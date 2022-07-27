package hw3JavaVariables;


public class Hasib {
	public String name = "Hasib Ahmed";
	public byte age = 127;
	public short myApartmentRent = 32767;
	public int myYearlySalary = 1234567890;
	public long myBankBalance = 123456789; //use L end of the value
	public float myHeight = 5.123456789f;
	public double myGrade = 3.123;
	public char sex = 'M';
	public boolean usCitizen = true;
	
	public static void main(String[] args) {
		//Hasib is a class, hasib is a variable 
	
		
		Hasib hasib = new Hasib();
		System.out.println(hasib.name);
		System.out.println("My name is: " + hasib.name);
		System.out.println(hasib.age);
		System.out.println(hasib.myApartmentRent);
		System.out.println(hasib.myYearlySalary);
		System.out.println(hasib.myBankBalance);
		System.out.println(hasib.myHeight);
		System.out.println(hasib.myGrade);
		System.out.println(hasib.sex);
		System.out.println(hasib.usCitizen);
		System.out.println("My name is: " + hasib.name + " My Age: " + hasib.age + " My rent Is: 4300" + hasib.myApartmentRent  + " My yearly salary is : 2000" + hasib.myYearlySalary);
		System.out.println("My name is: " + hasib.name + " \nMy Age: " + hasib.age);

		

	}
	



}