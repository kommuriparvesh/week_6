package builder;

public class Builders{

	public static void main(String[] args) {
		
	Builder boardBuilder = new BoardBuilder();
	ChalkFactory board = boardBuilder.collectRawMaterials().unpackRawMaterials().make().check().pack().build();

		
		board.prepare();
		board.box();
		System.out.println(board);
		
		Builder chalkBuilder = new ChalkBuilder();
		ChalkFactory chalk =  chalkBuilder.collectRawMaterials().unpackRawMaterials().make().check().pack().build();
		chalk.prepare();
		chalk.box();
		System.out.println(chalk);
		
		StringBuilder sb = new StringBuilder();
		sb.append("\nTesting String Builder\n").append(board).insert(0, "====");
		System.out.println(sb.toString());
		
		String sb2 = new StringBuilder().append("\nTesting String Builder\n").append(chalk).insert(0, "====").toString();
		System.out.println(sb2);
			}
}