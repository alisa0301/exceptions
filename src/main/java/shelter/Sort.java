package shelter;

//Этот enum уже чуть сложнее, помимо самих констант, содержит еще поле
// с русским названием породы
// полей в enumе может быть и больше
public enum Sort {
    TIGER("Тигр"),

    LION("Лев"),

    MANUL("Манул"),

    LITTLE_KITTY("Маленькая кисонька");

    private final String name;

    private Sort(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
