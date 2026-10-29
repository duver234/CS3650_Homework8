public class Driver {
    public static void main(String[] args) {
        PaymentMethod onlinePayment = new OnlinePayment();
        PaymentMethod cashPayment = new CashOnDeliveryPayment();
        PaymentMethod bitcoinPayment = new BitcoinPayment();
        PaymentMethod chequePayment = new ChequePayment();


        EmailChannel emailNotificationOnline = new EmailChannel(onlinePayment);
        emailNotificationOnline.notifyUser();

        //Sending an sms notification for online payment
        SmsChannel smsNotificationOnline = new SmsChannel(onlinePayment);
        smsNotificationOnline.notifyUser();

        //Sending an email notification for cash payment
        EmailChannel emailNotificationCash = new EmailChannel(cashPayment);
        emailNotificationCash.notifyUser();

        //Sending an sms notification for cash payment
        SmsChannel smsNotificationCash = new SmsChannel(cashPayment);
        smsNotificationCash.notifyUser();

        PushChannel pushNotificationBitcoin = new PushChannel(bitcoinPayment);
        pushNotificationBitcoin.notifyUser();

        SmsChannel smsNotificationCheque = new SmsChannel(chequePayment);
        smsNotificationCheque.notifyUser();

        EmailChannel emailNotificationCheque = new EmailChannel(chequePayment);
        emailNotificationCheque.notifyUser();

        WhatsAppChannel whatsAppNotificationCash = new WhatsAppChannel(cashPayment);
        whatsAppNotificationCash.notifyUser();

        WhatsAppChannel whatsAppNotificationBitcoin = new WhatsAppChannel(bitcoinPayment);
        whatsAppNotificationBitcoin.notifyUser();

    }
}