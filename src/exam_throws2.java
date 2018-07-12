class axException extends Exception {
	
}

class failException extends Exception {

}

public class exam_throws2 {
	public static void main(String[] args) {
		try {
			System.out.println("장작이 9개 정도 나올것 같은 나무 입니다.");
			System.out.println("벌목을 시작합니다.");
			System.out.println();
			start();

		} catch (Exception e) {
			System.out.println("장작을 얻었습니다.");
		}
	}

	public static void start() throws Exception {
		int array[] = new int[10];
		int finalwood = 1;
		int ax = 3; // ax가 array 의 크기보다 크면 결과가 달라진다.
		int wood = 0;

		array[9] = finalwood;

		for (int i = 0; i < 9; i++) {
			array[i] = wood;
		}

		try {
			for (int i = 0; i < array.length; i++) {
				if(array[i] != finalwood && ax != 0) {
					System.out.println("쿵쿵........ 장작 "+ (i+1) +" 개 를 얻었습니다!");
					ax--;
				}
				else if(ax == 0)
					throw new axException();
				else
					throw new failException();
			}
		} catch (axException e) {
			System.out.println("도끼가 부러졌습니다....");
			throw e;
		} catch (failException e) {
			System.out.println("더이상 장작이 나올꺼 같지 않습니다.");
			throw e;
		}
		finally {
			System.out.println("벌목이 끝났습니다.");
		}
	}

}
