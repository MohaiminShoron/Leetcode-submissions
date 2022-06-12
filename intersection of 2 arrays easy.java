class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums1) {
            if (map.containsKey(i) == false) {
                map.put(i, 1);
            } else {
                int val = map.get(i);
                map.put(i, val + 1);
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int j : nums2) {
            if (map.containsKey(j)) {
                list.add(j);
                map.remove(j);
            }
        }

        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }

        return res;

    }
}