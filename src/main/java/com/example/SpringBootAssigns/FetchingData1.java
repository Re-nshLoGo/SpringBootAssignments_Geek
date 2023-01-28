package com.example.SpringBootAssigns;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class FetchingData1 {
    public static void main(String[] args) {
        try {
            FetchdatawithApi();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void FetchdatawithApi() throws Exception {
        String url = "https://api.chucknorris.io/";

        HttpRequest request = HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
        java.net.http.HttpClient httpClient = HttpClient.newBuilder().build();
        HttpResponse<String> httpResponse = httpClient.send(request,HttpResponse.BodyHandlers.ofString());
        System.out.println(httpResponse.statusCode());
        System.out.println(httpResponse.body());
    }
}
