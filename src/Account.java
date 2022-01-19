public class Account {

    private String name;
    private long acc_no;
    private String email;
    private float amt;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(long acc_no) {
        this.acc_no = acc_no;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getAmt() {
        return amt;
    }

    public void setAmt(float amt) {
        this.amt = amt;
    }

    public static void main(String[] args) {
        Account air = new Account();
        air.setName("Ankit");
        air.setAcc_no(1012131415);
        air.setEmail("gmail.com");
        air.setAmt(12345f);
        System.out.println(air.getName());
        System.out.println( air.getAcc_no());
        System.out.println(air.getEmail());
        System.out.println(air.getAmt());
    }
}
