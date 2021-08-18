
public class SimpleTable {

	private String corner;
	private String roof;
	private String base;
	private String side;
	
	private String header;
	private String[] data;
	
	public SimpleTable(String corner, String roof, String base, String side, String header, String[] data) {
	
		this.corner = corner;
		this.roof = roof;
		this.base = base;
		this.side = side;
		this.header = header;
		this.data = data;
	}
	
	public SimpleTable(String header, String[] data) {
		
		this.corner = "+";
		this.roof = "-";
		this.base = "-";
		this.side = "|";
		
		this.header = header;
		this.data = data;
	}
	
	public void printCard(int size) {
	
		int headerStart = (size-header.length())/2;
		int remaining  = size - header.length() - headerStart;
		
		String leftAlignFormat = side + " %-" + (size-4) + "s " + side;
		
		String space = " ";
		System.out.println(corner + roof.repeat(size-2) + corner);
		System.out.println(side + space.repeat(size-2) + side);
		System.out.println(side + space.repeat(headerStart-1) + header + space.repeat(remaining-1)+side);
		System.out.println(side + space.repeat(size-2) + side);
		System.out.println(side + roof.repeat(size-2) + side);
		
		for (String s : data) {
			System.out.printf(leftAlignFormat, s);
			System.out.println();
		}
		System.out.println(corner + base.repeat(size-2) + corner);
		
		
	}
	
	
	
}
