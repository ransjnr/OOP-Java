public class ErrorHandler {

  public static void validateDimensions(int width, int height) throws IllegalArgumentException {
    if (width <= 0 || height <= 0) {
      throw new IllegalArgumentException("Width and height must be greater than 0"); 
    }
  }

  public static void handleFileReadError(Exception e) {
    System.out.println("Error reading input file: " + e.getMessage());
    e.printStackTrace();
    System.exit(1);
  }

  public static int getValidColor(int color) {
    if (color < 0 || color > 20) {
      throw new IllegalArgumentException("Invalid color value: " + color);
    }
    return color;
  }

  public static void handleUnexpectedError(Exception e) {   
    System.out.println("An unexpected error occurred: " + e.getMessage());
    e.printStackTrace();
    System.exit(1);
  }

}