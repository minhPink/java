package baitap;

public class Test {
	public static void main(String[] args) {
		Product pr = new Product();
		Product pr1 = pr.nhapThongTin("computer", 200d, 10d);
		pr1.xuatThongTin(pr1);
		System.out.println(pr1.getTaxPrice(pr1.getPrice(), pr1.getTax()));
	}
}
