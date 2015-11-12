public class Reformatory {
    private int totalWeightsMeasured_counter = 0;

    public int weight(Person person) {
        // return the weight of the person
        this.totalWeightsMeasured_counter += 1;
        return person.getWeight();
    }

    public void feed(Person person) {
        int current_weight = person.getWeight();
        int new_weight = current_weight + 1;
        person.setWeight(new_weight);
    }
    
    public int totalWeightsMeasured() {
        return this.totalWeightsMeasured_counter;                
    }
}
