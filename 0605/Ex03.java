package basic;
/*
 * 
 * ����ڰ� ������ ���� ������ 1���� ���������� ���� ���ϴµ�
 * �� ���� 50�� �Ѿ�� �����ϰ� �׶������� ������ ���� ���
 * ���࿡ 50�� �ȳѾ�� ���� ���� ���ؼ� ���
 * 
 */
public class Ex03 {

	public static int add(int num) {
		int sum=0;
		for (int i = 0; i <= num; i++) {
			sum += i;
			if(sum > 50) {
				return sum;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(add(10));
	}

}