package JavaCodingProject;

public class Task4 {
    public static void main(String[] args) {
        int [][]numbers={
                {9,15,20,16},
                {15,45,21,4},
                {47,33,52,19}
        };
        int evenSum=0;
        int oddSum=0;

        for(int [] row:numbers){
            for(int n:row){
                if(n%2==0){
                    evenSum+=n;
                }
                else{
                    oddSum+=n;
                }
            }
        }
        System.out.println("Sum of even numbers is " +evenSum);
        System.out.println("Sum of odd numbers is " +oddSum);
    }
    }


