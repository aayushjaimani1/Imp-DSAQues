class Solution {
    public int longestValidParentheses(String s) {
        // Stack<Character> st = new Stack<>();
        Stack<Integer> idx = new Stack<>();
        int max = 0;
        idx.push(-1);
        for(int i =0; i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
                // st.push(ch);
                idx.push(i);

            }
            else{
                if(!idx.isEmpty() && ch==')' && idx.peek()!= -1 && s.charAt(idx.peek())== '('){
                    // st.pop();
                    idx.pop();
                    max = Math.max(max,i-(idx.peek()));
                }else{
                    idx.push(i);
                }
            }
        }
        return max;

    }
}