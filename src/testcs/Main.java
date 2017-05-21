package testcs;

import a.db.create.BuildDB;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Test.delete();
		
		//Test2.TestCSFailures();
		
		
		//create the data base then comment this line and continue
		BuildDB.createDb();
		System.out.println("done");
		
		//after DB is built uncomment the below and run
		//Test.testCs();
		
	}

}
