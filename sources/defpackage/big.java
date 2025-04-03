package defpackage;

import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class big {
    static final bii[] a;
    static final bii[][] b;
    static final HashSet c;
    public static final String d;
    private static final bii[] f;
    private static final bii[] g;
    private static final bii[] h;
    private static final bii[] i;
    public final ByteOrder e;
    private final List j;

    static {
        bii[] biiVarArr = {new bii("ImageWidth", 256, 3, 4), new bii("ImageLength", 257, 3, 4), new bii("Make", 271, 2), new bii("Model", 272, 2), new bii("Orientation", 274, 3), new bii("XResolution", 282, 5), new bii("YResolution", 283, 5), new bii("ResolutionUnit", 296, 3), new bii("Software", 305, 2), new bii("DateTime", 306, 2), new bii("YCbCrPositioning", 531, 3), new bii("SubIFDPointer", 330, 4), new bii("ExifIFDPointer", 34665, 4), new bii("GPSInfoIFDPointer", 34853, 4)};
        f = biiVarArr;
        bii[] biiVarArr2 = {new bii("ExposureTime", 33434, 5), new bii("FNumber", 33437, 5), new bii("ExposureProgram", 34850, 3), new bii("PhotographicSensitivity", 34855, 3), new bii("SensitivityType", 34864, 3), new bii("ExifVersion", 36864, 2), new bii("DateTimeOriginal", 36867, 2), new bii("DateTimeDigitized", 36868, 2), new bii("ComponentsConfiguration", 37121, 7), new bii("ShutterSpeedValue", 37377, 10), new bii("ApertureValue", 37378, 5), new bii("BrightnessValue", 37379, 10), new bii("ExposureBiasValue", 37380, 10), new bii("MaxApertureValue", 37381, 5), new bii("MeteringMode", 37383, 3), new bii("LightSource", 37384, 3), new bii("Flash", 37385, 3), new bii("FocalLength", 37386, 5), new bii("SubSecTime", 37520, 2), new bii("SubSecTimeOriginal", 37521, 2), new bii("SubSecTimeDigitized", 37522, 2), new bii("FlashpixVersion", 40960, 7), new bii("ColorSpace", 40961, 3), new bii("PixelXDimension", 40962, 3, 4), new bii("PixelYDimension", 40963, 3, 4), new bii("InteroperabilityIFDPointer", 40965, 4), new bii("FocalPlaneResolutionUnit", 41488, 3), new bii("SensingMethod", 41495, 3), new bii("FileSource", 41728, 7), new bii("SceneType", 41729, 7), new bii("CustomRendered", 41985, 3), new bii("ExposureMode", 41986, 3), new bii("WhiteBalance", 41987, 3), new bii("SceneCaptureType", 41990, 3), new bii("Contrast", 41992, 3), new bii("Saturation", 41993, 3), new bii("Sharpness", 41994, 3)};
        g = biiVarArr2;
        bii[] biiVarArr3 = {new bii("GPSVersionID", 0, 1), new bii("GPSLatitudeRef", 1, 2), new bii("GPSLatitude", 2, 5, 10), new bii("GPSLongitudeRef", 3, 2), new bii("GPSLongitude", 4, 5, 10), new bii("GPSAltitudeRef", 5, 1), new bii("GPSAltitude", 6, 5), new bii("GPSTimeStamp", 7, 5), new bii("GPSSpeedRef", 12, 2), new bii("GPSTrackRef", 14, 2), new bii("GPSImgDirectionRef", 16, 2), new bii("GPSDestBearingRef", 23, 2), new bii("GPSDestDistanceRef", 25, 2)};
        h = biiVarArr3;
        a = new bii[]{new bii("SubIFDPointer", 330, 4), new bii("ExifIFDPointer", 34665, 4), new bii("GPSInfoIFDPointer", 34853, 4), new bii("InteroperabilityIFDPointer", 40965, 4)};
        bii[] biiVarArr4 = {new bii("InteroperabilityIndex", 1, 2)};
        i = biiVarArr4;
        b = new bii[][]{biiVarArr, biiVarArr2, biiVarArr3, biiVarArr4};
        c = new HashSet(Arrays.asList("FNumber", "ExposureTime", "GPSTimeStamp"));
        d = new String(new byte[]{1, 2, 3, 0}, StandardCharsets.UTF_8);
    }

    public big(ByteOrder byteOrder, List list) {
        ksw.d(list.size() == 4, "Malformed attributes list. Number of IFDs mismatch.");
        this.e = byteOrder;
        this.j = list;
    }

    final Map a(int i2) {
        ksw.e(i2, 0, 4, a.f(i2, "Invalid IFD index: ", ". Index should be between [0, EXIF_TAGS.length] "));
        return (Map) this.j.get(i2);
    }
}
