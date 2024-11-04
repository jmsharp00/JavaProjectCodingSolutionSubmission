package Arrays;

public class AllValuesFromTwoDArrays {
    public static void main(String[] args) {
        int[][] numbers={
                {1,2,3}, //1 array 1 row (0)
                {10,20,30,40,50},//2 array 2 row (1)
                {100,200}, //3 array 3 row (2)
        };
        System.out.println(numbers.length);
        // returns the number of arrays in the 2D array
        System.out.println(numbers[1].length);
        // specified which row you want to know how many elements, so it will to to the 2nd row and could the elements there (5)

        for(int row=0; row<numbers.length; row++){
            for(int column=0; column<numbers[row].length; column++) {
                System.out.print(numbers[row][column]+" ");
            }
            System.out.println();
        }
    }
}
