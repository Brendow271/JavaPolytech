/*
Написать программу, демонстрирующую методы для работы с объектами String

На основе программы LScanner.java, используя метод hasNext() принимать произвольное число слов (символы, разделенные пробелами)
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        sc.nextLine();
        for(int i = 0;i < n;i++) {
            s[i] = sc.nextLine();
        }

        int m = sc.nextInt();
        sc.nextLine();
        String[][] sm = new String[m][];
        String[][] sM = new String[m][2];
        for(int i = 0;i < m;i++) {
            sm[i] = sc.nextLine().split(" - ");
            sM[i][0] = sm[i][0].substring(0, 1).toUpperCase() + sm[i][0].substring(1);
            sM[i][1] = sm[i][1].substring(0, 1).toUpperCase() + sm[i][1].substring(1);
        }
        for(int i = 0;i < n;i++) {
            for(int j = 0;j < m;j++) {
                s[i] = s[i].replace(sm[j][0], sm[j][1]);
                s[i] = s[i].replace(sM[j][0], sM[j][1]);
            }
        }
        for(int i = 0;i < n;i++) {
            System.out.println(s[i]);
        }
    }
}