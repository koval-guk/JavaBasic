package dz11.task2Book;

class Author {
   private String author;

    public String getAuthor() {
        return author;
    }

    public Author(String author) {
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    void show(){
        System.out.println(author);
    }



}
