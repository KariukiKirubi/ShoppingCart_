import java.awt.*;

/**
 *
 * @author mgomez
 */
public class SupermarketDynamicWindow {
  
  // Class constants related to the window and drawings
  public static final int MASTER_WIDTH = 700;
  public static final int MASTER_HEIGHT = 500;
  public static final int FRAME_WIDTH = 100;
  public static final int FRAME_HEIGHT = 50;
  public static final int MARGIN = 50;
  public static final int MAX_COLUMNS = 5;
  
  // Class constants related to the transaction
  public static double MINOR_DISCOUNT = 0.10;
  public static double SENIOR_DISCOUNT = 0.20;
  public static double TAX_RATE = 0.0625;


  // Class variables/constants related to the cart
  public static final int MAX_ITEMS = 5;
  public static int cartSize = 0;
  
  // Declare two static arrays of size MAX_ITEMS to represent the shopping cart
  public static int[] cartItem = new int[MAX_ITEMS];
  public static double[] cartQty = new double[MAX_ITEMS];  

  // Array of possible actions
  public static final String[] actions = {"Add to cart", "Remove from cart", 
                                          "Finish transaction", 
                                          "Cancel transaction"};
  
  // Array of numbers used by DynamicWindow for asking for quantity and cash amount
  public static final String[] numbers = {"1", "2", "3", "4", "5", "6", "7", 
                                          "8", "9", "0", "."};
  
  // Arrays of customer information (names and ages) Indexes are the "customerID"
  public static String customerName[] = {"Aaron", "Priscilla", "Marty", "John", 
                                         "Bob", "Alicia", "Eve", "Joseph", 
                                         "Michael", "Donald"};
  public static int customerAge[] =     {     18,          15,      42,     25,
                                            29,       75,    15,       38,
                                                62,       68};    

  // Arrays of item information (description, price, tax) Indexes are the "itemID"
  public static String  itemDesc[]    = {"Beans", "Rice", "Banana", "Ice", "Tea", 
                                         "Bread", "Orange", "Sugar", "Cookies", 
                                         "Paper", "Coffee", "Water"};
  public static double  itemPrice[]   = {  3.25,    4.31,     6.88,   3.3,  5.25,   
                                           4.89,     6.32,     2.25,      3.18,
                                           1.25,     8.00,     1.0};
  public static Boolean itemTax[]     = { false,  false,     false,  true,  true,  
                                          false,    false,     true,      true,    
                                          true,     true,   false};
  
  /**
   * This main method will verify if the user's decision is to open a 
   * transaction or not. It should not be changed by the programmer / student
   * 
   * @param  args     The list of strings assigned when the program was executed 
   * @return          Nothing
   */
  public static void main(String[] args){
    
    
    // The method getDecision is already provided to give an idea of how
    // getValueList should look like
    if (getDecision("Yes", "No", "Do you want to start a transaction?").equals("Yes"))
        genTransaction();

  }

