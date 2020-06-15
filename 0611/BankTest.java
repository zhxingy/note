
public class BankTest{
    public static void main(String[] args){
        System.out.print("");
        Bank TestBank = new Bank();
        TestBank.setAccount("8888888888888888888888");
        TestBank.setPwd("1234567");
        TestBank.setUser("zhangsan");
        TestBank.setSex("man");
        TestBank.setCity("shenzhen");
        TestBank.setPhone("18888888888");
        TestBank.setBalance(1888888);
        System.out.print(TestBank.toString());
        TestBank.saveMoney(1);
        System.out.print("\n");
        TestBank.getBalance();
        TestBank.withdrawMoney(1);
        TestBank.getBalance();
        TestBank.withdrawMoney(1888889);

        System.out.print("");

        Bank TestBank2 = new Bank("8888888888888888888889", "1234567", "lisi", "man", "shanghai", "18888888887", 1888886);
        System.out.print(TestBank2.toString());
    }
}