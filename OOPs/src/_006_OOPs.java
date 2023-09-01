public class _006_OOPs {
    public static void main(String[] args) {
        movie m1=new movie("surya","kapil","2 star");
        movie m2=new movie("happy","sharukh","5 star");
        movie m3=new movie("dangal","salu","3 star");
        movie m4=new movie("khiladi","rihit");

        movie[] objArray={m1,m2,m3,m4};
        movie[] fiveStarArray=movie.fiveStarSort(objArray);
        for(int i=0;i<fiveStarArray.length;i++){
            if(fiveStarArray[i]!=null){
                System.out.println(fiveStarArray[i].getTitle());
            }
        }
    }
}
class movie {
    private String title;
    private String studio;
    private String rating;

    public String getTitle() {
        return title;
    }

    movie(String title, String studio, String rating){
        this.title=title;
        this.studio=studio;
        this.rating=rating;
    }
    movie(String title,String studio){
        this.title=title;
        this.studio=studio;
        this.rating="5 star";
    }
    public static movie[] fiveStarSort(movie[] objArray){
        movie[] sortArray =new movie[objArray.length];
        int j=0;
        for(int i=0;i<objArray.length;i++){
            if(objArray[i].rating.equals("5 star")){
                sortArray[j]=objArray[i];
                j++;
            }
        }
        return sortArray;
    }
}
