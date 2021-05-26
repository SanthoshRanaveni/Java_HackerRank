import java.util.*;
class Java_Stack{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
            Stack<Character> s = new Stack<>();
			String input=sc.next();
            char[] inArr = input.toCharArray();
            //Complete the code
            for(int i=0 ;i<inArr.length;i++)
            {
                if(!s.isEmpty()){
                    if(inArr[i]==')' && s.peek()=='(')
                        s.pop();
                    else if(inArr[i]=='}' && s.peek()=='{')
                        s.pop();
                    else if(inArr[i]==']' && s.peek()=='[')
                        s.pop();
                    else
                        s.push(inArr[i]);
                }
                else
                        s.push(inArr[i]);
            }
            System.out.println(s.isEmpty());
		}
		sc.close();
	}
}



