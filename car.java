class car {
    int year;
    String name;
    public car(String name, int year)
    {
        this.name = name;
        this.year = year;
    }
    void print() {
        System.out.println(name + " " + year);
    }
    public static void main(String[] args) {
        car obj = new car("marcedes", 1969);
        obj.print();
    }
}
