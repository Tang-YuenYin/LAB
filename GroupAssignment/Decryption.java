
package Encryption;
import java.util.ArrayList;
import java.util.Scanner;
public class Decryption {
    private String enckey="^zx^ehvw";
    public String CeasarCipher1(String t, int s)
    {
        String result="";
        for(int i=0;i<t.length();i++)
        {
            if(t.charAt(i)=='^')
            {
                i++;
                 result+=(char)(((int)t.charAt(i)+(26-s)-97)%26+65);
            }
            
            else if (t.charAt(i)=='$')
            {
                result+=" ";
            }
            else if(Character.isLowerCase(t.charAt(i)))
            {
                result+=(char)(((int)t.charAt(i)+(26-s)-97)%26+97);
            }
            else if(t.charAt(i)=='(')
            {
                String temp="";
                while(t.charAt(i)!=')')
                {
                 i++;
                  temp+=t.charAt(i);

                }
                for(int j=temp.length()-2;j>-1;j--)
                {
                    result+=(char)(((int)temp.charAt(j)+(26-s)-97)%26+97);
                }
            }
            else
            {
                result+=t.charAt(i);
            }
        }
        
        return result;
    }
    
    public String CeasarCipher2(String t, int s)
    {
        String result="";
        int num=Integer.parseInt(t.substring(t.length()-2,t.length()-1));
        t=t.substring(0,t.length()-7);
        for(int i=0;i<t.length();i++)
        {
            if(t.charAt(i)=='^')
            {
                i++;
                 result+=(char)(((int)t.charAt(i)+(26-s)-97)%26+65-num);
            }
            
            else if (t.charAt(i)=='$')
            {
                result+=" ";
            }
            else if(Character.isLowerCase(t.charAt(i)))
            {
                result+=(char)(((int)t.charAt(i)+(26-s)-97)%26+97-num);
            }
            else if(t.charAt(i)=='{')
            {
                String temp="";
                while(t.charAt(i)!='}')
                {
                 i++;
                  temp+=t.charAt(i);

                }
                for(int j=temp.length()-2;j>-1;j--)
                {
                    result+=(char)(((int)temp.charAt(j)+(26-s)-97)%26+97-num);
                }
            }
            else
            {
                result+=t.charAt(i);
            }
        }
        
        return result;
    }
    
    public String MorseCode(String t, int s)
    {
        MorseCode mc=new MorseCode();
        
        ArrayList<MorseCodeNode>list=mc.MorseCodeList();
        String result="";
        String end=t.substring(t.length()-7);
        t=t.substring(0,t.length()-7);
        String[]temp=t.split("#");
        String temp2="";
        for(int i=0;i<temp.length;i++)
        
        {
            String code="";
            for(int j=0;j<temp[i].length();j++)
            {
                if(Character.isUpperCase(temp[i].charAt(j)))
                    code+="-";
                else if(Character.isLowerCase(temp[i].charAt(j)))
                    code+=".";
                else
                    temp2+=temp[i].charAt(j);
            }
            
           for(MorseCodeNode node: list)
           {
               if(node.getCode().equalsIgnoreCase(code))
               {
                   temp2+=node.getCharacter();
                   break;
               }
           }
        }
        temp2+=end;       
        result=CeasarCipher2(temp2,s);
        return result;
    }
    
    public String getKey()
    {
        String key="";
        key=CeasarCipher1(enckey,3);
        return key;
    }
    
}
