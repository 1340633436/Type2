package com.company.transport;

import java.util.Date;

/**
 * @description:
 * @author: 邓建军
 * @date: Created in 2020/5/18 15:34
 * @version: 1.0
 * @modified By:
 */
public class Transport {
    private String id;
    private String ownership;
    private String GPSPosition;
    private String price;
    private Date dateOfPurchase;

    public Transport() {
    }

    public Transport(String id) {
        this.id = id;
    }

    public void drivingMethod(Transport transport) {
        System.out.println(transport.id);
    }
}
