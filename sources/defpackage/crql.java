package defpackage;

import android.content.Context;
import android.provider.BlockedNumberContract;
import j$.util.Optional;
import java.util.Locale;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crql {
    private static final cskc b = cskc.g("BugleDataModel", "BlockedNumberWrapper");
    private final Context c;
    private final cpdg d;
    final Set a = new cmj();
    private boolean e = false;

    public crql(Context context, cpdg cpdgVar) {
        this.c = context;
        this.d = cpdgVar;
    }

    public final Optional a(String str) {
        boolean isBlocked;
        boolean z;
        if (this.d.i(str)) {
            csjb d = b.d();
            d.I("Checking is blocked against the in memory alpha blocked list");
            d.k(str);
            d.r();
            synchronized (this.a) {
                synchronized (this.a) {
                    if (!this.e) {
                        b();
                    }
                    z = this.e;
                }
                if (z) {
                    return Optional.of(Boolean.valueOf(this.a.contains(str.toLowerCase(Locale.US))));
                }
            }
        }
        try {
            isBlocked = BlockedNumberContract.isBlocked(this.c, str);
            return Optional.of(Boolean.valueOf(isBlocked));
        } catch (Throwable th) {
            b.s(true != (th instanceof SecurityException) ? "This device appears to have a SystemBlockList, but its block list is not available at the URI content://com.android.blockednumber" : "Insufficient permissions to query BlockedNumberContract", th);
            return Optional.empty();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0070, code lost:
    
        if (r2 == null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r9 = this;
            java.util.Set r1 = r9.a
            monitor-enter(r1)
            r2 = 0
            android.content.Context r0 = r9.c     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            android.content.ContentResolver r3 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            android.net.Uri r4 = defpackage.afg$$ExternalSyntheticApiModelOutline0.m120m$3()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            java.lang.String r0 = "original_number"
            java.lang.String[] r5 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            r7 = 0
            r8 = 0
            r6 = 0
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            java.util.Set r0 = r9.a     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            r0.clear()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            if (r2 == 0) goto L5f
            int r0 = r2.getCount()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            if (r0 <= 0) goto L5f
        L28:
            boolean r0 = r2.moveToNext()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            if (r0 == 0) goto L58
            r0 = 0
            java.lang.String r0 = r2.getString(r0)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            cpdg r3 = r9.d     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            boolean r3 = r3.i(r0)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            if (r3 == 0) goto L28
            java.util.Set r3 = r9.a     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            java.util.Locale r4 = java.util.Locale.US     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            java.lang.String r4 = r0.toLowerCase(r4)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            r3.add(r4)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            cskc r3 = defpackage.crql.b     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            csjb r3 = r3.d()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            java.lang.String r4 = "Loading blocked alpha short code sender in memory"
            r3.I(r4)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            r3.k(r0)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            r3.r()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
            goto L28
        L58:
            r0 = 1
            r9.e = r0     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L68
        L5b:
            r2.close()     // Catch: java.lang.Throwable -> L7b
            goto L73
        L5f:
            if (r2 == 0) goto L64
            r2.close()     // Catch: java.lang.Throwable -> L7b
        L64:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7b
            return
        L66:
            r0 = move-exception
            goto L75
        L68:
            r0 = move-exception
            cskc r3 = defpackage.crql.b     // Catch: java.lang.Throwable -> L66
            java.lang.String r4 = "Couldn't load blocked numbers"
            r3.o(r4, r0)     // Catch: java.lang.Throwable -> L66
            if (r2 == 0) goto L73
            goto L5b
        L73:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7b
            return
        L75:
            if (r2 == 0) goto L7a
            r2.close()     // Catch: java.lang.Throwable -> L7b
        L7a:
            throw r0     // Catch: java.lang.Throwable -> L7b
        L7b:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7b
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crql.b():void");
    }
}
