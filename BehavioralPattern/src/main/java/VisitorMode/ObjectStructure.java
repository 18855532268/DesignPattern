package VisitorMode;

import java.util.LinkedList;
import java.util.List;

/**
 * @author yaoby
 * @version 1.0
 * @date 2021/6/28 21:12
 *
 */
public class ObjectStructure {
   private List<Person> persons =  new LinkedList<Person>();

   public void attach(Person p){
       persons.add(p);
   }

   public void remove(Person p){
       persons.remove(p);
   }

   public void display(Action action){
       for (Person p : persons){
           p.accept(action);
       }
   }

}
