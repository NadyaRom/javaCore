package generics;

//Створити клас MyEntry<K,V>. Описати в ньому дженеріками –поля, гетери/сетери, toString. 
//Створити клас MyMap<K,V>, в якому буде поле  Set<MyEntry<K,V>>. 
//Реалізвати в даному класі методи, які б:
//додавали  новий об’єкт в мапу 
//видаляли об’єкт мапи за ключем(тобто немає ні ключа ні значення) 
//видаляли об’єкт мапи за значенням(значенню об’єкта присвоюється нульова спилка, при цьому зберігається ключ) 
//виводили на екран Set ключів 
//Виводили на екран List значень 
//Виводили на екран цілу мапу

public class MyEntry<K,V> {
	   
    private K key;
 
    private V value;
   
   
    public MyEntry(K key, V value) {
        super();
        this.key = key;
        this.value = value;
    }
 
 
    public K getKey() {
        return key;
    }
 
    public void setKey(K key) {
        this.key = key;
    }
 
    public V getValue() {
        return value;
    }
 
    public V setValue(V newValue){
         V oldValue = value;
         value = newValue;
         return oldValue;
       
    }
 
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((key == null) ? 0 : key.hashCode());
        result = prime * result + ((value == null) ? 0 : value.hashCode());
        return result;
    }
 
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        MyEntry other = (MyEntry) obj;
        if (key == null) {
            if (other.key != null)
                return false;
        } else if (!key.equals(other.key))
            return false;
        if (value == null) {
            if (other.value != null)
                return false;
        } else if (!value.equals(other.value))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return key + ", " + value;
    }
   
 
}
