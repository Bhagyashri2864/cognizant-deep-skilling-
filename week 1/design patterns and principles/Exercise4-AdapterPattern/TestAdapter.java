public class TestAdapter {

    public static void main(String[] args) {

        PaymentProcessor paytm =
                new PaytmAdapter(new PaytmGateway());

        PaymentProcessor gpay =
                new GooglePayAdapter(new GooglePayGateway());

        paytm.processPayment(1000);
        gpay.processPayment(2000);
    }
}