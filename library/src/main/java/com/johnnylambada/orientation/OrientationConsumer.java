package com.johnnylambada.orientation;

public interface OrientationConsumer {
    void accept(float azimuth, float pitch, float roll);
}
