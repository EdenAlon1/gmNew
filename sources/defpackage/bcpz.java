package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcpz {
    private static final ArrayList e;
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    private final ffbr f;
    private final ffbr g;
    private boolean h;
    private boolean i;
    private boolean j;
    private bcpy k;
    private static final cskc c = cskc.g("Bugle", "CequintCallerIdManager");
    static final cfva a = cfvl.r(166321560, "enable_cequint_permission_check_pre_observer");
    private static final Uri d = Uri.parse("content://com.cequint.ecid/external/lookup/sms");

    static {
        ArrayList arrayList = new ArrayList(5);
        e = arrayList;
        arrayList.add(0, new byte[]{26, 12, -8, -115, 91, -30, 106, -19, 80, -123, -2, -120, -96, -98, -20, 37, 30, -54, 22, -105, 80, -38, 33, -52, 24, -55, -104, -81, 38, -51, 6, 113});
        arrayList.add(1, new byte[]{-54, 47, -82, -12, 9, -17, 76, 121, -8, 76, -40, -105, -65, 26, 21, 15, -16, 94, 84, 116, -74, 74, -54, -51, 5, 126, 30, -104, -58, 31, 92, 69});
        arrayList.add(2, new byte[]{-26, 122, 14, -80, 118, 78, -61, 40, -73, -63, 27, 27, -48, -124, 40, -90, 22, -39, -13, -21, -80, 32, -89, -40, -33, 20, 114, -127, 76, 19, -13, -55});
        arrayList.add(3, new byte[]{26, -70, -94, -124, 12, 97, -106, 9, -111, 94, -111, -107, 61, 41, 60, -112, -20, -76, -119, 29, -64, -79, 35, 88, -104, -21, -26, -44, 9, -27, -114, -99});
        arrayList.add(4, new byte[]{39, -7, 109, -70, -73, 123, 49, -10, -107, 62, 76, -46, -62, -34, -2, 21, -11, -41, -57, -113, 7, 61, -41, 22, 32, 24, -17, 71, 107, 9, 124, 52});
    }

    public bcpz(ffbr ffbrVar, ffbr ffbrVar2) {
        this.f = ffbrVar;
        this.g = ffbrVar2;
    }

    private static String c(Cursor cursor, int i) {
        if (cursor.isNull(i)) {
            return null;
        }
        String string = cursor.getString(i);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008b, code lost:
    
        if (r9 == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008d, code lost:
    
        if (r9 == 1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0090, code lost:
    
        if (r9 == 2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0093, code lost:
    
        if (r9 == 4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009d, code lost:
    
        defpackage.bcpz.c.p("This is Sprint Support Package Caller Name ID APK.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bc, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0095, code lost:
    
        defpackage.bcpz.c.p("This is SprintPackage Caller Name ID APK.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c0, code lost:
    
        r12 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00de, code lost:
    
        r0 = defpackage.bcpz.c.b();
        r0.I("Couldn't find package info");
        r0.A("packageName", r2);
        r0.s(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ef, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00be, code lost:
    
        r12 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d4, code lost:
    
        defpackage.bcpz.c.o("Device does not have the algorithm to hash the signatures.", r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a5, code lost:
    
        defpackage.bcpz.c.p("This is VZWPackage Caller Name ID APK.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ad, code lost:
    
        defpackage.bcpz.c.p("This is 2048-signed Caller Name ID APK.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b5, code lost:
    
        defpackage.bcpz.c.p("This is 1024-signed Caller Name ID APK.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean d(android.content.Context r12) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcpz.d(android.content.Context):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x0204, code lost:
    
        r4.append(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0207, code lost:
    
        if (r19 != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0209, code lost:
    
        r4.append(" ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0303, code lost:
    
        if (r22 != null) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0219 A[Catch: all -> 0x0307, TryCatch #1 {all -> 0x0307, blocks: (B:60:0x01ea, B:65:0x01f6, B:66:0x0213, B:69:0x0222, B:71:0x0228, B:72:0x0232, B:76:0x023e, B:77:0x024a, B:79:0x0250, B:82:0x025c, B:85:0x026e, B:87:0x0274, B:90:0x029a, B:92:0x02c3, B:94:0x02cd, B:95:0x02d1, B:97:0x02e4, B:100:0x02ef, B:103:0x02eb, B:104:0x027d, B:106:0x0283, B:108:0x0289, B:109:0x0290, B:113:0x0219, B:115:0x01fc, B:117:0x0204, B:119:0x0209, B:121:0x0210, B:47:0x02fe), top: B:44:0x011a }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x030b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[Catch: SecurityException -> 0x0314, SYNTHETIC, TRY_LEAVE, TryCatch #0 {SecurityException -> 0x0314, blocks: (B:43:0x0110, B:126:0x0148, B:50:0x022d, B:101:0x02f2, B:137:0x0313, B:136:0x0310, B:132:0x030b), top: B:42:0x0110, inners: #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.bcpy a(android.content.Context r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 812
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcpz.a(android.content.Context, java.lang.String):bcpy");
    }

    public final synchronized boolean b(Context context) {
        if (!this.i) {
            this.i = true;
            this.j = d(context);
        }
        return this.j;
    }
}
