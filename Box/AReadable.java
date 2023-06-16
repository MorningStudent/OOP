public abstract class AReadable {
    private String  name;
    private String  title;
    private Integer pages;

    public AReadable() {

    }

    public AReadable(String name, String title, Integer pages) {
        setName(name);
        setTitle(title);
        setPages(pages);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if ( !name.isBlank() && !name.equals("null") ) {
            this.name = name;
        } else {
            System.err.println("Cannot set a whitespace or the \"null\"-string. Try to set name again!");
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if ( !title.isBlank() && !title.equals("null") ) {
            this.title = title;
        } else {
            System.err.println("Cannot set a whitespace or the \"null\"-string. Try to set title again!");
        }
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        if (pages > 0) {
            this.pages = pages;
        } else {
            System.err.println("Cannot set a negative or 0 number. Try to set pages again!");
        }
    }

}
