package Task1;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class GetAllDogs {

    public static void main(String[] args) {
        try {
            GetAllDogs.call_me();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void call_me() throws Exception {
        String url = "https://dog.ceo/api/breeds/list/all";
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

        //Perform an API request to produce a list of all dog breeds. (Diagram 1)

        System.out.println("--------list of all dog breeds (1.1)---------\n");
        System.out.println(response.toString());


        //Using code, verify “retriever” breed is within the list. (Diagram 2)

        String getResponse= response.toString();
        System.out.println("\n");
        System.out.println("---------------verifying “retriever” breed is within the list (1.2)---------------\n");
        if(getResponse.contains("retriever")){


            System.out.println("Retriever breed is in the list\n");


        }
        else
            System.out.println("Retriever is not in the list/n");


        // Perform an API request to produce a list of sub-breeds for “retriever”. (Diagram 3)
        System.out.println("----------Perform an API request to produce a list of sub-breeds for “retrieve (1.3)----------/n");
        ListOfSubBreeds listOfSubBreeds= new ListOfSubBreeds();
        listOfSubBreeds.call_me();




        //Read JSON response and print
        JSONObject myResponse = new JSONObject(response.toString());
        System.out.println("result after Reading JSON Response");
        System.out.println("origin- " + myResponse.getString("origin"));








    }




    }




