package session6Assignment4;

public class Sess6Assign4 {

	public static void main(String[] args) {
		//Students of 2014 batch
		ResultProcessingSystem prakash= new StudentsOf2014(01, "Prakash G", 201401);
		System.out.println("Name = "+prakash.getName());
		System.out.println("Roll no = "+prakash.getRoll());
		System.out.println("Registration no = "+prakash.getRegistrationNum());
		prakash.setResult(70);
		prakash.getResult();

		ResultProcessingSystem saurabh= new StudentsOf2014(02, "Saurabh A", 201402);
		System.out.println("Name = "+saurabh.getName());
		System.out.println("Roll no = "+saurabh.getRoll());
		System.out.println("Registration no = "+saurabh.getRegistrationNum());
		saurabh.setResult(65);
		saurabh.getResult();
		
		ResultProcessingSystem keith= new StudentsOf2014(03, "Keith K", 201403);
		System.out.println("Name = "+keith.getName());
		System.out.println("Roll no = "+keith.getRoll());
		System.out.println("Registration no = "+keith.getRegistrationNum());
		keith.setResult(62);
		keith.getResult();
		
		ResultProcessingSystem warren= new StudentsOf2014(04, "Warren M", 201404);
		System.out.println("Name = "+warren.getName());
		System.out.println("Roll no = "+warren.getRoll());
		System.out.println("Registration no = "+warren.getRegistrationNum());
		warren.setResult(85);
		warren.getResult();
		
		ResultProcessingSystem griffith= new StudentsOf2014(05, "Griffith F", 201405);
		System.out.println("Name = "+griffith.getName());
		System.out.println("Roll no = "+griffith.getRoll());
		System.out.println("Registration no = "+griffith.getRegistrationNum());
		griffith.setResult(72);
		griffith.getResult();
		
		//students of 2015 batch
		ResultProcessingSystem praveen= new StudentsOf2015(01, "Praveen G", 201501);
		System.out.println("Name = "+praveen.getName());
		System.out.println("Roll no = "+praveen.getRoll());
		System.out.println("Registration no = "+praveen.getRegistrationNum());
		praveen.setResult(70);
		praveen.getResult();

		ResultProcessingSystem gautam= new StudentsOf2015(02, "Gautam A", 201502);
		System.out.println("Name = "+gautam.getName());
		System.out.println("Roll no = "+gautam.getRoll());
		System.out.println("Registration no = "+gautam.getRegistrationNum());
		gautam.setResult(65);
		gautam.getResult();
		
		ResultProcessingSystem Ashok= new StudentsOf2015(03, "Ashok K", 201503);
		System.out.println("Name = "+Ashok.getName());
		System.out.println("Roll no = "+Ashok.getRoll());
		System.out.println("Registration no = "+Ashok.getRegistrationNum());
		Ashok.setResult(62);
		Ashok.getResult();
		
		ResultProcessingSystem Blaze= new StudentsOf2015(04, "Blaze M", 201504);
		System.out.println("Name = "+Blaze.getName());
		System.out.println("Roll no = "+Blaze.getRoll());
		System.out.println("Registration no = "+Blaze.getRegistrationNum());
		Blaze.setResult(85);
		Blaze.getResult();
		
		ResultProcessingSystem kumar= new StudentsOf2015(05, "Kumar F", 201505);
		System.out.println("Name = "+kumar.getName());
		System.out.println("Roll no = "+kumar.getRoll());
		System.out.println("Registration no = "+kumar.getRegistrationNum());
		kumar.setResult(72);
		kumar.getResult();
		
		//students of 2016 Batch
		ResultProcessingSystem carolynn= new StudentsOf2016(01, "Carolynn G", 201601);
		System.out.println("Name = "+carolynn.getName());
		System.out.println("Roll no = "+carolynn.getRoll());
		System.out.println("Registration no = "+carolynn.getRegistrationNum());
		carolynn.setResult(70);
		carolynn.getResult();

		ResultProcessingSystem joseph= new StudentsOf2016(02, "Joseph A", 201602);
		System.out.println("Name = "+joseph.getName());
		System.out.println("Roll no = "+joseph.getRoll());
		System.out.println("Registration no = "+joseph.getRegistrationNum());
		joseph.setResult(65);
		joseph.getResult();
		
		ResultProcessingSystem arjun= new StudentsOf2016(03, "Arjun K", 201603);
		System.out.println("Name = "+arjun.getName());
		System.out.println("Roll no = "+arjun.getRoll());
		System.out.println("Registration no = "+arjun.getRegistrationNum());
		arjun.setResult(62);
		arjun.getResult();
		
		ResultProcessingSystem stephen= new StudentsOf2016(04, "Stephen M", 201604);
		System.out.println("Name = "+stephen.getName());
		System.out.println("Roll no = "+stephen.getRoll());
		System.out.println("Registration no = "+stephen.getRegistrationNum());
		stephen.setResult(85);
		stephen.getResult();
		
		ResultProcessingSystem remy= new StudentsOf2016(05, "Remy F", 201605);
		System.out.println("Name = "+remy.getName());
		System.out.println("Roll no = "+remy.getRoll());
		System.out.println("Registration no = "+remy.getRegistrationNum());
		remy.setResult(72);
		remy.getResult();
	}

}
abstract class ResultProcessingSystem{
	int studentRoll;
	String name;
	int registerationNumber;
	int result;
	//abstract methods
	abstract public int getRoll();
	abstract public String getName();
	abstract public int getRegistrationNum();
	abstract public void getResult();				//abstract result getter
	abstract public void setResult(int result);		//abstract result setter
	
}
class StudentsOf2014 extends ResultProcessingSystem{			//2014
	public StudentsOf2014(int roll, String Name, int regNum) {
		this.studentRoll=roll;
		this.name=Name;
		this.registerationNumber=regNum;
		
	}

