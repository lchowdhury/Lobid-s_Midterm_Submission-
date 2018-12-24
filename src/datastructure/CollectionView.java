package datastructure;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CollectionView {

        public static void main(String[] args) {
        /*
         Map is created and inserted some data.Retrieve the Collection view of values present in map
         */
                HashMap<Integer, String> map = new HashMap<Integer, String>();
                map.put(1, "Bangladesh");
                map.put(2, "London");
                map.put(3, "India");
                map.put(4, "Canada");
                map.put(5, "Italy");
                map.put(6, "France");

                for(Map.Entry<Integer,String> Country:map.entrySet()){
                        System.out.println("COllection View is-"+Country.getKey()+":"+Country.getValue());
                }


        }

}