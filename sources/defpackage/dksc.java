package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class dksc {
    protected final Context a;
    private final ContentResolver b;
    private final Uri c;
    private final dijv d;

    public dksc(Context context, ContentResolver contentResolver, Uri uri, dijv dijvVar) {
        this.a = context;
        this.b = contentResolver;
        this.c = uri;
        this.d = dijvVar;
    }

    private final void a(int i, Bundle bundle, String str, Throwable th) {
        String b = emxe.b(bundle.getString("storage_file_name"));
        String b2 = emxe.b(bundle.getString("preference_key"));
        if (i == 0) {
            return;
        }
        eyqd eyqdVar = (eyqd) eyqh.a.createBuilder();
        eyqdVar.copyOnWrite();
        eyqh eyqhVar = (eyqh) eyqdVar.instance;
        eyqhVar.b |= 16;
        eyqhVar.g = b;
        eyqdVar.copyOnWrite();
        eyqh eyqhVar2 = (eyqh) eyqdVar.instance;
        eyqhVar2.b |= 32;
        eyqhVar2.h = b2;
        eyqdVar.copyOnWrite();
        eyqh eyqhVar3 = (eyqh) eyqdVar.instance;
        eyqhVar3.b |= 64;
        eyqhVar3.i = str;
        String packageName = this.a.getPackageName();
        eyqdVar.copyOnWrite();
        eyqh eyqhVar4 = (eyqh) eyqdVar.instance;
        packageName.getClass();
        eyqhVar4.b |= 8;
        eyqhVar4.f = packageName;
        eyqdVar.copyOnWrite();
        eyqh eyqhVar5 = (eyqh) eyqdVar.instance;
        eyqhVar5.b |= 4;
        eyqhVar5.e = "com.google.android.apps.messaging";
        eyqdVar.copyOnWrite();
        eyqh eyqhVar6 = (eyqh) eyqdVar.instance;
        eyqhVar6.c = 2;
        eyqhVar6.b |= 1;
        eyqdVar.copyOnWrite();
        eyqh eyqhVar7 = (eyqh) eyqdVar.instance;
        eyqhVar7.d = i - 1;
        eyqhVar7.b |= 2;
        if (dijq.a() == 2) {
            String c = dktx.GENERIC.c(th);
            eyqdVar.copyOnWrite();
            eyqh eyqhVar8 = (eyqh) eyqdVar.instance;
            c.getClass();
            eyqhVar8.b |= 128;
            eyqhVar8.j = c;
        }
        dijv dijvVar = this.d;
        eyqh eyqhVar9 = (eyqh) eyqdVar.build();
        epls K = dijvVar.K(dijvVar.b);
        if (K == null) {
            dkty.q("Unable to send ContentProvider request event log", new Object[0]);
            return;
        }
        K.copyOnWrite();
        eplx eplxVar = (eplx) K.instance;
        eplx eplxVar2 = eplx.a;
        eyqhVar9.getClass();
        eplxVar.f = eyqhVar9;
        eplxVar.e = 32;
        dijvVar.M(dijvVar.b, (eplx) K.build(), ezee.DIAGNOSTIC_EVENT);
    }

    public static String g(String str, String str2) {
        return str.concat(String.valueOf(str2));
    }

    public static final Bundle l(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("preference_key", str);
        bundle.putString("storage_file_name", str2);
        return bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008e A[Catch: NullPointerException -> 0x0099, IllegalStateException -> 0x009b, IllegalArgumentException -> 0x00a9, TryCatch #2 {IllegalArgumentException -> 0x00a9, IllegalStateException -> 0x009b, NullPointerException -> 0x0099, blocks: (B:6:0x003f, B:8:0x004a, B:10:0x0050, B:11:0x005d, B:14:0x007f, B:15:0x0088, B:17:0x0089, B:27:0x008a, B:29:0x008e, B:30:0x0098), top: B:5:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004a A[Catch: NullPointerException -> 0x0099, IllegalStateException -> 0x009b, IllegalArgumentException -> 0x00a9, TryCatch #2 {IllegalArgumentException -> 0x00a9, IllegalStateException -> 0x009b, NullPointerException -> 0x0099, blocks: (B:6:0x003f, B:8:0x004a, B:10:0x0050, B:11:0x005d, B:14:0x007f, B:15:0x0088, B:17:0x0089, B:27:0x008a, B:29:0x008e, B:30:0x0098), top: B:5:0x003f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle f(java.lang.String r8, java.lang.String r9, android.os.Bundle r10) {
        /*
            r7 = this;
            java.lang.String r0 = "result_error_key"
            android.content.Context r1 = r7.a
            boolean r1 = defpackage.dkuy.f(r1)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto Le
        Lc:
            r1 = r3
            goto L2e
        Le:
            boolean r1 = defpackage.efbd.g()
            if (r1 == 0) goto Lc
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.String r1 = r1.getName()
            java.lang.String r4 = "com.google.android.mobly.snippet.SnippetRunner"
            boolean r4 = r1.contains(r4)
            if (r4 != 0) goto Lc
            java.lang.String r4 = "com.google.android.apps.common.testing.testrunner.Google3InstrumentationTestRunner"
            boolean r1 = r1.contains(r4)
            if (r1 == 0) goto L2d
            goto Lc
        L2d:
            r1 = r2
        L2e:
            java.lang.String r4 = "preference_key"
            java.lang.String r4 = r10.getString(r4)
            java.lang.String r5 = "storage_file_name"
            java.lang.String r5 = r10.getString(r5)
            java.lang.String r6 = "Incompatible thread for calling ContentResolver; method: %s, key: %s, fileName: %s"
            defpackage.emxf.s(r1, r6, r8, r4, r5)
            android.content.ContentResolver r1 = r7.b     // Catch: java.lang.NullPointerException -> L99 java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> La9
            android.net.Uri r4 = r7.c     // Catch: java.lang.NullPointerException -> L99 java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> La9
            android.os.Bundle r9 = r1.call(r4, r8, r9, r10)     // Catch: java.lang.NullPointerException -> L99 java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> La9
            r1 = 0
            if (r9 == 0) goto L8e
            boolean r3 = r9.containsKey(r0)     // Catch: java.lang.NullPointerException -> L99 java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> La9
            if (r3 == 0) goto L8a
            int r9 = r9.getInt(r0, r2)     // Catch: java.lang.NullPointerException -> L99 java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> La9
            int r9 = defpackage.eyqf.a(r9)     // Catch: java.lang.NullPointerException -> L99 java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> La9
            r7.a(r9, r10, r8, r1)     // Catch: java.lang.NullPointerException -> L99 java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> La9
            dksb r0 = new dksb     // Catch: java.lang.NullPointerException -> L99 java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> La9
            switch(r9) {
                case 1: goto L7b;
                case 2: goto L78;
                case 3: goto L75;
                case 4: goto L72;
                case 5: goto L6f;
                case 6: goto L6c;
                case 7: goto L69;
                case 8: goto L66;
                case 9: goto L63;
                default: goto L60;
            }     // Catch: java.lang.NullPointerException -> L99 java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> La9
        L60:
            java.lang.String r2 = "null"
            goto L7d
        L63:
            java.lang.String r2 = "PREFERENCE_KEY_NOT_SUPPORTED_ERROR"
            goto L7d
        L66:
            java.lang.String r2 = "INTERNAL_ERROR"
            goto L7d
        L69:
            java.lang.String r2 = "URI_IS_NOT_SUPPORTED_ERROR"
            goto L7d
        L6c:
            java.lang.String r2 = "PREFERENCE_FILE_NOT_SUPPORTED_ERROR"
            goto L7d
        L6f:
            java.lang.String r2 = "PREFERENCE_VALUE_TYPE_NOT_SUPPORTED_ERROR"
            goto L7d
        L72:
            java.lang.String r2 = "PREFERENCE_METHOD_NOT_SUPPORTED_ERROR"
            goto L7d
        L75:
            java.lang.String r2 = "PREFERENCE_KEY_MISSING_ERROR"
            goto L7d
        L78:
            java.lang.String r2 = "UID_NOT_VERIFIED_ERROR"
            goto L7d
        L7b:
            java.lang.String r2 = "FAILURE_REASON_UNKNOWN"
        L7d:
            if (r9 == 0) goto L89
            java.lang.String r9 = "ContentProvider request failed, failureReason: "
            java.lang.String r9 = defpackage.a.t(r2, r9)     // Catch: java.lang.NullPointerException -> L99 java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> La9
            r0.<init>(r9)     // Catch: java.lang.NullPointerException -> L99 java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> La9
            throw r0     // Catch: java.lang.NullPointerException -> L99 java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> La9
        L89:
            throw r1     // Catch: java.lang.NullPointerException -> L99 java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> La9
        L8a:
            r7.a(r2, r10, r8, r1)     // Catch: java.lang.NullPointerException -> L99 java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> La9
            return r9
        L8e:
            r7.a(r3, r10, r8, r1)     // Catch: java.lang.NullPointerException -> L99 java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> La9
            dksb r9 = new dksb     // Catch: java.lang.NullPointerException -> L99 java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> La9
            java.lang.String r0 = "ContentResolver::call returned empty Bundle."
            r9.<init>(r0)     // Catch: java.lang.NullPointerException -> L99 java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> La9
            throw r9     // Catch: java.lang.NullPointerException -> L99 java.lang.IllegalStateException -> L9b java.lang.IllegalArgumentException -> La9
        L99:
            r9 = move-exception
            goto L9c
        L9b:
            r9 = move-exception
        L9c:
            r0 = 8
            r7.a(r0, r10, r8, r9)
            dksb r8 = new dksb
            java.lang.String r10 = "Exception thrown when trying to parse the response parcel"
            r8.<init>(r10, r9)
            throw r8
        La9:
            r9 = move-exception
            r0 = 7
            r7.a(r0, r10, r8, r9)
            android.net.Uri r8 = r7.c
            dksb r10 = new dksb
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r0 = "ContentResolver can not resolve URI: "
            java.lang.String r8 = r0.concat(r8)
            r10.<init>(r8, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dksc.f(java.lang.String, java.lang.String, android.os.Bundle):android.os.Bundle");
    }

    public final String h(String str, String str2, String str3) {
        Bundle l = l(str, str3);
        l.putString("preference_value", str2);
        return f("GET", "STRING", l).getString("preference_key", str2);
    }

    public final void i(String str, int i, String str2) {
        Bundle l = l(str, str2);
        l.putInt("preference_value", i);
        f("PUT", "INTEGER", l);
    }

    public final void j(String str, String str2, String str3) {
        Bundle l = l(str, str3);
        l.putString("preference_value", str2);
        f("PUT", "STRING", l);
    }

    public final boolean k(String str, boolean z, String str2) {
        Bundle l = l(str, str2);
        l.putBoolean("preference_value", z);
        return f("GET", "BOOLEAN", l).getBoolean("preference_key", z);
    }

    public final int m(String str, String str2) {
        Bundle l = l(str, str2);
        l.putInt("preference_value", 0);
        return f("GET", "INTEGER", l).getInt("preference_key", 0);
    }

    public final eyhs n(String str, eyhs eyhsVar) {
        try {
            return cbhj.a(h(str, cbhj.b(eyhsVar), "RcsApplicationData"), eyhsVar);
        } catch (eygu e) {
            throw new dksb("ContentProvider InvalidProtocolBufferException", e);
        }
    }

    public final void o(String str, eyhs eyhsVar) {
        j(str, cbhj.b(eyhsVar), "RcsApplicationData");
    }
}
