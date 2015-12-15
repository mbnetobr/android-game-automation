package com.game.automation;

import java.io.IOException;

import org.junit.Assert;
import org.sikuli.script.FindFailed;


public class AngryBirds extends GameAutomation {
	
	String packageApp = "com.rovio.angrybirds";
	String mainActivity = "com.rovio.angrybirds/com.rovio.fusion.App";
	
	@org.junit.Before
	public void setUp() throws IOException, InterruptedException{
		clearCacheApp(packageApp);
		startApp(mainActivity);
	}
	
	@org.junit.After
	public void tearDown() throws IOException, InterruptedException{
		closeApp(packageApp);
	}
	
	@org.junit.Test
    public void testOpenAnglyFirstPhase() throws FindFailed, IOException, InterruptedException
    {
		switch(getDeviceModel()){
			
			/*
			 * Galaxy S6 Edge - 36%
			 * */
			case "SM-G925I":
				
				screen.wait(galaxyS6Path+"close.png",waitDefault);
				screen.click(galaxyS6Path+"close.png");
				
				screen.wait(galaxyS6Path+"play.png",waitDefault);
				screen.click(galaxyS6Path+"play.png");
				
				screen.wait(galaxyS6Path+"phase1.png",waitDefault);
				screen.click(galaxyS6Path+"phase1.png");
				
				screen.wait(galaxyS6Path+"nivel1.png",waitDefault);
				screen.click(galaxyS6Path+"nivel1.png");
				
				screen.wait(galaxyS6Path+"game_start.png",waitDefault);
				screen.click(galaxyS6Path+"start.png");
				
				screen.wait(galaxyS6Path+"bird_drag.png",waitDefault);
				screen.dragDrop(galaxyS6Path+"bird_drag.png", galaxyS6Path+"bird_drop.png");
				screen.wait(galaxyS6Path+"bird_drag.png",waitDefault);
				
				screen.wait(galaxyS6Path+"level_finish.png",waitDefault);
				Assert.assertNotNull(screen.exists(galaxyS6Path+"level_finish.png"));
				
				break;
			default:
				System.out.println("Model not found");
		}
		
		
    }

}
