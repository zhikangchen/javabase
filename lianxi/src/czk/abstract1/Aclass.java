package czk.abstract1;

public abstract class Aclass {

	/**
	 * 我想会编程
	 */
	public abstract String learning();

	/**
	 * 我能做什么事情
	 * @return
	 */
	public String canDoSomeThing() {
		return this.learning();
	}
}
