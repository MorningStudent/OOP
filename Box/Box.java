public class Box implements ThingInterface {
    
    private String  name;
    private ThingInterface content;

    // 2. Pe de alta parte, prezenta proprietatii de mai sus <content>, care este de tip <ThingInterface>
    // ne spune despre faptul ca obiectele de tip box vor putea avea ca continut doar obiecte ale claselor
    // care implementeaza aceasta interfata, adica obiecte care prin imaginatie sunt obiecte reale.
    

    public Box() {

    }

    public Box(String name) {
        setName(name);
    }

    public void setName(String name) {
        if ( !name.isBlank() && !name.equals("null") ) {
            this.name = name;
        } else {
            System.err.println("Cannot set a whitespace or the \"null\"-string. Try to set name again!");
        }
    }

    public String getName() {
        return name;
    }

    public ThingInterface getContent() {
        return content;
    }

    public void setContent(ThingInterface content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Box " + getName() + " [content=" + content + "]";
    }
    
    
}
