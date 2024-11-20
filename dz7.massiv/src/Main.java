import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // 1 zadamie
      int [] x = new int[] {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < 10; i++) {
            System.out.println(x[i]);
        }
                System.out.println();
        // 2 zadanie
        int[] sum=new int[]{1,2,3,4,5};
        System.out.println(sum[0]+sum[1]+sum[2]+sum[3]+sum[4]);
        System.out.println();
        // 3 zadanie


        int [] y = new int[] {23,44,77,799,78,42,234,56,44,20};
        int maks=y[0];
        for (int i = 0; i < y.length; i++) {
            if (maks<y[i]) {
                maks=y[i];
            }
                    }
        System.out.println("Максимальное число в массиве =" + maks);
        System.out.println();
        // 4 zadanie

        int [] o = new int[] {23,44,77,44,20,42,234,56,799,48};
        int min=o[0];
        for (int i = 0; i < o.length; i++) {
            if (min>y[i]) {
                min=y[i];
            }
        }
        System.out.println("Минимальное число в массиве =" + min);
        System.out.println();
        // 5 zadanie
        int chet=0;
        int [] u = new int[] {23,44,77,44,78,42,234,57,799,20};
        for (int i = 0; i < u.length; i++) {
            if (u[i]%2==0){
                chet++;
            }
                    }
        System.out.println("Количество четных числе = "+chet);
        System.out.println();

        // 6 zadanie
        int nechet=0;
        int [] p = new int[] {23,44,77,44,78,42,234,57,799,20};
        for (int i = 0; i < p.length; i++) {
            if (p[i]%2==0){
            }
            else{
                nechet++;
            }
        }
        System.out.println("Количество нечетных числе = "+nechet);
        System.out.println();

        // 7 zadanie
        int sam=0;
        int [] k = new int[] {23,44,77,44,78,42,234,57,799,20};
        for (int i = 0; i < k.length; i++) {
            sam=k[i]+sam;
        }
        System.out.println("Среднее арифметическое массива =" + sam/k.length);
        System.out.println();

        // 8 zadanie
        int [] l = new int[] {23,44,77,47,78,42,234,57,799,20};
        for (int i = l.length-1; 0<=i ; i--) {
            System.out.print(l[i] + ", ");
        }
            System.out.println();
            System.out.println();
            System.out.println();


            // 9 zadanie
            int [] ran = new int[10];
            Random random=new Random();
            for (int j = 0; j <ran.length ; j++) {
                ran[j]=random.nextInt(100+1);
                System.out.print(ran[j] + ", ");
            }
        System.out.println();System.out.println();System.out.println();

        //10 zadanie
        int [] tr = new int[] {23,44,77,47,78,42,234,57,799,20};
        for (int i = 0; i < tr.length; i++) {
            System.out.print(tr[i]+", ");
        }
        System.out.println();
        int posl=tr[tr.length-1], per=tr[0];
        tr[0]=posl;
        tr[tr.length-1]=per;
        for (int i = 0; i < tr.length; i++) {
            System.out.print(tr[i]+", ");
        }
        System.out.println();
        System.out.println();
        System.out.println();

        // 11 zadanie
        int [] raz = new int[] {23,44,77,47,78,42,234,57,799,20};
        int mini=raz[0], maxi=raz[0];
        for (int i = 0; i <raz.length; i++) {
            if (mini > raz[i]) {
                mini = raz[i];
            }
            if (maxi < raz[i]) {
                maxi = raz[i];
            }
        }
        int razni=maxi-mini;
        System.out.println("Разница между максимальным значением и минимальным ="+razni);
        System.out.println();
        System.out.println();
        System.out.println();

        // 12 zadanie

        int sami=0;
        int [] mass = new int[] {23,44,77,44,78,42,234,57,799,20};
        for (int i = 0; i < mass.length; i++) {
            sami=k[i]+sami;
        }
        int srmass=sami/k.length;
        System.out.println("Среднее арифметическое массива =" + srmass);
        int chislo=0;
        for (int i = 0; i <mass.length ; i++) {
            if (srmass<mass[i]){
                chislo++;
            }
        }
        System.out.println("Количество элементов, больше среднего арифметического ="+chislo);
        System.out.println();
        System.out.println();
        System.out.println();

        //13 zadanie
        int[] kv=new int [11];
        for (int i = 1; i < 11; i++) {
            kv[i]=i*i;
            System.out.print(kv[i]+", ");
        }


    }
}