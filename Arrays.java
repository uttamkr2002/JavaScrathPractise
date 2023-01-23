import java.util.*;
public class Arrays {

public static int inser_array(int arr1[],int pos, int size){
    System.out.println("we are in");
    Scanner sc =new Scanner(System.in);
    int element=sc.nextInt();

    System.out.println("element");
    System.out.println("enter the size"+ size);
    for(int i=size-1;i>=pos-1;i--){
                arr1[i+1]=arr1[i]; //??
    }    
    arr1[pos-1]=element; 
    size=size+1;
    for(int i=0;i<size;i++){
        System.out.println(arr1[i]);
    } 
    return size;   
}


public static void delete_array(int arr1[],int pos,int size){
    System.out.println("we are in deleting element in array");
    for(int i=pos-1;i<size;i++){
            arr1[i]=arr1[i+1];//??
    }
    System.out.println("we are printing ");
    for(int i=0;i<size-1;i++){        //   ??
        System.out.println(arr1[i]);
    }
}
public static void union_arrar(int a1[],int a2[],int size,int size2){
    System.out.println("we are in union arary");
   int i=0;
   int j=0;                   // sample input a1=1,2,3,4,5
   while(i<size&&j<size2){    // sample input a2=6,7,8,9,0,1,2,3
    if(a1[i]<a2[j]){          //  output    1,2,3,4,5,6,7,8,9,0 
    
        System.out.println(a1[i++]);// ?? here it is post increment
    }
    else if(a1[j]<a2[i]){
    System.out.println(a2[j++]);
   }
   else{
    System.out.println(a2[j++]);
    i++;
   }

   }
//???

while(i<size){
    System.out.println(a1[i++]);
}

while(j<size){
    System.out.println(a2[j++]);
}
 
}




   public static void main(String[]args){
    Scanner sc =new Scanner(System.in);
    System.out.println("enter the size");
    //int size1= sc.nextInt();
    int size = 5;
    int a1[]=new int[100];          //??most important if we not declare it it will always give arrayoutofbound error ***
     System.out.println("enter the array");
    for(int i=0;i<size;i++){
        a1[i]=sc.nextInt();
    }
   // size = inser_array(a1, 4,size);  // here we have to pass size because if we not pass it will take the size as 100
   // delete_array(a1,2,size);
   int a2[] = new int [100];
   //Scanner sc = new Scanner(System.in);
   System.out.println("enter the size2");
   int size2=8;
   for(int i=0;i<8;i++){
     a2[i]=sc.nextInt();
   }
    union_arrar(a1,a2,size,size2 );
}
}