class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        int count =0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '('){
                st.push(ch);
                //count++;
            }else if(!st.isEmpty() && ch == ')' && st.peek() == '('){
                st.pop();
                //count--;
            }else if(ch == ')'){
                st.push(ch);
            }
        }

        return st.size();
    }
}