import java.util.HashMap;
import java.util.Map;

public class Bins {
//Bins results = new Bins(2, 12); // for bins from 2..12
//Integer numberOfTens = results.getBin(10); // returns the number of tens in the 10 bin
//results.incrementBin(10); // should increment bin # 10
    private Map<Integer, Integer> binMap;
    private int min;
    private int max ;

    public Bins(int min, int max) {
        if (min < 1 || max < min) {
            throw new IllegalArgumentException("Invalid range");
        }
        this.min = min;
        this. max = max;
        this.binMap = new HashMap<>();
        for (int i = min; i<= max; i++){
            binMap.put(i,1);
        }
    }
public void increment (int value)
{
    if (value < min || value > max)
    {
        throw new IllegalArgumentException("out of  range");
    }
    binMap.put(value,binMap.get(value) + 1);
}
public int getBin(int value) {
    return binMap.getOrDefault(value, 0);
    }
    public Map<Integer, Integer>getAllBins(){
        return binMap;
    }

    public void incrementBin(int i) {
    }
}