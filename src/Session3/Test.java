package Session3;

import Session3.Clock.ClockDisplay;
import Session3.Music.Music;
import Session3.Music.MusicCollection;

public class Test {
    public static void main(String[] args) {
//        ClockDisplay clockDisplay = new ClockDisplay(0,0,0);
//        while (true)
//        clockDisplay.timeTick();

        MusicCollection pop = new MusicCollection();
//        pop.addFile("ebi");
//        pop.addFile("ebi1");
//        pop.removeFile(-1);

        Music music = new Music("derakht","ebi","2000");
        Music music2 = new Music("medad rangi","ebi","2000");
        Music music1 = new Music("2000","dariush","2000");
        pop.addFile(music);
        pop.addFile(music1);
        pop.addFile(music2);
//        pop.listAllFiles();
//        pop.listFile(1);
//        pop.removeFile(0);
//        pop.startPlaying(1);
//        System.out.println(pop.getNumberOfFiles());
//        pop.listAllFiles();
        pop.search("ebi");
//        pop.startPlaying(1);
//        pop.stopPlaying();
//        System.out.println(music);
    }
}
