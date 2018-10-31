
public class Example1
{
    public static void main(String[] args) {
        String       postUrl       = "http://zenter.local/api/v2";

        try {
            HttpClient   httpClient    = HttpClientBuilder.create().build();
            HttpPost     post          = new HttpPost(postUrl);
            StringEntity postingString = new StringEntity("{\"query\":\"query{  version}\"}");
            post.setEntity(postingString);
            post.setHeader("Content-type", "application/json");
            HttpResponse  response = httpClient.execute(post);
            HttpEntity entity = response.getEntity();
            String responseString = EntityUtils.toString(entity, "UTF-8");
            System.out.println("Response: "+ responseString);
        }catch (Exception ex){
        }
    }
}
