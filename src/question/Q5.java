package question;

public class Q5 {

	public static void main(String[] args) {
		
		StringBuffer str = new StringBuffer("We Are Happy");
		replaceSpace(str);
		System.out.println(str);	
		
	}
	
	public static void replaceSpace(StringBuffer str) {
        //这个是使用java提供的函数进行解决。
        //String str2 = str.toString();
       //return str2.replace(" ","%20");	
        
        //第二种则是使用StringBuffer提供的特性解决
        int spaceNum = 0;//计算空格的数量
        for(int i = 0; i < str.length(); i ++){
            if(str.charAt(i) == ' '){
                spaceNum ++;
            }
        }
        int oldLen = str.length();//原str的长度
        int oldIndex = oldLen - 1;//这个是原str的最后一个的下标
        int newLen = oldLen + spaceNum * 2;//这个新的替换空格后的str的长度
        int newIndex = newLen - 1;//这个是新的str的最后一个字符的下标。
        
        str.setLength(newLen);//设置新的长度
        for(int j = oldIndex; j >=0 && j < newIndex; j--){
            if(str.charAt(j) == ' '){
                str.setCharAt(newIndex--, '0');
                str.setCharAt(newIndex--, '2');
                str.setCharAt(newIndex--, '%');
            }else{
                str.setCharAt(newIndex--, str.charAt(j));
            }
        }
    }
}
