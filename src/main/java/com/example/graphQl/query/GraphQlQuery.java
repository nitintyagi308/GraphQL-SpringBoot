package com.example.graphQl.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class GraphQlQuery implements GraphQLQueryResolver {
    public String firstQuery(){
        return "first graphql query";
    }

    public String secondQuery(){
        return "second graphql query";
    }

    public String queryWithParameter(String param){
        return "Query with Param : "+param;
    }
}