	@Override
	public int getRoll() {
		
		return studentRoll;
		
	}

	@Override
	public String getName() {
		
		return name;
	}

	@Override
	public int getRegistrationNum() {
		
		return registerationNumber;
	}
	
	@Override
	public void setResult(int result) {
		// TODO Auto-generated method stub
		this.result=result;
	}

	@Override
	public void getResult() {
		System.out.println(name+" result with regristeration number " +registerationNumber+" is " +result+ "%.");
		System.out.println("");
	}

	
	
	
}
class StudentsOf2015 extends ResultProcessingSystem{			//2015
	public StudentsOf2015(int roll, String Name, int regNum) {
		this.studentRoll=roll;
		this.name=Name;
		this.registerationNumber=regNum;
		
	}

	@Override
	public int getRoll() {
		
		return studentRoll;
		
	}

	@Override
	public String getName() {
		
		return name;
	}

	@Override
	public int getRegistrationNum() {
		
		return registerationNumber;
	}
	
	@Override
	public void setResult(int result) {
		// TODO Auto-generated method stub
		this.result=result;
	}

	@Override
	public void getResult() {
		System.out.println(name+" result with regristeration number " +registerationNumber+" is " +result+ "%.");
		System.out.println("");
	}

	
	
	
}
class StudentsOf2016 extends ResultProcessingSystem{			//2016
	public StudentsOf2016(int roll, String Name, int regNum) {
		this.studentRoll=roll;
		this.name=Name;
		this.registerationNumber=regNum;
		
	}

	@Override
	public int getRoll() {
		
		return studentRoll;
		
	}

	@Override
	public String getName() {
		
		return name;
	}

	@Override
	public int getRegistrationNum() {
		
		return registerationNumber;
	}
	
	@Override
	public void setResult(int result) {
		// TODO Auto-generated method stub
		this.result=result;
	}

	@Override
	public void getResult() {
		System.out.println(name+" result with regristeration number " +registerationNumber+" is " +result+ "%.");
		System.out.println("");
	}

	
	
	
}