package main;

import java.io.*;
import lexer.*;
import parser.*;

/*
 * 龙书《编译原理》：附录A —— 一个完整的编译器前端
 */
public class Main {

	public static void main(String[] args) throws IOException {
		Lexer lex = new Lexer();
		Parser parse = new Parser(lex);
		parse.program();
		System.out.write('\n');
	}
	
}
