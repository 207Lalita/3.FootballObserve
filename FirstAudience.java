public class FirstAudience implements FootballObserve {

    @Override
    public void update(Source o) {
        System.out.println("live result: "+((RecordHeadQuater)o).getMatch());
    }
    
}