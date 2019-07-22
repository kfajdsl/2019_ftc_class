package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.*;
import com.qualcomm.robotcore.hardware.*;

@TeleOp(name="Mecanum Drive", group="Simple Drivebase")
public class MecanumTeleOp extends OpMode {

    private DcMotor frontLeft, frontRight, backLeft, backRight;
    private MotorGroup groupLeft, groupRight;
    private MotorGroup strafeFront, strafeBack;
    private ArcadeDrive arcadeDrive;
    private StrafeDrive strafeDrive;

    public void init() {
        frontLeft = hardwareMap.dcMotor.get("drive_fL");
        frontRight = hardwareMap.dcMotor.get("drive_fR");
        backLeft = hardwareMap.dcMotor.get("drive_bL");
        backRight = hardwareMap.dcMotor.get("drive_bR");

        groupLeft = new MotorGroup(new DcMotor[] {frontLeft, backLeft});
        groupRight = new MotorGroup(new DcMotor[] {frontRight, backRight});
        strafeBack = new MotorGroup(new DcMotor[] {backLeft, backRight});
        strafeFront = new MotorGroup(new DcMotor[] {frontLeft, frontRight});

        arcadeDrive = new ArcadeDrive(groupLeft, groupRight);
        strafeDrive = new StrafeDrive(strafeFront, strafeBack);
    }

    public void loop() {
        if (Math.abs(gamepad1.right_stick_x) < 0.25) {
            arcadeDrive.drive(gamepad1.left_stick_x, gamepad1.left_stick_y);
        }
        else {
            strafeDrive.drive(gamepad1.right_stick_x);
        }

    }

}