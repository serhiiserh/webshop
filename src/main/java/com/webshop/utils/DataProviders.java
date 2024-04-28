package com.webshop.utils;

import com.webshop.models.User;
import org.testng.annotations.DataProvider;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataProviders {

    @DataProvider
    public Iterator<Object[]> regNewUserFromCsvFile() throws IOException {
        List<Object[]> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(new File("src/test/resources/user.csv")));
        String line = reader.readLine();
        String[] split = line.split(",");
        list.add(new Object[]{new User()
                .setFirstName(split[0])
                .setLastName(split[1])
                .setEmail(split[2])
                .setPassword(split[3])
                .setConfirm_pass(split[4])});
        return list.iterator();
    }
}
