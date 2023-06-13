
public class Cabinet {

    private AThing topShelf;
    private AThing middleShelf;
    private AThing bottomShelf;

    
    public Cabinet() {
    }

    public AThing getTopShelf() {
        return topShelf;
    }

    public void setTopShelf(AThing topShelf) {
        this.topShelf = topShelf;
    }

    public AThing getMiddleShelf() {
        return middleShelf;
    }

    public void setMiddleShelf(AThing middleShelf) {
        this.middleShelf = middleShelf;
    }

    public AThing getBottomShelf() {
        return bottomShelf;
    }

    public void setBottomShelf(AThing bottomShelf) {
        this.bottomShelf = bottomShelf;
    }

    public AThing whatIsOn(String shlefName) {
        AThing thing = null;
        if (shlefName.equals("topShelf")) {
            thing = getTopShelf();
        } else if (shlefName.equals("middleShelf")) {
            thing = getMiddleShelf();
        } else if (shlefName.equals("bottomShelf")) {
            thing = getBottomShelf();
        }
        return thing;
    }

    public void put(String shlefName, AThing thing) {
        if (shlefName.equals("topShelf")) {
            setTopShelf(thing);
        } else if (shlefName.equals("middleShelf")) {
            setMiddleShelf(thing);
        } else if (shlefName.equals("bottomShelf")) {
            setBottomShelf(thing);
        }
    }

    public AThing take(String shlefName) {
        AThing thing = whatIsOn(shlefName);
        switch (shlefName) {
            case "topShelf"   : setTopShelf(null);       break;
            case "middleShelf": setMiddleShelf(null); break;
            case "bottomShelf": setBottomShelf(null); break;
            default: System.err.println("No such shelf!");
        }
        return thing;
    }

    public String toString() {
        
        String out = 
        "#########################################\n" +
        "# "+String.format("%-37s", topShelf)+" #\n" +
        "#########################################\n" +
        "# "+String.format("%-37s", middleShelf)+" #\n" +
        "#########################################\n" +
        "# "+String.format("%-37s", bottomShelf)+" #\n" +
        "#########################################";

        return out.replace("null", "0   ");
    }
}