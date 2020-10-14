package pattern;

public class CentralBank implements Proxy {

    private String name,email,phone,address,password,associateMember,NID,whichType;
    boolean isJoint;
    double loan,money=875.65,fund,percent;

    public void setAssociateMember(String associateMember) {
        this.associateMember = associateMember;
    }

    public void setWhichType(String whichType) {
        this.whichType = whichType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNID(String NID) {
        this.NID = NID;
    }

    public void setJoint(boolean joint) {
        isJoint = joint;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void setFund(double fund) {
        this.fund = fund;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getAssociateMember() {
        return associateMember;
    }

    public boolean getIsJoint() {
        return isJoint;
    }

    public double getMoney() {
        return money;
    }

    private void increaseFund(double m){
        money+=m;
    }

    private void decreaseFund(double m){
        money-=m;
    }


    private void deposit(double m){
        money+=m;
        System.out.println("Transaction Complete!!!");
    }

    private double arrangeLoan(){
        return percent/100 * money;

    }
    private void changeAccontType(String type){
        setWhichType(type);

    }

    private void changeAssociateMember(String newMember){
        setAssociateMember(newMember);
    }

    private void changeJoint (){
        setJoint(!getIsJoint());
    }


    @Override
    public void checkBalance() {
        System.out.println("Your balance = "+getMoney());
    }

    @Override
    public void withdrawMoney(double m ) {
        if(m<money){
            System.out.println("Transaction Complete!!!");
        }else {
            System.out.println("Sorry!!! Not enough money");
        }
    }
}


