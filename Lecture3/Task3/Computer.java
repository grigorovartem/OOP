package Lecture3.Task3;

public class Computer {

    private Harddrive harddrive = new Harddrive(1000);
    private Diskdrive diskdrive = new Diskdrive();
    private Ram ram = new Ram(4);
    private CompProcessor processor = new CompProcessor(2.8);

    public void onn() {
        System.out.println("The computer is on");
    }

    public void off() {
        System.out.println("The computer is off");
    }

    public void checkViruses() {
        System.out.println("Checking for viruses.....100500 viruses find");
    }

    public void hardDriveSize() {
        System.out.println("Size of HDD: " + harddrive.getSize() + " GB");
    }
}
