package com.develogical.app;

public class QueryProcessor {
    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }else if(query.toLowerCase().contains("ping")){
            //this is a dummy change 0
            return "pong";

        }else if(query.toLowerCase().contains("heroku")){
        //this is a dummy change 0
        return "works";

    }else if(query.toLowerCase().contains("alex")){
            //this is a dummy change 0
            return "Hi Alex";
        }
        else if(query.toLowerCase().contains("mistake")){
            //this is a dummy change 0
            return "Maistake";


        }

        return "";
    }
}
