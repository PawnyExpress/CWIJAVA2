import java.util.ArrayList;

public class IdahoFishAndGame implements Subject{

    private ArrayList<Observer> observers;
    private HuntingSeason currentSeason;

    public IdahoFishAndGame() {
        this.observers = new ArrayList<Observer>();
        this.currentSeason = HuntingSeason.NONE;
    }

    public void setHuntingSeason(HuntingSeason season) {
        if (this.currentSeason != season) {
            this.currentSeason = season;
            notifyObservers();
        }
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(currentSeason);
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    
}
