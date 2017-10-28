package org.usfirst.frc.team5002.drive.swerve;

import org.usfirst.frc.team5002.drive.Drive;

/**
 * The base interface for Swerve Drive.
 * All swerve drive classes must implement this interface to be
 * considered "swerve drive".
 *
 * This interface extends the Drive interface and adds on
 * extra methods specific to SwerveDrive.
 *
 * @author Brandon Gong
 * Date: 9/9/17
 */
public abstract class SwerveDrive implements Drive {

    /**
     * Lock the base.  This turns all wheels into an X-formation.
     */
    public abstract void lock();
    
    /*
     * Dimensions of base (axle-to-axle, wheel-to-wheel respectively).
     */
    private final double LENGTH = 24.69;
    private final double WIDTH = 22.61;

     double a;
     double b;
     double c;
     double d;
     double brSpeed;
     double blSpeed;
     double frSpeed;
     double flSpeed;
     double brAngle;
     double blAngle;
     double frAngle;
     double flAngle;
    




     /**
      * Set the twisting rate.  This means rotating robot chassis while
      * continuing to drive in a straight line.
      *
      * @param rate The rate of twisting expressed as a percentage of maximum
      *             twisting rate.  Should be between -1 and +1, with 0 being
      *             no twisting at all.
      */
     public void drive(double x, double y, double z) {
    	// Calculate diagonal length.
         double r = Math.sqrt((this.LENGTH * this.LENGTH) + (this.WIDTH * this.WIDTH));

         // invert y-axis
         y *= -1;

         // intermediate vector components
          a = x - z * (this.LENGTH / r);
          b = x + z * (this.LENGTH / r);
          c = y - z * (this.WIDTH / r);
          d = y + z * (this.WIDTH / r);

         // This is the speed calculations for each wheel.
          brSpeed = Math.sqrt((a * a) + (d * d));
          blSpeed = Math.sqrt((a * a) + (c * c));
         frSpeed = Math.sqrt((b * b) + (d * d));
          flSpeed = Math.sqrt((b * b) + (c * c));

         // Angle calculations for each wheel.
          brAngle = Math.atan2(a, d) / Math.PI;
          blAngle = Math.atan2(a, c) / Math.PI;
          frAngle = Math.atan2(b, d) / Math.PI;
          flAngle = Math.atan2(b, c) / Math.PI;
        }

}
