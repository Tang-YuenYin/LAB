
package Encryption;

import java.util.ArrayList;

public class MorseCode{
    public ArrayList<MorseCodeNode> MorseCodeList(){
    ArrayList<MorseCodeNode> morsecode=new ArrayList<>();
    morsecode.add(new MorseCodeNode(".-",'a'));
    morsecode.add(new MorseCodeNode("-...",'b'));
    morsecode.add(new MorseCodeNode("-.-.",'c'));
    morsecode.add(new MorseCodeNode("-..",'d'));
    morsecode.add(new MorseCodeNode(".",'e'));
    morsecode.add(new MorseCodeNode("..-.",'f'));
    morsecode.add(new MorseCodeNode("--.",'g'));
    morsecode.add(new MorseCodeNode("....",'h'));
    morsecode.add(new MorseCodeNode("..",'i'));
    morsecode.add(new MorseCodeNode(".---",'j'));
    morsecode.add(new MorseCodeNode("-.-",'k'));
    morsecode.add(new MorseCodeNode(".-..",'l'));
    morsecode.add(new MorseCodeNode("--",'m'));
    morsecode.add(new MorseCodeNode("-.",'n'));
    morsecode.add(new MorseCodeNode("---",'o'));
    morsecode.add(new MorseCodeNode(".--.",'p'));
    morsecode.add(new MorseCodeNode("--.-",'q'));
    morsecode.add(new MorseCodeNode(".-.",'r'));
    morsecode.add(new MorseCodeNode("...",'s'));
    morsecode.add(new MorseCodeNode("-",'t'));
    morsecode.add(new MorseCodeNode("..-",'u'));
    morsecode.add(new MorseCodeNode("...-",'v'));
    morsecode.add(new MorseCodeNode(".--",'w'));
    morsecode.add(new MorseCodeNode("-..-",'x'));
    morsecode.add(new MorseCodeNode("-.--",'y'));
    morsecode.add(new MorseCodeNode("--..",'z'));
    
    return morsecode;
   }
}
class MorseCodeNode {
    private char character;
    private String code;
    
    public MorseCodeNode(String code,char character)
    {
        this.code=code;
        this.character=character;
    }
    
    public char getCharacter() {
        return character;
    }

    public String getCode() {
        return code;
    }

    public void setCharacter(char character) {
        this.character = character;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
}
