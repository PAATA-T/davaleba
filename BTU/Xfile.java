package BTU;

import java.util.Scanner;

public class Xfile {
    public int x;


    public Xfile() {
        System.out.println("Hello");
    }

    public void input() {
        Scanner Scn1 = new Scanner(System.in);
        System.out.println("შეიყვანე Y მნიშვნელობა : ");
        x = Integer.parseInt(Scn1.nextLine());


    }

    public void shekreba() {
        System.out.println(x + 12);
    }

    public void kent_luw(){
        if (x % 2 == 1) {
            System.out.println("კენტია");
        } else {
            System.out.println("ლუწია");
        }

    }


}
