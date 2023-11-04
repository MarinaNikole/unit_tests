import static java.lang.Math.abs;

public class Tree {
    public int garlandLength(int[] arr){
        int length = 0;
        for (int i = 0; i < arr.length-1; i++) {
            length = length + abs((arr[i+1]-arr[i])); // берём модуль разности
        }
        return length;
    }

}
