package com.codeup.adlister.models;

import org.mindrot.jbcrypt.BCrypt;

public class test {
    public static void main(String[] args) {
        String hashOne = "";// need to actually register a user plug in the hash pass here and check
        String hashTwo;
        boolean passwordsMatch = BCrypt.checkpw("mypassword", hashOne);
        System.out.println(passwordsMatch);

    }
}
