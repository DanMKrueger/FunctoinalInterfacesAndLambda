import java.util.regex.Pattern;
import java.lang.StringBuilder;
import java.util.stream.Collectors;

@FunctionalInterface
public interface StringReverse{
    public String myReversedString(String myString);
}

class LambdaExamples{
    public static void main(String args[]){

        StringReverse tempString = (String mySentance) -> {return Pattern.compile(" ").splitAsStream(mySentance).map(word->new StringBuilder(word).reverse()).collect(Collectors.joining(" ")); };
        System.out.println(tempString.myReversedString("This is my sentance"));
    }
}