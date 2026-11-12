class Solution {
    private void solve(int openCount, int closeCount, List<String> result, StringBuilder sb){
        if(openCount == 0 && closeCount == 0){
            result.add(sb.toString());
            return;
        }
        // take open
        if(openCount > 0){
            sb.append('(');
            solve(openCount -1, closeCount, result, sb);
            sb.deleteCharAt(sb.length()-1);
        }

        // take closing bracket
        if(closeCount > 0 && closeCount > openCount){
            sb.append(')');
            solve(openCount, closeCount - 1, result, sb);
            sb.deleteCharAt(sb.length()-1);
        }
        return;
    }
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        solve(n-1,n, result, new StringBuilder("("));
        return result;
    }
}
