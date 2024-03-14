
package carlyseventapp_joption;
    import javax.swing.JOptionPane;
public class CarlysEventApp_JOption {
    
    public static void main(String[] args) {
        int guests;
        guests = getGuests();
        displayMotto();
        displayDetails(guests);
    }

    public static int getGuests() {
        int guests;
        String input = JOptionPane.showInputDialog("Enter number of guests:");
        guests = Integer.parseInt(input);
        return guests;
    }

    public static void displayDetails(int guests) {
        final double GUEST_PRICE = 35.00;
        final int LARGE_EVENT = 50;
        double price;
        price = guests * GUEST_PRICE;
        String message = "The price for an event with " + guests + " guests at $" + GUEST_PRICE +
                " per guest is $" + price + "\nWhether this is a large event is " + (guests >= LARGE_EVENT);
        JOptionPane.showMessageDialog(null, message);
    }

    public static void displayMotto() {
    String motto = "Carly's makes the food that makes it a party.";
    String border = "****************************************************\n";
    String message = border +
                     "*                                                  *\n" +
                     "*  Carly's makes the food that makes it a party.   *\n" +
                     "*                                                  *\n" +
                     border;
    JOptionPane.showMessageDialog(null, message);
}

}
    

