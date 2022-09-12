package dz11.task2Book;

 class Content {
    String content;

     public Content(String content) {
         this.content = content;
     }

     public String getContent() {
         return content;
     }

     public void setContent(String content) {
         this.content = content;
     }

     void show(){
        System.out.println(content);
    }
}
