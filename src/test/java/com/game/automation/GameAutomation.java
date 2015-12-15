package com.game.automation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.sikuli.script.Screen;

public class GameAutomation 
{
	int waitDefault = 1*60;
	Screen screen = new Screen();
	String galaxyS6Path = "pictures/GalaxyS6/";
	
	public void clearCacheApp(String packageApp) throws IOException, InterruptedException{
		adbCommand("adb shell pm clear "+packageApp); 
	}
	
	public void startApp(String mainActivity) throws IOException, InterruptedException{
		adbCommand("adb shell am start -n "+mainActivity);
	}
	
	public void closeApp(String packageApp) throws IOException, InterruptedException{
		adbCommand("adb shell am force-stop "+packageApp);
	}
	
	public String getDeviceModel() throws IOException, InterruptedException{
		return adbCommandGetModel("adb shell getprop ro.product.model");
	}
	
	public void adbCommand(String command) throws IOException, InterruptedException {
		ProcessBuilder builder = new ProcessBuilder(
	            "cmd.exe", "/c", command);
	        builder.redirectErrorStream(true);
	        Process p = builder.start();
	        p.waitFor();
	        BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
	        String line;
	        while (true) {
	            line = r.readLine();
	            if (line == null) { break; }
	            System.out.println(line);
	        }
	}
	
	public String adbCommandGetModel(String command) throws IOException, InterruptedException {	 	
		String line = "null";
		String cmd = command;

		Runtime run = Runtime.getRuntime();
		Process pr = run.exec(cmd);

		pr.waitFor();
		String model = null;
		BufferedReader buf = new BufferedReader(new InputStreamReader(pr.getInputStream()));
		while ((line=buf.readLine())!=null) {
			if(line.length() > 0){
				model = line;
			}
		}
		return model;
	}
}
