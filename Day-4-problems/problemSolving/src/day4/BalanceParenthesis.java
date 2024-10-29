package day4;
import java.util.*;
public class BalanceParenthesis {
	
		public static void main(String[] args) {
			Scanner in=new Scanner(System.in);
			String expr=in.nextLine();
			boolean res=checkbalanced(expr);

			if(res) {
				System.out.println("Balanced");
			}else {
				System.out.println("Not Balanced");
			}
			in.close();
		}

		private static boolean checkbalanced(String expr) {
			Stack<Character> st=new Stack<>();

			for(int i=0;i<expr.length();i++) {
				char ch=expr.charAt(i);
				if(ch=='('||ch=='{'||ch=='[') {
					st.push(ch);
				}
				else if(ch==')'||ch=='}'||ch==']') {
					if(st.isEmpty()) {
						return false;
					}
					char top=st.pop();
					if((ch==')'&& top!='('||
							ch=='}'&& top!='{'||
							ch==']'&& top!='[')){
						return false;
					}

				}
			}

			return st.isEmpty();

		}

	}
