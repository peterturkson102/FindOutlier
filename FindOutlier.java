import java.util.*;
public class FindOutlier{
  static int find(int[] integers){

  List<Integer> evenArray = new ArrayList<>();
  List<Integer> oddArray = new ArrayList<>();
    
    for(int integer : integers){
      if(!isEven(integer)){
        oddArray.add(integer);
      }else{
       evenArray.add(integer);
      }
    }
    
    if(evenArray.size()>oddArray.size()){
      return oddArray.get(0);
    }else{
      return evenArray.get(0);
    }
  
}

  
 static public boolean isEven(int number){
    return number%2==0 ? true : false;
  }
}
