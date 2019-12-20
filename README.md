# johnnylambada-orientation

This library makes it simple to track the orientation of the phone. It's based on the 
[Google Training TiltSpot-Solution](https://github.com/google-developer-training/android-advanced/tree/master/TiltSpot) 
repository. 

## Using this library

The following steps enable you to use this library.

### Set up jitpack.io for your project

Refer to [jitpack's documentation](https://jitpack.io/) for instructions.

### Add the library to your project

Add the following lines to your `app/build.gradle` dependencies:

```groovy
// https://github.com/johnnylambada/johnnylambada-orientation
implementation "com.github.johnnylambada:johnnylambada-orientation:1.0.0"
```

### Set up the service using the `OrientationReporter`

```java
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView azimuthView = findViewById(R.id.azimuth);
        final TextView pitchView = findViewById(R.id.pitch);
        final TextView rollView = findViewById(R.id.roll);

        getLifecycle().addObserver(new OrientationReporter(this, (azimuth, pitch, roll) -> {
            azimuthView.setText(getString(R.string.float_value,azimuth));
            pitchView.setText(getString(R.string.float_value,pitch));
            rollView.setText(getString(R.string.float_value,roll));
        }));
    }
```

### Review the sample app to see how to integrate the library.

Review the [MainActivity](https://github.com/johnnylambada/johnnylambada-orientation/blob/master/app/src/main/java/app/MainActivity.java), 
it shows you how to use the `OrientationReporter` from your activity.