  /**
   * This method will generate the complete transaction.
   *
   * See comments inside the method for more info to help you 
   * understand what is needed.
   * 
   * @return          Nothing
   */
  public static void genTransaction(){
    
    // Declare here your variables
    int action;
    int item;
    double quantity;
    int cartSize = 0;
    double grandTotal = 0.0;
    double discount = 0.0;
    double tax = 0.0;
    double customerDiscount = 0.00;
    double subTotal = 0.0;
    int itemCart = 0;
    double cash = 0.0;
    
    // Declare variables for Panel and Graphics for the background window, which 
    // will show the total cost at the bottom right
    DrawingPanel masterP = new DrawingPanel(MASTER_WIDTH, MASTER_HEIGHT);
    Graphics masterG = masterP.getGraphics();
    
    // Set the background color to your preferred color
    masterP.setBackground(Color.GREEN);

    // You can change the color to show your name (it should look clear)
    masterG.setColor(Color.BLACK);
    
    // Modify the following string with your specifics
    masterG.drawString("Fall 2019 - CS1083 - Section X - Project 3 - written by XYZ.", 
                       MARGIN, masterP.getHeight() - MARGIN * 2);

    // Continue writing your code here 
    System.out.println("Fix Me. genTransaction Method - H E R E "); // Delete this line of code
    
    // Show total cost with value already initialized in the variable

    // Get the customer id from the user. Where the user make a selection by clicking the mouse
    // on a square with a customer name on the panel screen 
    
    // Store in a variable the real discount to be applied
    // according to the customer's age
    
    // Start a loop that will run at least once and if the action selected
    // by the user is not to Finish Transaction 
      
      // Get the action from the user, based on the array of actions,
      // Convert the value returned to an int
      
      // When the action is Add to cart
        
        // Verifies if there is space in the cart

          // Get the item from the user, based on the array of Item Description
          // Convert the value returned to an int

          // Get the quantity from the user, based on the array of numbers,
          // note that the last parameter in the method call will be 1

          // Tries to add to the cart
            
            // Accumulate the values of subtotal, discount, tax. The tax should 
            // only accumulate if that item is taxable
            
            // Calculate the grand total and display it, calling the 
            // corresponding method
      
      // When the action selected is Remove from cart
        
        // Verify if the cart is not empty
        // For that, it has to get the itermNames of the items in the cart
          
          // Show the user the names of the items in the cart and get the index
          // for the item the user wants to remove
          
          // Using the indes to find the itemID and quantity 
          
          // Update the subtotal, discount, and tax 
          // Pay special attention if the item is taxable or not
          
          // Update the grand total and display it in panel by calling appropriate method
       
  // Otherwise, when the cart is empty
          
          // Show a message that the cart is empty
          
          // Clear the variables used for accumulation
      
      // When the action selected is to finish the transaction
        
        // Prompt the user for a cash value (the pay from the user)
        // Make sure this amount is sufficient to cover the grand total of the transaction. 
          
          // Ask for the cas value using the numbers array
          
          // When the value is greater or equal to the Total
            
            // Display the change (difference between
            // the cash and the total)
            
            // Close the Master window
      
      // When the action selected is Cancel transaction
        
        // Clear the cart
        
        // Clear accumulative values
        
        // Update the grand total in the master window
        
        // Show a message that the cart is empty
    
  }

