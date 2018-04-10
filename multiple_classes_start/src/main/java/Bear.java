import java.util.ArrayList;

public class Bear {

    private String name;
    private ArrayList<Salmon> stomach;

    public Bear(String name) {
        this.name = name;
        this.stomach = new ArrayList<>();
    }

    public int foodCount() {
        return this.stomach.size();
    }

    public void eatFishFromRiver(River river) {
        stomach.add(river.removeFish());
    }

    public void sleep() {
        stomach.clear();
    }

}