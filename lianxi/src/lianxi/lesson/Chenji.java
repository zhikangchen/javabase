package lianxi.lesson;

public class Chenji {

	public static void main(String[] args) {

		// 90<= c <= 100 --》3
		// 60<= c <90    --》2
		// 30<= c <60    --》1
		// 0<= c <30     --》0
		int c = 29;
		int z = c / 30;
		System.out.println(z);
		switch (z) {
		case 3:
			System.out.println("优");
			break;
		case 2:
			System.out.println("良");
			break;
		case 1:
			System.out.println("差");
			break;
		default:
			System.out.println("极差");

		}
	}
}
