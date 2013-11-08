import java.util.Arrays;
public class Test{

	public static void main(String [] args){
		testPlotFarm();
		testPaintSectors();
		testMoneyChecker();
		testBingo();
	}


	public static void testPaintSectors(){
		PaintSectors paint = new PaintSectors();
		assert Arrays.equals(paint.getColoredSectors(new String[]{"1 2 3 4 5 6","7 8 9 10 11 12","13 14 15 16 17 18"}
		,new int[]{1,3,9,13}
		,new int[]{2,8,12,18}
		,new char[]{'A','Z','J','X'}
		),new String[]{"AAAZZZ","ZZJJJJ","XXXXXX"});
	}

	public static void testBingo(){
		String [] card = {"1 2 3",
						  "4 5 6",							
						  "7 8 9"
							};

		Bingo bingo = new Bingo();
		"VALIDO".equals(bingo.validate(card,new int[]{1,2,3}));
		"VALIDO".equals(bingo.validate(card,new int[]{4,1,2,3}));
		"VALIDO".equals(bingo.validate(card,new int[]{1,2,3,4}));
		"VALIDO".equals(bingo.validate(card,new int[]{3,2,1}));
		"VALIDO".equals(bingo.validate(card,new int[]{1,4,7}));
		"VALIDO".equals(bingo.validate(card,new int[]{7,8,9}));
		"VALIDO".equals(bingo.validate(card,new int[]{3,6,9}));
		"VALIDO".equals(bingo.validate(card,new int[]{9,5,1}));
		"VALIDO".equals(bingo.validate(card,new int[]{7,5,3}));
		"NO VALIDO".equals(bingo.validate(card,new int[]{7,5,2}));
		"NO VALIDO".equals(bingo.validate(card,new int[]{1,2,4}));
		"NO VALIDO".equals(bingo.validate(card,new int[]{3,5,9}));
		"NO VALIDO".equals(bingo.validate(card,new int[]{2,5,3,9,4}));

	}

	public static void testMoneyChecker(){
		MoneyChecker checker = new MoneyChecker();
		assert "OK".equals(checker.calculate(new int[]{1,2,5},3));
		assert "OK".equals(checker.calculate(new int[]{1,1,1,2},4));
		assert "OK".equals(checker.calculate(new int[]{1,1,1},3));
		assert "OK".equals(checker.calculate(new int[]{5,1,1,1,5},3));
		assert "NO OK".equals(checker.calculate(new int[]{1},3));
		assert "NO OK".equals(checker.calculate(new int[]{},3));
		assert "NO OK".equals(checker.calculate(new int[]{1,1},3));
		assert "OK".equals(checker.calculate(new int[]{2,2,1},3));
			
	}
	

	public static void testPlotFarm(){
		PlotFarm plot = new PlotFarm();
		print(plot.getFarmPlot(4, 3));
	
	}

	private static void print(String [] farm){
		for(String line : farm){
			System.out.println(line);		
		}
	}

}
