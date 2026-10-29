public class WhatsAppChannel extends Notification {
    private String paymentTypeMessage;
    
    public WhatsAppChannel(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    
    public void notifyUser() {
        String paymentTypeMessage = paymentMethod.setPaymentTypeMessage();
        System.out.println("WhatsApp Notification: " + paymentTypeMessage + "\n");
    }
}