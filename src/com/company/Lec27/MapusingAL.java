package com.company.Lec27;

import java.util.ArrayList;
import java.util.LinkedList;


public class MapusingAL<K,V> {

    ArrayList<LinkedList<Entity>> entities = new ArrayList<>();

    public MapusingAL() {

        for (int i = 0; i <100 ; i++) {
            entities.add(new LinkedList<>());
        }
    }

    public void put(K key, V value){

        int hashcode = Math.abs(key.hashCode()%entities.size());

        LinkedList<Entity> list = entities.get(hashcode);

        for (Entity entity:list) {
            if (entity.key.equals(key)) {
                entity.value= value;
                return;
            }
        }

        list.add(new Entity(key,value));
    }

    public V get(K key){

        int hashcode = Math.abs(key.hashCode()%entities.size());

        LinkedList<Entity> list = entities.get(hashcode);

        for (Entity entity: list) {

            if (entity.key.equals(key)) {
                return entity.value;
            }
        }
        return null;
    }

    public void remove(K key){

        int hashcode = Math.abs(key.hashCode()%entities.size());

        LinkedList<Entity> list = entities.get(hashcode);

       Entity target =null;

        for (Entity entity: list) {

            if (entity.key.equals(key)) {
                target= entity;
                break;
            }
        }
        list.remove(target);
    }

    class Entity{
        K key;
        V value;

        public Entity(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
