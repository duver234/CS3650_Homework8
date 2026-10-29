public class EmailChannel extends Notification {
    private String paymentTypeMessage;
    
    public EmailChannel(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    
    public void notifyUser() {
        String paymentTypeMessage = paymentMethod.setPaymentTypeMessage();
        System.out.println("Email Notification: " + paymentTypeMessage + "\n");
    }
}