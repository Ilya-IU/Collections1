import org.junit.Test;

import static org.junit.Assert.*;
public class CarListTest {
    private CarList carList;

    @org.junit.Before
    public void setUp() throws Exception {
        carList = new CarArrayList();
        for (int i = 0; i < 100; i++) {
            carList.add(new Car("Brand"+i,i));

        }
    }
    @Test
    public void whenAdded100ElementsSizeArray100(){
        System.out.println(carList.size());
        assertEquals(99, carList.size());
    }
    @Test
    public void whenDeleted1ElementSizeArrayMustBeIncrease(){
        assertTrue(carList.revoveAt(5));
        assertEquals(100, carList.size());
    }
    @Test
    public void whenDeletedCarElementSizeArrayMustBeIncrease(){
        Car car = new Car("Bentli",15);
        assertEquals(101, carList.size());
        assertTrue(carList.remove(car));
        assertEquals(100, carList.size());
    }
    @Test
    public void nonExistCarInCarListRemoveThenReturnFalse(){
        Car car = new Car("BMW",11);
        assertFalse(carList.remove(car));
        assertEquals(100, carList.size());
    }
    @Test
    public void SizeCarListMustBe(){
        carList.clear();
        assertEquals(0, carList.size());
    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void whenIndexOutOfBoundsThenTrowException(){
        carList.getIndex(100);
    }
    @Test
    public void ReturnValueToIndexFromArray(){
        Car car = new Car("Brand0",0);
        assertEquals("Brand0", carList.getIndex(0));
    }

}