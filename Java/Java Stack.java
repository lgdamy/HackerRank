class Solution{
   
    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i<s.length();i++) {
            if (!stack.empty()) {
                switch(s.charAt(i)) {
                    case '}':
                        if(stack.peek()=='{')
                            stack.pop();
                        break;
                    case ']':
                        if(stack.peek()=='[')
                            stack.pop();
                        break;
                    case ')':
                        if(stack.peek()=='(')
                            stack.pop();
                        break;
                    default:
                        stack.push(s.charAt(i));
                }
            } else {
                stack.push(s.charAt(i));
            }
        }
        return stack.empty();
    }
   public static void main(String []argh)
   {
      Scanner sc = new Scanner(System.in);
      
      while (sc.hasNext()) {
         String input=sc.next();
         System.out.println(isBalanced(input));
      }
      
   }
}