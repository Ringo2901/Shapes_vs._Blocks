import java.awt.*;

public class PlatformCollection{
    Platform platforms[];
    int pos =0;
    FullStatistics stat;
    PlatformCollection(){
        platforms = new Platform[1];
        platforms[0] = new Platform(400,900,500,920, 4500,910, Color.getHSBColor(50.0f, 100.0f, 210.0f),10);
        addPlatform(platforms[0]);
    }

    public void addPlatform(Platform platform)
    {
        platforms[pos]=platform;
        pos++;
    }
    public void removePlatform(Platform platform)
    {

    }
    public Platform getPlatform(int index) {
        return null;
    }
}
