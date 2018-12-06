package com.airhacks;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("books")
public class BookResource {
	
	@GET
	public JsonArray books() {
		return Json.createArrayBuilder().add(book("teste", 1)).add(book("teste2", 2)).build();
	}

	
	public JsonObject book(String title, int id) {
		return Json.createObjectBuilder()
				.add("title", title)
				.add("id", id)
				.build();
	}
	
}
