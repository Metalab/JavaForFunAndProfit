public class Bars extends ForFun {
  private int frameCnt = 0;

  public Bars(int width, int height) {
    super(width, height);
  }

  public void process(int[] pixels) {
    for(int i = 0; i < pixels.length; i++) {
      int period = 3000;
      int max = Integer.MAX_VALUE;
      int mod = (i % period);

      pixels[i] = mod * (max / period);
    } 
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

