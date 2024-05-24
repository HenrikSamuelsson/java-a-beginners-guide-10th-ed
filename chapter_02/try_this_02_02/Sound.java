/*
 * Try This 2-1
 * 
 * Compute the distance to a lightning strike whose sound takes 7.2 seconds to
 * reach you.
 */
class Sound {
    public static void main(String[] args) {
        double time_s = 7.2; // Time from lighting strike until sound is heard.

        double speedOfSound_ms = 343; // Speed of sound in meters per second.
        double speedOfSound_fs = 1125; // Speed of sound in foot per second.

        // Calculate distance to lightning strike in meters.
        double distance_m = time_s * speedOfSound_ms;

        // Calculate distance to lightning strike in feet.
        double distance_f = time_s * speedOfSound_fs;

        // Present result of the calculations.
        System.out.println("The lightning is " + distance_m + " meters away ("
                + distance_f + " feet away).");
    }
}
