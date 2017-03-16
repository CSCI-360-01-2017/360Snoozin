/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csci360.alarmclock;
import org.joda.time.DateTime;

public class Clock {

    public DateTime getTime() {
        return new DateTime();
    }
    
    public void setTime(DateTime time) {
        
    }
    
    public boolean getUse24HourFormat() {
        return false;
    }
    
    public void setUse24HourFormat(boolean use24HourFormat) {
        
    }
    
    public Alarm[] getAlarms() {
        return new Alarm[0];
    }
}
