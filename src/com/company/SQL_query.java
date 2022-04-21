package com.company;

import java.sql.*;
import java.util.Properties;

public class SQL_query {
    public static void query(String args[]) throws SQLException, ClassNotFoundException {

        String url = "jdbc:sqlite:E:\\ubezpieczalnia\\ubezpieczalniadb.sqlite";

        Class.forName("org.sqlite.JDBC");


        Properties props = new Properties();
        Connection connection = DriverManager.getConnection(url);

        Statement st = connection.createStatement();

        //CUSTOMERS
        String dropTableCustomers = "DROP TABLE IF EXISTS Customers";
        st.execute(dropTableCustomers);
        String createTableCustomers = "create table Customers\n" +
                "(\n" +
                "\tid Integer not null\n" +
                "\t\tconstraint Customers_pk\n" +
                "\t\t\tprimary key autoincrement,\n" +
                "\tname String,\n" +
                "\tsurname String,\n" +
                "\tphone String,\n" +
                "\taddress Address\n" +
                ")\n" +
                "\n" +
                "create unique index Customers_id_uindex\n" +
                "\ton Customers (id)";

        st.execute(createTableCustomers);

        //DAMAGES
        String dropTableDamages = "DROP TABLE IF EXISTS Damages";
        st.execute(dropTableDamages);
        String createTableDamages = "create table Damages\n" +
                "(\n" +
                "\tid Integer not null\n" +
                "\t\tconstraint Damages_pk\n" +
                "\t\t\tprimary key autoincrement,\n" +
                "\tpolicyClass PolicyClass,\n" +
                "\tdocuments String,\n" +
                "\tdamageType DamageType,\n" +
                "\tvictim CustomerClass\n" +
                ")\n" +
                "\n" +
                "create unique index Damages_id_uindex\n" +
                "\ton Damages (id)";
        st.execute(createTableDamages);

        //EVENTS
        String dropTableEvents = "DROP TABLE IF EXISTS Events";
        st.execute(dropTableEvents);
        String createTableEvents = "create table Events\n" +
                "(\n" +
                "\tid Integer not null\n" +
                "\t\tconstraint Events_pk\n" +
                "\t\t\tprimary key autoincrement,\n" +
                "\teventDate Date,\n" +
                "\tdamageClass DamageClass,\n" +
                "\teventPlace String,\n" +
                "\tprocess String\n" +
                ")\n" +
                "\n" +
                "create unique index Events_id_uindex\n" +
                "\ton Events (id)";
        st.execute(createTableEvents);

        //POLICIES
        String dropTablePolicies = "DROP TABLE IF EXISTS Policies";
        st.execute(dropTablePolicies);
        String createTablePolicies = "create table Policies\n" +
                "(\n" +
                "\tid Integer not null\n" +
                "\t\tconstraint Policies_pk\n" +
                "\t\t\tprimary key autoincrement,\n" +
                "\tpolicyHolder CustomerClass,\n" +
                "\tpolicyInsured CustomerClass,\n" +
                "\tpolicyBeneficiary CustomerClass,\n" +
                "\tRisk RiskClass,\n" +
                "\tpolicy_from Date,\n" +
                "\tpolicy_to Date,\n" +
                "\tcontributionAmount PolicyType\n" +
                ")\n" +
                "\n" +
                "create unique index Policies_id_uindex\n" +
                "\ton Policies (id)";
        st.execute(createTablePolicies);

        //RISKS
        String dropTableRisks = "DROP TABLE IF EXISTS Risks";
        st.execute(dropTableRisks);
        String createTableRisks = "create table Risks\n" +
                "(\n" +
                "\tid Integer not null\n" +
                "\t\tconstraint Risks_pk\n" +
                "\t\t\tprimary key autoincrement,\n" +
                "\tprice_from double,\n" +
                "\tprice_to double,\n" +
                "\tsecurity_from Date,\n" +
                "\tsecurity_to Date,\n" +
                "\tdescription String,\n" +
                "\tpolicyType PolicyType\n" +
                ")\n" +
                "\n" +
                "create unique index Risks_id_uindex\n" +
                "\ton Risks (id)";
        st.execute(createTableRisks);


        ResultSet rs = st.executeQuery("");

        while(rs.next()){
            System.out.println(rs.getString(""));
        }

    }

}
