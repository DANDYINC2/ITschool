package IT;
import java.util.Scanner;

public class Work {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        // прямой доступ к полям класс - нежелательно !!

        Ndrob fract1 = new Ndrob ();
//        fract1.num = 3;
//        fract1.denom =5;
        fract1.setNum(3);
        fract1.setDenom(5);
        Ndrob fract2 = new Ndrob();
//        fract2.num = in.nextInt();
//        fract2.denom = in.nextInt();
        fract2.setNum(in.nextInt());
        fract2.setDenom(in.nextInt());
        System.out.println(fract2);
        fract1.print();
        System.out.println(fract1.milti(fract2));
        System.out.println(fract1.del(fract2));











    }

}
