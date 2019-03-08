package mpazi.test.assigment3;


import mpazi.main.assignment3.MobilePhone;
import org.junit.*;
import java.util.List;

import static org.junit.Assert.*;


public class FixtureTest {
    private MobilePhone phone;
    @Before
    public void setUp() throws Exception{
         phone = new MobilePhone();
    }
    @After
    public void tearDown()throws Exception{

    }
    @Test
    public void objectEquality(){

        String result = phone.getCall();
        Assert.assertEquals("All mobile phones makes calls","all phones make calls",result);
    }
    @Test
    public void objectIdentityTest(){

        assertNotSame(phone.getBrand("Mobicel"),phone.getBrand("Samsung"));
    }

    @Test
    public void failingTest(){

        try {
            phone.getHighestValue(new int[]{});
            fail("should of throw an IllegalArgumentException");
        }catch (final IllegalArgumentException e){
           assertTrue(false);
        }
    }

    @Test(timeout=21)
    public void TimeoutsTest(){

       List results =phone.getListBrands();

 assertEquals("",5,results.size());

    }
    @Ignore
    @Test
    public void DisablingTest(){
        phone.getNamePhones();

    }
}
