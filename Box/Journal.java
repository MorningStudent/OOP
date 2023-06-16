public class Journal extends AReadable implements ThingInterface{

    private String  category;

    

    public Journal() {
    }

    public Journal(String name, String title, Integer pages) {
        super(name, title, pages);
    }

    public Journal(String name, String title, Integer pages, String category) {
        super(name, title, pages);
        setCategory(category);
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        if ( !category.isBlank() && !category.equals("null") ) {
            this.category = category;
        } else {
            System.err.println("Cannot set a whitespace or the \"null\"-string. Try to set category again!");
        }
    }

    @Override
    public String toString() {
        return getName() + "[title=" + getTitle() + ", pages=" + getPages()+ ", category=" + category + "]";
    }

}
