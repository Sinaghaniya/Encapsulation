
//with getters and setters
// we can ovverride the datatypes too;

class Student1 {

    private String name = "Raja";

    String getName(){

        return name;
    }

    void setName(String name){

        this.name = name;
    }
}

public class Encapsulationerror {

    public static void main(String[]args){

        Student1 s = new Student1();

        s.setName("akash");

        System.out.println(s.getName());
    }
}
