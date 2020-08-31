package comp1110.mse;

public class Q2Meter {
  public String id;           // meter ID
  public int avgConsumption;  // KWH/day

  /**
   * Constructor
   *
   * @param id The machine ID
   * @param avgConsumption The average consumption per hour
   */
  public Q2Meter(String id, int avgConsumption) {
    this.id = id;
    this.avgConsumption =avgConsumption;
  }

  /** Return the average consumption for this meter */
  public int getAvgConsumption() {
    return avgConsumption; // FIXME 2b: complete this method
  }

  /**
   * Set the average consumption of this meter
   * @param avgConsumption The average consumption per hour
   */
  public void setAvgConsumption(int avgConsumption) {
    this.avgConsumption = avgConsumption;
    // FIXME 2c: complete this method
  }

  /**
   * Calculate the expected consumption of this meter given its
   * average consumption and a certain number of days.
   *
   * @param days The number of days
   *
   * @return The expected consumption of this meter given its
   * average consumption and a certain number of days.
   */
  public int expectedConsumption(int days) {
    return days*avgConsumption; // FIXME 2d: complete this method
  }

  /**
   * Return an array of meters using the provided names and average
   * consumption rates, or null if the length of the provided arrays do
   * not match or if they are null or have no elements.
   *
   * @param names An array of names
   * @param avgConsumptions An array of average consumptions
   * @return an array of meters using the provided names and average
   * consumption rates, or null if the length of the provided arrays do not
   * match or if they are null or have no elements.
   */
  public static Q2Meter[] makeMeters(String[] names, int[] avgConsumptions) {
    if (names == null || avgConsumptions == null ){return null;}
    if (names.length == 0 || names.length!=avgConsumptions.length) {return null;}
    Q2Meter[] res = new Q2Meter[names.length];
    for(int i=0; i<names.length;++i){
      res[i] = new Q2Meter(names[i], avgConsumptions[i]);
    }
    return res;
  }

  /**
   * Return a string describing the meter, in the format
   *    "Meter ID averages AVGCONSUMPTION KWH per day"
   * where ID is replaced by the meter's id and AVGCONSUMPTION is replaced by
   * the meter's average consumption.
   *
   * @return A string describing the meter
   */
  @Override
  public String toString() {
    return  "Meter "+this.id + " averages "+ this.avgConsumption+ " KWH per day";  // FIXME 2f: complete this method
  }

}
