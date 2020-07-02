package prikhozhaev;

public class Test {

    public static void main(String[] args) {
        Object object1 = new Object();
        Object object2 = new Object();

        CompareObjectsTest.testCompareObjects(object1, object2);

        int[] testArray = {-2, -1, 0, 1, 2, 3, 4, 5, 6};
        SortTest.testReverseSort(testArray);

        String lastName = "Ерохин";
        String firstName = "Сергей";

        MapTest.testMap(lastName, firstName);
    }
}
