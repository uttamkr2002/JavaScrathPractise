import java.util.*;
public class Arrays {

public static void inser_array(int arr1[],int pos){
    System.out.println("we are in");
    Scanner sc =new Scanner(System.in);
    int element=sc.nextInt();
    System.out.println("element");

    for(int i=0;i<arr1.length;i++){
        System.out.println(arr1[i]);
    }
    for(int i=arr1.length-1;i>=pos-1;i--){
        System.out.println(arr1[i]);



        arr1[i+1]=arr1[i];
       // arr1[pos-1]=element;
    }
    System.out.println("why not?");
    arr1[pos-1]=element;
    System.out.println(element+ ""+ pos);
    for(int i=0;i<arr1.length+1;i++){
        System.out.println(arr1[i]);
    }
    
}


   public static void main(String[]args){
    Scanner sc =new Scanner(System.in);
    int size1= sc.nextInt();
    int a1[]=new int[size1];
    for(int i=0;i<size1;i++){
        a1[i]=sc.nextInt();
    }
System.out.println("welcome");
     inser_array(a1,2);
     //inser_array(a1, size1);

   } 
}
