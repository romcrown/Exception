
public class exam_exception {

	public static void main(String[] args) {
		int num;
		try {
			num = 20 / 0;
			System.out.println(num);
		}catch (ArithmeticException e) { //Exception 외에 넣을수 있는 함수가 여러가지 있다.
			System.out.print("오류 내용 > ");
			e.printStackTrace(); // 오류 위치와 내용을 출력해준다.
			//System.out.println(e.getMessage()); //  -> 오류를 출력해준다.
		}
		
		//finally 는 예외가 발생해도 무조건 실행시켜준다.
		finally {
			System.out.println("aaaaa");
		}
	}
}
