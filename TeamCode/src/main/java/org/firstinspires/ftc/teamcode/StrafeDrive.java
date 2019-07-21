package org.firstinspires.ftc.teamcode;

public class StrafeDrive {

    private MotorGroup strafeLeft, strafeRight;

    public StrafeDrive(MotorGroup diagLeft, MotorGroup diagRight) {
        strafeLeft = diagLeft;
        strafeRight = diagRight;
    }

    public void setPower(float speed) {
        strafeLeft.setPower(-speed);
        strafeRight.setPower(speed);
    }

}
