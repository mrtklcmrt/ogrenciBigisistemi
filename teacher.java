public class teacher {
    String name ;
    String telNumber;
    String branch ;



    teacher(){};



    teacher(String name , String telNumber , String branch){
        this.name=name;
        this.telNumber=telNumber;
        this.branch=branch;
    }

    void teacherinfo (){
        System.out.println("İSİM: " + this.name);
        System.out.println("TELEFON NO: " + this.telNumber);
        System.out.println("BRANCH: " + this.branch);

    }


}
