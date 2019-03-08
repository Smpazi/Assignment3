package mpazi.main.assignment3;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class MobilePhone {

    private String mobile;

    public String getCall(){
         mobile ="all phones make calls";
        return mobile;
    }

    public String getBrand(final String key){
        Map<String, String> mapprice = new HashMap<>();

        mapprice.put("Samsung","S9");
        mapprice.put("Mobicel","PULSE");

        return mapprice.get(key);
    }

    public double getHighestValue(final int[] list){
        int max = Integer.MAX_VALUE;
        for(int index =0; index<list.length-1; index++){
            if(list[index]>max){
                max =list[index];
            }
        }
        return max;
    }

    public List getListBrands() {
        List brands = new ArrayList();

        brands.add("iPhone");
        brands.add("Mobicel");
        brands.add("Samsung");
        brands.add("Nokia");
        brands.add("Huawai");

        try {
            TimeUnit.MILLISECONDS.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return brands;
    }
    public Set getNamePhones(){
        Set pname = new HashSet();
        pname.add("P10");
        pname.add("PULSE");
        pname.add("S9");
        pname.add("J2");

        // Print the elements of the Set
        System.out.println("Names of phones: " + pname);
        return pname;
    }


}