  /**
   * This method gets a decision  ("yes" or "no") from the user. It also serves
   * as an example of what the getValueList method should look like.
   * 
   * @param  option1     The option 1 "Yes" 
   * @param  option2     The option 2 "No" 
   * @param  title       The title to display centered in the window
   * @return             The string the user selected in the two options selected
   */
  public static String getDecision(String option1, String option2, String title){
    
    // Declares the variables used
    String ret = "";
    int row = -1;
    int col = -1;
    int index = -1;
    int x = -1;
    int y = -1;
    int pX = -2;
    int pY = -2;

    // Create the window with sufficient rectangles to list the options (in this case only "Yes" or "no")
    DrawingPanel dP = new DrawingPanel(MARGIN * 2 + FRAME_WIDTH * 2, // Because of two options
                                       MARGIN * 2 + FRAME_HEIGHT);   // Only one row
    Graphics dG = dP.getGraphics();
    
    // Display the title centered in the window (DrawingPanel)
    dG.drawString(title, 
                 (dP.getWidth() / 2) - ((title.length()/3) * 10), 
                  MARGIN / 2);
    
    // Draw the two frames for the two options
    // In the other method, you will have to call the method drawOptions instead to draw the 
	// boxes based on the array received as list.
	
	// This extra indentation bellow is just to show you how the drawOptions method may look like changing it
	// with based on the list received as first array
		dG.setColor(Color.BLACK);
		dG.fillRect(MARGIN, MARGIN, FRAME_WIDTH, FRAME_HEIGHT); // For option 1
		dG.fillRect(MARGIN + FRAME_WIDTH, MARGIN, FRAME_WIDTH, FRAME_HEIGHT); // For option 2
		dG.setColor(Color.LIGHT_GRAY);
		dG.fillRect(MARGIN + 1, MARGIN + 1, FRAME_WIDTH-2, FRAME_HEIGHT - 2); // For option 1
		dG.fillRect(MARGIN + FRAME_WIDTH + 1, MARGIN + 1, FRAME_WIDTH-2, FRAME_HEIGHT - 2); // For option 2
		
		// Display the two options inside the frames
		dG.setColor(Color.BLACK);
		dG.drawString(option1, MARGIN + 2, 80);
		dG.drawString(option2, MARGIN + FRAME_WIDTH + 2, 80);

    // Cycle for "waiting" until the user selects one of the options
    while (true){
      
      // Example method calls to get the row and the column
      row = getClickRowExample(dP, "yes", "no"); // When coding your own method take out the "Example" portion
      col = getClickColExample(dP, "yes", "no"); // When coding your own method take out the "Example" portion
      x = dP.getClickX();
      y = dP.getClickY();
      
      // Keep looking for a click inside the rectangles of the two options
      while ((row < 0 || col < 0) && (!(x == pX && y == pY))) {
        
        // Example method calls to get the row and the column in the panel 
        // that has only one row of two rectangle cells labeled "yes" and "no"
        // In your implementation of getValueList, you may have to deal with 
        // a panel that contains multiple rows of many cells (labeled by options or digits).
        // However, the logic used here is similar to the logic you will implement
        // in your getValueList method
        row = getClickRowExample(dP, "yes", "no"); 
        col = getClickColExample(dP, "yes", "no"); 
        x = dP.getClickX();
        y = dP.getClickY();

        // In the your own getValueList method, you also need to verify if the parameter returnInt is false,
        // and whether the "OK" button was clicked (in that case you need to stop this loop),
        // and return the value that was created by the sequence of numbers and "." selected.
        // Note that the return value in that method is datatype double

      }    
      
      // If there has been a change in row or column as compared to the previous row and column
      if (!((x == pX) && (y == pY))){

          // Record previous X and previous Y
          pX = x;
          pY = y;          

          // Calculates the index selected based on the row and column
          index = row + col; // Here the row will be multiplied by the number 
                             // of MAX_COLUMNS to know the real value
          
          // For your own getValueList method, if the parameter returnInt is false, the user
          // may need to select a double value by clicking some digits, and a "." 
          // and more digits.  You can use method isNumeric to tell whether a double is
          // selected.
          //
          // On the other hand, if the parameter returnInt is true, then selecting a single
          // value should suffice and return the index selected as in this method
          
          // The following two lines of code is only for this sample method, not 
          // for your getValueList method. 
          if ((index == 0))
            ret = option1;
          
          if ((index == 1))
            ret = option2;
          
          // Note that in the real method, you will return the index, not the value

          break;
          
      }

    }
    
    // Closes the current window (Drawing Panel) and return the value
    dP.close();
    return ret;
    
  }
  
  /**
   * This method returns the value selected by the user via mouse clicks on a input window. 
   *
   * The method will draw an input window that contains a title, a number of labeled rectangles
   * and may be also an "OK" button. Depending on the title of the window, 
   * the user may select an integer (say as an index) or
   * a double (say, a dollar amount). 
   *
   * The parameters of this method provide the labels for the rectangles, the title and 
   * the expected type of the user input. Although this method will always return a
   * double value, this value may be intepreted as an int in some case and a double 
   * in other cases. 
   * 
   * It will detect user's mouse click and identify the rectangle that was clicked by 
   * the user and construct the return value.
   * 
   * It can also be used as a window to show a message. 
   * 
   * At each iteration of the loop, this method will look for the col/row clicked by the user and
   * check if the "OK" button is clicked if returnInt is false. 
   * 
   * @param  list        The list of options (e.g., customer names, item description,
   *                         numbers, just a message), stored in an array of Strings.
   * @param  title       The title to display centered in the window
   * @param  returnInt   The expected type of the return value.
   *                        true - The returned double value should be treated as an int
   *                               This is typically used when an index is expected
   *                               by the caller. In this case, the caller will 
   *                               typically cast the returned value into an int.
   *                        false - The returned double value is truly a double. In this case, 
   *                               The window should display an "OK" button and verify the
   *                               compound input every time any number/"." is clicked.
   *       
   * @return             A double value selected by the user via mouse clicks
   */
  public static double getValueList(String[] list, String title, boolean returnInt){

    // Write your code here    
    System.out.println("Fix Me. getValueList Method - H E R E ");
    
    return 0.0; // Return only for the method stub to be working. Modify afterwards

  }
  
