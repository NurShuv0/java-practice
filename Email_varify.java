interface Account {
    String getName();
    void setName(String name);
    String getPassword();
    void setPassword(String password);
}
interface Email {
    String getOtp();
    void setOtp(String otp);
    boolean verifyEmail(String otp);
}
class Person implements Account, Email {
    private String name;
    private String password;
    private String otp;
    public Person(String name, String password) {
        this.name = name;
        this.password = password;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String getPassword() {
        return password;
    }
    @Override
    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String getOtp() {
        return otp;
    }
    @Override
    public void setOtp(String otp) {
        this.otp = otp;
    }

    @Override
    public boolean verifyEmail(String otp) {
        return this.otp != null && this.otp.equals(otp);
    }
}
public class Email_varify {
    public static void main(String[] args) {
        Person person = new Person("NUR", "paSSWoRd");
        person.setOtp("036392");
        System.out.println("Name: " + person.getName());
        System.out.println("Password: " + person.getPassword());
        String otpToVerify = "036392";
        if (person.verifyEmail(otpToVerify)) {
            System.out.println("Email verified successfully!");
        } else {
            System.out.println("Email verification failed.");
        }
    }
}