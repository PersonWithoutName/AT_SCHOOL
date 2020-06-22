package prikhozhaev;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CompareObjectsTest {

    public void testCompareObjects(){
        testCompare();
//        testCompareHashCode();
//        testCompareToString();
    }

//    @ParameterizedTest
//    @MethodSource("prikhozhaev.Providers#testCompareObjects")
    @Test
    @DisplayName("Тест метода prikhozhaev.compare(Object object1, Object object2)")
    public void testCompare(){
        Assert.assertEquals("test", "test");
    }

    @ParameterizedTest
    @MethodSource("prikhozhaev.Providers#testCompareToString")
    @DisplayName("Test of method prikhozhaev.compareToString(Object object1, Object object2)")
    void testCompareToString(Object param, Object expected){
        Assert.assertEquals(param, expected);
    }

    @ParameterizedTest
    @MethodSource("prikhozhaev.Providers#testCompareHashCode")
    @DisplayName("Test of method prikhozhaev.compareHashCode(Object object1, Object object2)")
    void testCompareHashCode(Object param, Object expected){
        Assert.assertEquals(param, expected);
    }
}

