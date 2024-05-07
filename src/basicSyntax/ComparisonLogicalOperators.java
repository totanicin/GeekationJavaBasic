package basicSyntax;

public class ComparisonLogicalOperators {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int a = 10;
		int b = 5;
		boolean resultA = (a > b);
		System.out.println(resultA);
		
		boolean isSunny = true;
		boolean isWarm = true;
		boolean resultB = isSunny && isWarm;
		System.out.println(resultB);
		
		int x = 0;
		int y = 4;
		boolean resultC = (x >= 0 && y % 2 == 0 );
		System.out.println(resultC);
		
		boolean hasPermission = false;
		boolean resultD = !hasPermission;
		System.out.println(resultD);
	

	}

}
