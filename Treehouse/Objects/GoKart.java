public class GoKart {
  public static final int MAX_ENERGY_BARS = 8;
  private String mColor;
  private int mBarsCount;

  public GoKart(String color) {
    mColor = color;
    mBarsCount = 0;
  }

  public String getColor() {
    return mColor;
  }

  public void charge() {
    while(!isFullyCharged) {
      mBarsCount++;
    }
  }

  public boolean isBatteryEmpty() {
    return mBarsCount == 0;
  }

  public boolean isFullyCharged() {
    return mBarsCount == MAX_ENERGY_BARS;
  }



}