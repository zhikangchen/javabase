package lianxi.lesson;

import java.util.Date;

public class Bird {
	private String varieties;
	private String color;
	private double weight;
	private Date birthDay;
	private boolean Parrot;

	public String getVarieties() {
		return varieties;
	}

	public void setVarieties(String varieties) {
		this.varieties = varieties;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	public boolean isParrot() {
		return Parrot;
	}

	public void setParrot(boolean parrot) {
		Parrot = parrot;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird bird1 = new Bird();
		String color = bird1.getColor();
		System.out.println("鸟的颜色 ：" + color);
		bird1.setColor("黄色");
		String color1 = bird1.getColor();
		System.out.println("鸟的颜色 ：" + color1);
		
		bird1.setWeight(2);
		
		System.out.println("鸟的重量：" + bird1.getWeight());

		System.out.println("鸟的出生日期：" + bird1.getBirthDay());

		System.out.println("是不是鹦鹉：" + bird1.isParrot());

	}

}
