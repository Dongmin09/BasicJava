package chapter13.확인문제;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);

		String name = null;
		int maxScore = 0;
		int totalScore = 0;

		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> entry : entrySet) {

			Integer score = entry.getValue();
			totalScore += score;
			if (maxScore < score) {

				maxScore = score;

				name = entry.getKey();

			}

		}

		System.out.println("평균" + (totalScore / map.size()));
		System.out.println("최고 점수" + maxScore);
		System.out.println("최고 점수 아이디" + name);
		/*
		 * Set<Entry<String, Integer>> entrySet = map.entrySet(); for (Map.Entry<String,
		 * Integer> entry : entrySet) { if (entry.getValue() > maxScore) {
		 * 
		 * name = entry.getKey(); maxScore = entry.getValue();
		 * 
		 * }
		 * 
		 * totalScore += entry.getValue();
		 * 
		 * }
		 * 
		 * int avgScore = totalScore / map.size(); System.out.println("평균점수: " +
		 * avgScore);
		 * 
		 * System.out.println("최고 점수: " + maxScore);
		 * 
		 * System.out.println("최고 점수 이름: " + name);
		 */
	}

}
