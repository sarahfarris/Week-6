package com.pluralsight.collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class FixedList<T> {
  // this is a list that will allow you to create a collection of any type of item, but limit the
  // max number of items that can be added to the list
  List<T> items;
  Collection<T> item;
  int maxSize;


  //this is the constructor that takes a single argument which specifies the max size
  public FixedList(int maxSize) {
    this.maxSize = maxSize;
    this.items = new ArrayList<>();
//    this.item = new List<T>[maxSize];
  }

  public void add(T item) {
      //this allows you to add to the list if it has not reached max size
      if (items.size() < maxSize){
          items.add(item);
      } else {
      throw new RuntimeException("List is at maximum capacity");
      }
  }

  public List<T> getItems() {
    return items;
  }
}
