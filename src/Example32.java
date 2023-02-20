import java.util.Scanner;

public class Example32 {
    public static void main(String[] args) {
        int num= 0,i=1;
        int raizCuadrada=1;
        float y,x;
        int resultado =0;
        double valorreal,dif=1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero");
        num = sc.nextInt();
        x=num;
        valorreal=Math.sqrt(num);



        while (dif>=0.000001)
        {

            y= 0.5f*(x + (num/x));
            System.out.println("Iteracion "+i+" :"+y);
            x=y;

            i++;
            dif=y-valorreal;
            if (dif<0)
                dif=dif*-1;


        }

    }
}