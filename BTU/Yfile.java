package BTU;

import java.util.Scanner;

public class Yfile extends Xfile {
    public int y;

    public void input(){
        Scanner Scn2 = new Scanner(System.in);
        System.out.println("შეიყვანე X მნიშვნელობა : ");
        y = Integer.parseInt(Scn2.nextLine());

    }

    public int sum(){
        int q = x + y;

        return q;
    }
}
