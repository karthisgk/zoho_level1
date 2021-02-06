import java.util.Scanner;
class Pattern {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num = inp.nextInt();
        for (int i = num; i >= 0; i--){
            System.out.println(i);
        }
    }
}