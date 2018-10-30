package Task1;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;

import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.json.JSONObject;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ListOfSubBreeds {
@Test
    public  void getbreed(){
        try {
            call_me();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public  void call_me() throws Exception {
        String url = "https://dog.ceo/api/breed/retriever/list";
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

       // Perform an API request to produce a list of sub-breeds for “retriever”. (Diagram 3)
        System.out.println("--------Perform an API request to produce a list of sub-breeds for “retriever”---------\n");
        System.out.println(response.toString());
        System.out.println("----------Perform an API request to produce a random image / link for the sub-breed “golden” (1.4)-------)\n");
        //calling a getgolden class
        GetGoldenImage getGoldenImage= new GetGoldenImage();
        getGoldenImage.golden();

        //Read JSON response and print
        JSONObject myResponse = new JSONObject(response.toString());
        System.out.println("result after Reading JSON Response");
        System.out.println("origin- " + myResponse.getString("origin"));







}
    }
