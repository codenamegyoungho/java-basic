package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(0);
        speaker.volumeUp();
        speaker.volumeDown();
        speaker.volumeDown();
        speaker.showVolume();
    }
}
