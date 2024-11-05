package topInterview150;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class InsertDeleteGetRandomO1 {

}

class RandomizedSet {

    Set<Integer> hashSet;

    public RandomizedSet() {
        this.hashSet = new HashSet<>();
    }
    
    public boolean insert(int val) {
        if (hashSet.contains(val)){
            return false; // if item is already present
        }

        hashSet.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(!hashSet.contains(val)){
            return false; // if item is not present
        }

        hashSet.remove(val);
        return true;
    }
    
    public int getRandom() {
        Integer[] arr = hashSet.toArray(new Integer[0]); //converting hashSet to arr 


        Random random = new Random();
        int randomIndex = random.nextInt(arr.length);

        return arr[randomIndex];
    }
}