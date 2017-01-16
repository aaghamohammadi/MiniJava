
import parser.Parser;
import scanner.lexicalAnalyzer;
import scanner.token.Token;
import scanner.type.Type;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Parser parser = new Parser();
        try {
	    // start parsing
            parser.startParse(new Scanner(new File("src//resource//code")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}



