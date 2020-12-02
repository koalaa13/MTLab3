import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;
import java.util.Scanner;

public class Translator {

    private static String generate(InputStream inputStream) throws IOException {
        CharStream stream = CharStreams.fromStream(inputStream);
        GrammarLexer lexer = new GrammarLexer(stream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        GrammarParser parser = new GrammarParser(commonTokenStream);

        ParseTree tree = parser.start();
        GrammarListenerImpl listener = new GrammarListenerImpl();
        ParseTreeWalker.DEFAULT.walk(listener, tree);
        return listener.getCode().toString();
    }

    public static void main(String[] args) throws IOException {
        File file = new File("tests/whileTests/whileEasyTest.txt");
        StringBuilder input = new StringBuilder();
        try (Scanner reader = new Scanner(file)) {
            while (reader.hasNextLine()) {
                input.append(reader.nextLine()).append('\n');
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        InputStream stream = new ByteArrayInputStream(input.toString().getBytes());
        System.out.println(generate(stream));
    }
}
