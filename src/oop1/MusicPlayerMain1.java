package oop1;

public class MusicPlayerMain1 {
    public static void main(String[] args) {
        int volume = 0;
        boolean isOn = false;


        isOn = true;
        System.out.println("음악 플레이어를 시작합니다");

        volume++;
        System.out.println(volume);
        volume++;
        System.out.println(volume);
        volume--;
        System.out.println(volume);

        System.out.println("음악 플레이어 상태 확인");
        if (isOn) {
            System.out.println("음악 플레이어 on " + volume);
        } else {
            System.out.println("음악 플레이어 off");
        }

    }
}
