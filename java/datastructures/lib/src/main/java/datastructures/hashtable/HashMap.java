package datastructures.hashtable;

import java.util.ArrayList;
import java.util.LinkedList;


public class HashMap <K, V> {
  ArrayList<LinkedList<HashMapPair<K, V>>> buckets;
  int size;
  public HashMap(int size){
    if(size < 1){
      throw new IllegalArgumentException("Hashmap size must be greater than 1.");
    }

    this.size = size;
    this.buckets = new ArrayList<>(size);
    for(int i = 0; i < this.size; i++){
      buckets.add(i, new LinkedList<>());
    }
  }
  public void set (){

  }
  public void add (){

  }
  public boolean contains (){
  }
  public String repeatedWord(String text, HashMap<String, Integer> hashmap){
    String[] newArray = text.split("\\W+");
    for(int i = 0; i < newArray.length; i++){
      if(hashmap.contains(newArray[i])){
        return newArray[i];
      }
      else{
        hashmap.add(newArray[i].toLowerCase(),i);
      }
    }
    return "No Repeated Strings";
  }
}
