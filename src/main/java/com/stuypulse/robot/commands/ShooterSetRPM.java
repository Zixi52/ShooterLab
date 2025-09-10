package com.stuypulse.robot.commands;

import com.stuypulse.robot.subsystems.Shooter;

import edu.wpi.first.wpilibj2.command.InstantCommand;

public class ShooterSetRPM extends InstantCommand {

    //TODO: Make a field for the shooter

    private double targetRPM;

    public ShooterSetRPM(double targetRPM) {
        //TODO: Initialize the shooter and targetRPM in the constructor (dont forget to add requirements)
    }

    @Override
    public void initialize() {
        //TODO: Use the shooter's setTargetRPM method to set the target RPM (very similar to ShooterStop.java)
    }
}
