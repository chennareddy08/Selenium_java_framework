package utility;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;

public class Timestamp {

public  String email;
public String name;
public String phone;
public String address;

	public Timestamp(){
	       this.name =name;
			 this.email=email;
			 this.phone=phone;
	         this.address =address;
		// TODO Auto-generated method stub
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		Date date = new Date();
		String timestamp =dateFormat.format(date);
	    email="test"+timestamp+"@gmail.com";
		name="test"+timestamp;
		phone =timestamp;
		address=timestamp +"Bangalore";
		
		

	}	
	}


