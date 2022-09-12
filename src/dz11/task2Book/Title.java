package dz11.task2Book;

 class Title {
    private String title;

     public Title(String title) {
         this.title = title;
     }

     public String getTitle() {
         return title;
     }

     public void setTitle(String title) {
         this.title = title;
     }

     void show(){
        System.out.println(title);
    }
}
