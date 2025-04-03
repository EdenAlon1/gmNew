package defpackage;

import android.content.res.AssetManager;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import com.android.vcard.VCardConstants;
import j$.util.DesugarCollections;
import j$.util.DesugarTimeZone;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lig {
    private static final byte[] B;
    private static final byte[] C;
    private static final byte[] D;
    private static final byte[] E;
    private static final byte[] F;
    private static final byte[] G;
    private static final byte[] H;
    private static final byte[] I;
    private static final byte[] J;
    private static final byte[] K;
    private static final byte[] L;
    private static final byte[] M;
    private static final byte[] N;
    private static final byte[] O;
    private static final byte[] P;
    private static final byte[] Q;
    private static final lid[] R;
    private static final lid[] S;
    private static final lid[] T;
    private static final lid[] U;
    private static final lid[] V;
    private static final lid W;
    private static final lid[] X;
    private static final lid[] Y;
    private static final lid[] Z;
    public static final boolean a = Log.isLoggable("ExifInterface", 3);
    private static final lid[] aa;
    private static final lid[] ab;
    private static final HashMap[] ac;
    private static final HashMap[] ad;
    private static final Set ae;
    private static final HashMap af;
    private static final Pattern ag;
    private static final Pattern ah;
    private static final Pattern ai;
    public static final int[] b;
    public static final int[] c;
    static final byte[] d;
    public static final byte[] e;
    static final byte[] f;
    public static final SimpleDateFormat g;
    public static final SimpleDateFormat h;
    public static final String[] i;
    public static final int[] j;
    public static final byte[] k;
    static final lid[][] l;
    public static final Charset m;
    public static final byte[] n;
    public static final byte[] o;
    public static final Pattern p;
    public boolean A;
    private AssetManager.AssetInputStream aj;
    private final HashMap[] ak;
    private final Set al;
    private ByteOrder am;
    private int an;
    private int ao;
    private int ap;
    private int aq;
    private int ar;
    public String q;
    public FileDescriptor r;
    public int s;
    public boolean t;
    public boolean u;
    public boolean v;
    public byte[] w;
    public int x;
    public int y;
    public lic z;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        b = new int[]{8, 8, 8};
        c = new int[]{8};
        d = new byte[]{-1, -40, -1};
        B = new byte[]{102, 116, 121, 112};
        C = new byte[]{109, 105, 102, 49};
        D = new byte[]{104, 101, 105, 99};
        E = new byte[]{97, 118, 105, 102};
        F = new byte[]{97, 118, 105, 115};
        G = new byte[]{79, 76, 89, 77, 80, 0};
        H = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        e = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        f = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);
        I = new byte[]{82, 73, 70, 70};
        J = new byte[]{87, 69, 66, 80};
        K = new byte[]{69, 88, 73, 70};
        L = new byte[]{-99, 1, 42};
        M = "VP8X".getBytes(Charset.defaultCharset());
        N = "VP8L".getBytes(Charset.defaultCharset());
        O = "VP8 ".getBytes(Charset.defaultCharset());
        P = "ANIM".getBytes(Charset.defaultCharset());
        Q = "ANMF".getBytes(Charset.defaultCharset());
        i = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        j = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        k = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        lid[] lidVarArr = {new lid("NewSubfileType", 254, 4), new lid("SubfileType", PrivateKeyType.INVALID, 4), new lid("ImageWidth", 256, 3, 4), new lid("ImageLength", 257, 3, 4), new lid("BitsPerSample", 258, 3), new lid("Compression", 259, 3), new lid("PhotometricInterpretation", 262, 3), new lid("ImageDescription", 270, 2), new lid("Make", 271, 2), new lid("Model", 272, 2), new lid("StripOffsets", 273, 3, 4), new lid("Orientation", 274, 3), new lid("SamplesPerPixel", 277, 3), new lid("RowsPerStrip", 278, 3, 4), new lid("StripByteCounts", 279, 3, 4), new lid("XResolution", 282, 5), new lid("YResolution", 283, 5), new lid("PlanarConfiguration", 284, 3), new lid("ResolutionUnit", 296, 3), new lid("TransferFunction", 301, 3), new lid("Software", 305, 2), new lid("DateTime", 306, 2), new lid("Artist", 315, 2), new lid("WhitePoint", 318, 5), new lid("PrimaryChromaticities", 319, 5), new lid("SubIFDPointer", 330, 4), new lid("JPEGInterchangeFormat", 513, 4), new lid("JPEGInterchangeFormatLength", 514, 4), new lid("YCbCrCoefficients", 529, 5), new lid("YCbCrSubSampling", 530, 3), new lid("YCbCrPositioning", 531, 3), new lid("ReferenceBlackWhite", 532, 5), new lid("Copyright", 33432, 2), new lid("ExifIFDPointer", 34665, 4), new lid("GPSInfoIFDPointer", 34853, 4), new lid("SensorTopBorder", 4, 4), new lid("SensorLeftBorder", 5, 4), new lid("SensorBottomBorder", 6, 4), new lid("SensorRightBorder", 7, 4), new lid("ISO", 23, 3), new lid("JpgFromRaw", 46, 7), new lid("Xmp", 700, 1)};
        R = lidVarArr;
        lid[] lidVarArr2 = {new lid("ExposureTime", 33434, 5), new lid("FNumber", 33437, 5), new lid("ExposureProgram", 34850, 3), new lid("SpectralSensitivity", 34852, 2), new lid("PhotographicSensitivity", 34855, 3), new lid("OECF", 34856, 7), new lid("SensitivityType", 34864, 3), new lid("StandardOutputSensitivity", 34865, 4), new lid("RecommendedExposureIndex", 34866, 4), new lid("ISOSpeed", 34867, 4), new lid("ISOSpeedLatitudeyyy", 34868, 4), new lid("ISOSpeedLatitudezzz", 34869, 4), new lid("ExifVersion", 36864, 2), new lid("DateTimeOriginal", 36867, 2), new lid("DateTimeDigitized", 36868, 2), new lid("OffsetTime", 36880, 2), new lid("OffsetTimeOriginal", 36881, 2), new lid("OffsetTimeDigitized", 36882, 2), new lid("ComponentsConfiguration", 37121, 7), new lid("CompressedBitsPerPixel", 37122, 5), new lid("ShutterSpeedValue", 37377, 10), new lid("ApertureValue", 37378, 5), new lid("BrightnessValue", 37379, 10), new lid("ExposureBiasValue", 37380, 10), new lid("MaxApertureValue", 37381, 5), new lid("SubjectDistance", 37382, 5), new lid("MeteringMode", 37383, 3), new lid("LightSource", 37384, 3), new lid("Flash", 37385, 3), new lid("FocalLength", 37386, 5), new lid("SubjectArea", 37396, 3), new lid("MakerNote", 37500, 7), new lid("UserComment", 37510, 7), new lid("SubSecTime", 37520, 2), new lid("SubSecTimeOriginal", 37521, 2), new lid("SubSecTimeDigitized", 37522, 2), new lid("FlashpixVersion", 40960, 7), new lid("ColorSpace", 40961, 3), new lid("PixelXDimension", 40962, 3, 4), new lid("PixelYDimension", 40963, 3, 4), new lid("RelatedSoundFile", 40964, 2), new lid("InteroperabilityIFDPointer", 40965, 4), new lid("FlashEnergy", 41483, 5), new lid("SpatialFrequencyResponse", 41484, 7), new lid("FocalPlaneXResolution", 41486, 5), new lid("FocalPlaneYResolution", 41487, 5), new lid("FocalPlaneResolutionUnit", 41488, 3), new lid("SubjectLocation", 41492, 3), new lid("ExposureIndex", 41493, 5), new lid("SensingMethod", 41495, 3), new lid("FileSource", 41728, 7), new lid("SceneType", 41729, 7), new lid("CFAPattern", 41730, 7), new lid("CustomRendered", 41985, 3), new lid("ExposureMode", 41986, 3), new lid("WhiteBalance", 41987, 3), new lid("DigitalZoomRatio", 41988, 5), new lid("FocalLengthIn35mmFilm", 41989, 3), new lid("SceneCaptureType", 41990, 3), new lid("GainControl", 41991, 3), new lid("Contrast", 41992, 3), new lid("Saturation", 41993, 3), new lid("Sharpness", 41994, 3), new lid("DeviceSettingDescription", 41995, 7), new lid("SubjectDistanceRange", 41996, 3), new lid("ImageUniqueID", 42016, 2), new lid("CameraOwnerName", 42032, 2), new lid("BodySerialNumber", 42033, 2), new lid("LensSpecification", 42034, 5), new lid("LensMake", 42035, 2), new lid("LensModel", 42036, 2), new lid("Gamma", 42240, 5), new lid("DNGVersion", 50706, 1), new lid("DefaultCropSize", 50720, 3, 4)};
        S = lidVarArr2;
        lid[] lidVarArr3 = {new lid("GPSVersionID", 0, 1), new lid("GPSLatitudeRef", 1, 2), new lid("GPSLatitude", 2, 5, 10), new lid("GPSLongitudeRef", 3, 2), new lid("GPSLongitude", 4, 5, 10), new lid("GPSAltitudeRef", 5, 1), new lid("GPSAltitude", 6, 5), new lid("GPSTimeStamp", 7, 5), new lid("GPSSatellites", 8, 2), new lid("GPSStatus", 9, 2), new lid("GPSMeasureMode", 10, 2), new lid("GPSDOP", 11, 5), new lid("GPSSpeedRef", 12, 2), new lid("GPSSpeed", 13, 5), new lid("GPSTrackRef", 14, 2), new lid("GPSTrack", 15, 5), new lid("GPSImgDirectionRef", 16, 2), new lid("GPSImgDirection", 17, 5), new lid("GPSMapDatum", 18, 2), new lid("GPSDestLatitudeRef", 19, 2), new lid("GPSDestLatitude", 20, 5), new lid("GPSDestLongitudeRef", 21, 2), new lid("GPSDestLongitude", 22, 5), new lid("GPSDestBearingRef", 23, 2), new lid("GPSDestBearing", 24, 5), new lid("GPSDestDistanceRef", 25, 2), new lid("GPSDestDistance", 26, 5), new lid("GPSProcessingMethod", 27, 7), new lid("GPSAreaInformation", 28, 7), new lid("GPSDateStamp", 29, 2), new lid("GPSDifferential", 30, 3), new lid("GPSHPositioningError", 31, 5)};
        T = lidVarArr3;
        lid[] lidVarArr4 = {new lid("InteroperabilityIndex", 1, 2)};
        U = lidVarArr4;
        lid[] lidVarArr5 = {new lid("NewSubfileType", 254, 4), new lid("SubfileType", PrivateKeyType.INVALID, 4), new lid("ThumbnailImageWidth", 256, 3, 4), new lid("ThumbnailImageLength", 257, 3, 4), new lid("BitsPerSample", 258, 3), new lid("Compression", 259, 3), new lid("PhotometricInterpretation", 262, 3), new lid("ImageDescription", 270, 2), new lid("Make", 271, 2), new lid("Model", 272, 2), new lid("StripOffsets", 273, 3, 4), new lid("ThumbnailOrientation", 274, 3), new lid("SamplesPerPixel", 277, 3), new lid("RowsPerStrip", 278, 3, 4), new lid("StripByteCounts", 279, 3, 4), new lid("XResolution", 282, 5), new lid("YResolution", 283, 5), new lid("PlanarConfiguration", 284, 3), new lid("ResolutionUnit", 296, 3), new lid("TransferFunction", 301, 3), new lid("Software", 305, 2), new lid("DateTime", 306, 2), new lid("Artist", 315, 2), new lid("WhitePoint", 318, 5), new lid("PrimaryChromaticities", 319, 5), new lid("SubIFDPointer", 330, 4), new lid("JPEGInterchangeFormat", 513, 4), new lid("JPEGInterchangeFormatLength", 514, 4), new lid("YCbCrCoefficients", 529, 5), new lid("YCbCrSubSampling", 530, 3), new lid("YCbCrPositioning", 531, 3), new lid("ReferenceBlackWhite", 532, 5), new lid("Copyright", 33432, 2), new lid("ExifIFDPointer", 34665, 4), new lid("GPSInfoIFDPointer", 34853, 4), new lid("DNGVersion", 50706, 1), new lid("DefaultCropSize", 50720, 3, 4)};
        V = lidVarArr5;
        W = new lid("StripOffsets", 273, 3);
        lid[] lidVarArr6 = {new lid("ThumbnailImage", 256, 7), new lid("CameraSettingsIFDPointer", 8224, 4), new lid("ImageProcessingIFDPointer", 8256, 4)};
        X = lidVarArr6;
        lid[] lidVarArr7 = {new lid("PreviewImageStart", 257, 4), new lid("PreviewImageLength", 258, 4)};
        Y = lidVarArr7;
        lid[] lidVarArr8 = {new lid("AspectFrame", 4371, 3)};
        Z = lidVarArr8;
        lid[] lidVarArr9 = {new lid("ColorSpace", 55, 3)};
        aa = lidVarArr9;
        l = new lid[][]{lidVarArr, lidVarArr2, lidVarArr3, lidVarArr4, lidVarArr5, lidVarArr, lidVarArr6, lidVarArr7, lidVarArr8, lidVarArr9};
        ab = new lid[]{new lid("SubIFDPointer", 330, 4), new lid("ExifIFDPointer", 34665, 4), new lid("GPSInfoIFDPointer", 34853, 4), new lid("InteroperabilityIFDPointer", 40965, 4), new lid("CameraSettingsIFDPointer", 8224, 1), new lid("ImageProcessingIFDPointer", 8256, 1)};
        ac = new HashMap[10];
        ad = new HashMap[10];
        ae = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        af = new HashMap();
        Charset forName = Charset.forName("US-ASCII");
        m = forName;
        n = "Exif\u0000\u0000".getBytes(forName);
        o = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
        g = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
        h = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i2 = 0;
        while (true) {
            lid[][] lidVarArr10 = l;
            int length = lidVarArr10.length;
            if (i2 >= 10) {
                lid[] lidVarArr11 = ab;
                Integer valueOf = Integer.valueOf(lidVarArr11[0].a);
                HashMap hashMap = af;
                hashMap.put(valueOf, 5);
                hashMap.put(Integer.valueOf(lidVarArr11[1].a), 1);
                hashMap.put(Integer.valueOf(lidVarArr11[2].a), 2);
                hashMap.put(Integer.valueOf(lidVarArr11[3].a), 3);
                hashMap.put(Integer.valueOf(lidVarArr11[4].a), 7);
                hashMap.put(Integer.valueOf(lidVarArr11[5].a), 8);
                p = Pattern.compile(".*[1-9].*");
                ag = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                ah = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                ai = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            ac[i2] = new HashMap();
            ad[i2] = new HashMap();
            for (lid lidVar : lidVarArr10[i2]) {
                ac[i2].put(Integer.valueOf(lidVar.a), lidVar);
                ad[i2].put(lidVar.b, lidVar);
            }
            i2++;
        }
    }

    public lig(InputStream inputStream) {
        int length = l.length;
        this.ak = new HashMap[10];
        this.al = new HashSet(10);
        this.am = ByteOrder.BIG_ENDIAN;
        if (inputStream == null) {
            throw new NullPointerException("inputStream cannot be null");
        }
        FileDescriptor fileDescriptor = null;
        this.q = null;
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.aj = (AssetManager.AssetInputStream) inputStream;
            this.r = null;
        } else {
            if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                if (G(fileInputStream.getFD())) {
                    this.aj = null;
                    fileDescriptor = fileInputStream.getFD();
                    this.r = fileDescriptor;
                }
            }
            this.aj = null;
            this.r = fileDescriptor;
        }
        u(inputStream);
    }

    private final void A(int i2, String str, String str2) {
        if (this.ak[i2].isEmpty() || this.ak[i2].get(str) == null) {
            return;
        }
        HashMap hashMap = this.ak[i2];
        hashMap.put(str2, (lic) hashMap.get(str));
        this.ak[i2].remove(str);
    }

    private final void B(lia liaVar) {
        lic licVar;
        int b2;
        HashMap hashMap = this.ak[4];
        lic licVar2 = (lic) hashMap.get("Compression");
        if (licVar2 == null) {
            this.x = 6;
            s(liaVar, hashMap);
            return;
        }
        int b3 = licVar2.b(this.am);
        this.x = b3;
        if (b3 != 1) {
            if (b3 == 6) {
                s(liaVar, hashMap);
                return;
            } else if (b3 != 7) {
                return;
            }
        }
        lic licVar3 = (lic) hashMap.get("BitsPerSample");
        if (licVar3 != null) {
            int[] iArr = (int[]) licVar3.l(this.am);
            int[] iArr2 = b;
            if (Arrays.equals(iArr2, iArr) || (this.s == 3 && (licVar = (lic) hashMap.get("PhotometricInterpretation")) != null && ((b2 = licVar.b(this.am)) != 1 ? !(b2 != 6 || !Arrays.equals(iArr, iArr2)) : Arrays.equals(iArr, c)))) {
                t(liaVar, hashMap);
                return;
            }
        }
        if (a) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    private final void C(int i2, int i3) {
        if (this.ak[i2].isEmpty() || this.ak[i3].isEmpty()) {
            if (a) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        lic licVar = (lic) this.ak[i2].get("ImageLength");
        lic licVar2 = (lic) this.ak[i2].get("ImageWidth");
        lic licVar3 = (lic) this.ak[i3].get("ImageLength");
        lic licVar4 = (lic) this.ak[i3].get("ImageWidth");
        if (licVar == null || licVar2 == null) {
            if (a) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (licVar3 == null || licVar4 == null) {
            if (a) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int b2 = licVar.b(this.am);
        int b3 = licVar2.b(this.am);
        int b4 = licVar3.b(this.am);
        int b5 = licVar4.b(this.am);
        if (b2 >= b4 || b3 >= b5) {
            return;
        }
        HashMap[] hashMapArr = this.ak;
        HashMap hashMap = hashMapArr[i2];
        hashMapArr[i2] = hashMapArr[i3];
        hashMapArr[i3] = hashMap;
    }

    private static void D(CRC32 crc32, int i2) {
        crc32.update(i2 >>> 24);
        crc32.update(i2 >>> 16);
        crc32.update(i2 >>> 8);
        crc32.update(i2);
    }

    private final void E(lif lifVar, int i2) {
        lic j2;
        lic j3;
        lic licVar = (lic) this.ak[i2].get("DefaultCropSize");
        lic licVar2 = (lic) this.ak[i2].get("SensorTopBorder");
        lic licVar3 = (lic) this.ak[i2].get("SensorLeftBorder");
        lic licVar4 = (lic) this.ak[i2].get("SensorBottomBorder");
        lic licVar5 = (lic) this.ak[i2].get("SensorRightBorder");
        if (licVar != null) {
            if (licVar.a == 5) {
                lie[] lieVarArr = (lie[]) licVar.l(this.am);
                if (lieVarArr == null || lieVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=".concat(String.valueOf(Arrays.toString(lieVarArr))));
                    return;
                } else {
                    j2 = lic.h(lieVarArr[0], this.am);
                    j3 = lic.h(lieVarArr[1], this.am);
                }
            } else {
                int[] iArr = (int[]) licVar.l(this.am);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=".concat(String.valueOf(Arrays.toString(iArr))));
                    return;
                } else {
                    j2 = lic.j(iArr[0], this.am);
                    j3 = lic.j(iArr[1], this.am);
                }
            }
            this.ak[i2].put("ImageWidth", j2);
            this.ak[i2].put("ImageLength", j3);
            return;
        }
        if (licVar2 != null && licVar3 != null && licVar4 != null && licVar5 != null) {
            int b2 = licVar2.b(this.am);
            int b3 = licVar4.b(this.am);
            int b4 = licVar5.b(this.am);
            int b5 = licVar3.b(this.am);
            if (b3 <= b2 || b4 <= b5) {
                return;
            }
            lic j4 = lic.j(b3 - b2, this.am);
            lic j5 = lic.j(b4 - b5, this.am);
            this.ak[i2].put("ImageLength", j4);
            this.ak[i2].put("ImageWidth", j5);
            return;
        }
        lic licVar6 = (lic) this.ak[i2].get("ImageLength");
        lic licVar7 = (lic) this.ak[i2].get("ImageWidth");
        if (licVar6 == null || licVar7 == null) {
            lic licVar8 = (lic) this.ak[i2].get("JPEGInterchangeFormat");
            lic licVar9 = (lic) this.ak[i2].get("JPEGInterchangeFormatLength");
            if (licVar8 == null || licVar9 == null) {
                return;
            }
            int b6 = licVar8.b(this.am);
            int b7 = licVar8.b(this.am);
            lifVar.c(b6);
            byte[] bArr = new byte[b7];
            lifVar.readFully(bArr);
            o(new lia(bArr), b6, i2);
        }
    }

    private final void F() {
        C(0, 5);
        C(0, 4);
        C(5, 4);
        lic licVar = (lic) this.ak[1].get("PixelXDimension");
        lic licVar2 = (lic) this.ak[1].get("PixelYDimension");
        if (licVar != null && licVar2 != null) {
            this.ak[0].put("ImageWidth", licVar);
            this.ak[0].put("ImageLength", licVar2);
        }
        if (this.ak[4].isEmpty() && H(this.ak[5])) {
            HashMap[] hashMapArr = this.ak;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        if (!H(this.ak[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        A(0, "ThumbnailOrientation", "Orientation");
        A(0, "ThumbnailImageLength", "ImageLength");
        A(0, "ThumbnailImageWidth", "ImageWidth");
        A(5, "ThumbnailOrientation", "Orientation");
        A(5, "ThumbnailImageLength", "ImageLength");
        A(5, "ThumbnailImageWidth", "ImageWidth");
        A(4, "Orientation", "ThumbnailOrientation");
        A(4, "ImageLength", "ThumbnailImageLength");
        A(4, "ImageWidth", "ThumbnailImageWidth");
    }

    private static boolean G(FileDescriptor fileDescriptor) {
        try {
            Os.lseek(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            if (!a) {
                return false;
            }
            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
            return false;
        }
    }

    private final boolean H(HashMap hashMap) {
        lic licVar = (lic) hashMap.get("ImageLength");
        lic licVar2 = (lic) hashMap.get("ImageWidth");
        if (licVar == null || licVar2 == null) {
            return false;
        }
        return licVar.b(this.am) <= 512 && licVar2.b(this.am) <= 512;
    }

    private static final void I(lia liaVar, lib libVar, byte[] bArr) {
        int readInt = liaVar.readInt();
        libVar.write(bArr);
        libVar.b(readInt);
        if (readInt % 2 == 1) {
            readInt++;
        }
        lih.c(liaVar, libVar, readInt);
    }

    private static final int J(byte[] bArr) {
        lia liaVar;
        long readInt;
        byte[] bArr2;
        long j2;
        lia liaVar2 = null;
        try {
            try {
                liaVar = new lia(bArr);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e2) {
            e = e2;
        }
        try {
            readInt = liaVar.readInt();
            bArr2 = new byte[4];
            liaVar.readFully(bArr2);
        } catch (Exception e3) {
            e = e3;
            liaVar2 = liaVar;
            if (a) {
                Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
            }
            if (liaVar2 != null) {
                liaVar2.close();
            }
            return 0;
        } catch (Throwable th2) {
            th = th2;
            liaVar2 = liaVar;
            if (liaVar2 != null) {
                liaVar2.close();
            }
            throw th;
        }
        if (!Arrays.equals(bArr2, B)) {
            liaVar.close();
            return 0;
        }
        if (readInt == 1) {
            readInt = liaVar.readLong();
            j2 = 16;
            if (readInt < 16) {
                liaVar.close();
                return 0;
            }
        } else {
            j2 = 8;
        }
        if (readInt > 5000) {
            readInt = 5000;
        }
        long j3 = readInt - j2;
        if (j3 < 8) {
            liaVar.close();
            return 0;
        }
        byte[] bArr3 = new byte[4];
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (long j4 = 0; j4 < (j3 >> 2); j4++) {
            try {
                liaVar.readFully(bArr3);
                if (j4 != 1) {
                    if (Arrays.equals(bArr3, C)) {
                        z = true;
                    } else if (Arrays.equals(bArr3, D)) {
                        z2 = true;
                    } else if (Arrays.equals(bArr3, E) || Arrays.equals(bArr3, F)) {
                        z3 = true;
                    }
                    if (!z) {
                        continue;
                    } else {
                        if (z2) {
                            liaVar.close();
                            return 12;
                        }
                        if (z3) {
                            liaVar.close();
                            return 15;
                        }
                    }
                }
            } catch (EOFException unused) {
                liaVar.close();
                return 0;
            }
        }
        liaVar.close();
        return 0;
    }

    private static final ByteOrder K(lia liaVar) {
        short readShort = liaVar.readShort();
        if (readShort == 18761) {
            if (a) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort != 19789) {
            throw new IOException("Invalid byte order: ".concat(String.valueOf(Integer.toHexString(readShort))));
        }
        if (a) {
            Log.d("ExifInterface", "readExifSegment: Byte Align MM");
        }
        return ByteOrder.BIG_ENDIAN;
    }

    private static final void L(lia liaVar, lib libVar, byte[] bArr, byte[] bArr2) {
        while (true) {
            byte[] bArr3 = new byte[4];
            liaVar.readFully(bArr3);
            I(liaVar, libVar, bArr3);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    public static double a(String str, String str2) {
        try {
            String[] split = str.split(",", -1);
            String[] split2 = split[0].split("/", -1);
            double parseDouble = Double.parseDouble(split2[0].trim()) / Double.parseDouble(split2[1].trim());
            String[] split3 = split[1].split("/", -1);
            double parseDouble2 = Double.parseDouble(split3[0].trim()) / Double.parseDouble(split3[1].trim());
            String[] split4 = split[2].split("/", -1);
            double parseDouble3 = parseDouble + (parseDouble2 / 60.0d) + ((Double.parseDouble(split4[0].trim()) / Double.parseDouble(split4[1].trim())) / 3600.0d);
            if (!str2.equals("S") && !str2.equals("W")) {
                if (!str2.equals(VCardConstants.PROPERTY_N) && !str2.equals("E")) {
                    throw new IllegalArgumentException();
                }
                return parseDouble3;
            }
            return -parseDouble3;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    private static int k(int i2) {
        if (i2 != 4) {
            return (i2 == 9 || i2 == 15 || i2 == 12 || i2 == 13) ? 2 : 1;
        }
        return 3;
    }

    private static Pair l(String str) {
        if (str.contains(",")) {
            String[] split = str.split(",", -1);
            Pair l2 = l(split[0]);
            if (((Integer) l2.first).intValue() != 2) {
                for (int i2 = 1; i2 < split.length; i2++) {
                    Pair l3 = l(split[i2]);
                    int intValue = (((Integer) l3.first).equals(l2.first) || ((Integer) l3.second).equals(l2.first)) ? ((Integer) l2.first).intValue() : -1;
                    int intValue2 = (((Integer) l2.second).intValue() == -1 || !(((Integer) l3.first).equals(l2.second) || ((Integer) l3.second).equals(l2.second))) ? -1 : ((Integer) l2.second).intValue();
                    if (intValue == -1) {
                        if (intValue2 == -1) {
                            return new Pair(2, -1);
                        }
                        intValue = -1;
                    }
                    if (intValue == -1) {
                        l2 = new Pair(Integer.valueOf(intValue2), -1);
                    } else if (intValue2 == -1) {
                        l2 = new Pair(Integer.valueOf(intValue), -1);
                    }
                }
            }
            return l2;
        }
        if (str.contains("/")) {
            String[] split2 = str.split("/", -1);
            if (split2.length == 2) {
                try {
                    long parseDouble = (long) Double.parseDouble(split2[0]);
                    long parseDouble2 = (long) Double.parseDouble(split2[1]);
                    if (parseDouble >= 0 && parseDouble2 >= 0) {
                        if (parseDouble <= 2147483647L && parseDouble2 <= 2147483647L) {
                            return new Pair(10, 5);
                        }
                        return new Pair(5, -1);
                    }
                    return new Pair(10, -1);
                } catch (NumberFormatException unused) {
                }
            }
            return new Pair(2, -1);
        }
        try {
            try {
                long parseLong = Long.parseLong(str);
                Long valueOf = Long.valueOf(parseLong);
                valueOf.getClass();
                if (parseLong >= 0) {
                    valueOf.getClass();
                    if (parseLong <= 65535) {
                        return new Pair(3, 4);
                    }
                }
                valueOf.getClass();
                return parseLong < 0 ? new Pair(9, -1) : new Pair(4, -1);
            } catch (NumberFormatException unused2) {
                return new Pair(2, -1);
            }
        } catch (NumberFormatException unused3) {
            Double.parseDouble(str);
            return new Pair(12, -1);
        }
    }

    private final lic m(String str) {
        lic licVar;
        lic licVar2;
        if ("ISOSpeedRatings".equals(str)) {
            if (a) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        int i2 = 0;
        if ("Xmp".equals(str) && k(this.s) == 2 && (licVar2 = this.z) != null) {
            return licVar2;
        }
        while (true) {
            int length = l.length;
            if (i2 >= 10) {
                if (!"Xmp".equals(str) || (licVar = this.z) == null) {
                    return null;
                }
                return licVar;
            }
            lic licVar3 = (lic) this.ak[i2].get(str);
            if (licVar3 != null) {
                return licVar3;
            }
            i2++;
        }
    }

    private final void n() {
        String e2 = e("DateTimeOriginal");
        if (e2 != null && e("DateTime") == null) {
            this.ak[0].put("DateTime", lic.e(e2));
        }
        if (e("ImageWidth") == null) {
            this.ak[0].put("ImageWidth", lic.f(0L, this.am));
        }
        if (e("ImageLength") == null) {
            this.ak[0].put("ImageLength", lic.f(0L, this.am));
        }
        if (e("Orientation") == null) {
            this.ak[0].put("Orientation", lic.f(0L, this.am));
        }
        if (e("LightSource") == null) {
            this.ak[1].put("LightSource", lic.f(0L, this.am));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x015e, code lost:
    
        r22.c = r21.am;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0162, code lost:
    
        return;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x009a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x009d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x00a0. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:32:0x014c A[LOOP:0: B:9:0x0034->B:32:0x014c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0152 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a8 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void o(defpackage.lia r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lig.o(lia, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0054, code lost:
    
        r17.A = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0056, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void p(defpackage.lia r18) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lig.p(lia):void");
    }

    private final void q(lif lifVar) {
        lic licVar;
        v(lifVar);
        y(lifVar, 0);
        E(lifVar, 0);
        E(lifVar, 5);
        E(lifVar, 4);
        F();
        if (this.s != 8 || (licVar = (lic) this.ak[1].get("MakerNote")) == null) {
            return;
        }
        lif lifVar2 = new lif(licVar.d);
        lifVar2.c = this.am;
        lifVar2.b(6);
        y(lifVar2, 9);
        lic licVar2 = (lic) this.ak[9].get("ColorSpace");
        if (licVar2 != null) {
            this.ak[1].put("ColorSpace", licVar2);
        }
    }

    private final void r(lia liaVar) {
        if (a) {
            Objects.toString(liaVar);
            Log.d("ExifInterface", "getWebpAttributes starting with: ".concat(liaVar.toString()));
        }
        liaVar.c = ByteOrder.LITTLE_ENDIAN;
        int length = I.length;
        liaVar.b(4);
        int readInt = liaVar.readInt() + 8;
        byte[] bArr = J;
        int length2 = bArr.length;
        liaVar.b(4);
        int length3 = bArr.length;
        int i2 = 12;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                liaVar.readFully(bArr2);
                int readInt2 = liaVar.readInt();
                int i3 = i2 + 8;
                if (Arrays.equals(K, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    liaVar.readFully(bArr3);
                    byte[] bArr4 = n;
                    if (lih.d(bArr3, bArr4)) {
                        bArr3 = Arrays.copyOfRange(bArr3, bArr4.length, readInt2);
                    }
                    this.y = i3;
                    x(bArr3, 0);
                    B(new lia(bArr3));
                    return;
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                i2 = i3 + readInt2;
                if (i2 == readInt) {
                    return;
                }
                if (i2 > readInt) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                liaVar.b(readInt2);
            } catch (EOFException e2) {
                throw new IOException("Encountered corrupt WebP file.", e2);
            }
        }
    }

    private final void s(lia liaVar, HashMap hashMap) {
        lic licVar = (lic) hashMap.get("JPEGInterchangeFormat");
        lic licVar2 = (lic) hashMap.get("JPEGInterchangeFormatLength");
        if (licVar == null || licVar2 == null) {
            return;
        }
        int b2 = licVar.b(this.am);
        int b3 = licVar2.b(this.am);
        if (this.s == 7) {
            b2 += this.ap;
        }
        if (b2 > 0 && b3 > 0) {
            this.t = true;
            if (this.q == null && this.aj == null && this.r == null) {
                byte[] bArr = new byte[b3];
                liaVar.b(b2);
                liaVar.readFully(bArr);
                this.w = bArr;
            }
            this.an = b2;
            this.ao = b3;
        }
        if (a) {
            Log.d("ExifInterface", a.r(b3, b2, "Setting thumbnail attributes with offset: ", ", length: "));
        }
    }

    private final void t(lia liaVar, HashMap hashMap) {
        int length;
        int length2;
        int i2;
        lic licVar = (lic) hashMap.get("StripOffsets");
        lic licVar2 = (lic) hashMap.get("StripByteCounts");
        if (licVar == null || licVar2 == null) {
            return;
        }
        long[] e2 = lih.e(licVar.l(this.am));
        long[] e3 = lih.e(licVar2.l(this.am));
        if (e2 == null || (length = e2.length) == 0) {
            Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            return;
        }
        if (e3 == null || (length2 = e3.length) == 0) {
            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            return;
        }
        if (length != length2) {
            Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
            return;
        }
        long j2 = 0;
        for (long j3 : e3) {
            j2 += j3;
        }
        int i3 = (int) j2;
        byte[] bArr = new byte[i3];
        this.v = true;
        this.u = true;
        this.t = true;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int length3 = e2.length;
            if (i4 >= length3) {
                int i7 = i3;
                this.w = bArr;
                if (this.v) {
                    this.an = (int) e2[0];
                    this.ao = i7;
                    return;
                }
                return;
            }
            int i8 = (int) e2[i4];
            int i9 = (int) e3[i4];
            if (i4 < length3 - 1) {
                i2 = i3;
                if (i8 + i9 != e2[i4 + 1]) {
                    this.v = false;
                }
            } else {
                i2 = i3;
            }
            int i10 = i8 - i5;
            if (i10 < 0) {
                Log.d("ExifInterface", "Invalid strip offset value");
                return;
            }
            try {
                liaVar.b(i10);
                int i11 = i5 + i10;
                byte[] bArr2 = new byte[i9];
                try {
                    liaVar.readFully(bArr2);
                    i4++;
                    i5 = i11 + i9;
                    System.arraycopy(bArr2, 0, bArr, i6, i9);
                    i6 += i9;
                    i3 = i2;
                } catch (EOFException unused) {
                    Log.d("ExifInterface", a.f(i9, "Failed to read ", " bytes."));
                    return;
                }
            } catch (EOFException unused2) {
                Log.d("ExifInterface", a.f(i10, "Failed to skip ", " bytes."));
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x031e A[Catch: all -> 0x03ea, RuntimeException -> 0x03ec, TryCatch #6 {RuntimeException -> 0x03ec, blocks: (B:92:0x029d, B:94:0x02c3, B:97:0x02f8, B:99:0x030b, B:101:0x031e, B:108:0x0337, B:114:0x034a, B:116:0x0354, B:118:0x0368, B:119:0x0375, B:120:0x037c, B:121:0x037d, B:122:0x0384, B:123:0x0385, B:126:0x0395, B:127:0x03b4, B:129:0x03b8, B:134:0x02d7, B:136:0x02dd), top: B:91:0x029d, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0354 A[Catch: all -> 0x03ea, RuntimeException -> 0x03ec, TryCatch #6 {RuntimeException -> 0x03ec, blocks: (B:92:0x029d, B:94:0x02c3, B:97:0x02f8, B:99:0x030b, B:101:0x031e, B:108:0x0337, B:114:0x034a, B:116:0x0354, B:118:0x0368, B:119:0x0375, B:120:0x037c, B:121:0x037d, B:122:0x0384, B:123:0x0385, B:126:0x0395, B:127:0x03b4, B:129:0x03b8, B:134:0x02d7, B:136:0x02dd), top: B:91:0x029d, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x037d A[Catch: all -> 0x03ea, RuntimeException -> 0x03ec, TryCatch #6 {RuntimeException -> 0x03ec, blocks: (B:92:0x029d, B:94:0x02c3, B:97:0x02f8, B:99:0x030b, B:101:0x031e, B:108:0x0337, B:114:0x034a, B:116:0x0354, B:118:0x0368, B:119:0x0375, B:120:0x037c, B:121:0x037d, B:122:0x0384, B:123:0x0385, B:126:0x0395, B:127:0x03b4, B:129:0x03b8, B:134:0x02d7, B:136:0x02dd), top: B:91:0x029d, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03b8 A[Catch: all -> 0x03ea, RuntimeException -> 0x03ec, TRY_LEAVE, TryCatch #6 {RuntimeException -> 0x03ec, blocks: (B:92:0x029d, B:94:0x02c3, B:97:0x02f8, B:99:0x030b, B:101:0x031e, B:108:0x0337, B:114:0x034a, B:116:0x0354, B:118:0x0368, B:119:0x0375, B:120:0x037c, B:121:0x037d, B:122:0x0384, B:123:0x0385, B:126:0x0395, B:127:0x03b4, B:129:0x03b8, B:134:0x02d7, B:136:0x02dd), top: B:91:0x029d, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x040a A[Catch: all -> 0x04da, UnsupportedOperationException -> 0x04dc, IOException -> 0x04de, TryCatch #4 {UnsupportedOperationException -> 0x04dc, blocks: (B:3:0x0009, B:5:0x0010, B:7:0x001c, B:8:0x0031, B:10:0x0045, B:14:0x004d, B:15:0x0059, B:17:0x005c, B:21:0x0064, B:183:0x0089, B:191:0x00b4, B:195:0x00d3, B:197:0x00d8, B:202:0x00e0, B:204:0x00e5, B:206:0x00ee, B:211:0x00f3, B:213:0x00f8, B:215:0x0104, B:199:0x0109, B:229:0x00c6, B:230:0x00c9, B:225:0x00ce, B:241:0x0098, B:242:0x009b, B:237:0x00a0, B:23:0x0121, B:29:0x0132, B:33:0x0144, B:35:0x0155, B:37:0x017d, B:38:0x018e, B:41:0x01ad, B:42:0x01bf, B:44:0x01cd, B:46:0x01d7, B:49:0x01db, B:51:0x01e2, B:53:0x01e8, B:55:0x01f0, B:56:0x01f4, B:57:0x0210, B:58:0x0183, B:60:0x0189, B:61:0x03df, B:70:0x0227, B:71:0x022c, B:73:0x0230, B:74:0x0240, B:76:0x0251, B:77:0x025e, B:80:0x0278, B:81:0x0281, B:85:0x028b, B:88:0x0290, B:89:0x0297, B:90:0x0298, B:131:0x03dc, B:140:0x03f5, B:141:0x03f8, B:147:0x03f9, B:148:0x0400, B:149:0x0401, B:151:0x040a, B:153:0x0412, B:156:0x041b, B:157:0x0420, B:159:0x0424, B:160:0x0434, B:162:0x0484, B:165:0x0490, B:170:0x049e, B:172:0x04c6, B:167:0x04d2, B:19:0x010e, B:12:0x0116), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x00d8 A[Catch: all -> 0x04da, UnsupportedOperationException -> 0x04dc, IOException -> 0x04de, TryCatch #4 {UnsupportedOperationException -> 0x04dc, blocks: (B:3:0x0009, B:5:0x0010, B:7:0x001c, B:8:0x0031, B:10:0x0045, B:14:0x004d, B:15:0x0059, B:17:0x005c, B:21:0x0064, B:183:0x0089, B:191:0x00b4, B:195:0x00d3, B:197:0x00d8, B:202:0x00e0, B:204:0x00e5, B:206:0x00ee, B:211:0x00f3, B:213:0x00f8, B:215:0x0104, B:199:0x0109, B:229:0x00c6, B:230:0x00c9, B:225:0x00ce, B:241:0x0098, B:242:0x009b, B:237:0x00a0, B:23:0x0121, B:29:0x0132, B:33:0x0144, B:35:0x0155, B:37:0x017d, B:38:0x018e, B:41:0x01ad, B:42:0x01bf, B:44:0x01cd, B:46:0x01d7, B:49:0x01db, B:51:0x01e2, B:53:0x01e8, B:55:0x01f0, B:56:0x01f4, B:57:0x0210, B:58:0x0183, B:60:0x0189, B:61:0x03df, B:70:0x0227, B:71:0x022c, B:73:0x0230, B:74:0x0240, B:76:0x0251, B:77:0x025e, B:80:0x0278, B:81:0x0281, B:85:0x028b, B:88:0x0290, B:89:0x0297, B:90:0x0298, B:131:0x03dc, B:140:0x03f5, B:141:0x03f8, B:147:0x03f9, B:148:0x0400, B:149:0x0401, B:151:0x040a, B:153:0x0412, B:156:0x041b, B:157:0x0420, B:159:0x0424, B:160:0x0434, B:162:0x0484, B:165:0x0490, B:170:0x049e, B:172:0x04c6, B:167:0x04d2, B:19:0x010e, B:12:0x0116), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x010c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x04e3 A[Catch: all -> 0x04da, TRY_LEAVE, TryCatch #12 {all -> 0x04da, blocks: (B:3:0x0009, B:5:0x0010, B:7:0x001c, B:8:0x0031, B:10:0x0045, B:14:0x004d, B:15:0x0059, B:17:0x005c, B:21:0x0064, B:183:0x0089, B:191:0x00b4, B:195:0x00d3, B:197:0x00d8, B:202:0x00e0, B:204:0x00e5, B:206:0x00ee, B:211:0x00f3, B:213:0x00f8, B:215:0x0104, B:199:0x0109, B:229:0x00c6, B:230:0x00c9, B:225:0x00ce, B:241:0x0098, B:242:0x009b, B:237:0x00a0, B:23:0x0121, B:29:0x0132, B:33:0x0144, B:35:0x0155, B:37:0x017d, B:38:0x018e, B:41:0x01ad, B:42:0x01bf, B:44:0x01cd, B:46:0x01d7, B:49:0x01db, B:51:0x01e2, B:53:0x01e8, B:55:0x01f0, B:56:0x01f4, B:57:0x0210, B:58:0x0183, B:60:0x0189, B:61:0x03df, B:70:0x0227, B:71:0x022c, B:73:0x0230, B:74:0x0240, B:76:0x0251, B:77:0x025e, B:80:0x0278, B:81:0x0281, B:85:0x028b, B:88:0x0290, B:89:0x0297, B:90:0x0298, B:131:0x03dc, B:140:0x03f5, B:141:0x03f8, B:147:0x03f9, B:148:0x0400, B:149:0x0401, B:151:0x040a, B:153:0x0412, B:156:0x041b, B:157:0x0420, B:159:0x0424, B:160:0x0434, B:162:0x0484, B:165:0x0490, B:170:0x049e, B:172:0x04c6, B:167:0x04d2, B:19:0x010e, B:12:0x0116, B:251:0x04df, B:253:0x04e3), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x04ef A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02f8 A[Catch: all -> 0x03ea, RuntimeException -> 0x03ec, TryCatch #6 {RuntimeException -> 0x03ec, blocks: (B:92:0x029d, B:94:0x02c3, B:97:0x02f8, B:99:0x030b, B:101:0x031e, B:108:0x0337, B:114:0x034a, B:116:0x0354, B:118:0x0368, B:119:0x0375, B:120:0x037c, B:121:0x037d, B:122:0x0384, B:123:0x0385, B:126:0x0395, B:127:0x03b4, B:129:0x03b8, B:134:0x02d7, B:136:0x02dd), top: B:91:0x029d, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x030b A[Catch: all -> 0x03ea, RuntimeException -> 0x03ec, TryCatch #6 {RuntimeException -> 0x03ec, blocks: (B:92:0x029d, B:94:0x02c3, B:97:0x02f8, B:99:0x030b, B:101:0x031e, B:108:0x0337, B:114:0x034a, B:116:0x0354, B:118:0x0368, B:119:0x0375, B:120:0x037c, B:121:0x037d, B:122:0x0384, B:123:0x0385, B:126:0x0395, B:127:0x03b4, B:129:0x03b8, B:134:0x02d7, B:136:0x02dd), top: B:91:0x029d, outer: #5 }] */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r19v0, types: [lig] */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void u(java.io.InputStream r20) {
        /*
            Method dump skipped, instructions count: 1278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lig.u(java.io.InputStream):void");
    }

    private final void v(lia liaVar) {
        ByteOrder K2 = K(liaVar);
        this.am = K2;
        liaVar.c = K2;
        int readUnsignedShort = liaVar.readUnsignedShort();
        int i2 = this.s;
        if (i2 != 7 && i2 != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: ".concat(String.valueOf(Integer.toHexString(readUnsignedShort))));
        }
        int readInt = liaVar.readInt();
        if (readInt < 8) {
            throw new IOException(a.h(readInt, "Invalid first Ifd offset: "));
        }
        int i3 = readInt - 8;
        if (i3 > 0) {
            liaVar.b(i3);
        }
    }

    private final void w() {
        for (int i2 = 0; i2 < 10; i2++) {
            Log.d("ExifInterface", "The size of tag group[" + i2 + "]: " + this.ak[i2].size());
            for (Map.Entry entry : this.ak[i2].entrySet()) {
                lic licVar = (lic) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + licVar.toString() + ", tagValue: '" + licVar.m(this.am) + "'");
            }
        }
    }

    private final void x(byte[] bArr, int i2) {
        lif lifVar = new lif(bArr);
        v(lifVar);
        y(lifVar, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x00bf, code lost:
    
        if (r13 != r23) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x026c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void y(defpackage.lif r32, int r33) {
        /*
            Method dump skipped, instructions count: 896
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lig.y(lif, int):void");
    }

    private final void z(String str) {
        int i2 = 0;
        while (true) {
            int length = l.length;
            if (i2 >= 10) {
                return;
            }
            this.ak[i2].remove(str);
            i2++;
        }
    }

    public final double b(String str, double d2) {
        lic m2 = m(str);
        if (m2 != null) {
            try {
                return m2.a(this.am);
            } catch (NumberFormatException unused) {
            }
        }
        return d2;
    }

    public final int c(String str, int i2) {
        lic m2 = m(str);
        if (m2 != null) {
            try {
                return m2.b(this.am);
            } catch (NumberFormatException unused) {
            }
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0362 A[EDGE_INSN: B:146:0x0362->B:147:0x0362 BREAK  A[LOOP:7: B:104:0x029a->B:141:0x035f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014f A[EDGE_INSN: B:57:0x014f->B:58:0x014f BREAK  A[LOOP:3: B:43:0x011b->B:56:0x0147], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0176 A[EDGE_INSN: B:67:0x0176->B:68:0x0176 BREAK  A[LOOP:5: B:59:0x0152->B:65:0x0173], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0250  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(defpackage.lib r20) {
        /*
            Method dump skipped, instructions count: 907
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lig.d(lib):int");
    }

    public final String e(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        lic m2 = m(str);
        if (m2 == null) {
            return null;
        }
        if (!str.equals("GPSTimeStamp")) {
            if (!ae.contains(str)) {
                return m2.m(this.am);
            }
            try {
                return Double.toString(m2.a(this.am));
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        int i2 = m2.a;
        if (i2 != 5 && i2 != 10) {
            Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + m2.a);
            return null;
        }
        lie[] lieVarArr = (lie[]) m2.l(this.am);
        if (lieVarArr == null || lieVarArr.length != 3) {
            Log.w("ExifInterface", "Invalid GPS Timestamp array. array=".concat(String.valueOf(Arrays.toString(lieVarArr))));
            return null;
        }
        lie lieVar = lieVarArr[0];
        Integer valueOf = Integer.valueOf((int) (lieVar.a / lieVar.b));
        lie lieVar2 = lieVarArr[1];
        Integer valueOf2 = Integer.valueOf((int) (lieVar2.a / lieVar2.b));
        lie lieVar3 = lieVarArr[2];
        return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (lieVar3.a / lieVar3.b)));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x01ef A[Catch: all -> 0x0202, Exception -> 0x0205, TryCatch #5 {Exception -> 0x0205, all -> 0x0202, blocks: (B:9:0x003e, B:11:0x004b, B:13:0x005d, B:14:0x005f, B:17:0x01d4, B:19:0x01ef, B:20:0x01f8, B:24:0x006c, B:26:0x007b, B:28:0x0083, B:29:0x0087, B:31:0x00a0, B:32:0x00a5, B:34:0x00a7, B:36:0x00b3, B:38:0x00b7, B:41:0x00bc, B:43:0x00c8, B:45:0x00d0, B:49:0x00e2, B:51:0x00ea, B:52:0x00ee, B:54:0x00ff, B:56:0x0111, B:57:0x0164, B:59:0x0170, B:60:0x0177, B:62:0x01b1, B:63:0x01cd, B:64:0x01bd, B:66:0x01c5, B:67:0x0122, B:68:0x0129, B:69:0x012a, B:71:0x0136, B:73:0x013c, B:76:0x0153, B:78:0x0156, B:79:0x015d), top: B:8:0x003e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(java.io.InputStream r21, java.io.OutputStream r22) {
        /*
            Method dump skipped, instructions count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lig.f(java.io.InputStream, java.io.OutputStream):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0152, code lost:
    
        if (r7 != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0155, code lost:
    
        if (r7 != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x019e, code lost:
    
        if (r3 == false) goto L83;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(java.lang.String r35, java.lang.String r36) {
        /*
            Method dump skipped, instructions count: 1084
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lig.g(java.lang.String, java.lang.String):void");
    }

    public final void h(lib libVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.y = libVar.a.size() + d(new lib(byteArrayOutputStream, ByteOrder.BIG_ENDIAN));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        libVar.write(byteArray);
        CRC32 crc32 = new CRC32();
        crc32.update(byteArray, 4, byteArray.length - 4);
        libVar.b((int) crc32.getValue());
    }

    public final void i(lib libVar) {
        libVar.b(this.z.d.length + 22);
        CRC32 crc32 = new CRC32();
        libVar.b(1767135348);
        D(crc32, 1767135348);
        byte[] bArr = f;
        libVar.write(bArr);
        crc32.update(bArr);
        libVar.write(this.z.d);
        crc32.update(this.z.d);
        libVar.b((int) crc32.getValue());
        this.A = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] j() {
        /*
            r8 = this;
            java.lang.String r0 = "ExifInterface"
            boolean r1 = r8.t
            r2 = 0
            if (r1 != 0) goto L8
            return r2
        L8:
            byte[] r1 = r8.w
            if (r1 != 0) goto L97
            android.content.res.AssetManager$AssetInputStream r1 = r8.aj     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7b
            if (r1 == 0) goto L2d
            boolean r3 = r1.markSupported()     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L29
            if (r3 == 0) goto L1b
            r1.reset()     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L29
        L19:
            r3 = r2
            goto L4d
        L1b:
            java.lang.String r3 = "Cannot read thumbnail from inputstream without mark/reset support"
            android.util.Log.d(r0, r3)     // Catch: java.lang.Throwable -> L24 java.lang.Exception -> L29
            defpackage.lih.b(r1)
            return r2
        L24:
            r0 = move-exception
            r3 = r2
        L26:
            r2 = r1
            goto L8e
        L29:
            r3 = move-exception
            r4 = r3
            r3 = r2
            goto L80
        L2d:
            java.lang.String r1 = r8.q     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7b
            if (r1 == 0) goto L38
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7b
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7b
            r1 = r3
            goto L19
        L38:
            java.io.FileDescriptor r1 = r8.r     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7b
            java.io.FileDescriptor r1 = android.system.Os.dup(r1)     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7b
            int r3 = android.system.OsConstants.SEEK_SET     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L73
            r4 = 0
            android.system.Os.lseek(r1, r4, r3)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L73
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L73
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L73
            r7 = r3
            r3 = r1
            r1 = r7
        L4d:
            lia r4 = new lia     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            int r5 = r8.an     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            int r6 = r8.y     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            int r5 = r5 + r6
            r4.b(r5)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            int r5 = r8.ao     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            r4.readFully(r5)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            r8.w = r5     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L6e
            defpackage.lih.b(r1)
            if (r3 == 0) goto L6b
            defpackage.lih.a(r3)
        L6b:
            return r5
        L6c:
            r0 = move-exception
            goto L26
        L6e:
            r4 = move-exception
            goto L80
        L70:
            r0 = move-exception
            r3 = r1
            goto L8e
        L73:
            r3 = move-exception
            r4 = r3
            r3 = r1
            r1 = r2
            goto L80
        L78:
            r0 = move-exception
            r3 = r2
            goto L8e
        L7b:
            r1 = move-exception
            r3 = r1
            r1 = r2
            r4 = r3
            r3 = r1
        L80:
            java.lang.String r5 = "Encountered exception while getting thumbnail"
            android.util.Log.d(r0, r5, r4)     // Catch: java.lang.Throwable -> L6c
            defpackage.lih.b(r1)
            if (r3 == 0) goto L8d
            defpackage.lih.a(r3)
        L8d:
            return r2
        L8e:
            defpackage.lih.b(r2)
            if (r3 == 0) goto L96
            defpackage.lih.a(r3)
        L96:
            throw r0
        L97:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lig.j():byte[]");
    }

    public lig(String str) {
        FileInputStream fileInputStream;
        int length = l.length;
        this.ak = new HashMap[10];
        this.al = new HashSet(10);
        this.am = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            FileInputStream fileInputStream2 = null;
            this.aj = null;
            this.q = str;
            try {
                fileInputStream = new FileInputStream(str);
            } catch (Throwable th) {
                th = th;
            }
            try {
                if (G(fileInputStream.getFD())) {
                    this.r = fileInputStream.getFD();
                } else {
                    this.r = null;
                }
                u(fileInputStream);
                lih.b(fileInputStream);
                return;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                lih.b(fileInputStream2);
                throw th;
            }
        }
        throw new NullPointerException("filename cannot be null");
    }
}
