import java.util.*;

// METHOOD
public class Funcoes{
    public static List<Integer> calculation(int maxDigit) {
        List<Integer> numerosFinal = new ArrayList<>();
        
        for(int num1 = 0; num1 <= maxDigit ;num1++){
            for(int num2 = 0; num2 <= maxDigit ;num2++){
                for(int num3 = 0; num3 <= maxDigit ;num3++){
                    for(int num4 = 0; num4 <= maxDigit ;num4++){
                        if(num1 + num2 + num3 + num4 == 21){
                            String num = "" + num1 +num2+ num3 + num4;
                            numerosFinal.add(Integer.parseInt(num));
                        }
                    }
                }
            }
        }
        
        if(numerosFinal.isEmpty()){
            numerosFinal.add(null);
        }
        
        return numerosFinal;
    }

    public static void main(String[] args){
        System.out.println(calculation(6));
    }
}