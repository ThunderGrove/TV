public class TV{
    private boolean powerState = false;
    private short channel=1;
    private short volume=1;

    public void turnOn(){
        powerState=true;
    }

    public void turnOff(){
        powerState=false;
    }

    public void setChannel(short newChannel){
        if(newChannel>0 && newChannel<121){
          channel=newChannel;
        }
    }

    public void setVolume(short newVolume){
        if(newVolume>0 && newVolume<8){
            volume=newVolume;
        }
    }

    public void volumeUp(){
        if(volume<7){
            volume++;
        }
    }

    public void volumeDown(){
        if(volume>1){
            volume--;
        }
    }

    public void channelUp(){
        if(channel<120){
            channel++;
        }else{
            channel=1;
        }
    }

    public void channelDown(){
        if(channel>1){
            channel--;
        }else{
            channel=120;
        }
    }

    public boolean getPowerState(){
        return powerState;
    }

    public short getChannel(){
        return channel;
    }

    public short getVolume(){
        return volume;
    }
}