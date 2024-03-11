package model;

import java.sql.ResultSet;

public class A {

    public static void main(String[] args) {

        try {

            String x;

            if (10 < 5) {
                x = "WHERE `username`='thinuka'";
            } else {
                x = "";
            }

            ResultSet rs = MySQL.search("SELECT * FROM `user`" + x);

            while (rs.next()) {
                System.out.println(rs.getString("name"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
