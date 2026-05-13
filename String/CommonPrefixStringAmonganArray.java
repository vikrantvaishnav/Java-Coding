public class CommonPrefixStringAmonganArray {
    void main() {

		String[] strs = {"flower","flow","floght"};
		String frefix= strs[0];
		int match=0;
		int min=strs[0].length();
		for(int i=0;i<strs.length;i++) {
			
			if(strs[i].length()<min)
				min = strs[i].length();
			
		}
		for(int i=0;i<min;i++) {
			boolean isEqual= true;
			for(int j=1;j<strs.length;j++) {
				if(frefix.charAt(i)!=strs[j].charAt(i)){
					isEqual=false;
					break;
				}
			}
			if(isEqual) {
				
				match++;
			}
			
		}
		
		for(int i=0;i<match;i++) {
			IO.print(frefix.charAt(i));
		}
		
		
	}
}
