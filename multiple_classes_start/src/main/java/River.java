import java.util.ArrayList;

public class River {

    private ArrayList<Salmon> allFish;

    public River() {
        this.allFish = new ArrayList<>();
    }

    public void addFish(Salmon fish) {
        allFish.add(fish);
    }

    public int fishCount() {
        return allFish.size();
    }

    public Salmon removeFish() {
        return allFish.remove(0);
    }

}
