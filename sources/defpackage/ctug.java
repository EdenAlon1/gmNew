package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctug {
    private static final String[] A;
    private static final String[] B;
    private static final String[] C;
    private static final String[] D;
    private static final String[] E;
    private static final String[] F;
    private static final String[] G;
    public static final String[] a;
    public static final String[] b;
    static final String[] c;
    public static final String[] d;
    public static final String[] e;
    public static final String[] f;
    public static final String[] g;
    public static final String[] h;
    public static final String[] i;
    public static final String[] j;
    public static final String[] k;
    public static final String[] l;
    public static final String[] m;
    public static final String[] n;
    public static final String[] o;
    static final String[] p;
    public static final String[] q;
    public static final String[] r;
    public static final String[] s;
    static final enhk t;
    private static final String[] u;
    private static final String[] v;
    private static final String[] w;
    private static final String[] x;
    private static final String[] y;
    private static final String[] z;

    static {
        String[] strArr = {"android.permission.RECORD_AUDIO"};
        a = strArr;
        String[] strArr2 = {"android.permission.SCHEDULE_EXACT_ALARM"};
        b = strArr2;
        String[] strArr3 = {"android.permission.CAMERA"};
        c = strArr3;
        String[] strArr4 = {"android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
        u = strArr4;
        String[] strArr5 = {"android.permission.CAMERA", "android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_AUDIO"};
        v = strArr5;
        String[] strArr6 = {"android.permission.CAMERA", "android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"};
        w = strArr6;
        if (ctid.h) {
            strArr4 = strArr6;
        } else if (ctid.f) {
            strArr4 = strArr5;
        }
        d = strArr4;
        String[] strArr7 = {"android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
        x = strArr7;
        String[] strArr8 = {"android.permission.CAMERA", "android.permission.READ_MEDIA_IMAGES"};
        y = strArr8;
        String[] strArr9 = {"android.permission.CAMERA", "android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"};
        z = strArr9;
        if (ctid.h) {
            strArr7 = strArr9;
        } else if (ctid.f) {
            strArr7 = strArr8;
        }
        e = strArr7;
        String[] strArr10 = (String[]) enoh.b(strArr7, strArr, String.class);
        A = strArr10;
        String[] strArr11 = {"android.permission.CAMERA", "android.permission.READ_MEDIA_VIDEO", "android.permission.RECORD_AUDIO"};
        B = strArr11;
        String[] strArr12 = {"android.permission.CAMERA", "android.permission.READ_MEDIA_VIDEO", "android.permission.RECORD_AUDIO", "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"};
        C = strArr12;
        if (ctid.h) {
            strArr10 = strArr12;
        } else if (ctid.f) {
            strArr10 = strArr11;
        }
        f = strArr10;
        String[] strArr13 = {"android.permission.ACCESS_FINE_LOCATION"};
        g = strArr13;
        String[] strArr14 = {"android.permission.READ_SMS", "android.permission.SEND_SMS", "android.permission.RECEIVE_SMS", "android.permission.RECEIVE_MMS"};
        h = strArr14;
        String[] strArr15 = {"android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS"};
        i = strArr15;
        String[] strArr16 = {"android.permission.READ_PHONE_STATE"};
        j = strArr16;
        engw.r("android.permission.READ_PRIVILEGED_PHONE_STATE");
        String[] strArr17 = {"android.permission.CALL_PHONE"};
        k = strArr17;
        String[] strArr18 = {"android.permission.READ_CALL_LOG"};
        l = strArr18;
        String[] strArr19 = {"android.permission.CALL_PRIVILEGED"};
        m = strArr19;
        String[] strArr20 = {"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
        D = strArr20;
        String[] strArr21 = {"android.permission.READ_EXTERNAL_STORAGE", "android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_AUDIO", "android.permission.WRITE_EXTERNAL_STORAGE"};
        E = strArr21;
        String[] strArr22 = {"android.permission.READ_EXTERNAL_STORAGE", "android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_AUDIO", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"};
        F = strArr22;
        if (ctid.h) {
            strArr21 = strArr22;
        } else if (!ctid.f) {
            strArr21 = strArr20;
        }
        n = strArr21;
        String[] strArr23 = {"android.permission.RECEIVE_WAP_PUSH"};
        o = strArr23;
        p = new String[]{"com.samsung.android.app.reminder.permission.action.REGISTER"};
        String[] strArr24 = (String[]) enoh.b(strArr14, (String[]) enoh.b(strArr16, strArr15, String.class), String.class);
        q = strArr24;
        String[] strArr25 = {"android.permission.POST_NOTIFICATIONS"};
        G = strArr25;
        if (!ctid.f) {
            strArr25 = new String[0];
        }
        r = strArr25;
        String[] strArr26 = ctid.e ? new String[]{"android.permission.READ_PHONE_NUMBERS"} : new String[0];
        s = strArr26;
        enhd enhdVar = new enhd();
        enhdVar.k(ctuf.RECORD_AUDIO_PERMISSIONS, strArr);
        enhdVar.k(ctuf.CAMERA_GALLERY_ROLL_PERMISSIONS, strArr4);
        enhdVar.k(ctuf.CAMERA_IMAGE_PERMISSIONS, strArr7);
        enhdVar.k(ctuf.CAMERA_VIDEO_PERMISSIONS, strArr10);
        enhdVar.k(ctuf.STORAGE_PERMISSIONS, strArr21);
        enhdVar.k(ctuf.LOCATION_PERMISSIONS, strArr13);
        enhdVar.k(ctuf.CALL_PHONE_PERMISSIONS, strArr17);
        enhdVar.k(ctuf.MINIMUM_REQUIRED_PERMISSIONS, strArr24);
        enhdVar.k(ctuf.CAMERA_PERMISSIONS, strArr3);
        enhdVar.k(ctuf.RECEIVE_WAP_PUSH_PERMISSIONS, strArr23);
        enhdVar.k(ctuf.CONTACTS_PERMISSIONS, strArr15);
        enhdVar.k(ctuf.PRIVILEGED_CALL_PERMISSIONS, strArr19);
        enhdVar.k(ctuf.CALL_LOG_PERMISSIONS, strArr18);
        enhdVar.k(ctuf.SCHEDULED_SEND_PERMISSIONS, strArr2);
        enhdVar.k(ctuf.NOTIFICATIONS, strArr25);
        enhdVar.k(ctuf.READ_PHONE_NUMBERS, strArr26);
        t = enhdVar.c();
    }
}
