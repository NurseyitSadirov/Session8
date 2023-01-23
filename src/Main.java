import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int [] arrayNum = new int[10];
        for (int i = 0; i < arrayNum.length; i++) {
            arrayNum[i] = random.nextInt(1,50);
        }
        System.out.println("Array:"+Arrays.toString(arrayNum));
        maxNumbers(arrayNum);
        minNumbers(arrayNum);


     /*    int sum = 0;
        for (int i = 0; i < 300; i++) {
            if (i % 3 == 0 && i % 4 == 0 && i % 5 == 0)
            {
                sum += i;
            }
        }
        System.out.println("Жооп: " + sum);
*/

     /*    int s = 1;
        int sum1 = 0;
        while (s < 300) {

            if (s % 3 == 0 && s % 4 == 0 && s % 5 == 0){
                System.out.println("Bolunuuchu sandar: "+s);
                sum1 += s;
            }
            s++;
        }
        System.out.println();
        System.out.println("Alardyn summasy: " + sum1);
*/

     /*    int[] a = new int[10];
        int counter = 0;
        int counter1 = 0;
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(50, 70);
            if (a[i] % 2 == 0) {
                counter += a[i];
            } else {
                counter1 += a[i];
            }
        }
        System.out.println("Jup sandardyn ortocho arifmetikalyk sany: "+counter / a.length);
        System.out.println("Tak  sandardyn ortocho arifmetikalyk sany: "+counter1 / a.length);

*/

         /*for (int i = 2; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
                System.out.println(i+" * "+j+" = "+(i*j));
            }
            System.out.println("~~~~~~~~~~~");
        }*/

       /*   Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        if (a1 < 25) {
            System.out.println("F");
        } else if (a1 > 25 && a1 < 45) {
            System.out.println("E");
        } else if (a1 >= 45 && a1 <= 50) {
            System.out.println("D");
        } else if (a1 >= 50 && a1 <= 60) {
            System.out.println("C");
        } else if (a1>= 60 && a1 <= 80) {
            System.out.println("B");
        } else {
            System.out.println("A");
        }*/


    }
        public  static void maxNumbers(int [] array){
        Arrays.sort(array);
            System.out.println("Max:"+array[9]);

        }
        public  static  void  minNumbers(int [] array ) {
            Arrays.sort(array);
            System.out.println("min:" + array[0]);
        }
}