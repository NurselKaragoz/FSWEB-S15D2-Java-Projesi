package com.workintech.set;

import java.util.HashSet;
import java.util.Set;

public class TasksData {

   private Set<String> annsTasks= new HashSet<>();
    private Set<String> bobsTasks= new HashSet<>();
   private Set<String> carolsTasks= new HashSet<>();
  public Set<String> unionSet = new HashSet<String>();
   Task task =new Task(" design","electrical autocad plans","bob");
     public Set<String> getTasks(String variable ){
         switch (variable.toLowerCase()) {
             case "ann":
                 return annsTasks;
             case "bob":
                 return bobsTasks;
             case "carol":
                 return carolsTasks;
             case "all":
                 Set<String> allTasks = new HashSet<>();
                 allTasks.addAll(annsTasks);
                 allTasks.addAll(bobsTasks);
                 allTasks.addAll(carolsTasks);
                 return allTasks;
             default:
                 throw new IllegalArgumentException("Invalid assignee: " +variable);
         }

    }
    public Set<String> getUnion(Set<String> sets){
       unionSet.addAll(sets);
       return unionSet;
     }

    public Set<String> getIntersect(Set<String> set1,Set<String> set2){
         set1.retainAll(set2);
         return set1;
    }
   public  Set<String> getDifference(Set<String> set1,Set<String> set2){

         set1.removeAll(set2);
         return set1;
   }
}
