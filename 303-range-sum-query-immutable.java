class NumArray {
    int[] arr;

    public NumArray(int[] nums) {
        this.arr = new int[nums.length];
        this.arr[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            this.arr[i] = this.arr[i - 1] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        return left > 0 ? this.arr[right] - this.arr[left - 1] : this.arr[right];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */