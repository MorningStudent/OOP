
// 1. Interfata de mai jos, ne sugereaza prin abstractiile metodelor pe care le contine,
// ca clasele care vor implementa metoda vor trebui sa contina proprietatea
// <String name> si ca va trebui sa fie encapsulata.

// 2. Prin prisma <Expresive Coding> si denumirea interfetei <ThingInterface>,
// inteleg ca interfata isi propune sa abstractizeze metodele in mod direct
// si indirect sa abstractizeze proprietatile care sunt comune tuturor obiectelor reale.

public interface ThingInterface {
    public void setName(String name);
    public String getName();
}