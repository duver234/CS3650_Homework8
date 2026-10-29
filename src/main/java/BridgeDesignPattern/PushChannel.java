public class PushChannel extends Notification {
    private String paymentTypeMessage;
    
    public PushChannel(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    
    public void notifyUser() {
        String paymentTypeMessage = paymentMethod.setPaymentTypeMessage();
        System.out.println("Push Notification: " + paymentTypeMessage + "\n");
    }
}