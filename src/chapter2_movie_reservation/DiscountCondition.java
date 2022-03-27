package chapter2_movie_reservation;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
