package javainterviewquestions;

public class reversestring {
	public static void main(String[] args) {

		String str = "valid";
		int len = str.length();
		System.out.println(len);
		String rev = "";
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);

		}

		System.out.println("reverse string= " + rev);

		StringBuffer sf = new StringBuffer("correct");
		System.out.println("reverse string= " + sf.reverse());

		StringBuilder sb = new StringBuilder("java");
		System.out.println("reverse string= " + sb.reverse());

		String s = "@@##$%^ Selenium #$%^^ Java $%%^^&    153266@#@$2343  @@#$$$%#$ Testing";
		String rep = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("ReplaceJunk =  " + rep);

		int num = 123456789;
		int re = 0;
		while (num != 0) {
			re = re * 10 + num % 10;
			num = num / 10;

		}
System.out.println("Reverse number="+re);
	}
}
