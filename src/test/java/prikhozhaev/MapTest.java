package prikhozhaev;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MapTest {
    private static Map map;

    @BeforeAll
    static void setMap() { map = new Map();}

    public void testMap(){
        testDeleteValueFromMap();
        testCountElementsInMap();
    }

    @Test
    @DisplayName("Тест метода Map.countElementsInMap(String lastName, String firstName)")
    public void testCountElementsInMap(){
        assertEquals(1,map.countElementsInMap("Дмитрий","Дмитрий"));
    }

    @Test
    @DisplayName("Тест метода Map.deleteValueFromMap(HashMap<String, String> map, String value)")
    public void testDeleteValueFromMap(){

    }
}
