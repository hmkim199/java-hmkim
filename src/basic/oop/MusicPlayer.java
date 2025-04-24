package basic.oop;

public class MusicPlayer {
    int volumn = 0;
    boolean isOn = false;

    public void off() {
        this.isOn = false; // this 생략 가능
        System.out.println("음악 플레이어를 종료합니다.");
    }

    public void showStatus() {
        System.out.println("음악 플레이어 상태 확인");
        if (this.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨 : " + this.volumn);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }

    public void volumnDown() {
        this.volumn--;
        System.out.println("음악 플레이어 볼륨: " + this.volumn);
    }

    public void volumnUp() {
        this.volumn++;
        System.out.println("음악 플레이어 볼륨: " + this.volumn);
    }

    public void on() {
        this.isOn = true;
        System.out.println("음악 플레이어를 시작합니다");
    }
}
