package steve.spring.reflect;

public class ClassNameTest {
	public static void main(String[] args) {

		System.out.println(ClassNameTest.class.getCanonicalName()); //获取类的完全限定名
	}
}
