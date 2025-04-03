package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aknc {
    private final ejtr d;
    private final errl e;
    private final aknd f;
    public static final entd a = entd.c("KnoxProvider");
    private static final String[] c = new String[0];
    public static final Uri b = new Uri.Builder().scheme("content").authority("com.sec.knox.provider2").appendPath("PhoneRestrictionPolicy").build();

    public aknc(ejtr ejtrVar, errl errlVar, aknd akndVar) {
        this.d = ejtrVar;
        this.e = errlVar;
        this.f = akndVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0055 A[Catch: all -> 0x008c, TryCatch #1 {all -> 0x008c, blocks: (B:3:0x0008, B:18:0x005c, B:23:0x004e, B:24:0x0055), top: B:2:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.elfl a(final defpackage.aknb r11) {
        /*
            r10 = this;
            java.lang.String r0 = "1"
            java.lang.String r1 = "KnoxProvider#query"
            ekzz r1 = defpackage.eleg.f(r1)
            ejtr r2 = r10.d     // Catch: java.lang.Throwable -> L8c
            android.net.Uri r3 = defpackage.aknc.b     // Catch: java.lang.Throwable -> L8c
            java.lang.String[] r4 = defpackage.aknc.c     // Catch: java.lang.Throwable -> L8c
            java.lang.String r5 = r11.e     // Catch: java.lang.Throwable -> L8c
            int r6 = r5.hashCode()     // Catch: java.lang.Throwable -> L8c
            r7 = -1266976085(0xffffffffb47b7aab, float:-2.3420823E-7)
            r8 = 2
            r9 = 1
            if (r6 == r7) goto L3a
            r7 = -917366455(0xffffffffc9521949, float:-860564.56)
            if (r6 == r7) goto L30
            r7 = -186966299(0xfffffffff4db1ee5, float:-1.3888423E32)
            if (r6 == r7) goto L26
            goto L44
        L26:
            java.lang.String r6 = "isIncomingMmsAllowed"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L44
            r6 = r9
            goto L45
        L30:
            java.lang.String r6 = "isRCSEnabled"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L44
            r6 = 0
            goto L45
        L3a:
            java.lang.String r6 = "isOutgoingMmsAllowed"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L44
            r6 = r8
            goto L45
        L44:
            r6 = -1
        L45:
            if (r6 == 0) goto L55
            if (r6 == r9) goto L4e
            if (r6 == r8) goto L4e
            r0 = 0
        L4c:
            r6 = r0
            goto L5c
        L4e:
            java.lang.String r0 = "true"
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L8c
            goto L4c
        L55:
            java.lang.String r6 = "false"
            java.lang.String[] r0 = new java.lang.String[]{r0, r6, r0}     // Catch: java.lang.Throwable -> L8c
            goto L4c
        L5c:
            r7 = 0
            erph r0 = r2.b(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L8c
            r1.a(r0)     // Catch: java.lang.Throwable -> L8c
            akmz r2 = new akmz     // Catch: java.lang.Throwable -> L8c
            r2.<init>()     // Catch: java.lang.Throwable -> L8c
            erow r2 = defpackage.eldl.g(r2)     // Catch: java.lang.Throwable -> L8c
            errl r3 = r10.e     // Catch: java.lang.Throwable -> L8c
            erph r0 = r0.e(r2, r3)     // Catch: java.lang.Throwable -> L8c
            erqc r0 = r0.g()     // Catch: java.lang.Throwable -> L8c
            elfl r0 = defpackage.elfl.g(r0)     // Catch: java.lang.Throwable -> L8c
            java.lang.Class<java.lang.Exception> r2 = java.lang.Exception.class
            akna r3 = new akna     // Catch: java.lang.Throwable -> L8c
            r3.<init>()     // Catch: java.lang.Throwable -> L8c
            errl r11 = r10.e     // Catch: java.lang.Throwable -> L8c
            elfl r11 = r0.f(r2, r3, r11)     // Catch: java.lang.Throwable -> L8c
            r1.close()
            return r11
        L8c:
            r0 = move-exception
            r11 = r0
            r1.close()     // Catch: java.lang.Throwable -> L92
            goto L96
        L92:
            r0 = move-exception
            r11.addSuppressed(r0)
        L96:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aknc.a(aknb):elfl");
    }

    public final void b(aknb aknbVar, int i) {
        int ordinal = aknbVar.ordinal();
        if (ordinal == 0) {
            aknd akndVar = this.f;
            akndVar.a.e("Bugle.Knox.Signature.Lookup.Counts", aknd.a(i));
        } else if (ordinal == 1 || ordinal == 2 || ordinal == 3) {
            aknd akndVar2 = this.f;
            akndVar2.a.e("Bugle.Knox.Mms.Lookup.Counts", aknd.a(i));
        }
    }
}
