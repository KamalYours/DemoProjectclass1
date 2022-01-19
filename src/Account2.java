public class Account2 {

    private long acc_no;
    private String name;
    private String email;
    private float amt;

    public long getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(long acc_no) {
        this.acc_no = acc_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        Account2 air = new Account2();
        air.setAcc_no(123456789);
        air.setName("Kamal");
        air.setEmail("yourskamal@");
        air.setAmt(12345f);

        air.getAcc_no();
        air.getName();
        air.getEmail();
        air.getAmt();

        System.out.println(air.getAcc_no());
        System.out.println(air.getName());
        System.out.println(air.getEmail());
        System.out.println(air.getAmt());
    }
}
