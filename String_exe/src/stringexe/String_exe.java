package stringexe;

import java.util.Arrays;

public class String_exe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		�ڹ� String ������ �޼ҵ� ����

//		1. substring : ���ڿ� �ڸ���
//		substring(int start) : start���� ������ ���ڿ��� �ڸ�
//		substring(int start, int end) : start���� end �ձ��� ���ڿ��� �ڸ�
//		return�� : �߸� ���ڿ�
//		
//		String tmp_str = "abcdefgh";
//		String sub1 = tmp_str.substring(5);
//		String sub2 = tmp_str.substring(1, 4);
//		
//		System.out.println("sub1 = " + sub1);
//		System.out.println("sub2 = " + sub2);

//		2. length : ���ڿ��� ���� ���ϱ�
//		���� : length()
//		return�� : ����, ���ڿ� ����
//		
//		String string1 = "java";
//		String string2 = "�޼ҵ� ����";
//		
//		System.out.println("string1.length() = " + string1.length());
//		System.out.println("string2.length() = " + string2.length());
		
//		3. split : ���ڿ� ������
//		String[] split(String divider)
//		�Լ��� ���� : ���ڿ��� �ڸ� �и��ڷ� ������ ���ڿ� �迭�� ��Ƽ� ��ȯ ��
//		1st �Ű����� : �и���
//		return�� : �и��ڷ� �߸� ���ڿ� �迭
//		
//		String str_num = "123 4567 890";
//		String[] arr = str_num.split(" ");
//		
//		System.out.println(Arrays.toString(arr));
//		System.out.println("arr[0] = " + arr[0]);
//		System.out.println("arr[1] = " + arr[1]);
//		System.out.println("arr[2] = " + arr[2]);
		
//		4. equals : ���ڿ� ��ġ ���� �˻�
//		boolean equals(Object obj)
//		1st �Ű����� : ���ڿ� ��ü�� ����
//		return�� : ��ġ�ϸ� ��(true), Ʋ���� ����(false)
//		���ڿ� �� if("abc" == "abc") : ���ڿ� �� �� �� �������� ���� �� ��
//		���ڿ� �� if("abc".equals("abc") == true) : �������� ��� ��
//		���� ���� :  if('a' == 'a') : �� ���� �� �̰� �� ����
//		
//		String s = "Hello Java";
//		boolean c1 = s.equals("Hello Java");
//		boolean c2 = s.equals("Fucking Java");
//		
//		System.out.println("c1 = " + c1);
//		System.out.println("c2 = " + c2);
		
//		5. contains : ���ڿ��� ���� �� ���ڰ� �ִ��� �˻�
//		boolean contain(�˻� �� ���ڿ�)
//		1st �Ű� ���� : �˻� �� ���ڿ�
//		return�� : �˻� �� ���ڿ��� ������ true(��), ������ flase(����)
//		
//		String string1 = "abcdefgh";
//		boolean a1 = string1.contains("efg");
//		boolean a2 = string1.contains("fuck");
//		
//		System.out.println("a1 = " + a1);
//		System.out.println("a2 = " + a2);
		
//		6. startWith, endsWith : ���ڿ� ���� �Ǵ� �� �κп� ��ġ�ϴ� ���ڿ��� �ִ��� �˻�
//		boolean stratWith(String s) : ���ڿ� s�� �����ϴ��� �˻� (������ true, Ʋ���� false)
//		boolean endsWith(String s) : ���ڿ� s�� �������� �˻� (������ true, Ʋ���� false)
//		
//		String string1 = "http://www.naver.com";
//		boolean b1 = string1.startsWith("http");
//		boolean b2 = string1.endsWith("co.kr");
//		
//		System.out.println("b1 = " + b1);
//		System.out.println("b2 = " + b2);
		
//		7. replace : ���ڿ��� ������ ���ڿ��� �ٲٱ�
//		String replace(���� ���ڿ�, �ٲ� ���ڿ�)
//		return�� : �ٲپ��� ���ڿ�
//		
//		String tmp_str = "ABCDEF";
//		
//		String string2 = tmp_str.replace("DE", "XX");
//		
//		System.out.println("tmp_str = " + tmp_str);
//		System.out.println("string2 = " + string2);
		
//		8. trim : ���ڿ� �¿��� ���� ���ֱ�
//		String trim()
//		return�� : ���ڿ� ó���� ���� ������ ���� ���ڿ�
//		
//		String tmp_str = "    Hello java text   ";
//		String trim_str = tmp_str.trim();
//		
//		System.out.println("trim_str = " + trim_str);
		
//		9. toLowerCase : ���ڿ��� �빮�ڸ� �ҹ��ڷ� �ٲٱ�
//		String toLoweCase()
//		return�� : ��� �ҹ��ڷ� �ٲ� ���ڿ�
//		
//		String tmp_str = "Java Programming Test";
//		String tmp_lower = tmp_str.toLowerCase();
//		
//		System.out.println("tmp_lower = " + tmp_lower);
		
//		10.toUpperCase : ���ڿ��� �ҹ��ڸ� �빮�ڷ� �ٲٱ�
//		String toUpperCase()
//		return�� : ��� ���ڿ��� �빮�ڷ� �ٲپ ��ȯ
//		
//		String tmp_str = "Java Programming Test";
//		String tmp_upper = tmp_str.toUpperCase();
//		
//		System.out.println("tmp_upper = " + tmp_upper);
		
//		11. charAt() : �Ű������� index��ȣ�� �ش��ϴ� ���� �ϳ��� ��ȯ
//		char charAt(int index)
//		1st �Ű����� : ���ڿ� ����迭�� index��ȣ
//		return�� : ���ڿ� index��ȣ�� �ش��ϴ� ���� �ϳ�
//		
//		String str = "abcdefg";
//		char chr = str.charAt(1);
//		char chr2 = str.charAt(str.length() - 1);
//		
//		System.out.println("chr = " + chr);
//		System.out.println("chr2 = " + chr2);
		
//		12. indexOf(ã�� ���ڿ�) : ���ڿ� �� ã�� ���ڿ��� ������ ù index��ȣ�� ��ȯ
//		int indexOf(String str)
//		1st �Ű����� : ã�� ���ڿ�
//		return�� : ã�� ���ڿ��� ù��° ������ index��ȣ, ������ -1
		
		String str = "abcdefg hi";
		int index = str.indexOf("a");
		int index2 = str.indexOf("hi");
		int index3 = str.indexOf("j");
		
		System.out.println("index = " + index);
		System.out.println("index2 = " + index2);
		System.out.println("index3 = " + index3);
	}

}