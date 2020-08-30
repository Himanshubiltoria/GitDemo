package qaclickacademy.Mavenjava;

import java.util.HashMap;

import org.testng.annotations.Test;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class ExcelReader {
	@Test
	public void readDataExcel() throws FilloException {
		Fillo fillo = new Fillo();
        String path = System.getProperty("user.dir");
		Connection connection = fillo.getConnection(path+"\\Data\\Testdata1.xlsx");
		
		String strquery = "Select * from Sheet1";
		
				
		//Recordset recordset = connection.executeQuery("Select * from sheet1");
		Recordset recordset = connection.executeQuery(strquery);
		
		while(recordset.next()) {
			HashMap<String, String> hash = new HashMap<String, String>();
//			hash.get(recordset.getField("Browser"));
//			hash.get(recordset.getField("URL"));
			hash.put(recordset.getField("Browser"), (recordset.getField("URL")));
//			System.out.println(hash);
			OpenBrowser.testCase(hash);
//			System.out.println(hash);
			
	
		}

		
	}

	
	/*
	public void readDataFromExcel() throws FilloException
	{
	HashMap<String, String> map = new HashMap<String, String>();
	Fillo fillo=new Fillo();
	String path = System.getProperty("user.dir");
	System.out.println("PATH "+path);
	Connection connection=fillo.getConnection(path+"/data/student.xlsx");
	String strQuery="Select * from Sheet1";
	Recordset recordset=connection.executeQuery(strQuery);
	while(recordset.next()){
	//System.out.println(recordset.getField("Class"));
	map.put("FirstName", recordset.getField("FirstName"));
	}
	recordset.close();
	connection.close();
	System.out.println(map);
	}*/

}
