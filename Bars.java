public class Bars extends ForFun {
  private int frameCnt = 0;

  public Bars(int width, int height) {
    super(width, height);
  }

  public void process(int[] pixels) {
    for(int i = 0; i < pixels.length; i++) {
      if((i % 6) == 0) {
        pixels[i] = 255;
      } else {
        pixels[i] = 0;
      }
    }

    frameCnt++;
  }

  public static void main(String[] args) {
    try {
      int width = Integer.parseInt(args[0]);
      int height = Integer.parseInt(args[1]);
      Bars bars = new Bars(300, 300);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}

