public class course {
    String branch;
    int code;
    teacher teacher;
    int note;


    course(String branch , int code){
        this.branch=branch;
        this.code=code;
        System.out.print("Ders ismi: " + this.branch + "\t");
        System.out.println("Ders kodu: " + this.code + "\n");
    }
    void addTeacher( teacher teacher){
        if (teacher.branch.equals(this.branch))
            this.teacher=teacher;
        else
            System.out.println("hocamizin bransi farklı: ");

    }
    void infoCourse(){
        System.out.println("Ders ismi: " + this.branch);
        System.out.println("Ders kodu: " + this.code);
        System.out.println("Ogretmenin ismi: " + this.teacher.name);
        System.out.println("Ogretmenin telefon numarasi: " + this.teacher.telNumber);
    }


}
