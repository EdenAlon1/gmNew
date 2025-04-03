package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cqnt extends ffhv implements ffji {
    int a;
    final /* synthetic */ cqnv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqnt(cqnv cqnvVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = cqnvVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00c2, code lost:
    
        if (r2.h(r5, r18) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00d0, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007b, code lost:
    
        if (r2 != r0) goto L9;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r19) {
        /*
            r18 = this;
            r1 = r18
            ffhh r0 = defpackage.ffhh.a
            int r2 = r1.a
            r3 = 2
            r4 = 0
            java.lang.String r5 = "com/google/android/apps/messaging/shared/telephony/impl/telephonydatabaseupdate/TelephonyDatabaseUpdater"
            java.lang.String r6 = "TelephonyDatabaseUpdater.kt"
            java.lang.String r7 = "BugleTelephony"
            r8 = 1
            defpackage.ffci.b(r19)
            if (r2 == 0) goto L1b
            if (r2 == r8) goto L18
            goto Lc5
        L18:
            r2 = r19
            goto L7d
        L1b:
            cqnv r2 = r1.b
            enru r9 = defpackage.cqnv.a
            ensk r9 = r9.h()
            ensn r10 = defpackage.ente.a
            r9.Y(r10, r7)
            java.lang.String r10 = "queryTextPartsWithZeroOrNullCharsets"
            r11 = 411(0x19b, float:5.76E-43)
            ensk r9 = r9.h(r5, r10, r11, r6)
            enrr r9 = (defpackage.enrr) r9
            java.lang.String r10 = "Querying pdus for update"
            r9.q(r10)
            java.util.Locale r9 = java.util.Locale.US
            r10 = 4
            java.lang.Object[] r11 = new java.lang.Object[r10]
            java.lang.String r12 = "ct"
            r11[r4] = r12
            java.lang.String r12 = "text/plain"
            r11[r8] = r12
            java.lang.String r12 = "chset"
            r11[r3] = r12
            r13 = 3
            r11[r13] = r12
            java.lang.Object[] r10 = java.util.Arrays.copyOf(r11, r10)
            java.lang.String r11 = "%s == '%s' AND (%s IS NULL OR %s == 0)"
            java.lang.String r15 = java.lang.String.format(r9, r11, r10)
            r15.getClass()
            ffbr r9 = r2.d
            java.lang.Object r9 = r9.b()
            r12 = r9
            ejtr r12 = (defpackage.ejtr) r12
            android.net.Uri r13 = defpackage.cqnv.c
            java.lang.String[] r14 = defpackage.cqnv.b
            r16 = 0
            r17 = 0
            erph r9 = r12.b(r13, r14, r15, r16, r17)
            ffsk r2 = r2.e
            ffss r2 = defpackage.axnh.b(r9, r2)
            r1.a = r8
            ffuq r2 = (defpackage.ffuq) r2
            java.lang.Object r2 = r2.B(r1)
            if (r2 == r0) goto Ld0
        L7d:
            java.io.Closeable r2 = (java.io.Closeable) r2
            r8 = r2
            android.database.Cursor r8 = (android.database.Cursor) r8     // Catch: java.lang.Throwable -> Lc8
            int r9 = r8.getCount()     // Catch: java.lang.Throwable -> Lc8
            enru r10 = defpackage.cqnv.a     // Catch: java.lang.Throwable -> Lc8
            ensk r10 = r10.h()     // Catch: java.lang.Throwable -> Lc8
            ensn r11 = defpackage.ente.a     // Catch: java.lang.Throwable -> Lc8
            r10.Y(r11, r7)     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r7 = "processCharsets"
            r11 = 438(0x1b6, float:6.14E-43)
            ensk r5 = r10.h(r5, r7, r11, r6)     // Catch: java.lang.Throwable -> Lc8
            enrr r5 = (defpackage.enrr) r5     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r6 = "Found [%s] null or 0 valued charset values in the parts table"
            r5.r(r6, r9)     // Catch: java.lang.Throwable -> Lc8
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lc8
            r5.<init>()     // Catch: java.lang.Throwable -> Lc8
        La5:
            boolean r6 = r8.moveToNext()     // Catch: java.lang.Throwable -> Lc8
            if (r6 == 0) goto Lb6
            java.lang.String r6 = r8.getString(r4)     // Catch: java.lang.Throwable -> Lc8
            r6.getClass()     // Catch: java.lang.Throwable -> Lc8
            r5.add(r6)     // Catch: java.lang.Throwable -> Lc8
            goto La5
        Lb6:
            r4 = 0
            defpackage.ffig.a(r2, r4)
            cqnv r2 = r1.b
            r1.a = r3
            java.lang.Object r2 = r2.h(r5, r1)
            if (r2 != r0) goto Lc5
            goto Ld0
        Lc5:
            ffcu r0 = defpackage.ffcu.a
            return r0
        Lc8:
            r0 = move-exception
            r3 = r0
            throw r3     // Catch: java.lang.Throwable -> Lcb
        Lcb:
            r0 = move-exception
            defpackage.ffig.a(r2, r3)
            throw r0
        Ld0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqnt.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new cqnt(this.b, (ffgu) obj).b(ffcu.a);
    }
}
