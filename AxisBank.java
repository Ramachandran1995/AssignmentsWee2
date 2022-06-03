package bank;

public class AxisBank  extends BankInfo{
	public void deposit() {
		System.out.println("Axis Bank");
	}
public static void main(String[] args) {
	AxisBank bank=new AxisBank();
	bank.deposit();
	bank.fixed();
	bank.savings();
}
	

}