package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ouh extends ffhv implements ffjm {
    int a;
    final /* synthetic */ our b;
    final /* synthetic */ int[] c;
    final /* synthetic */ String[] d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ouh(our ourVar, int[] iArr, String[] strArr, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ourVar;
        this.c = iArr;
        this.d = strArr;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ouh) c((ffxy) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        if (defpackage.ffra.a((defpackage.ffhd) r8, r5, r7) != r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        if (r8 != r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0074, code lost:
    
        if (r3.a(r4, r7) != r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0076, code lost:
    
        return r0;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) {
        /*
            r7 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r7.a
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L23
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L15
            java.lang.Object r1 = r7.e
            ffxy r1 = (defpackage.ffxy) r1
            defpackage.ffci.b(r8)
            goto L59
        L15:
            defpackage.ffci.b(r8)     // Catch: java.lang.Throwable -> L19
            goto L77
        L19:
            r8 = move-exception
            goto L7d
        L1b:
            java.lang.Object r1 = r7.e
            ffxy r1 = (defpackage.ffxy) r1
            defpackage.ffci.b(r8)
            goto L46
        L23:
            defpackage.ffci.b(r8)
            java.lang.Object r8 = r7.e
            r1 = r8
            ffxy r1 = (defpackage.ffxy) r1
            our r8 = r7.b
            int[] r5 = r7.c
            osl r8 = r8.c
            boolean r8 = r8.a(r5)
            if (r8 == 0) goto L59
            our r8 = r7.b
            r7.e = r1
            r7.a = r4
            otb r8 = r8.a
            r4 = 0
            java.lang.Object r8 = defpackage.ovw.a(r8, r4, r7)
            if (r8 == r0) goto L76
        L46:
            our r4 = r7.b
            ffhd r8 = (defpackage.ffhd) r8
            oue r5 = new oue
            r5.<init>(r4, r2)
            r7.e = r1
            r7.a = r3
            java.lang.Object r8 = defpackage.ffra.a(r8, r5, r7)
            if (r8 == r0) goto L76
        L59:
            fflb r8 = new fflb     // Catch: java.lang.Throwable -> L19
            r8.<init>()     // Catch: java.lang.Throwable -> L19
            our r3 = r7.b     // Catch: java.lang.Throwable -> L19
            osn r3 = r3.d     // Catch: java.lang.Throwable -> L19
            oug r4 = new oug     // Catch: java.lang.Throwable -> L19
            java.lang.String[] r5 = r7.d     // Catch: java.lang.Throwable -> L19
            int[] r6 = r7.c     // Catch: java.lang.Throwable -> L19
            r4.<init>(r8, r1, r5, r6)     // Catch: java.lang.Throwable -> L19
            r7.e = r2     // Catch: java.lang.Throwable -> L19
            r8 = 3
            r7.a = r8     // Catch: java.lang.Throwable -> L19
            java.lang.Object r8 = r3.a(r4, r7)     // Catch: java.lang.Throwable -> L19
            if (r8 != r0) goto L77
        L76:
            return r0
        L77:
            ffbx r8 = new ffbx     // Catch: java.lang.Throwable -> L19
            r8.<init>()     // Catch: java.lang.Throwable -> L19
            throw r8     // Catch: java.lang.Throwable -> L19
        L7d:
            our r0 = r7.b
            int[] r1 = r7.c
            osl r0 = r0.c
            r0.b(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ouh.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ouh ouhVar = new ouh(this.b, this.c, this.d, ffguVar);
        ouhVar.e = obj;
        return ouhVar;
    }
}
