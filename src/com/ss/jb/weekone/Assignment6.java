package com.ss.jb.weekone;

import com.ss.jb.four.Assignment1;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Assignment6 {
    public static class SampleSingleton {
        private static Connection conn = null;
        private static SampleSingleton instance = null;

        private SampleSingleton (Connection c){
            this.conn = c;
        }

        private SampleSingleton(){
        }

        public static SampleSingleton getInstance() {
            if (instance == null){
                synchronized (SampleSingleton.class){
                    if (instance == null)
                        instance = new SampleSingleton();
                }
            }
            return instance;
        }
    }
}

