class Patron extends Library {
    private String name;
    private String patronID;

    public Patron(String name, String patronID) {
        this.name = name;
        this.patronID = patronID;
    }

    public String getName() {
        return name;
    }

    public void borrowBook(Book book) {
        System.out.println("Patron '" + this.name + "' borrowed book '" + book.getTitle() + "'.");
    }
}