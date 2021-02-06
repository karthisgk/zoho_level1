import java.util.Scanner;
class Pattern {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num = inp.nextInt();
        for (int i = num; i >= 1; i--){
            int k = 1;
            for (int j = num; j >= 1; j--){
                if(i >= j)
                    System.out.print(i + " ");
                else
                    System.out.print((i+k) + " ");
                k++;
            }
            System.out.println();
        }
    }
}