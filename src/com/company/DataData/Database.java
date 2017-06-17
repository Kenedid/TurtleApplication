package com.company.DataData;

import java.sql.*;

/**
 * Created by Kenedid on 11-05-2017.
 */
public class Database {

    // Forbinder JDBC driver med databse addarsse:
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DTABASE_ADDASSE = "jdbc:mysql://localhost/users";


    // Brugernavn og kode til denne table
    static final String Tablename = "Userstable";
    static final String Tablekode = "Userstable";


    // Database connection variable
    private Connection connection = null;

    // Databse Variable
    private static Database database;

    public Database() {
        this.connection = connection();
    }

    public Connection connection() {

        try {
            final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
            final String DTABASE_ADDASSE = "jdbc:mysql://localhost/users";
            final String Tablename = "Userstable";
            final String Tablekode = "Userstable";

            return DriverManager.getConnection(DTABASE_ADDASSE,Tablename,Tablekode);


        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("Error Database: Database error" + ((SQLException) e).getErrorCode());


        }
        return null;
    }


    public static Database getDatabase() {


        return new Database();
    }

    // Brug returnDatabseset til SELECT-stement fra Datarapper

    public ResultSet returnDatabaseSet(PreparedStatement preparedStatement){

        try {
            return preparedStatement.executeQuery();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("Error Databse: ResultSet Erroor" +((SQLException)e).getMessage());
        }
        return null;
    }

    // Bruge updatedatabse i alle andre sql-sætninger
    public ResultSet updatetheDatabase(PreparedStatement preparedStatement){

        try{
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("Error Database: Update Error" +((SQLException)e).getMessage());
        }
        return null;
    }

}
