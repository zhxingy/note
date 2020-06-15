
public class Bank {
    String account;
    String pwd;
    String user;
    String sex;
    String city;
    String phone;
    float balance;

    public Bank(){

    }

    public Bank(String account, String pwd, String user, String sex, String city, String phone, float balance){
        this.account = account;
        this.pwd = pwd;
        this.user = user;
        this.sex = sex;
        this.city = city;
        this.phone = phone;
        this.balance = balance;
    }

    public void getAccount(){
        System.out.println(this.account);
    }

    public void setAccount(String account){
        this.account = account;
    }

    public void getPwd(){
        System.out.println(this.pwd);
    }

    public void setPwd(String pwd){
        this.pwd = pwd;
    }

    public void getUser(){
        System.out.println(this.user);
    }

    public void setUser(String user){
        this.user = user;
    }

    public void getSex(){
        System.out.println(this.sex);
    }

    public void setSex(String sex){
        this.sex = sex;
    }

    public void getCity(){
        System.out.println(this.city);
    }

    public void setCity(String city){
        this.city = city;
    }

    public void getPhone(){
        System.out.println(this.phone);
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public void getBalance(){
        System.out.println(this.balance);
    }

    public void setBalance(float balance){
        this.balance = balance;
    }

    public String toString(){
        return ("\nAccount: " + this.account + "\nPwd: " + this.pwd + "\nuser: " + this.user + "\nsex: " + this.sex + "\ncity: " + this.city + "\nphone: " + this.phone + "\nbalance: " + this.balance);
    }

    public void saveMoney(float money){
        this.balance += money;
    }

    public void withdrawMoney(float money){
        if (this.balance - money < 0) {
            System.out.println("Sorry, your credit is running low");
        }else{
            this.balance -= money;
        }
    }

}