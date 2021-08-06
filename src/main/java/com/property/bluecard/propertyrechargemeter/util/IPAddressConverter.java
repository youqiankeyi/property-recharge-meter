package com.property.bluecard.propertyrechargemeter.util;

import ch.qos.logback.classic.pattern.ClassicConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPAddressConverter extends ClassicConverter {
    private static final Logger log = LoggerFactory.getLogger(IPAddressConverter.class);
    private static String ipAddress;

    public IPAddressConverter() {
    }

    public String convert(ILoggingEvent event) {
        return ipAddress;
    }

    static {
        try {
            ipAddress = InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException var1) {
            log.error("fetch localhost host address failed", var1);
            ipAddress = "UNKNOWN";
        }

    }
}
