package com.company;

import java.sql.*;

public class Main {

    public static void main(String[] args) {

        try {
            SQL_query.query();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        FileWriterUsingJFrame fwj = new FileWriterUsingJFrame();


        //------------------
        //sqlite-jdbc mam w external libraries a nie w lib

    }
}
