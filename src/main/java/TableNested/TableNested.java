package TableNested;

import java.util.ArrayList;

/**
 * All you need to do for this microlab is take the Table and Entry from the last one and make Entry a nested class.
 * Think about how nested classes should work with generics.
 */
public class TableNested<K, V> {

    private ArrayList<Table.Entry<K,V>> entries;

    public TableNested() {

        this.entries = new ArrayList();
    }

    public V get(K foo) {

        for(int i = 0; i < entries.size(); i++){
            if(entries.get(i).getKey().equals(foo)){
                return entries.get(i).getValue();
            }
        }
        return null;
    }

    public void put(K foo, V i) {

        boolean hasBeenSet = false;

        for(int index = 0; index < entries.size(); index++){
            if(entries.get(index).getKey().equals(foo)){
                entries.set(index, new Table.Entry<>(foo,i));
                hasBeenSet = true;
            }
        }
        if(!hasBeenSet){
            entries.add(new Table.Entry<>(foo,i));
        }

    }

    public void remove(K foo) {

        for(int i = 0; i < entries.size(); i++){
            if(entries.get(i).getKey().equals(foo)){
                entries.remove(i);
            }
        }
    }


    public class Entry<K,V>{

        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }

}
