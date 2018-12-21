import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import java.util.Scanner;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import tools.Tools;

class ToolsTest {

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		outContent.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
	}

	@AfterEach
	void tearDown() throws Exception {
        System.setOut(System.out);
	}

	@Test
	@DisplayName("AskToUser: Good value (1) in the range [1 to 100]")
	void GoodValue_test_AskToUser() {
		// Gets back the values that has been sent with the keyboard
		System.setIn(new ByteArrayInputStream(String.format("1%n").getBytes()));
		
		// The static method of the Tools class returns the final choice
		int choice = Tools.askToUser(new Scanner(System.in), 1, 100);
		assertEquals(1, choice);
	}
	
	@Test
	@DisplayName("AskToUser: Bad choice (text)")
	void BadChoice_test_AskToUser() {
		// Gets back the values that has been sent with the keyboard
		System.setIn(new ByteArrayInputStream(String.format("text%n1%n").getBytes()));
		
		// The static method of the Tools class returns the final choice
		int choice = Tools.askToUser(new Scanner(System.in), 1, 100);
		assertEquals(1, choice);
		
		String[] stringArrayOutput = outContent.toString().replace("\r\n", "\n").split("\n");			
		assertEquals("Veuilliez saisir un entier, s'il vous plaît !", stringArrayOutput[0]);
	}
	
	@Test
	@DisplayName("AskToUser: Bad value (200) in the range [1 to 100]")
	void BadValue1_test_AskToUser() {
		// Gets back the values that has been sent with the keyboard
		System.setIn(new ByteArrayInputStream(String.format("200%n1%n").getBytes()));
		
		// The static method of the Tools class returns the final choice
		int choice = Tools.askToUser(new Scanner(System.in), 1, 100);
		assertEquals(1, choice);
		
		String[] stringArrayOutput = outContent.toString().replace("\r\n", "\n").split("\n");			
		assertEquals("L'intervalle de validité est [1 ; 100].", stringArrayOutput[0]);
	}
	
	@Test
	@DisplayName("AskToUser: Bad value (0) in the range [1 to 100]")
	void BadValue2_test_AskToUser() {
		// Gets back the values that has been sent with the keyboard
		System.setIn(new ByteArrayInputStream(String.format("0%n1%n").getBytes()));
		
		// The static method of the Tools class returns the final choice
		int choice = Tools.askToUser(new Scanner(System.in), 1, 100);
		assertEquals(1, choice);
		
		String[] stringArrayOutput = outContent.toString().replace("\r\n", "\n").split("\n");			
		assertEquals("L'intervalle de validité est [1 ; 100].", stringArrayOutput[0]);
	}
	
	//---------------------------------------------------------------------------------------------
	
	private static ByteArrayOutputStream outContent;
}
