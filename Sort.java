import java.util.*;
public class Sort{

    public static void main(String[] args){

        int[] array = {2,1,7,3,8,2,4,6};

        for(int i=0; i<7; i++){
            for(int j=0; j<7; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;


                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}