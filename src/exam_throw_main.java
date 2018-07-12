import java.util.Scanner;

public class exam_throw_main {

	public static void main(String[] args) {
		try {
			System.out.println("=============");
			repeat.start();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}

class scan {
	Scanner sc = new Scanner(System.in);

	public String str() {
		String a = sc.next();
		return a;
	}

	public int Int() {
		int a = sc.nextInt();
		return a;
	}
}

class repeat {

	static void start() throws Exception { // throws 는 예외를 던진다음 예외를 알아서 처리해준디.

		scan sc = new scan();
		Cal cal = new Cal();

		while (true) {
			try { // try .catch 는내가 발생한 예외를 직접 처리하겠다는 뜻.
				System.out.println("1.더하기, 2.빼기, 3.곱하기, 4.나누기, 5.stop");
				String num = sc.str();
				if (num.equals("1")) {
					cal.puls();
					break;
				} else if (num.equals("2")) {
					cal.minus();
					break;
				} else if (num.equals("3")) {
					cal.mul();
					break;
				} else if (num.equals("4")) {
					cal.div();
					break;
				} else if (num.equals("5")) {
					System.out.println("종료.");
					break;
				} else {
					// throw new Exception("에러 내용입니다."); // 이위치에서 강제로 예외처리를 하겠다는 뜻.
					System.out.println("숫자를 확인해 주세여.");
				}
			} catch (Exception e) {
				e.printStackTrace(); // 오류 를 보여준다.
			}

		}
	}
}

class Cal {

	void puls() {
		System.out.println("숫자를 입력하세요. 입력후 엔터를 누르면 자동으로 더해집니다. 000을 누르면 종료.");
		scan sc = new scan();
		int array[] = new int[999];
		array[0] = 0;

		for (int i = 1; i < array.length; i++) {
			System.out.print("prompt > ");
			int b = sc.Int();
			if (b == 0) {
				System.out.println("종료.");
				break;
			} else {
				int sum = array[i - 1] + b;
				array[i] = sum;
				System.out.println(array[i]);
			}
		}

	}

	void minus() {

	}

	void mul() {

	}

	void div() {

	}
}