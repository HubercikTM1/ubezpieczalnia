package com.company;

import java.sql.*;
import java.util.Properties;

public class SQL_query {
    public static void query() throws SQLException, ClassNotFoundException {

        String url = "jdbc:sqlite:E:\\ubezpieczalnia\\ubezpieczalniadb.sqlite";

        Class.forName("org.sqlite.JDBC");


        Properties props = new Properties();
        Connection connection = DriverManager.getConnection(url);

        Statement st = connection.createStatement();

        //CUSTOMERS
        String dropTableCustomers = "DROP TABLE IF EXISTS Customers";
        st.execute(dropTableCustomers);
        String createTableCustomers = "create table Customers(id Integer not null constraint Customers_pk" +
                " primary key autoincrement, name String, surname String, phone String, address Address) ";
        st.execute(createTableCustomers);

        String createIndexCustomers = "create unique index Customers_id_uindex on Customers (id)";
        st.execute(createIndexCustomers);


        //DAMAGES
        String dropTableDamages = "DROP TABLE IF EXISTS Damages";
        st.execute(dropTableDamages);
        String createTableDamages = "create table Damages(id Integer not null constraint Damages_pk" +
                " primary key autoincrement, policyClass PolicyClass, documents String, damageType DamageType," +
                " victim CustomerClass)";
        st.execute(createTableDamages);

        String createIndexDamages = "create unique index Damages_id_uindex on Damages (id)";
        st.execute(createIndexDamages);


        //EVENTS
        String dropTableEvents = "DROP TABLE IF EXISTS Events";
        st.execute(dropTableEvents);
        String createTableEvents = "create table Events(id Integer not null constraint Events_pk" +
                " primary key autoincrement, eventDate Date, damageClass DamageClass, eventPlace String," +
                " process String)";
        st.execute(createTableEvents);

        String createIndexEvents = "create unique index Events_id_uindex on Events (id)";
        st.execute(createIndexEvents);


        //POLICIES
        String dropTablePolicies = "DROP TABLE IF EXISTS Policies";
        st.execute(dropTablePolicies);
        String createTablePolicies = "create table Policies(id Integer not null constraint Policies_pk" +
                " primary key autoincrement, policyHolder CustomerClass, policyInsured CustomerClass, policyBeneficiary CustomerClass," +
                " Risk RiskClass, policy_from Date, policy_to Date, contributionAmount PolicyType)";
        st.execute(createTablePolicies);

        String createIndexPolicies = "create unique index Policies_id_uindex on Policies (id)";
        st.execute(createIndexPolicies);


        //RISKS
        String dropTableRisks = "DROP TABLE IF EXISTS Risks";
        st.execute(dropTableRisks);
        String createTableRisks = "create table Risks (id Integer not null constraint Risks_pk " +
                "primary key autoincrement, price_from double, price_to double, security_from Date," +
                " security_to Date, description String, policyType PolicyType)";
        st.execute(createTableRisks);

        String createIndexRisks = "create unique index Risks_id_uindex on Risks (id)";
        st.execute(createIndexRisks);



        //INSERTS
        String insertStatement = "INSERT INTO Customers VALUES(1, 'Jan', 'Kowalski', '123456789', 'Wisniowa, Warsaw, 12-345')";

        st.execute(insertStatement);

        ResultSet rs = st.executeQuery("SELECT name, surname, phone FROM Customers");

        while(rs.next()){
            System.out.println(rs.getString("name"));
            System.out.println(rs.getString("surname"));
            System.out.println(rs.getString("phone"));
        }

    }

}
