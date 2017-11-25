package lianxi.lesson;

import java.util.Date;

public class Tank {
	String model;// 属性，属性名为model
	private String color;// 颜色
	private int speed;// 速度

	private int length;// 长度
	private int width;// 宽度
	private int height;// 高度

	private double weight;// 重量
	// int volume;//体积
	
	private Date birthDay;	//生产日期
	private boolean heavy;  //是否重型坦克
	

	/**
	 * 变量和属性相同点：都是存放数据；
	 *  不同点，生命周期不同；<br>
	 * 变量只在方法内部存在（有效） 属性，在类存放，属性就存在；
	 */
	
	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	public boolean isHeavy() {
		return heavy;
	}

	public void setHeavy(boolean heavy) {
		this.heavy = heavy;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * 属性与方法 属性，存放数据的； <br>
	 * 方法，对数据做计算；
	 */
	/**
	 * 属性值的赋值和获取值的，有两种方式；<br>
	 * 1。权限放开，直接访问；<br>
	 * 2。设置权限（设置成隐藏的），通过get和set方法；
	 * 
	 * @return
	 */
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	/**
	 * 入口函数
	 * @param args
	 */
	public static void main(String[] args) {
		// String model;//定义一个字符串类型的变量
		// new 关键字，创建一个新的类
		/**
		 * new 关键字，创建一个新的实例
		 */
		Tank tank1 = new Tank();
		String color = tank1.getColor();
		System.out.println("坦克的颜色 ："+color);
		
		tank1.setColor("绿色");
		
		String color1 = tank1.getColor();
		System.out.println("坦克的颜色 ："+color1);
		//int length = 5;
		tank1.setLength(5);// 长度
		//int width = 3;
		tank1.setWidth(3);// 宽度
		//int height = 2;// 高度
		tank1.setHeight(2);
		int volume = tank1.volume();
		System.out.println("坦克的体积："+volume);
		
		System.out.println("坦克的重量："+tank1.getWeight());
		
		System.out.println("坦克的生产日期："+tank1.getBirthDay());
		
		System.out.println("是否重型坦克："+tank1.isHeavy());
		/**
		 * 属性未赋值时，会有默认值；
		 * 字符串：null<br>
		 * 时间：null<br>
		 * 整数：0 <br>
		 * 小数：0.0<br>
		 * 布尔：false<br>
		 */
	}

	public int volume() {
		int volume = length * width * height;
		return volume;
	}

}
