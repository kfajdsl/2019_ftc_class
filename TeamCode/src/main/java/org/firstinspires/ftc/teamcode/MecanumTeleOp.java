package org.ftcinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.*;
import com.qualcomm.robotcore.hardware.*;

@TeleOp(name="Mecanum Drive", group="Simple Drivebase")
public class MecanumTeleOp extends OpMode {

    private DcMotor frontLeft, frontRight, backLeft, backRight;
    privae MotorGroup groupLeft, groupRight;

    public void init() {
        frontLeft = hardwareMap.dcMotor.get("drive_fL");
        frontRight = hardwareMap.dcMotor.get("drive_fR");
        backLeft = hardwareMap.dcMotor.get("drive_bL");
        backRight = hardwareMap.dcMotor.get("drive_bR");

        groupLeft = new MotorGroup(new DcMotor[] {frontLeft, backLeft});
        groupRight = new MotorGroup(new DcMotor[] {frontRight, backRight});
    }

    public void loop() {
    }

}