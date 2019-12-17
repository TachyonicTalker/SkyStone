package org.firstinspires.ftc.teamcode;

/**
 * An indication of which type of filter to use for a blur.
 * Choices are BOX, GAUSSIAN, MEDIAN, and BILATERAL
 */
enum BlurType{
    BOX("Box Blur"), GAUSSIAN("Gaussian Blur"), MEDIAN("Median Filter"),
    BILATERAL("Bilateral Filter");

    private final String label;

    BlurType(String label) {
        this.label = label;
    }

    public static BlurType get(String type) {
        if (BILATERAL.label.equals(type)) {
            return BILATERAL;
        }
        else if (GAUSSIAN.label.equals(type)) {
            return GAUSSIAN;
        }
        else if (MEDIAN.label.equals(type)) {
            return MEDIAN;
        }
        else {
            return BOX;
        }
    }

    @Override
    public String toString() {
        return this.label;
    }
}
