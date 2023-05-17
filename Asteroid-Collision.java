class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int i =0; i<asteroids.length ;i++){
            int ch = asteroids[i];
            if(st.isEmpty() || asteroids[i] > 0){
                st.push(ch);
            }else{
                while(true){
                    int peek = st.peek();
                    if(peek < 0){
                        st.push(ch);
                        break;
                    }else if(peek == -ch){
                        st.pop();
                        break;
                    }else if(peek > -ch){
                        break;
                    }else{
                        st.pop();
                        if(st.isEmpty()){
                            st.push(ch);
                            break;
                        }
                    }
                }
            }
        }
        int[] res = new int[st.size()];
        for(int j = st.size()-1; j>=0; j--){
            res[j] = st.pop();
        }
        return res;
    }
