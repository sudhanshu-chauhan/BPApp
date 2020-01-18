package com.vdmn.BPApp;

import com.vdmn.util.RawParser;
import com.vdmn.models.jsonmapper.SimpleDataMapper;

public class App {
    public static void main(String[] args) {
        SimpleDataMapper dm = new SimpleDataMapper();
        dm = (SimpleDataMapper) RawParser.ParseRawJSON("/Users/sud/data.json", SimpleDataMapper.class);
        System.out.println(dm.getFullName());

    }
}
