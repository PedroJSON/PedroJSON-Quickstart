package org.firstinspires.ftc.teamcode.pedroPathing.OpModes.Testing_OpModes.examples;

import com.pedropathing.follower.Follower;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import org.firstinspires.ftc.teamcode.pedroPathing.Config.Callbacks;
import org.firstinspires.ftc.teamcode.pedroPathing.Config.constants.*;

import java.io.File;

import PedroJSON.main.PathLoader;

@Autonomous(name = "Test: JSON Auto")
public class Test_JSONAuto extends OpMode {
    File routine = new File("TeamCode\\src\\main\\java\\org\\firstinspires\\ftc\\teamcode\\pedroPathing\\OpModes\\Data\\");
    Follower follower;
    PathLoader pathLoader;
    Callbacks callbacks;

    @Override
    public void init() {
        callbacks = new Callbacks(this);
        follower = new Follower(hardwareMap, FConstants.class, LConstants.class);
        pathLoader = new PathLoader(routine, follower, this, callbacks);

        pathLoader.Parse();
        pathLoader.Init();
    }

    @Override
    public void start() {
        pathLoader.Start();
    }

    @Override
    public void loop() {
        pathLoader.Update();
    }
}
