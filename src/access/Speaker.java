package access;

public class Speaker {
    private int volume;

    Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if (volume >= 100) {
            System.out.println("음량을 증가할 수 없습니다. 최대 음량입니다.");
        } else {
            volume += 10;
            System.out.println("음량을 10 증가합니다.");
        }
    }

    void volumeDown() {
        if (volume >= 10) {
            System.out.println("볼륨을 10 감소합니다.");
            volume -= 10;
        } else {
            System.out.println("최저볼륨입니다. 더이상 감소 불가!!");
        }
    }

    void showVolume() {
        System.out.println("현재 볼륨은 : " + volume);
    }
}
