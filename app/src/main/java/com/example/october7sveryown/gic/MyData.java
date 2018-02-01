package com.example.october7sveryown.gic;

import java.util.Date;

/**
 * Created by Abhi on 25-01-2017.
 */

public class MyData {

    /*static String[] festArray = {"Lakshya Fest", "Talaash", "Synapse", "Xitij"};
    static String[] placeArray = {"LDCE", "Nirma", "Silver Oak", "DA-IICT"};
    static String[] dateArray = {"17th Feb to 19th Feb", "17th Feb to 19th Feb","17th Feb to 19th Feb","17th Feb to 19th Feb"};

    static Integer[] id_ = {0, 1, 2, 3};
*/
    private int event_id;
    private String event_name,event_venue,event_register_link;
    private Date event_date;

    public MyData(int event_id, String event_name, String event_venue, Date event_date,String event_register_link) {
        this.event_id = event_id;
        this.event_name = event_name;
        this.event_venue = event_venue;
        this.event_date = event_date;
        this.event_register_link=event_register_link;
    }

    public int getEvent_id() {
        return event_id;
    }

    public String getEvent_register_link() {
        return event_register_link;
    }


    public String getEvent_name() {
        return event_name;
    }

    public String getEvent_venue() {
        return event_venue;
    }

    public Date getEvent_date() {
        return event_date;
    }

    public void setEvent_id(int event_id) {
        this.event_id = event_id;
    }
    public void setEvent_register_link(String event_register_link) {
        this.event_register_link = event_register_link;
    }

    public void setEvent_name(String event_name) {
        this.event_name = event_name;
    }

    public void setEvent_venue(String event_venue) {
        this.event_venue = event_venue;
    }

    public void setEvent_date(Date event_date) {
        this.event_date = event_date;
    }
}
