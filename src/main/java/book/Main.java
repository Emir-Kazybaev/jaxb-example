package book;

import jaxb.JAXBHelper;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.URL;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) throws Exception {
        Book book = new Book();
        book.setName("The Dead Zone");
        book.setAuthor("Stephen King");
        book.setLanguage("English");
        ArrayList<Date> dates = new ArrayList<>();
        dates.add(new Date(14,"May",Year.of(2018)));
        book.setDate(dates);
        book.setGenres(List.of("Novel", "Thriller", "Horror fiction", "Detective fiction","Fantastic"));
        book.setPages(608);
        book.setPublisher("HODDER & STOUGHTON");
        book.setPCity("London");
        ArrayList<Isbn> isbns = new ArrayList<>();
        isbns.add(new Isbn(10,"1444708090"));
        isbns.add(new Isbn(13,"9781444708097"));
        book.setIsbns(isbns);
        ArrayList<Rating> rating = new ArrayList<>();
        rating.add(new Rating("GoodReads",3.92));
        rating.add(new Rating("LibraryThing",3.78));
        rating.add(new Rating("Amazon",4.5));
        book.setRating(rating);
        ArrayList<Price> prices = new ArrayList<>();
        prices.add(new Price("Book",false,"FT",5722));
        prices.add(new Price("Book",true,"FT",3544));
        prices.add(new Price("CD-Audio",false,"FT",12890));
        prices.add(new Price("CD-Audio",true,"FT",10106));
        book.setPrices(prices);
        book.setRank(3021);
        book.setUrl(new URL("https://www.bookdepository.com/Dead-Zone-Stephen-King/9781444708097"));
        ArrayList<Attributes> attributes = new ArrayList<>();
        attributes.add(new Attributes(131,197,38,"mm"));
        book.setAttributes(attributes);
        ArrayList<Weight> weight = new ArrayList<>();
        weight.add(new Weight("g",422));
        book.setWeight(weight);
        book.setDescription("Stephen King's fan-favourite thriller. Also available in audio for the first time, read by Academy Award nominee James Franco.\n" +
                "\n" +
                "The two things that conjured up that horrible night, were his run of luck at the Wheel of Fortune, and the mask . . .\n" +
                "\n" +
                "Meet Johnny Smith. A young man whose streak of luck ends dramatically in a major car crash. Followed by blackness. A long, long time in cold limbo.\n" +
                "\n" +
                "When he wakes up life has been turned upside down. His fiancee has met someone else. And Johnny is cursed with the power to perceive evil in men's souls. He's had these hunches since he had an ice-skating accident as a child. Now he has an ability to see into the future. An ability which will bring him into a terrifying confrontation with a charismatic, power-hungry and dangerous man . . .");

        JAXBHelper.toXML(book, new FileOutputStream("book.xml"));
        System.out.println(JAXBHelper.fromXML(Book.class,new FileInputStream("book.xml")));
    }
}
