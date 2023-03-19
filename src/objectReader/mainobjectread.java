package objectReader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.gson.Gson;
public class mainobjectread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String apiUrl = "http://universities.hipolabs.com/search?country=Oman";
		try {
		URL url = new URL(apiUrl);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Accept", "application/json");
		if (conn.getResponseCode() != 200) {
		throw new RuntimeException("HTTP error code : " + conn.getResponseCode());
		}
		BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
		String output;
		StringBuilder json = new StringBuilder();
		while ((output = br.readLine()) != null) {
		json.append(output);
		}
		conn.disconnect();
		Gson gson = new Gson();
		MyObject[] myObjs = gson.fromJson(json.toString(), MyObject[].class);
		for (MyObject myObj : myObjs) {
		    System.out.println("Name: " + myObj.getName());
		    System.out.println("Country: " + myObj.getCountry());
		    System.out.println("State/Province: " + myObj.getStateProvince());
		    System.out.println("Website: " + myObj.getWeb_pages().get(0));
		    System.out.println("Domain: " + myObj.getDomains().get(0));
		    System.out.println("Alpha-2 Code: " + myObj.getAlpha_two_code());
	
		}
		
		
		
		
		// Use myObj for further processing
		} catch (Exception e) {
		e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
	}

}
