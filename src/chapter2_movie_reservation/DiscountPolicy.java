package chapter2_movie_reservation;

public interface DiscountPolicy {
    Money calculateDiscountAmount(Screening screening);
}
