package day12forloopwhileloop;

public class WhileLoop01 {
    public static void main(String[] args) {
        //3 den 10 a kadar tam sayıları konsola yazdırınız.

        for (int i=3; i<11; i++){
            System.out.print(i + " ");
        }
        System.out.println();

//2.YOL: (while-loop)
        int i=3;

        while (i<11){

            System.out.print(i + " ");

            i++;
        }
        System.out.println();
        // 23 den 12 ye kadar olan çift sayıları yazdırınız.
        int k=23;
        while (k>11){
            if (k%2==0){
                System.out.print(k + " ");
            }

            k--;
        }
        System.out.println();
        //Example 3: verilen bir tamsayının rakamları toplamını yazdırın.
        int num =-2584;
        int sum = 0;
        while (num>0){
            sum=sum+num%10;
            num/=10;
        }
        System.out.println(sum);
        //2.Yol: for-loop
        int a = 6841;
        int toplam = 0;

        for(int m = a; m>0; m/=10){
            toplam = toplam + m%10;
        }
        System.out.println(toplam);//19
    }
}
