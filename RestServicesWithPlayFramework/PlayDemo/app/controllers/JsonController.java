package controllers;

import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.*;

import com.auth0.beans.*;

import com.fasterxml.jackson.databind.JsonNode;

public class JsonController extends Controller {

    public Result returnHash(){
        Map<String, Object> result = new HashMap<>();
        result.put("Day", "Sunday");
        result.put("name", "Julio");
        result.put("year", 2017);

        return ok(Json.toJson(result));
    }

    public Result returnObject(){
        Any any = new Any("Community Day", "Mercedes", 2017);

        return ok(Json.toJson(any));
    }

    public Result catchObject(){
        JsonNode jsonNode = request().body().asJson();
        Any any = Json.fromJson(jsonNode, Any.class);

        return ok(Json.toJson(any));
    }

}