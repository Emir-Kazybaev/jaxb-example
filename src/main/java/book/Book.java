package book;

import lombok.Data;

import javax.xml.bind.annotation.*;
import java.net.URL;
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Book {
    private String name;
    private String author;
    private String language;
    private List<Date> date;
    @XmlElementWrapper(name = "genres")
    @XmlElement(name = "genre")
    private List<String> genres;
    private int pages;
    @XmlElement(name = "Bestsellers_rank")
    private int Rank;
    private String publisher;
    private String pCity;
    @XmlElementWrapper(name = "ratings")
    private List<Rating> rating;
    @XmlElementWrapper(name = "prices")
    @XmlElement(name = "price")
    private List<Price> prices;
    private String description;
    @XmlElementWrapper(name = "ISBNS")
    @XmlElement(name = "ISBN")
    private List<Isbn> isbns;
    private List<Attributes> attributes;
    private List<Weight> weight;
    private URL url;
}
