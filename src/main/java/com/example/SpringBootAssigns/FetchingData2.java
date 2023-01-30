package com.example.SpringBootAssigns;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class FetchingData2 {
    public static void main(String[] args) throws Exception {
        FetchdatawithApi2();
    }
    public static void FetchdatawithApi2() throws Exception {
        String url = "https://www.weatherbit.io/";

        HttpRequest request = HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
        HttpClient httpClient = HttpClient.newBuilder().build();
        HttpResponse<String> httpResponse = httpClient.send(request,HttpResponse.BodyHandlers.ofString());
//        System.out.println(httpResponse.statusCode());
        System.out.println(httpResponse.body());
    }

}