package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.*;

@TeleOp(name="Tank Drive", group="Simple Drivebase")
public class MyFirstOpMode extends OpMode {

    private DcMotor leftMotor;
    private DcMotor rightMotor;
    private boolean dpadOn = false;

    @Override
    public void init() {

        leftMotor = hardwareMap.get(DcMotor.class, "left_motor");
        rightMotor = hardwareMap.get(DcMotor.class, "right_motor");

        leftMotor.setDirection(DcMotor.Direction.FORWARD);
        rightMotor.setDirection(DcMotor.Direction.REVERSE);

    }

    @Override
    public void loop() {

        if (gamepad1.a) {
           switch (dpadOn) {
               case true:
                   dpadOn = false;
                   break;
               case false:
                   dpadOn = true;
                   break;
               default:
                   break;
           }
       }

        if (dpadOn) {
            if (gamepad1.dpad_up) {
                setRobotSpeed(-0.75);
            } else if (gamepad1.dpad_down) {
                setRobotSpeed(0.75);
            } else if (gamepad1.dpad_left) {
                robotTurn(0.5, 0);
            } else if (gamepad1.dpad_right) {
                robotTurn(0.5, 1);
            } else {
                stopRobot();
            }
        }

        else {
            leftMotor.setPower(gamepad1.left_stick_y);
            rightMotor.setPower(gamepad1.right_stick_y);
        }
    }

    private void setRobotSpeed(double power) {
        leftMotor.setPower(power);
        rightMotor.setPower(power);
    }

    private void robotTurn(double power, int direction) {
        switch(direction) {
            case 0:
                leftMotor.setPower(power);
                rightMotor.setPower(-power);
                break;
            case 1:
                leftMotor.setPower(-power);
                rightMotor.setPower(power);
                break;
            default:
                break;
        }
    }

    private void stopRobot() {
        setRobotSpeed(0); // wow
    }

}
