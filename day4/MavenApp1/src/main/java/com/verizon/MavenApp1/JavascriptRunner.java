package com.verizon.MavenApp1;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
public class JavascriptRunner {
	    public static void main(String[] args) throws ScriptException {
	        ScriptEngineManager manager = new ScriptEngineManager();
	        ScriptEngine engine = manager.getEngineByName("nashorn");

	        if (engine == null) {
	            System.out.println("Nashorn engine not found. Please add nashorn-core dependency.");
	            return;
	        }
	        engine.eval("print('Hello from Nashorn in Java 21');");
	        Object result = engine.eval("3 + 7");
	        System.out.println("JavaScript result: " + result);
	    }
	}
