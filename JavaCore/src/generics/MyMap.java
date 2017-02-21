package generics;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
 
public class MyMap<K,V>  {
    
	Set<MyEntry<K, V>> set = new HashSet<MyEntry<K,V>>();
   
    public boolean add(K key, V value){
        return set.add(new MyEntry<>(key, value)); 
    }
   
    public void  removeByKey(K key) {
        Iterator<MyEntry<K, V>> iterator = set.iterator();
        while(iterator.hasNext()){
            MyEntry<K, V> next = iterator.next();
            if(next.getKey()==key){
            iterator. remove();
            }
        }
    }
    public void  removeByValue(V value) {
        Iterator<MyEntry<K, V>> iterator = set.iterator();
        while(iterator.hasNext()){
            MyEntry<K, V> next = iterator.next();
            if(next.getValue()==value){
                next.setValue(null);
            }
            }
        }
   
       
    public void showKeySet(){
        Set<K> keySet = new HashSet<>();
        Iterator<MyEntry<K, V>> iterator = set.iterator();
        while(iterator.hasNext()){
            keySet.add(iterator.next().getKey());
        }
        for (K k : keySet) {
            System.out.println(k);
        }
        }              
   
    public void showListValue(){
        List<V> listValue = new ArrayList<>(); 
        Iterator<MyEntry<K, V>> iterator = set.iterator();
        while(iterator.hasNext()){
            listValue.add(iterator.next().getValue());
        }
        for (V v : listValue) {
            System.out.println(v);
        }
    }              
    public void showMap(){
        for (MyEntry<K, V> map : set) {
            System.out.println(map);
           
        }
   
    }
}
