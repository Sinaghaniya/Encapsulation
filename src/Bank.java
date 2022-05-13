
class Customer{

    private String name,email;
    private long AccNo;
    private float amount;

    String getName(){

        return name;
    }

    String getEmail(){
        return email;
    }

    long getAccNo(){
        return AccNo;
    }

    float getAmount(){
        return amount;
    }

    void setName(String name){

        this.name = name;
    }

    void setEmail(String email){
        this.email = email;
    }

    void setAccNo(long accNo){
        this.AccNo = AccNo;
    }

    void setAmount(float amount){
        this.amount = amount;
    }
}

public class Bank {

    public static void main(String[]args){

        Customer c = new Customer();

        c.setName("Aditya Singh");
        c.setEmail("aditya@gmail.com");
        c.setAccNo(7560504000l);
        c.setAmount(22223.00f);

        System.out.println(c.getName()+" "+c.getEmail()+" "+c.getAmount());
        System.out.println(c.getAccNo());
    }

}
