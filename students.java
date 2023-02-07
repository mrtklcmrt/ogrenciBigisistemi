import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;
import java.util.concurrent.RecursiveTask;

public class students {
    Scanner mert;

    {
        mert = new Scanner(System.in);
    }

    int number , avarage;
            String telno , name;
            course c1 ,c2 ,c3;



        students( course c1 , course c2 ,course c3){
            System.out.print("TELEFON NUMARASI: ");
            this.telno=mert.nextLine();
            System.out.print("İSİM: ");
            this.name= mert.nextLine();
            System.out.print("OKUL NUMARASİ: ");
            this.number= mert.nextInt();

            this.c1=c1;
            this.c2=c2;
            this.c3=c3;



        }
        void addnote () {
            System.out.println("NOTLARİNİZİ GİRİNİZ: ");
            System.out.print(this.c1.branch + ": ");
            this.c1.note= mert.nextInt();
            System.out.print(this.c2.branch + ": ");
            this.c2.note= mert.nextInt();
            System.out.print(this.c3.branch + ": ");
            this.c3.note= mert.nextInt();

            avarage= (this.c1.note+ this.c2.note+ this.c3.note)/3;
            ispass();
        }







        boolean ispass (){
            if (avarage >= 55){
                System.out.println("ORTALAMANİZ: " + avarage);
                System.out.println("DERSİ GECTİNİZ:)");
                return true;
            }else{
                System.out.println("ORTALAMANİZ: " + avarage);
                System.out.println("DERSTEN KALDINIZ:( ");
                return false;

            }


        }


}
