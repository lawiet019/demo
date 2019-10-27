package implement;

public class Student {
	private String name;
	private int id;
	private String phone;
	private String address;
	private int age;
	private String department;
	public Student(int id,String name) {
		this.id = id;
		this.name = name;			
	}
	public String getName(){
		return this.name;
		
	}
	public int getId(){
		return this.id;	
	}
	String getAddress() {
		return this.address;
	}
	void setAddress(String address) {
		this.address = address;
	}
	protected String getPhone() {
		return this.phone;
	}
	protected void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDepartment() {
		return this.department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public void printStudentInfo() {

		System.out.printf("name:%s",this.getName());
		System.out.println();
		System.out.printf("id:%d",this.getId());
		System.out.println();
		System.out.printf("phone:%s",this.getPhone());
		System.out.println();
		System.out.printf("address:%s",this.getAddress());
		System.out.println();
		System.out.printf("age:%d",this.getAge());
		System.out.println();
		System.out.printf("department:%s",this.getDepartment());	
	}
	public static void main(String[] args) {
		//
		Student s = new Student(001,"Jerry");
		s.setAddress("1st street");
		s.setAge(20);
		s.setDepartment("LIS");
		s.setPhone("123456789");
		s.printStudentInfo();
		
	}
		 
		
	
	

}
