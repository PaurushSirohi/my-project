interface Camera {
    void takePhoto();
}

interface MusicPlayer {
    void playMusic();
}

class SmartPhone implements Camera, MusicPlayer {

    @Override
    public void takePhoto() {
        System.out.println("Photo clicked");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing song");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();

        sp.takePhoto();
        sp.playMusic();
    }
}