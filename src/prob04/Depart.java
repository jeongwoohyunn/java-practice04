package prob04;

public class Depart extends Employee {
	private String department;
	//상속을 받아서
	public Depart(String name, int salary, String department) {
		//오버라이딩
		super(name,salary);//부모 employee의 name과 샐러리
		this.department = department;//department 사용(보충하기)
	}
	@Override
	public void getInformation() {
		System.out.println( "이름:" + getName() + ", 연봉 : " + getSalary() + ", 부서 : " + department);
	}
}
