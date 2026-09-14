class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> m1 = new HashMap<>();
        HashMap<Character, Integer> m2 = new HashMap<>();

        if (s.length() != t.length()) return false;

        char[] sarr = s.toCharArray();
        char[] tarr = t.toCharArray();

        for (int i = 0; i < sarr.length; i++) {
            if(m1.containsKey(sarr[i])) m1.replace(sarr[i], m1.get(sarr[i]) + 1);
            else m1.put(sarr[i], 1);
            if(m2.containsKey(tarr[i])) m2.replace(tarr[i], m2.get(tarr[i]) + 1);
            else m2.put(tarr[i], 1);
        }

        for (char key : sarr) {
            if (!m2.containsKey(key) || !m1.get(key).equals(m2.get(key))) return false;
        }
        return true;
    }
}
