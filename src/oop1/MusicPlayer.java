package oop1;

public class MusicPlayer {
    int volume = 0;
    boolean isOn = false;

    void on() {
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }
    void off() {
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
    void volumeUp() {
        volume++;
        System.out.println("볼륨 1 증가, 현재 볼륨: " + volume);
    }
    void volumeDown() {
        volume--;
        System.out.println("볼륨 1 감소, 현재 볼륨: " + volume);
    }

    void showStatus() {
        if (isOn) {
            System.out.println("현재 켜져있습니다.");
        } else {
            System.out.println("현재 꺼져있습니다.");
        }
    }
}
