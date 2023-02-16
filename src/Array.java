import java.util.Arrays;
public class Array {
    public static void main(String[] args){
        int[] marks = new int[3];
        marks[0]= 92;
        marks[1] = 80;
        marks[2] = 30;

        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);
    }
}
