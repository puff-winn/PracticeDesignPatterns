package com.bridgePattern.components;

public interface Device{

    public boolean isEnabled();

    public void enable();

    public void disable();

    public void setVolume(int volume);

    public int getVolume();

    public void setChannel(int channel);

    public int getChannel();

    public void printStatus();
}
