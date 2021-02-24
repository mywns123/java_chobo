package java_chobo.ch07.abstract01;

public class SubAbstractTest extends AbstractTest {

	@Override
	public void prnTest() {
		System.out.println("Sub");
		super.prnTest();
	}

	@Override
	void prnTest2() {
		System.out.println("SubTest");
	}

	public static void main(String[] args) {
		SubAbstractTest sat = new SubAbstractTest();
		sat.prnTest();

		AbstractTest sat1 = new SubAbstractTest();
		sat1.prnTest();

	}
}
