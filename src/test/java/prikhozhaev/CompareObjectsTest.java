package prikhozhaev;


class CompareObjectsTest {

    static void testCompareObjects(Object object1, Object object2) {
        testCompare(object1, object2);
        testCompareToString(object1, object2);
        testCompareHashCode(object1, object2);
    }

    private static void testCompare(Object object1, Object object2) {
        System.out.println("CompareObjects.compare method test: " + CompareObjects.compare(object1, object2));
    }

    private static void testCompareToString(Object object1, Object object2) {
        System.out.println("CompareObjects.compareToString method test: " + CompareObjects.compareToString(object1, object2));
    }

    private static void testCompareHashCode(Object object1, Object object2) {
        System.out.println("CompareObjects.compareHashCode method test: " + CompareObjects.compareHashCode(object1, object2));
    }
}

