package payload;


public class DataForTests {

	public static String postData() {
		return "{\r\n"
				+ "  \"id\": 21,\r\n"
				+ "  \"name\": \"Amul Restaurant\",\r\n"
				+ "  \"location\": \"Secunderabad\"\r\n"
				+ "}";
	}


	public static String postData1(){
		
		return "{\r\n"
				+ "	  \"id\": 20,\r\n"
				+ "	  \"name\": \"AmuruthVillas Restaurant\",\r\n"
				+ "	  \"location\": \"Hyderabad\"\r\n"
				+ "	}";
	}
	
	public static String putData() {
		return "{\r\n"
				+ "	  \"id\": 6,\r\n"
				+ "	  \"name\": \"Happy Restaurant\",\r\n"
				+ "	  \"location\": \"Madanapalle\"\r\n"
				+ "	}";
		
	}
}
