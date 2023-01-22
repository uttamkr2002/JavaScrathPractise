import java.util.*;
public class Arrays {

public static void inser_array(int arr1[],int pos){
    System.out.println("we are in");
    Scanner sc =new Scanner(System.in);
    int element=sc.nextInt();
    System.out.println("element");
    int size=arr1.length;
     System.out.println("enter the size"+ size);
    for(int i=size-2;i>=pos-1;i--){
                arr1[i+1]=arr1[i];
    }    
    arr1[pos-1]=element; 
    size=size+1;
    for(int i=0;i<size;i++){
        System.out.println(arr1[i]);
    }    
}


   public static void main(String[]args){
    Scanner sc =new Scanner(System.in);
    System.out.println("enter the size");
    int size1= sc.nextInt();
    int a1[]=new int[size1];
     System.out.println("enter the array");
    for(int i=0;i<size1;i++){
        a1[i]=sc.nextInt();
    }
    inser_array(a1, 4);
}
}