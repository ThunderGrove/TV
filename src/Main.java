public class Main{

    public static void main(String[] args) {
	    TV tv=new TV();

        tv.turnOn();
        if(tv.getPowerState()){
            System.out.println("The TV is on.");
        }

        tv.setChannel((short) 120);
        System.out.println("The Channel is on 120");

        tv.channelUp();
        System.out.println("The selected channel number is now passed 120 and wraped back to " + tv.getChannel());

        tv.channelDown();
        System.out.println("The selected channel number is now below 1 and wraped back to " + tv.getChannel());

        tv.setVolume((short) 5);
        System.out.println("The volume is 5");

        tv.volumeUp();tv.volumeUp();
        System.out.println("The volume is now "+tv.getVolume());

        tv.volumeDown();
        System.out.println("The volume is now "+tv.getVolume());

        tv.turnOff();
        System.out.println("The tv is now off");
    }
}
