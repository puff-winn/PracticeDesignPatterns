package com.singletonPattern.repo;

public class DatabaseConfig {

    private static DatabaseConfig instance;

    private DatabaseConfig(){

    }

    public static DatabaseConfig getInstance(){
        if(instance==null){
            synchronized (DatabaseConfig.class) {
                if(instance==null){
                    instance=new DatabaseConfig();
                }
            }
        }
        return instance;
    }

    public void executeQuery(String query){
        System.out.println("Executed query : "+ query);
    }
}
