
class Student {

    private String name;

    String getName(){

        return name;
    }

    void setName(String name){

        this.name = name;
    }
}


public class Encapsulation {

    public static void main(String[]args){

        Student s = new Student();

        s.setName("Akash");

        System.out.println(s.getName());

    }
}
