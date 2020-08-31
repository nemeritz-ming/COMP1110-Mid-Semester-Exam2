package comp1110.mse;


public class Q1Product {
  /**
   * Return the product of the values in the array between index start and
   * index end (inclusive).  Return zero if there are no values (because the
   * values array is null or empty, end is less than start, or the interval does
   * not overlap the array).
   *
   * @param values an array of double values
   * @param start the first index in the interval
   * @param end the last index in the interval
   * @return the product of the values in the array between index start and
   * index end (inclusive), or zero if the array is null or has no values, or
   * there are no values in the interval.
   */
  public static double product(double[] values, int start, int end) {
    if(values == null){
      return 0;
    }
    if (values.length==0||start>end){
      return 0;
    }else{
      double res = 1;
      for(int i=start; i< end+1;++i){
        res = res * values[i];
      }
      return res;
    }
  }
}
