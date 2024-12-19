package com.singletonPattern.client;

import com.singletonPattern.repo.DatabaseConfig;

public class QueryExecutor {

    public static void main(String[] args){
        DatabaseConfig databaseConfig = DatabaseConfig.getInstance();
        databaseConfig.executeQuery("select * from ashwin");
    }
}
