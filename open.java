import java.util.Scanner;
public class open {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[]= new int[n];
        int index = 0;
        for(int i = 0; i < n;i++)
            a[i] = scan.nextInt();
        int min = a[0];
        for(int i = 0 ; i < n; i++)
            if(min > a[i]){
            min = a[i];
            index = i;
        }

        System.out.println(min + " " + index);
        }
}
