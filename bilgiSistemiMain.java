import java.util.Scanner;

public class bilgiSistemiMain {
    public static void main(String[] args) {
        Scanner mert = new Scanner(System.in);

//j
        course history = new course("history" , 101);
        course fizik = new course("fizik", 102);
        course kimya = new course("kimya",103);
        course matematik = new course("matematik",104);


        teacher t1 = new teacher("sultan" , "05464743753","history");
        history.addTeacher(t1);

        teacher t2 =new teacher("mert" , "94375" , "matematik");
        matematik.addTeacher(t2);

        teacher t3 =new teacher("hasan" , "757437" , "kimya");
        kimya.addTeacher(t3);

        teacher t4 = new teacher("volkan" , "52943268" , "fizik");
        fizik.addTeacher(t4);

        students s1 = new students(fizik,kimya,matematik);
        s1.addnote();





    }
}
