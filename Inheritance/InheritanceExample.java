class PhoneV1{

    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void sendMessage(String message){
        System.out.println(message+"\nMessage sent from PhoneV1.");
    }
}

class PhoneV2 extends PhoneV1{
    
    public void call(){
        System.out.println(getPhoneNumber()+"\nCalling from PhoneV2.");
    }
}
public class InheritanceExample{
    public static void main(String args[]){
        PhoneV2 phoneV2=new PhoneV2();
        phoneV2.setPhoneNumber("1234567890");
        phoneV2.sendMessage("Hello there!");
        phoneV2.call();
    }
}