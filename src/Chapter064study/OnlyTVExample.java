package Chapter064study;

public class OnlyTVExample {

	public static void main(String[] args) {

		OnlyTV myTv = new OnlyTV();

		int[] values1 = { 1, 2, 3 };
		int result1 = myTv.sum1(values1);
		System.out.println("result1 : " + result1);

		int result2 = myTv.sum1(new int[] { 1, 2, 3, 4 });
		System.out.println("result2 : " + result2);

		int result3 = myTv.sum2(1, 2, 3);
		System.out.println("result3 : " + result3);

		int result4 = myTv.sum2(1, 3, 5, 7, 9);
		System.out.println("result4 : " + result4);

	}

}
