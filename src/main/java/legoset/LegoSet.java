package legoset;

import movie.YearAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.Year;
import java.util.List;
import java.util.Set;
import lombok.Data;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class LegoSet {

    @XmlAttribute(name = "number")
    private int number;
    private String name;
    private String theme;
    private String subtheme;
    @XmlJavaTypeAdapter(YearAdapter.class)
    private Year year;
    private int pieces;
    @XmlElementWrapper(name = "tags")
    @XmlElement(name = "tag")
    private Set<String> tags;
    @XmlElementWrapper(name = "minifigs")
    @XmlElement(name = "minifig")
    private List<Minifig> minifigs;
    @XmlElement(name = "weight")
    private List<Weight> Weight;
    private String url;
}
