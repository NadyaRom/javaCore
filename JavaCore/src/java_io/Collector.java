package java_io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Serializable;
import java.text.Bidi;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;



public class Collector {
	private Map<Person, List<Pet>> map = restore();

	Scanner scanner = new Scanner(System.in);


	public void restore(String fileName){
		File file = new File(fileName+".txt");
		if(file.exists()){
			try(BufferedReader br = new BufferedReader(
					new InputStreamReader(new FileInputStream(file)))){
				List<Pet> list = new ArrayList<>();
				Map<Person, List<Pet> > maps = new HashMap<>();
				while(br.ready()){
					String line = br.readLine();
					if(!line.isEmpty()){
						String[] array = line.split("\\ ");
						Person p = new Person(array[0],
								Integer.valueOf(array[1]),
								Gender.valueOf(array[2]));
						Pet p1=Pet.valueOf(array[3]);
						list.add(p1);
						maps.put(p, list);
					}
				}
				map = maps;
				save();
			}catch (IOException e) {
			}
	
		}
	}
	public void write(String fileName){
		try(PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(fileName+".txt")))){
			Set<Person> keySet = map.keySet();
				for (Person key : keySet) {
					for (Pet pet : map.get(key)){
						pw.println(key+" -> "+pet);
					}
				}
			pw.flush();
		}catch (IOException e) {
		}
	}
	
	@SuppressWarnings( "unchecked")
	private Map<Person, List<Pet>> restore(){
		File file = new File("save.bf");
		if(file.exists()){
			try(ObjectInputStream ois = new ObjectInputStream(
					new FileInputStream(file))){
				return (Map<Person, List<Pet>>) ois.readObject();
			}catch (IOException | ClassNotFoundException e) {}
			
		}
		return new HashMap<>();
		}
	
			public void add(){
		System.out.println("Enter person's name:");
		String name = scanner.next();
		System.out.println("Enter person's age: ");
		int age = scanner.nextInt();
		System.out.println("Enter person's gender: ");
		Gender gender = Gender.valueOf(scanner.next().toUpperCase());
		Person person = new Person(name, age, gender);
		System.out.println("Enter pet: ");
		Pet pet = Pet.valueOf(scanner.next().toLowerCase());
		map.put(person, new ArrayList<Pet>());
		if(map.containsKey(person)){
			map.get(person).add(pet);
		save();
		}
	}
			
	public void print(){
		 Set<Person> keySet = map.keySet();
			for (Person key : keySet) {
				for (Pet pet : map.get(key)){
					System.out.println(key+" -> "+pet);
			
	}
			}
	}
	private void save(){
		File file = new File("save.bf");
		try(ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream(file))){
			oos.writeObject(map);
			oos.flush();
		}catch (IOException e) {
		}
	}
	

}
