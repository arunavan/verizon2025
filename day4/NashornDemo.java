package day4;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;


public class NashornDemo {
	
	    public static void main(String[] args) {
	        // Create a script engine manager
	        ScriptEngineManager manager = new ScriptEngineManager();

	        // Create a Nashorn script engine
	        ScriptEngine engine = manager.getEngineByName("nashorn");

	        // JavaScript code to execute
	        String script = "var greeting = 'Hello from JavaScript!'; greeting + ' 2 + 3 = ' + (2 + 3);";

	        try {
	            // Evaluate the script and print the result
	            Object result = engine.eval(script);
	            System.out.println("JavaScript Output: " + result);
	        } catch (ScriptException e) {
	            e.printStackTrace();
	        }
	    }
	}
