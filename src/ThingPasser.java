public class ThingPasser {
    public int value;
    public String name;

    public ThingPasser(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public String name() {
        return this.name;
    }

    public String name(String newName) {
        this.name = newName;
        return name;
    }


}
