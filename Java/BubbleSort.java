
/**
 * sorting
 */
public class BubbleSort {

public static void main(String[]args){

    int [] number ={4,2,7,8,5,1,2};
    for(int i=0; i<number.length; i++){
        for(int j=0; i<number.length-1;i++){
            boolean Sort= number[j] <number[j+1];
            if (!Sort){
                int newSort=number[j];
                number[j] = number[j+1];
                number[j+1]= newSort;
            }
        }
    }
    for(int i=0; i<number.length;i++){
        System.out.println(number[i]);
        }
    }
}