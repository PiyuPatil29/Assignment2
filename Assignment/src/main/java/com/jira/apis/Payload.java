package com.jira.apis;

public class Payload {
	public static String reqBody() {
		return "{\r\n" + 
				"	\"username\":\"AdityaPatil\",\r\n" + 
				"	\"password\": \"adityapatil29\"\r\n" + 
				"	\r\n" + 
				"}";		
	}
	public static String createIssue() {
		return "{\r\n" + 
				"    \"fields\": {\r\n" + 
				"       \"project\":\r\n" + 
				"       {\r\n" + 
				"          \"key\": \"SCRUM\"\r\n" + 
				"       },\r\n" + 
				"       \"summary\": \"Priyanka Patil\",\r\n" + 
				"       \"description\": \"Giving demo for creating a story of issue\",\r\n" + 
				"       \"issuetype\": {\r\n" + 
				"          \"name\": \"Story\"\r\n" + 
				"       }\r\n" + 
				"   }\r\n" + 
				"}\r\n" + 
				"";	
	}
	public static String createAttachment() {
		return "";
	}



}
