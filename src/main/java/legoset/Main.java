package legoset;

import jaxb.JAXBHelper;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.Year;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws Exception {
        LegoSet legoSet = new LegoSet();
        legoSet.setNumber(75211);
        legoSet.setName("Imperial TIE Fighter");
        legoSet.setTheme("Star Wars");
        legoSet.setSubtheme("Solo");
        legoSet.setYear(Year.of(2018));
        legoSet.setPieces(519);
        Set<String> tags = new HashSet<>();
        tags.add("Starfighter");
        tags.add("Stormtrooper");
        tags.add("Star Wars");
        tags.add("Solo");
        legoSet.setTags(tags);
        ArrayList<Minifig> minifigs = new ArrayList();
        minifigs.add(new Minifig("Imperial Mudtrooper", 2));
        minifigs.add(new Minifig("Imperial Pilot", 1));
        minifigs.add(new Minifig("Mimban Stormtrooper", 1));
        legoSet.setMinifigs(minifigs);
        ArrayList<Weight> weight = new ArrayList<>();
        weight.add(new Weight("kg",0.89));
        legoSet.setWeight(weight);
        legoSet.setUrl("https://brickset.com/sets/75211-1/Imperial-TIE-Fighter");

        JAXBHelper.toXML(legoSet, new FileOutputStream("legoSet.xml"));
        System.out.println(JAXBHelper.fromXML(LegoSet.class, new FileInputStream("legoSet.xml")));
    }
}
