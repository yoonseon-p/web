package basic;

public class Ex06 {
	
	// ������ ���� 1��
	// ������ ���� 1��
	// ������ ���� 1��
	// ������ ���� 1��
	// ������ ���� 5���� ���� �Լ��� ����
		
	// ��ü������ ���� �ٽ��� overload -  ��ǥ���� ���̽��� overload
	// constructor overload
//	public static void method(int num) { }
//	public static void method(int num, int num2) { }
//	public static void method(int num, double num2) { }
//	public static void method(double num, int num2) { }
//	public static void method(int num, int num2, int num3) { }
	
	public static void method(int...num) { 
		System.out.println(num.length);
		System.out.println(num[0]);
	}
	
	public static void main(String[] args) {
		method(1,2,3,4);
		method(1,2);
		method(1);
		method(1,2,3,4,5,6,7,8,9,10,11,12);
	}
}