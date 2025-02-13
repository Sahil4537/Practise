package ARRAYS;
import java.util.*;


//Array using call by refrence method.
public class refrence {

    public static void update(int marks[]) {
        for(int i=0; i<marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String args[]){
        int marks[] = {95, 98, 99};
        update(marks);

        for(int i=0; i<marks.length; i++) {
            System.out.println(marks[i]+ " ");
        }
    }
}
