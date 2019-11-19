import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TVTest{

    @Test
    void setChannel(){
        TV tv=new TV();
        tv.setChannel((short) 60);
        assertEquals((short) 60,tv.getChannel(),"The channel where not 60");
        tv.setChannel((short) 0);
        assertEquals((short) 60,tv.getChannel(),"The channel where not 60");
        tv.setChannel((short) 121);
        assertEquals((short) 60,tv.getChannel(),"The channel where not 60");
    }

    @Test
    void setVolume(){
        TV tv=new TV();
        tv.setVolume((short) 4);
        assertEquals((short) 4,tv.getVolume(),"The volume where not 60");
        tv.setVolume((short) 0);
        assertEquals((short) 4,tv.getVolume(),"The volume where not 4");
        tv.setVolume((short) 8);
        assertEquals((short) 4,tv.getVolume(),"The channel where not 4");
    }

    @Test
    void volumeUp(){
        TV tv=new TV();
        tv.setVolume((short) 5);
        tv.volumeUp();
        assertEquals((short) 6,tv.getVolume(),"The volume where not 6");
        tv.volumeUp();
        assertEquals((short) 7,tv.getVolume(),"The volume where not 7");
        tv.volumeUp();
        assertEquals((short) 7,tv.getVolume(),"The channel where not 7");
    }

    @Test
    void volumeDown(){
        TV tv=new TV();
        tv.setVolume((short) 3);
        tv.volumeDown();
        assertEquals((short) 2,tv.getVolume(),"The volume where not 2");
        tv.volumeDown();
        assertEquals((short) 1,tv.getVolume(),"The volume where not 1");
        tv.volumeDown();
        assertEquals((short) 1,tv.getVolume(),"The channel where not 1");
    }

    @Test
    void channelUp(){
        TV tv=new TV();
        tv.setChannel((short) 118);
        tv.channelUp();
        assertEquals((short) 119,tv.getChannel(),"The channel where not 119");
        tv.channelUp();
        assertEquals((short) 120,tv.getChannel(),"The channel where not 120");
        tv.channelUp();
        assertEquals((short) 1,tv.getChannel(),"The channel where not 1");
    }

    @Test
    void channelDown(){
        TV tv=new TV();
        tv.setChannel((short) 3);
        tv.channelDown();
        assertEquals((short) 2,tv.getChannel(),"The channel where not 2");
        tv.channelUp();
        assertEquals((short) 1,tv.getChannel(),"The channel where not 1");
        tv.channelUp();
        assertEquals((short) 120,tv.getChannel(),"The channel where not 120");
    }
}