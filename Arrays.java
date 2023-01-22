import java.util.*;
public class Arrays {

public static int inser_array(int arr1[],int pos, int size){
    System.out.println("we are in");
    Scanner sc =new Scanner(System.in);
    int element=sc.nextInt();
    System.out.println("element");
    System.out.println("enter the size"+ size);
    for(int i=size-1;i>=pos-1;i--){
                arr1[i+1]=arr1[i];
    }    
    arr1[pos-1]=element; 
    size=size+1;
    for(int i=0;i<size;i++){
        System.out.println(arr1[i]);
    } 
    return size;   
}


   public static void main(String[]args){
    Scanner sc =new Scanner(System.in);
    System.out.println("enter the size");
    //int size1= sc.nextInt();
    int size = 5;
    int a1[]=new int[100];
     System.out.println("enter the array");
    for(int i=0;i<size;i++){
        a1[i]=sc.nextInt();
    }
    size = inser_array(a1, 4,size);
}
}