package org.launchcode.Piri.controllers;

import jdk.internal.access.JavaNetUriAccess;
//import org.hibernate.validator.constraints.URL;

import javax.xml.crypto.Data;
import java.net.HttpURLConnection;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.json.JSONArray;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URI;

public class FetchFromJSONController {
    HttpClient client = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://raw.githubusercontent.com/millbj92/US-Zip-Codes-JSON/master/USCities.json")).build();

    public static String parse(String responseBody) {
        JSONArray cities = new JSONArray(responseBody);
        for (int i = 0; i < cities.length(); i++) {
            JSONObject city = cities.getJSONObject(i);
            int zipcode = city.getInt("zip_code");
            int latitude = city.getInt("latitude");
            int longitude = city.getInt("longitude");
            String cityName = city.getString("city");
            String state = city.getString("state");
            String county = city.getString("county");
        }

        return null;

    }
}
