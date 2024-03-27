// You are given a phone book that consists of people's names and their phone number. 
// After that you will be given some person's name as query. 
// For each query, print the phone number of that person.


import java.util.Scanner;
import java.util.HashMap;
import java.util.*;

class Telephone{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    HashMap<String, String> book = new HashMap<>();
    int n = sc.nectInt();
    sc.nextLine //to occupy a line
      for(int i = 0; i<n; i++){
      String name = sc.nextLine();
      String number = sc.nextLine();
      book.put(name, number);
      } //after inputting all the key value pairs (n number of such pairs) we check if there are any other inputs - .hasNext() --> test inputs and not key value pairs
    while(in.hasNext()){
      String test = sc.nextLine();
      if(book.containsKey(test)){
        System.out.println(test + "=" + book.get(test));
      }
      else{
        System.out.println("no such number in the directory");
      }
    }
  }
                          }
