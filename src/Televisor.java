public class Televisor {
    boolean status;

    Televisor(){
        status = false;
    }

    void turnOn() {
        status = !status;
    }

    void turnOff() {
        status = !status;
    }

    void showStatus(){
        System.out.println("Is TV switched on: " + status);
    }
}
