/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csci360.alarmclock;

public abstract class AudioInput {
    
    public abstract void playAudio();
    
    public abstract AudioInput getNext();
    
    public abstract AudioInput getPrev();
}
