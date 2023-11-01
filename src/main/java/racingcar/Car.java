package racingcar;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Car {

    private Map<String, Integer> carInfo = new HashMap<String, Integer>();

    public Map<String, Integer> getCarInfo() {
        return carInfo;
    }

    public void setCarName() {
        String str = Console.readLine();
        String[] names = str.split(",");

        for (String name : names) {
            if (name.length() > 5) {
                throw new IllegalArgumentException("Invalid argument: " + name);
            }
            carInfo.put(name,0);
        }
    }
}
