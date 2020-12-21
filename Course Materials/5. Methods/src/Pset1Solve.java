public class Pset1Solve {

    //-------------------------------Problem 1 Solution ------------------------------
    public boolean checkString(String s1, String s2){
        boolean result = false;

        // Check to see if s2 is greater than s1
        if(s2.length() > s1.length()) return false;
        //javaiscool   isc
        //gfo    for
        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) == s2.charAt(0)){
                int currentIndex = i;
                for (int j = 1; j < s2.length(); j++) {
                    i++;
                    if( i >=s1.length() || s1.charAt(i) != s2.charAt(j) ){
                        i = currentIndex;
                        result = false;
                        break;
                    }else{
                        result = true;
                    }
                }
            }
        }

        return result;
    }




    //-------------------------------Problem 2 Solution ------------------------------
    public boolean isSorted(int[] arr){
        // 1 3 4 5
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i+1] - arr[i] < 0) return false;
        }
        return true;
    }

    public boolean binarySearch(int[] arr, int left, int right, int n){
        if( !isSorted(arr) ){
            System.out.println("The given array is unsorted. Please give a sorted array as input!");
            return false;
        }

        int middle = (left + right)/2;
        while (left <= right){
            //if n is greater than the middle element, ignore the left half of array, search in the right half of t
            //the array
            if( arr[middle] < n){
                left = middle + 1;
            }else if( arr[middle] == n){
                return true;
            }else{
                //if n is less than the middle element, ignore the right half of array, search in the left half of t
                //the array
                right = middle -1;
            }
            middle  = (left + right)/2;
        }

        return false;
    }



    public static void main(String[] args) {
//            String a = "foor";
//            String b = "foo";
//            String c = "for";
//            String d = "gfor";
//            String e = "gfo";
//
//            Pset1Solve obj = new Pset1Solve();
//            System.out.println(obj.checkString(e,c));
        Pset1Solve obj = new Pset1Solve();

        int[] a = {1,3,4,5,6};
        System.out.println(obj.binarySearch(a,0,a.length-1, 6));

    }

}
