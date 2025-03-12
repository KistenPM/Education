public class massive {

    public static void main(String[] args) {

        System.out.println("He-he or not He-he");

        var x = ("divan");
        var y = 10;

//      var определяет переменную integer или String

        System.out.println(x);
        System.out.println(y);

        final var LIMIT = 5;

        System.out.println(LIMIT);

        int[] nums = new int[4];
        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 30;
        nums[3] = 40;

        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[][] nums2 = new int[2][3];
        nums2[0][0] = 1;
        nums2[0][1] = 2;
        nums2[0][2] = 3;
        nums2[1][0] = 4;
        nums2[1][1] = 5;
        nums2[1][2] = 6;

        for (var stroka = 0; stroka < nums2.length; ++stroka ) { // ++stroka  stroka = stroka +1
            for (var stolb = 0; stolb < nums2[stroka].length; ++stolb) {
                System.out.print(nums2[stroka][stolb]);
            }
            System.out.println();
        }

    }
}