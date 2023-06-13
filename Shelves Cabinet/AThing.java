public abstract class AThing {

    public abstract void setName(String name);  // <--- These are abstract methods, which means the subclasses must override the methods
    public abstract String getName();           //      with its implementation

    public String toString() {
        return getName();
    }

}
