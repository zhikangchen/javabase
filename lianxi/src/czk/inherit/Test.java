package czk.inherit;

public class Test {

	public static void main(String[] args) {
		Aclass a = new Aclass();
		a.car = "尼桑";
		a.house = "万福林";
		
		System.out.println("属性1："+a.house);
		System.out.println("属性2："+a.car);
		
		System.out.println("方法1："+a.doSomeThing());
		
		
		Bclass b = new Bclass();
		
		System.out.println("属性1："+b.house);
		System.out.println("属性2："+b.car);
		
		System.out.println("方法1："+b.doSomeThing());
	}

}
