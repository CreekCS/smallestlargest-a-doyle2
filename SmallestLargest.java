// Name: Andrew Doyle
public class SmallestLargest{
    public static void main(String[] args){
        int[] array = new int[10];
        System.out.print("[");
        for (int i = 0; i < 10; i++) {
            array[i] = (int)(Math.random()*100 + 1);
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
        
        System.out.println("Smallest value: " + smallestValue(array));
        System.out.println("Largest value: " + largestValue(array));
    }

    public static int smallestValue(int[] array){
        int min = array[0];
        for (int i : array) {
            min = Math.min(min, i);
        }
        return min;
    }
    
    public static int largestValue(int[] array){
        int max = array[0];
        for (int i : array) {
            max = Math.max(max, i);
        }
        return max;
    }
}