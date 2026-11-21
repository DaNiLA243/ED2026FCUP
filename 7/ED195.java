class ED195{
    public static boolean balanced(String s){
        MyStack<Character> stack=new LinkedListStack<>();
        char[] input=s.toCharArray();
        for(int i=0; i!=s.length(); i++){
            if(input[i]=='(' || input[i]=='['){stack.push(input[i]);}
            if(input[i]==')' && stack.isEmpty()){return false;}
            if(input[i]==']' && stack.isEmpty()){return false;}
            if(input[i]==')' && stack.pop()!='('){return false;}
            if(input[i]==']' && stack.pop()!='['){return false;}
        }
        if(stack.isEmpty()){return true;}
        return false;
    }
}
