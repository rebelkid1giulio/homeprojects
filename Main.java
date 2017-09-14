public class Main {

    public static void main(String[] args) {

        System.out.println("Bitte gib deinen Namen und dein Alter ein!");
        String e1 = Tastatur.leseText();
        int e2 = Tastatur.leseZahl();
        Player p = new Player();
        p.name = e1;
        System.out.println("Hallo " + p.name + ",");


        if (e2<16) {

            System.out.println("Du bist leider zu jung!");

        } else {

            System.out.println("dies ist einer deiner ersten Java Programme.");

        }

        System.out.println("Möchtest du wissen wen ich liebe? (Ja = 1 Nein = 0)");
        int a1 = Tastatur.leseZahl();

        if (a1==1) {

            System.out.println("Ich liebe " + p.love + "!");


        } else {

            System.out.print("Okay Tschüss!");
            return;
        }


    }
}
