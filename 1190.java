class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder result = new StringBuilder();
        for(char a : s.toCharArray()){
            if(a == ')'){
                Queue<Character> q = new LinkedList<>();
                while(st.peek() != '('){
                    q.add(st.pop());
                }
                st.pop();
                while(q.size()>0){
                    st.push(q.remove());
                } 
            }
            else{
                st.push(a);
            }
        }
        while(!st.isEmpty()){
            result.append(st.pop());
        }
        return result.reverse().toString();
    }
}
