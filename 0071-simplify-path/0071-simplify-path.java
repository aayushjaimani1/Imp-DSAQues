class Solution {
    public String simplifyPath(String path) {
        ArrayDeque<String> st = new ArrayDeque<>();
        StringBuilder s = new StringBuilder();

        String[] fin = path.split("/");
        for(int i = 0; i<fin.length; i++){
            System.out.println(fin[i]);
            if(!st.isEmpty() && fin[i].equals("..")){
                st.pop();
            }
            else if(!fin[i].equals("") && !fin[i].equals(".") && !fin[i].equals("..")){
                st.push(fin[i]);
            }
        }
        if(st.isEmpty()) return "/";
        while(!st.isEmpty()){
            s.insert(0, st.pop()).insert(0, "/");
        }

        return s.toString();
    }
}