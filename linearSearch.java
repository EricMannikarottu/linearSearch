package linearSearch;
import java.util.*;
public class linearSearch { 

        public static void main(String args[]){

            Scanner sc=new Scanner(System.in);

            System.out.println("What should be the lenght of the array?");
            int size=sc.nextInt();

            int numbers[]=readArray(sc,size);


            System.out.println("What number are you looking for?");
            int x=sc.nextInt();

            int index=linSearch(numbers,x);

            printResult(index);

            sc.close();
        }

        private static int[] readArray(Scanner sc, int size ){

            int numbers[]=new int[size];
            for(int i=0; i<size;i++){
                System.out.println("Enter No."+ (i+1)+ " Entry");
                numbers[i]=sc.nextInt();
            }
            return numbers;

        }

        private static int linSearch(int numbers[],int x){

            for(int i=0;i<numbers.length;i++){
                if(numbers[i]==x){
                    return i;
                }
            }
            return -1;

        }

        private static void printResult(int index){

            if (index != -1) {
                System.out.println("The provided value is at index " + index);
            } else {
                System.out.println("The provided value is not in the array.");
            }
        }
    
}

