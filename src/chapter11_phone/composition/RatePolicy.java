package chapter11_phone.composition;

public interface RatePolicy {
    Money calculateFee(Phone phone);
}
