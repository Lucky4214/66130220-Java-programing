package bai_4;

public class BMI {

	public static void main(String[] args) {
		double weight = 51.5;
		double height = 1.6;
		double BMI = weight / (height * height);
		System.out.println("Cân nặng là:" + weight +"kg");
		System.out.println("Chiều cao là:" + height +"m");
		System.out.println("BMI là:" + BMI);
		if(BMI < 18.5) {
			System.out.println("thiếu cân");
		}else if(BMI < 20) {
			System.out.println("bình thường");
		}else if(BMI < 30) {
			System.out.println("thừa cân");
		}else {
			System.out.println("béo phì");
		}

	}

}
