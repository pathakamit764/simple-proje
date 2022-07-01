package com.spring.assignment;
import org.springframework.expression.Expression;  
import org.springframework.expression.ExpressionParser;  
import org.springframework.expression.spel.standard.SpelExpressionParser;  
public class SpelExpression {

public static void main(String[] args) {  
ExpressionParser parser = new SpelExpressionParser();  
  
Expression exp = parser.parseExpression("'Hello World'");  
String message = (String) exp.getValue();  
System.out.println(message);  

ExpressionParser parser1 = new SpelExpressionParser();  
Expression exp1 = parser1.parseExpression("'Welcome SPEL'.concat('!')");  
String message1 = (String) exp1.getValue();  
System.out.println(message1);  

ExpressionParser parser2 = new SpelExpressionParser();
Expression exp2 = parser2.parseExpression("'Hello' .bytes");  
byte[] bytes = (byte[]) exp2.getValue();  
for(int i=0;i<bytes.length;i++){  
    System.out.print((char)bytes[i]+" ");  
    
    
    
}  
}  
}  