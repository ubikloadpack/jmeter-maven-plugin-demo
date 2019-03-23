package com.ubikingenierie.ubikloadpack.demo;

import org.apache.jmeter.threads.JMeterVariables;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyCustomClass {
    private static final Logger LOGGER = LoggerFactory.getLogger(MyCustomClass.class);
    public MyCustomClass() {
        super();
    }

    public void doSomething(JMeterVariables variables) {
        LOGGER.info("Log from {}", MyCustomClass.class);
        variables.put("myVar", Long.toString(System.currentTimeMillis()));
    }
}
