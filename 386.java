class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> result = new ArrayList<>(n);
        dfs(1, n, result);
        return result;
    }
    private void dfs(int curr, int n, List<Integer> result) {
        if (curr > n) return;
        result.add(curr);
        if (curr * 10 <= n) {
            dfs(curr * 10, n, result);
        }
        if (curr % 10 != 9 && curr + 1 <= n) {
            dfs(curr + 1, n, result);
        }
    }
}
