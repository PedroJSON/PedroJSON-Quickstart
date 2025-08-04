package org.firstinspires.ftc.teamcode.pedroPathing.Config;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import PedroJSON.main.Callback;

public class Callbacks extends PedroJSON.main.Callback {

    OpMode opmode;

    public Callbacks(OpMode opmode) {
        this.opmode = opmode;
    }

    @Override
    public Runnable GetCallback(String identifier) {

        Runnable codeToRun = () -> {
            //Maybe add a default command idk
        };

        switch (identifier) {
            case "verticalLiftTo10": //Example case
                codeToRun = () -> {
                    // Code goes here
                };
                break;
            case "closeClaw": //Example case
                codeToRun = () -> {
                    // Code goes here
                };
                break;
            case "horizontalLiftTo25": //Example case
                codeToRun = () -> {
                    // Code goes here
                };
                break;
        }

        return codeToRun;
    }
}
