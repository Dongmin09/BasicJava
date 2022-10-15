package chapter041;

public class 교육ifswitch {
	
	// 랜덤 숫자 만들기
	
	/*
	 * 1. 좋지않은 방ㅎ식
	 * int randomNum = (int) (Math.random() * 총개수) + 시작숫자;
	 * 이유 : 
	 * 
	 * 2. 좋은 방식
	 * Random random = new Random();
	 * int randomNum = random.nexInt(총개수) + 시작숫자;
	 * -ex 6이라고 쓰면 0~5까지 숫자를 가져옴. 0~( 괄호안의 숫자 -1까지 만들어줌) 
	 * 게임같은 곳에서 확률적으로 하기위해 많이씀
	 * 
	 * 
	 * 3. 보안 적용
	 * SecureRandom sercureRandom = new SecureRandom();
	 * int randomNum = secureRandom.nextInt(총개수) + 시작숫자;
	 * 
	 * 직접하려고 노력을하고 왠만하면 시간이 걸리더라도 풀어볼것.
	 * 만약 도저히 모르겠으면 참조만하고 다시 자기가 직접 해결해볼것.
	 * 
	 */

}
