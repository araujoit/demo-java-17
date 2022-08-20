package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.pattern.PatternMatchingInstanceOf;
import com.example.demo.record2.BasicRecord;
import com.example.demo.switchexpressions.SwitchExpressions;
import com.example.demo.switchexpressions.SwitchExpressionsYield;
import com.example.demo.text.TextBlocks;

@SpringBootApplication
public class DemoJava17Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoJava17Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// 2. Text Blocks
		// TextBlocks.validate();

		// 3. Switch Expressions
		// SwitchExpressions.validate("Orange");
		// SwitchExpressionsYield.validate("Orange");

		// 4. Records
		// BasicRecord.validate();
		// BasicRecord.validate2();

		// 5. Sealed Classes

		// 6. Pattern matching of instanceof
		// PatternMatchingInstanceOf.validate();

		// 7. NullPointerException úteis
		// NullPointerExceptions.validate();

		// 8. Suporte a compactação de formatação de número
		// NumberFormattingSupport.validate();

		// 9. Adicionado suporte aó período do dia
		// DatePeriodSupport.validate();
		// DatePeriodSupport.validateWithLocale();

		// 10. Stream.toList()
		// StreamToListUtils.validate();
	}
}