  /**
   * This method gets the value corresponding to the last column selected by the user. 
   * It serves as an example of how should look like the getClickCol method as 
   * in this example, it only has 2 options.
   * 
   * @param  panel       DrawingPanel where the validation will take place
   * @param  option1     The option 1 "Yes" 
   * @param  option2     The option 2 "No" 
   * @return             The col the user selected between the two options 
   */
  public static int getClickColExample(DrawingPanel panel, String option1, String option2) {
    int x = panel.getLastClickX();
    int y = panel.getLastClickY();
    
    // In the other method you will need to user a logic that includes every 
    // option based on having a maximum of MAX_COLUMNS columns per row
    if ((x > MARGIN && x < MARGIN + FRAME_WIDTH) &&       // First Column
        (y > MARGIN && y < MARGIN + FRAME_HEIGHT)) {      // First Row
      return 0; // dimensions of the first column, first row
    }
    else if ((x > MARGIN + FRAME_WIDTH && x < MARGIN + FRAME_WIDTH * 2) &&   // Second Column
        (y > MARGIN && y < MARGIN + FRAME_HEIGHT)) {                         // First Row
      return 1; // dimensions of the second column, first row
    }
    else {
      return -1;
    }
  }

  /**
   * This method gets the value corresponding to the last row selected by the user. 
   * It serves as an example of how should look like the getClickRow method as 
   * in this example, it only has 2 options.
   * 
   * @param  panel       DrawingPanel where the validation will take place
   * @param  option1     The option 1 "Yes" 
   * @param  option2     The option 2 "No" 
   * @return             The row the user selected between the two options 
   */
  public static int getClickRowExample(DrawingPanel panel, String option1, String option2) {
    int x = panel.getLastClickX();
    int y = panel.getLastClickY();
    if ((x > MARGIN && x < MARGIN + FRAME_WIDTH * 2) && // Since there are two columns
        (y > MARGIN && y < MARGIN + FRAME_HEIGHT)) {     //
      return 0; // tells the program your clicker is on the first row
    } 
    else {
      return -1; // tells the program you aren't in the grey box area
    }
  }

  /**
   * This method gets the value representing the last row selected by the user. 
   * 
   * @param  panel       DrawingPanel where the validation will take place
   * @param  list        The list of options (e.g., customer names, item description,
   *                                          numbers, just a message)
   * @return             The row that the user selected within the options
   */
  public static int getClickRow(DrawingPanel panel, String[] list) {
    
    // Write your code here    
    System.out.println("Fix Me. getClickRow Method - H E R E ");
    
    return 0; // Return only for the method stub to be working. Modify afterwards

  }  
  
  /**
   * This method gets the value representing the last col selected by the user. 
   * 
   * @param  panel       DrawingPanel where the validation will take place
   * @param  list        The list of options (e.g., customer names, item description,
   *                                          numbers, just a message)
   * @return             The col that the user selected within the options
   */
  public static int getClickCol(DrawingPanel panel, String[] list) {
    int x = panel.getLastClickX();
    int y = panel.getLastClickY();
    int col = (x - MARGIN) / FRAME_WIDTH;
    int row = (y - MARGIN) / FRAME_HEIGHT;
    int rows = list.length / 5;
    int cols = list.length % 5;
    
    if (!((col == (panel.getLastClickX() - MARGIN) / FRAME_WIDTH) && 
          (row == (panel.getLastClickY() - MARGIN) / FRAME_HEIGHT)))
      return -1;
    
    if ((row >= rows) && (col > cols - 1))
      return -1;
    
    if ((row < rows) && (col > 4))
      return -1;
    
    if (((x < MARGIN) || (x > (panel.getWidth() - MARGIN)))) {
      return -1; // tells the program your clicker was outside the options
    }
    
    if ((y < MARGIN) || ( y > panel.getHeight() - MARGIN))
      return -1;
    
    return col;
  }
  
