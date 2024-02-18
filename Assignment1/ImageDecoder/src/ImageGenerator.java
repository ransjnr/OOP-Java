import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Scanner;


public class ImageGenerator {

  public static void main(String[] args) throws Exception {

    File file = new File("picture.txt");
    Scanner scanner = new Scanner(file);
 try {  
    int width = scanner.nextInt();
    int height = scanner.nextInt();

    ErrorHandler.validateDimensions(width, height);

    PicturePlotter plotter = new PicturePlotter(width, height);

    int x = 0; 
    int y = 0;

    while(true) {
      int count = scanner.nextInt();
      if(count < 0) {
        break;
      }

      int color = scanner.nextInt();
      plotter.plot(x, y, count, color);

      x += count;
      if(x >= width) {
        x = 0; 
        y++;
      }
    }

    plotter.showImage();
      } catch (Exception e) {
      ErrorHandler.handleUnexpectedError(e);
    }
  }


}

class PicturePlotter {

  private BufferedImage image;
  
  public PicturePlotter(int width, int height) {
    image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
  }

  public void plot(int x, int y, int count, int color) {
    for(int i = 0; i < count; i++) {
      image.setRGB(x + i, y, colorToRGB(color)); 
    }
  }

  public void showImage() {
    CustomGUI gui = new CustomGUI("Generated Image", image);
  }

private int colorToRGB(int color) {

  int validColor = ErrorHandler.getValidColor(color);

  switch(color) {
    case 0: return 0x000000; //black
    case 1: return 0xFF0000; //red
    case 2: return 0x00FF00; //green
    case 3: return 0x0000FF; //blue
    case 4: return 0xFFFF00; //yellow
    case 5: return 0xFF00FF; //magenta
    case 6: return 0x00FFFF; //cyan
    case 7: return 0xFFFFFF; //white
    case 8: return 0xFFA500; //orange
    case 9: return 0xA52A2A; //brown
    case 10: return 0x808080; //gray
    case 11: return 0xA0522D; //sienna
    case 12: return 0x556B2F; //dark olive green
    case 13: return 0x006400; //dark green
    case 14: return 0x8B0000; //dark red 
    case 15: return 0x4B0082; //indigo
    case 16: return 0x2F4F4F; //dark slate gray
    case 17: return 0x800000; //maroon
    case 18: return 0x808000; //olive
    case 19: return 0xC0C0C0; //silver
    case 20: return 0x696969; //dim gray
  }
  return 0; 
  }

}