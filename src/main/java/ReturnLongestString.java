
public class ReturnLongestString {
    /**
     * Return the longest String out of arr.
     * Remember that you can get the length of String with str.length().
     *
     * @param arr an array of Strings.
     * @return the longest String within arr. You can assume that there are no ties for the longest string.
     */
    public String longest(String[] arr){
        //return null;

        int maxLength = arr[0].length(), maxPos = -1;
        
        for (int ctr = 1; ctr < arr.length; ctr++) {
            if (maxLength <= arr[ctr].length()) {
                maxLength = arr[ctr].length();
                maxPos=ctr;
            }
        }
        return arr[maxPos];
    }
}