  /**
   * This method draws all the options based on the list received as the first within
   * the parameters. 
   *
   * It also will draw the Strings of every option inside each of the box created.
   *
   * The size of the boxes is FRAME_WIDTH and FRAME_HEIGHT.
   *
   * Take into consideration that there could be only a MAX_COLUMNS as columns per row. 
   * Use 50, 50 as the size of the square for the OK button (if needed to be drawn).
   * 
   * HINT: For this method you may need to use a nested loop for drawing the squares
   * and the values.
   * 
   * @param  list        The list of options (e.g., customer names, item description,
   *                                          numbers, just a message)
   * @param  p           DrawingPanel object where the validation will take place
   * @param  vG          Graphics object where the validation will take place
   * @param  returnInt   The type of the value that will be expected:
   *                        true  - Do Nothing
   *                        false - Draw an extra frame of OK in the bottom right
   *                                 corner of the panel p
   * @return             Nothing
   */
  public static void drawOptions(String[] list, DrawingPanel p, Graphics vG, boolean returnInt){
    
 // Write your code here    
    System.out.println("Fix Me. drawOptions Method - H E R E ");
    
  }
  
  
  /**
   * This method will show the value that has been formed as concatenation
   * of the values that the user has selected when the parameter returnInt
   * was received as false in the getValueList method call.
   * 
   * Look at the video examples that when quantity or cash are input, the value
   * concatenated after validating if is valid it is shown in the top left 
   * corner of the window. Code it in such a way that the parameter "str" 
   * will be presented in that location after concatenating it to "Value input : ".   
   * 
   * @param  str          String containing the value to show (In theory you are receiving
   *                      only the double value. Concatenate it to the text "Value input : ")
   * @param  p      	  DrawingPanel where the str will be displayed (needed for the width)
   * @param  g            Graphics where the str will be displayed
   * @return              Nothing
   */  
  public static void showValue(String str, DrawingPanel p, Graphics g){
    // Write your code here    
    System.out.println("Fix Me. showValue Method - H E R E ");
  }
  
  /**
   * This method will show the text received as parameter. 
   * It should create an array of only one Element with the String received
   * call the method getInputList with parameters as: created array as list, 
   * "Message" as title, and true as returnInt. 
   * 
   * As an example of where this method is called is when the cart is empty or when the cart is full.
   * Also it will be called when the 
   * 
   * @param  message     String containing the value to show
   * @return             Nothing
   */  
  public static void showMessage(String str){
    
    // Write your code here    
    System.out.println("Fix Me. showMessage Method - H E R E ");

  }
  
  /**
   * This method will return true if there was a click in the area of the OK
   * frame. 
   * 
   * @param  p           DrawingPanel object where the validation will take place
   * @return             True if there was a click in the Frame of OK, False otherwise
   */  
  public static boolean OkClicked(DrawingPanel p){
    if ((p.getLastClickX() > p.getWidth() - 100) && (p.getLastClickX() < p.getWidth() - 50) &&
        (p.getLastClickY() > p.getHeight() - 50))
      return true;
    return false;
  }
  
  /**
   * This method will show the double value received as parameter in the location
   * of total of the graphics object also received as parameter. 
   * 
   * @param  g           Graphics object where the value will be presented
   * @param  value       Value that will be presented in the frame of total
   * @return             Nothing
   */  
  public static void showTotal(Graphics g, double value){

    // Write your code here    
    System.out.println("Fix Me. showTotal Method - H E R E ");

  }  

