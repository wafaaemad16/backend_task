/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wafaa.backend_coding_challenge.parser;

import java.io.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author sally
 */

public class JsonParser {

    public String parse(String url) throws FileNotFoundException, IOException, ParseException {
        Object object = new JSONParser().parse(new FileReader(url));
        JSONObject json = (JSONObject) object;

        Integer reposNumber =(Integer) json.get("total_count");
        JSONArray items = (JSONArray) json.get("items");
        
        return "repos number = " + reposNumber + " , itmes: " + items.toJSONString();
        
    }
}
