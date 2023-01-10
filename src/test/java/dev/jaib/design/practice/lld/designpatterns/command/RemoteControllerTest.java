package dev.jaib.design.practice.lld.designpatterns.command;

import org.junit.jupiter.api.Test;

class RemoteControllerTest
{

	@Test
	void remoteControllerTest()
	{
		RemoteContoller remoteContoller = new RemoteContoller();

		Light light = new Light();
		Stereo stereo = new Stereo();

		LightOnCommand lightOnCommand = new LightOnCommand(light);
		LightOffCommand lightOffCommand = new LightOffCommand(light);

		StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
		StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

		remoteContoller.setCommand(lightOnCommand, lightOffCommand, 0);
		remoteContoller.setCommand(stereoOnWithCDCommand, stereoOffCommand, 1);

		System.out.println(remoteContoller);

		remoteContoller.onButtonWasPushed(0);
		remoteContoller.onButtonWasPushed(1);
		remoteContoller.onButtonWasPushed(2);

		System.out.println("\n");
		remoteContoller.offButtonWasPushed(0);
		remoteContoller.offButtonWasPushed(1);

		System.out.println("\n");

		remoteContoller.undoButtonWasPushed();


		MacroCommands macroCommandsOn = new MacroCommands(new Command[]{lightOnCommand, stereoOnWithCDCommand});
		MacroCommands macroCommandsOFF = new MacroCommands(new Command[]{lightOffCommand, stereoOffCommand});
		remoteContoller.setCommand(macroCommandsOn, macroCommandsOFF, 2);

		System.out.println(remoteContoller);

		remoteContoller.onButtonWasPushed(2);
		remoteContoller.offButtonWasPushed(2);

	}

}