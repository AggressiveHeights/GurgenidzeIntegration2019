// Irakli Gurgenidze
// 4/1/19
// Trajectory minigame, to be completed soon
public class Trajectory {
  // instance variables
  private double ms;
  private double r;
  private double thetaDeg;
  private double thetaRad;
  private double kph;
  private double g;


  public Trajectory(double theta_, double kph_) {
    // Initialize instance variables
    ms = 0.0;
    r = 0.0;
    thetaDeg = theta_;
    thetaRad = 0.0;
    kph = kph_;
    g = 9.8;
  }


  public void calcMs() {
    ms = kph * (100.0 / 6.0);
  }


  public void calcRad() {
    thetaRad = Math.toRadians(thetaDeg);
  }


  public void calcR() {
    r = ((ms * ms) * Math.sin(thetaRad)) / g;
  }


  public double getMs() {
    return ms;
  }


  public double getR() {
    return r;
  }


  public double getThetaDeg() {
    return thetaDeg;
  }


  public double getThetaRad() {
    return thetaRad;
  }


  public double getKph() {
    return kph;
  }
}
