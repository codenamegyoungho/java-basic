package class1.ex;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview titanic = new MovieReview();
        titanic.title = "타이타닉";
        titanic.review = "아직 안봄 ㅋㅋ";

        MovieReview ironman = new MovieReview();
        ironman.title = "아이언맨";
        ironman.review = "개꿀잼 ㅋㅋ";

        MovieReview[] movies = new MovieReview[]{titanic,ironman};
        for (MovieReview movie : movies) {
            System.out.println(movie.title + ":" + movie.review);
        }
    }

}
