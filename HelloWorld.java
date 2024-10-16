import java.util.Random;

public class HelloWorld{
  public static void main(String[] args) {
		Random r=new Random();
		String[] word= {"Hello","HelloWorld"};
		for(int i=0;i<=12;i++) {
			String rs=word[r.nextInt(0,2)];
			System.out.println(rs);
		}
}
