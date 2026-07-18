class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        if(s.length()==1){
            return false;
        }
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                Character popped=stack.pop();
                if (!((popped == '(' && s.charAt(i) == ')') ||
      (popped == '{' && s.charAt(i) == '}') ||
      (popped == '[' && s.charAt(i) == ']'))) {
    return false;
}
            }
        }
        return stack.isEmpty();
    }
}
