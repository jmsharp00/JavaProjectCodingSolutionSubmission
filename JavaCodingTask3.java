public class JavaCodingTask3 {
    public static void main(String[] args){
        int[][] numbers = {
                {5,10,15,20,25},
                {2,19,29,39,41},
                {1,9,24,74,98,300,}

        };

        for(int[] row:numbers){
            for(int n:row){
                if(n%2==0){
                    System.out.println(n);
                }
            }
        }

    }
}
