package Task1;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class GetGoldenImage {
    public  void getGolden() {
        try {
            golden();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public  void golden() throws Exception {
        String url = "https://dog.ceo/api/breed/retriever/images/random";
        URL obj = new URL(url);

        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        // optional default is GET
        con.setRequestMethod("GET");
        //add request header
        con.setRequestProperty("User-Agent", "Chrome2.48");
        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);
        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        //Perform an API request to produce a random image / link for the sub-breed “golden” (Diagram 4)

       // System.out.println("--------Perform an API request to produce a random image / link for the sub-breed “golden” (1.4)---------\n");
        System.out.println(response.toString());
        JSONObject myResponse = new JSONObject(response.toString());
        System.out.println("result after Reading JSON Response");
        System.out.println("origin- " + myResponse.getString("origin"));

    }

    }
