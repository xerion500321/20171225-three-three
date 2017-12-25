import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
       int count[]=new int[52];
       String str = scn.nextLine();
       int len =str.length();
       for(int i=0 ; i<len ; i++){
           int val = str.charAt(i)-'a';
           if(val>=0 && val<26){
               count[val]++;
           }else{
               val = str.charAt(i)-'A';
               if(val>=0 && val<26){
                   count[26+val]++;
               }
           }
       }
       for(int i=0 ; i<52 ; i++){
           if(count[i]>0){
               if(i<26){
                   System.out.println((char)(97+i)+":"+count[i]);
               }
               else{
                   System.out.println((char)(65+i)+":"+count[i]);
               }
           }
       }
    }
}