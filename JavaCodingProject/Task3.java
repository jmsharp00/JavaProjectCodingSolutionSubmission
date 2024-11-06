package JavaCodingProject;

public class Task3 {
    public static void main(String[] args){
        int[][] numb = {
                {12,7,13,29,},
                {6,12,3,1},
                {21,8,16,2}

        };

        for(int[] row:numb){
            for(int n:row){
                if(n % 2==0){
                    System.out.println(n);
                }
            }
        }

    }
}
