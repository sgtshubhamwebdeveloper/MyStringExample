package mystringexamples;

public class ExampleofString {
	public static void main(String[] args) {
		String str = "Shubham";
		StringBuffer sbr = new StringBuffer(str);
		sbr.reverse();
		System.out.println(sbr);
		StringBuilder sbl = new StringBuilder(str);
		sbl.append("543m8");
		System.out.println(sbl);
	}

}
