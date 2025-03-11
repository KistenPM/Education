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
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);

        int[][] nums2 = new int[2][3];
        nums2[1][0] = 1;
        nums2[1][1] = 2;
        nums2[2][1] = 3;
        System.out.println(nums2);
    }
}