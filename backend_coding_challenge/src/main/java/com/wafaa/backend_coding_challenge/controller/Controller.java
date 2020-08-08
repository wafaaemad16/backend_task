/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wafaa.backend_coding_challenge.controller;

import com.wafaa.backend_coding_challenge.parser.JsonParser;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import org.json.simple.parser.ParseException;

/**
 *
 * @author wafaa
 */
@Path (value = "/BackendCodingChallenge")
public class Controller {
    
    @GET
    @Path("/tendingItems")
    public String getTendingItems(@QueryParam("jsonUrl") String url) throws IOException, FileNotFoundException, ParseException, ParseException{
        JsonParser parser = new JsonParser();
        return parser.parse(url);
    }  
}
