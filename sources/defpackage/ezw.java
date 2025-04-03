package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ezw extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffud b;
    final /* synthetic */ ezy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ezw(ffud ffudVar, ezy ezyVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffudVar;
        this.c = ezyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ezw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0053, code lost:
    
        if (defpackage.ffsw.c(500, r9) != r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0031, code lost:
    
        if (defpackage.ffui.a(r10, r9) != r0) goto L16;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0061 -> B:8:0x0064). Please report as a decompilation issue!!! */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) {
        /*
            r9 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r9.a
            r2 = 500(0x1f4, double:2.47E-321)
            r4 = 0
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 3
            r7 = 2
            r8 = 1
            if (r1 == 0) goto L24
            if (r1 == r8) goto L20
            if (r1 == r7) goto L1c
            if (r1 == r6) goto L18
            defpackage.ffci.b(r10)     // Catch: java.lang.Throwable -> L6a
            goto L64
        L18:
            defpackage.ffci.b(r10)     // Catch: java.lang.Throwable -> L6a
            goto L55
        L1c:
            defpackage.ffci.b(r10)     // Catch: java.lang.Throwable -> L6a
            goto L47
        L20:
            defpackage.ffci.b(r10)
            goto L33
        L24:
            defpackage.ffci.b(r10)
            ffud r10 = r9.b
            if (r10 == 0) goto L33
            r9.a = r8
            java.lang.Object r10 = defpackage.ffui.a(r10, r9)
            if (r10 == r0) goto L6c
        L33:
            ezy r10 = r9.c     // Catch: java.lang.Throwable -> L6a
            r10.a(r5)     // Catch: java.lang.Throwable -> L6a
            ezy r10 = r9.c     // Catch: java.lang.Throwable -> L6a
            boolean r10 = r10.a     // Catch: java.lang.Throwable -> L6a
            if (r10 != 0) goto L4d
            r9.a = r7     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r10 = defpackage.ffsw.b(r9)     // Catch: java.lang.Throwable -> L6a
            if (r10 != r0) goto L47
            goto L6c
        L47:
            ffbx r10 = new ffbx     // Catch: java.lang.Throwable -> L6a
            r10.<init>()     // Catch: java.lang.Throwable -> L6a
            throw r10     // Catch: java.lang.Throwable -> L6a
        L4d:
            r9.a = r6     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r10 = defpackage.ffsw.c(r2, r9)     // Catch: java.lang.Throwable -> L6a
            if (r10 == r0) goto L6c
        L55:
            ezy r10 = r9.c     // Catch: java.lang.Throwable -> L6a
            r10.a(r4)     // Catch: java.lang.Throwable -> L6a
            r10 = 4
            r9.a = r10     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r10 = defpackage.ffsw.c(r2, r9)     // Catch: java.lang.Throwable -> L6a
            if (r10 != r0) goto L64
            goto L6c
        L64:
            ezy r10 = r9.c     // Catch: java.lang.Throwable -> L6a
            r10.a(r5)     // Catch: java.lang.Throwable -> L6a
            goto L4d
        L6a:
            r10 = move-exception
            goto L6d
        L6c:
            return r0
        L6d:
            ezy r0 = r9.c
            r0.a(r4)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ezw.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ezw(this.b, this.c, ffguVar);
    }
}
