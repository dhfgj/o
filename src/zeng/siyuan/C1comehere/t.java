package zeng.siyuan.C1comehere;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vn0xrjh on 11/18/16.
 */
public class t {
    public static void main(String[] args) throws IOException {
        HttpClient client = new DefaultHttpClient();
        HttpPost post = new HttpPost("http://textbelt.com/text");
        HttpGet get = new HttpGet("http://localhost:9200/movies/movie/1");

//        System.out.println("executing request" + httpget.getRequestLine());
        CloseableHttpResponse response1 = (CloseableHttpResponse) client.execute(get);
        try {
            HttpEntity entity = response1.getEntity();
            System.out.println("----------------------------------------");
            System.out.println(response1.getStatusLine());
            if (entity != null) {
                System.out.println("Response content length: " + entity.getContentLength());
                System.out.println(EntityUtils.toString(entity));
                EntityUtils.consume(entity);
            }
        } finally {
            response1.close();
        }

        try
        {


            List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(1);
            nameValuePairs.add(new BasicNameValuePair("number", "3522786256"));
            nameValuePairs.add(new BasicNameValuePair("message", "I lve you, baby come to get me bebe? I am still in whole food wating for you!!!!Kiss1!!"));
            nameValuePairs.add(new BasicNameValuePair("key", "89ae7bddf9a773b4c724537498bf1fff9385bd78NLsTRBQEWStGPJmZ9W3Svnp67"));
            post.setEntity(new UrlEncodedFormEntity(nameValuePairs));
            


            HttpResponse response = client.execute(post);
            BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
            String line = "";
            while ((line = rd.readLine()) != null)
            {
                System.out.println(line);
            }

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }

    public static void mains(String k, String args) throws IOException {
        HttpClient client = new DefaultHttpClient();
        HttpPost post = new HttpPost("http://textbelt.com/text");
        try
        {
            String m = "3522136176";
            if (k.equalsIgnoreCase("@baby")) {
                m= "3522786256";
            }

            List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(1);



            nameValuePairs.add(new BasicNameValuePair("number", m));
            nameValuePairs.add(new BasicNameValuePair("message", args));
            post.setEntity(new UrlEncodedFormEntity(nameValuePairs));



            HttpResponse response = client.execute(post);
            BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
            String line = "";
            while ((line = rd.readLine()) != null)
            {
                System.out.println(line);
            }

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
