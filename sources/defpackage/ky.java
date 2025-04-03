package defpackage;

import android.content.Context;
import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ky {
    public static final cskc a = cskc.g("Bugle", "MmsManager");
    private static final SparseArray b = new SparseArray();
    private final cpai c;
    private kz d = null;
    private final fazb e;
    private final ffbr f;
    private final Context g;

    public ky(Context context, fazb fazbVar, ffbr ffbrVar, cpai cpaiVar) {
        this.c = cpaiVar;
        this.f = ffbrVar;
        this.e = fazbVar;
        this.g = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
    
        if ((r6 instanceof java.lang.String) == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005e, code lost:
    
        if ((r6 instanceof java.lang.Integer) == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006c, code lost:
    
        if ((r6 instanceof java.lang.Boolean) == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006e, code lost:
    
        r1.putBoolean(r5, ((java.lang.Boolean) r6).booleanValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0060, code lost:
    
        r1.putInt(r5, ((java.lang.Integer) r6).intValue());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle a(int r10) {
        /*
            r9 = this;
            android.util.SparseArray r0 = defpackage.ky.b
            monitor-enter(r0)
            java.lang.Object r1 = r0.get(r10)     // Catch: java.lang.Throwable -> Lbc
            android.os.Bundle r1 = (android.os.Bundle) r1     // Catch: java.lang.Throwable -> Lbc
            if (r1 != 0) goto Lba
            android.os.Bundle r1 = new android.os.Bundle     // Catch: java.lang.Throwable -> Lbc
            r1.<init>()     // Catch: java.lang.Throwable -> Lbc
            r0.put(r10, r1)     // Catch: java.lang.Throwable -> Lbc
            cpai r2 = r9.c     // Catch: java.lang.Throwable -> Lbc
            if (r2 == 0) goto L81
            android.telephony.SmsManager r2 = android.telephony.SmsManager.getSmsManagerForSubscriptionId(r10)     // Catch: java.lang.Throwable -> Lbc
            android.os.Bundle r2 = r2.getCarrierConfigValues()     // Catch: java.lang.Throwable -> Lbc
            cpai r3 = r9.c     // Catch: java.lang.Throwable -> Lbc
            android.os.Bundle r3 = r3.a(r10)     // Catch: java.lang.Throwable -> Lbc
            if (r2 == 0) goto L7e
            java.util.Set r4 = r3.keySet()     // Catch: java.lang.Throwable -> Lbc
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> Lbc
        L2f:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> Lbc
            if (r5 == 0) goto L81
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> Lbc
            java.lang.Object r6 = r3.get(r5)     // Catch: java.lang.Throwable -> Lbc
            java.lang.Object r7 = r2.get(r5)     // Catch: java.lang.Throwable -> Lbc
            if (r6 == 0) goto L4d
            if (r7 == 0) goto L4d
            boolean r8 = r6.equals(r7)     // Catch: java.lang.Throwable -> Lbc
            if (r8 == 0) goto L55
        L4d:
            if (r6 == 0) goto L51
            if (r7 == 0) goto L55
        L51:
            if (r6 != 0) goto L2f
            if (r7 == 0) goto L2f
        L55:
            if (r6 == 0) goto L78
            boolean r7 = r6 instanceof java.lang.String     // Catch: java.lang.Throwable -> Lbc
            if (r7 == 0) goto L5c
            goto L78
        L5c:
            boolean r7 = r6 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> Lbc
            if (r7 == 0) goto L6a
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch: java.lang.Throwable -> Lbc
            int r6 = r6.intValue()     // Catch: java.lang.Throwable -> Lbc
            r1.putInt(r5, r6)     // Catch: java.lang.Throwable -> Lbc
            goto L2f
        L6a:
            boolean r7 = r6 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> Lbc
            if (r7 == 0) goto L2f
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> Lbc
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> Lbc
            r1.putBoolean(r5, r6)     // Catch: java.lang.Throwable -> Lbc
            goto L2f
        L78:
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> Lbc
            r1.putString(r5, r6)     // Catch: java.lang.Throwable -> Lbc
            goto L2f
        L7e:
            r1.putAll(r3)     // Catch: java.lang.Throwable -> Lbc
        L81:
            cpak r2 = new cpak     // Catch: java.lang.Throwable -> Lbc
            android.content.Context r3 = r9.g     // Catch: java.lang.Throwable -> Lbc
            fazb r4 = r9.e     // Catch: java.lang.Throwable -> Lbc
            java.lang.Object r4 = r4.b()     // Catch: java.lang.Throwable -> Lbc
            ctwb r4 = (defpackage.ctwb) r4     // Catch: java.lang.Throwable -> Lbc
            ffbr r4 = r9.f     // Catch: java.lang.Throwable -> Lbc
            java.lang.Object r4 = r4.b()     // Catch: java.lang.Throwable -> Lbc
            cpbs r4 = (defpackage.cpbs) r4     // Catch: java.lang.Throwable -> Lbc
            r2.<init>(r3, r4, r10)     // Catch: java.lang.Throwable -> Lbc
            r9.d = r2     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r10 = "userAgent"
            r3 = r2
            cpak r3 = (defpackage.cpak) r3     // Catch: java.lang.Throwable -> Lbc
            r2.a()     // Catch: java.lang.Throwable -> Lbc
            r3 = r2
            cpak r3 = (defpackage.cpak) r3     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r3 = r2.a     // Catch: java.lang.Throwable -> Lbc
            r1.putString(r10, r3)     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r10 = "uaProfUrl"
            r3 = r2
            cpak r3 = (defpackage.cpak) r3     // Catch: java.lang.Throwable -> Lbc
            r2.a()     // Catch: java.lang.Throwable -> Lbc
            r3 = r2
            cpak r3 = (defpackage.cpak) r3     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r2 = r2.b     // Catch: java.lang.Throwable -> Lbc
            r1.putString(r10, r2)     // Catch: java.lang.Throwable -> Lbc
        Lba:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lbc
            return r1
        Lbc:
            r10 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lbc
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ky.a(int):android.os.Bundle");
    }
}
