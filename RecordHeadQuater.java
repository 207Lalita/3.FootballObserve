import java.util.ArrayList;

public class RecordHeadQuater implements Source{
    private final ArrayList<FootballObserve> name;
    private String match;

    public RecordHeadQuater(){
        this.name = new ArrayList<>();
    }

    public void setMatch(String match){
        this.match = match;
        notice();
    }

    public String getMatch(){
        return this.match;
    }

    @Override
    public void notice() {
        for(int i = 0; i < name.size(); i++){
            name.get(i).update(this);
        }
    }

    @Override
    public void register(FootballObserve ob) {
        name.add(ob);
    }

    @Override
    public void checkOut(FootballObserve ob) {
        name.add(ob);
    }
    
}
