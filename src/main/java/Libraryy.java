import java.util.ArrayList;
public class Libraryy {
    private final String name;
    private ArrayList selections;
    public Libraryy(String name) {
        this.name = name;
        this.selections = new ArrayList();
        this.selections.add("Science");
        this.selections.add("Literature");
        this.selections.add("Education");
        this.selections.add("children");
        this.selections.add("Advanture");     }
        public String getName() {
        return name;     }
        public boolean isInSelection(String select) {
        if (this.selections.contains(select))
            return true;
            return false;     } }