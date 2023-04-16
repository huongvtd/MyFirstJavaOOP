public class ClassLamp {
    public boolean lamp = false;
    private String roomName;

    public ClassLamp (String room){
        roomName = room;
        System.out.println("My " + room);
    }

    public void checkLamp () {
        if (lamp) {
            System.out.println("Lamp in the " + roomName + " is ON");
        } else {
            System.out.println("Lamp in the " + roomName + " is OFF");
        }
    }
}
