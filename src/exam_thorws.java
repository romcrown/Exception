
public class exam_thorws {

	public static void main(String[] args) {

		try {
			System.out.println("탐색을 시작합니다.");
			start();
			System.out.println("탐색을 중단합니다.");
		} catch (Exception e) {
			System.out.println("보물 발견."); // start의 catch에서 예외를 여기서 처리.
		}
	}

	public static void start() throws Exception {
		int array[] = new int[12];
		int treasure = 1;
		int stone = 0;

		array[11] = treasure;

		for(int i = 0 ; i < 11 ; i++) {
			array[i] = stone;
		}
		
		try {
			for (int i = 0; i < array.length; i++) {
				if (array[i] != array[11]) {
					System.out.println("쾅쾅쾅...");
				}
				else 
					throw new Exception(); //예외 발생 시킴. -> catch 로 넘긴다.
			}

		} catch (Exception e) {
			System.out.println("보물을 발견했습니다."); //발생 시킨 예외를 여기서 처리.
			throw e; //catch 에 있는 예외 throws 가 처리.
		
		}
		finally {
			System.out.println("작업을 종료합니다.");
			
		}
		
	}
}