  /**
   * This method will check whether the cart is full or not. 
   * If the cart is full, show it is full calling the method showMessage.
   * 
   * @return             true if the cart is empty, false otherwise
   */  
  public static boolean isCartFull(){

    // Write your code here    
    System.out.println("Fix Me. isCartFull Method - H E R E ");
    
    return true; // Return only for the method stub to be working. Modify afterwards
    
  }
  
  /**
   * This method will check whether the cart is empty or not. 
   * If the cart is empty, show it is empty calling the method showMessage.
   * 
   * @return             true if the cart is empty, false otherwise
   */  
  public static boolean isCartEmpty(){
    
    
    // Write your code here    
    System.out.println("Fix Me. isCartEmpty Method - H E R E ");
    
    return true; // Return only for the method stub to be working. Modify afterwards

  }

  /**
   * This method will add an item to the cart in both arrays, the Items, and the
   * quantity. It will use the following empty space in the arrays to store those
   * values. If the item is already in the cart, it will only accumulate the 
   * values. Increase the cart size variable.
   * 
   * @param  item        Item ID of the one to add to the cart
   * @param  qty         Quantity to be assigned for that item
   * @return             True if it was successful adding to the cart, False otherwise
   */  
  public static boolean addToCart(int item, double qty){
    
    // Write your code here    
    System.out.println("Fix Me. addToCart Method - H E R E ");
    
    return true; // Return only for the method stub to be working. Modify afterwards
    
  }
  
  /**
   * This method will get a new array conformed by the description of the items 
   * already in the cart. It has to traverse the array of the items in the cart 
   * and go to get the different descriptions.
   *
   * Take into consideration that the itemCart array is the one that holds the
   * itemID of the items previously added to the cart.
   * 
   * @param  desc        Array of item descriptions
   * @return             A new array with the descriptions of the items in the array
   */  
  public static String[] getCartItemNames(String[] desc){
    
    // Write your code here    
    System.out.println("Fix Me. getCartItemNames Method - H E R E ");
 
    String[] ret = {" "}; // Value generated for the method stub to be working
    return ret; // Return only for the method stub to be working. Modify afterwards

  }
  
  /**
   * This method returns the itemID of the item in a specific position of the 
   * cart. It has to verify if the index received as parameter is less than the
   * current size.
   * 
   * @param  index       Index of the item in the cart
   * @return             The itemID of the item in the index received as parameter
   */  
  public static int getItemAtCart(int index){
    
    // Write your code here    
    System.out.println("Fix Me. getItemAtCart Method - H E R E ");
 
    return 0; // Return only for the method stub to be working. Modify afterwards

  }
  
  /**
   * This method removes the item from the cart in the index received as parameter 
   * It has to verify first if the index received as parameter is less than the
   * current size. It also reduces the size of the cart.
   * 
   * @param  index       Index of the item in the cart
   * @return             Quantity of the item that was removed
   */  
  public static double removeItemCart(int index){
    
    // Write your code here    
    System.out.println("Fix Me. removeItemCart Method - H E R E ");
 
    return 0.0; // Return only for the method stub to be working. Modify afterwards

  }
  
  /**
   * This method clears the cart and the cart size. For that, it clears the
   * two arrays related to the cart and assigns 0 to the size of the cart variable.
   * 
   * @return             Nothing
   */  
  public static void clearCart(){
    
    // Write your code here    
    System.out.println("Fix Me. clearCart Method - H E R E ");
 
  }

  /**
   * This method is used to verify if the string received is a number (including
   * decimals).
   * 
   * @param  strNum      String containing the possible value
   * @return             True if the string received is actually a value
   */  
  public static boolean isNumeric(String strNum) {
    try {
      double d = Double.parseDouble(strNum);
    } catch (NumberFormatException | NullPointerException nfe) {
      return false;
    }
    return true;
  }

}
