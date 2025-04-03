package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhzc implements fiab {
    public static final Map a;
    public final int b;
    private final String c;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(a("SHA-256", 32, 67, 20, 2), new fhzc(1, "XMSSMT_SHA2_20/2_256"));
        hashMap.put(a("SHA-256", 32, 67, 20, 4), new fhzc(2, "XMSSMT_SHA2_20/4_256"));
        hashMap.put(a("SHA-256", 32, 67, 40, 2), new fhzc(3, "XMSSMT_SHA2_40/2_256"));
        hashMap.put(a("SHA-256", 32, 67, 40, 4), new fhzc(4, "XMSSMT_SHA2_40/4_256"));
        hashMap.put(a("SHA-256", 32, 67, 40, 8), new fhzc(5, "XMSSMT_SHA2_40/8_256"));
        hashMap.put(a("SHA-256", 32, 67, 60, 3), new fhzc(6, "XMSSMT_SHA2_60/3_256"));
        hashMap.put(a("SHA-256", 32, 67, 60, 6), new fhzc(7, "XMSSMT_SHA2_60/6_256"));
        hashMap.put(a("SHA-256", 32, 67, 60, 12), new fhzc(8, "XMSSMT_SHA2_60/12_256"));
        hashMap.put(a("SHA-512", 64, 131, 20, 2), new fhzc(9, "XMSSMT_SHA2_20/2_512"));
        hashMap.put(a("SHA-512", 64, 131, 20, 4), new fhzc(10, "XMSSMT_SHA2_20/4_512"));
        hashMap.put(a("SHA-512", 64, 131, 40, 2), new fhzc(11, "XMSSMT_SHA2_40/2_512"));
        hashMap.put(a("SHA-512", 64, 131, 40, 4), new fhzc(12, "XMSSMT_SHA2_40/4_512"));
        hashMap.put(a("SHA-512", 64, 131, 40, 8), new fhzc(13, "XMSSMT_SHA2_40/8_512"));
        hashMap.put(a("SHA-512", 64, 131, 60, 3), new fhzc(14, "XMSSMT_SHA2_60/3_512"));
        hashMap.put(a("SHA-512", 64, 131, 60, 6), new fhzc(15, "XMSSMT_SHA2_60/6_512"));
        hashMap.put(a("SHA-512", 64, 131, 60, 12), new fhzc(16, "XMSSMT_SHA2_60/12_512"));
        hashMap.put(a("SHAKE128", 32, 67, 20, 2), new fhzc(17, "XMSSMT_SHAKE_20/2_256"));
        hashMap.put(a("SHAKE128", 32, 67, 20, 4), new fhzc(18, "XMSSMT_SHAKE_20/4_256"));
        hashMap.put(a("SHAKE128", 32, 67, 40, 2), new fhzc(19, "XMSSMT_SHAKE_40/2_256"));
        hashMap.put(a("SHAKE128", 32, 67, 40, 4), new fhzc(20, "XMSSMT_SHAKE_40/4_256"));
        hashMap.put(a("SHAKE128", 32, 67, 40, 8), new fhzc(21, "XMSSMT_SHAKE_40/8_256"));
        hashMap.put(a("SHAKE128", 32, 67, 60, 3), new fhzc(22, "XMSSMT_SHAKE_60/3_256"));
        hashMap.put(a("SHAKE128", 32, 67, 60, 6), new fhzc(23, "XMSSMT_SHAKE_60/6_256"));
        hashMap.put(a("SHAKE128", 32, 67, 60, 12), new fhzc(24, "XMSSMT_SHAKE_60/12_256"));
        hashMap.put(a("SHAKE256", 64, 131, 20, 2), new fhzc(25, "XMSSMT_SHAKE_20/2_512"));
        hashMap.put(a("SHAKE256", 64, 131, 20, 4), new fhzc(26, "XMSSMT_SHAKE_20/4_512"));
        hashMap.put(a("SHAKE256", 64, 131, 40, 2), new fhzc(27, "XMSSMT_SHAKE_40/2_512"));
        hashMap.put(a("SHAKE256", 64, 131, 40, 4), new fhzc(28, "XMSSMT_SHAKE_40/4_512"));
        hashMap.put(a("SHAKE256", 64, 131, 40, 8), new fhzc(29, "XMSSMT_SHAKE_40/8_512"));
        hashMap.put(a("SHAKE256", 64, 131, 60, 3), new fhzc(30, "XMSSMT_SHAKE_60/3_512"));
        hashMap.put(a("SHAKE256", 64, 131, 60, 6), new fhzc(31, "XMSSMT_SHAKE_60/6_512"));
        hashMap.put(a("SHAKE256", 64, 131, 60, 12), new fhzc(32, "XMSSMT_SHAKE_60/12_512"));
        a = DesugarCollections.unmodifiableMap(hashMap);
    }

    private fhzc(int i, String str) {
        this.b = i;
        this.c = str;
    }

    public static String a(String str, int i, int i2, int i3, int i4) {
        return str + "-" + i + "-16-" + i2 + "-" + i3 + "-" + i4;
    }

    public final String toString() {
        return this.c;
    }
}
