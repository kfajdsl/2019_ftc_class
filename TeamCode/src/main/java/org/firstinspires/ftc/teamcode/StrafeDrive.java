package org.firstinspires.ftc.teamcode;

public class StrafeDrive {

    private MotorGroup strafeFront, strafeBack;

    public StrafeDrive(MotorGroup back, MotorGroup front) {
        strafeFront = back;
        strafeBack = front;
    }

    public void drive(float speed) {
        strafeFront.setPower(speed);
        strafeBack.setPower(-speed);
    }

}
