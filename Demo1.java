
public class Demo1 {
	/** 示例：打印每个员工的工资等级
	  如果大于3000就是D级，如果大于5000是C级，如果大于8000是B级
	  大于10000是A级。
*/
	public static void main(String[] args) {
		//定义一个工资的变量
		int salary = 11000;
		if(salary>3000 && salary<=5000) {
		System.out.println("D级");
		}
		if(salary>5000&&salary<=8000) {
			System.out.println("C级");
		}if(salary>8000&&salary<=10000)	{
			System.out.println("B级");
			
			
		}if(salary>10000) {
		System.out.println("A级");
		}

}
}