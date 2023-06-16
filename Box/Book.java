public class Book extends AReadable implements ThingInterface{


    private String  authorName;
    private Integer publishingYear;

    public Book() {
    }

    public Book(String name, String title, Integer pages) {
        super(name, title, pages);
    }

    public Book(String name, String title, Integer pages, String authorName, Integer publishingYear) {
        super(name, title, pages);
        setAuthorName(authorName);
        setPublishingYear(publishingYear);
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        if ( !authorName.isBlank() && !authorName.equals("null") ) {
            this.authorName = authorName;
        } else {
            System.err.println("Cannot set a whitespace or the \"null\"-string. Try to set authorName again!");
        }
    }

    public Integer getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(Integer publishingYear) {
        if (publishingYear > 1500 && publishingYear < 2024) {
            this.publishingYear = publishingYear;
        } else {
            System.err.println("Cannot set out of range [1501...2023]. Try to set publishingYear again!");
        }
    }

    @Override
    public String toString() {
        return getName() + "[title=" + getTitle() + ", pages=" + getPages()+ ", authorName=" + authorName +
        ", publishingYear=" + publishingYear + "]";
    }

}
