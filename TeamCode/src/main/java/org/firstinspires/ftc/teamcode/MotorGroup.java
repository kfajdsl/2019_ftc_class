package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;

public class MotorGroup {
    private DcMotor[] motors;

    public MotorGroup(DcMotor[] motors) {
        this.motors = motors;
    }

    public void setPower(double power) {
        for (DcMotor i : motors) {
            i.setPower(power);
        }
    }

}
