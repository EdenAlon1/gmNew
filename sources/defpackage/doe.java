package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class doe extends ffhu implements ffjm {
    int a;
    final /* synthetic */ ffji b;
    final /* synthetic */ ffix c;
    final /* synthetic */ ffix d;
    final /* synthetic */ ffjm e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public doe(ffji ffjiVar, ffix ffixVar, ffix ffixVar2, ffjm ffjmVar, ffgu ffguVar) {
        super(ffguVar);
        this.b = ffjiVar;
        this.c = ffixVar;
        this.d = ffixVar2;
        this.e = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((doe) c((iju) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0043, code lost:
    
        if (r7 != r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0035, code lost:
    
        if (r7 != r0) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0073 A[Catch: CancellationException -> 0x009b, TryCatch #0 {CancellationException -> 0x009b, blocks: (B:7:0x0010, B:8:0x006b, B:10:0x0073, B:12:0x0080, B:14:0x008c, B:16:0x008f, B:22:0x0092, B:24:0x0018, B:25:0x0045, B:27:0x0049, B:33:0x0020, B:34:0x0037, B:37:0x002c), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0092 A[Catch: CancellationException -> 0x009b, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x009b, blocks: (B:7:0x0010, B:8:0x006b, B:10:0x0073, B:12:0x0080, B:14:0x008c, B:16:0x008f, B:22:0x0092, B:24:0x0018, B:25:0x0045, B:27:0x0049, B:33:0x0020, B:34:0x0037, B:37:0x002c), top: B:2:0x0006 }] */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) {
        /*
            r6 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r6.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 == r3) goto L1c
            if (r1 == r2) goto L14
            java.lang.Object r0 = r6.f
            iju r0 = (defpackage.iju) r0
            defpackage.ffci.b(r7)     // Catch: java.util.concurrent.CancellationException -> L9b
            goto L6b
        L14:
            java.lang.Object r1 = r6.f
            iju r1 = (defpackage.iju) r1
            defpackage.ffci.b(r7)     // Catch: java.util.concurrent.CancellationException -> L9b
            goto L45
        L1c:
            java.lang.Object r1 = r6.f
            iju r1 = (defpackage.iju) r1
            defpackage.ffci.b(r7)     // Catch: java.util.concurrent.CancellationException -> L9b
            goto L37
        L24:
            defpackage.ffci.b(r7)
            java.lang.Object r7 = r6.f
            r1 = r7
            iju r1 = (defpackage.iju) r1
            r6.f = r1     // Catch: java.util.concurrent.CancellationException -> L9b
            r6.a = r3     // Catch: java.util.concurrent.CancellationException -> L9b
            r7 = 0
            java.lang.Object r7 = defpackage.dtr.g(r1, r7, r6, r2)     // Catch: java.util.concurrent.CancellationException -> L9b
            if (r7 == r0) goto L9a
        L37:
            iku r7 = (defpackage.iku) r7     // Catch: java.util.concurrent.CancellationException -> L9b
            long r3 = r7.a     // Catch: java.util.concurrent.CancellationException -> L9b
            r6.f = r1     // Catch: java.util.concurrent.CancellationException -> L9b
            r6.a = r2     // Catch: java.util.concurrent.CancellationException -> L9b
            java.lang.Object r7 = defpackage.doo.f(r1, r3, r6)     // Catch: java.util.concurrent.CancellationException -> L9b
            if (r7 == r0) goto L9a
        L45:
            iku r7 = (defpackage.iku) r7     // Catch: java.util.concurrent.CancellationException -> L9b
            if (r7 == 0) goto L97
            ffji r2 = r6.b     // Catch: java.util.concurrent.CancellationException -> L9b
            long r3 = r7.c     // Catch: java.util.concurrent.CancellationException -> L9b
            iak r5 = new iak     // Catch: java.util.concurrent.CancellationException -> L9b
            r5.<init>(r3)     // Catch: java.util.concurrent.CancellationException -> L9b
            r2.invoke(r5)     // Catch: java.util.concurrent.CancellationException -> L9b
            long r2 = r7.a     // Catch: java.util.concurrent.CancellationException -> L9b
            dod r7 = new dod     // Catch: java.util.concurrent.CancellationException -> L9b
            ffjm r4 = r6.e     // Catch: java.util.concurrent.CancellationException -> L9b
            r7.<init>(r4)     // Catch: java.util.concurrent.CancellationException -> L9b
            r6.f = r1     // Catch: java.util.concurrent.CancellationException -> L9b
            r4 = 3
            r6.a = r4     // Catch: java.util.concurrent.CancellationException -> L9b
            java.lang.Object r7 = defpackage.doo.j(r1, r2, r7, r6)     // Catch: java.util.concurrent.CancellationException -> L9b
            if (r7 != r0) goto L6a
            goto L9a
        L6a:
            r0 = r1
        L6b:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.util.concurrent.CancellationException -> L9b
            boolean r7 = r7.booleanValue()     // Catch: java.util.concurrent.CancellationException -> L9b
            if (r7 == 0) goto L92
            iki r7 = r0.p()     // Catch: java.util.concurrent.CancellationException -> L9b
            java.util.List r7 = r7.a     // Catch: java.util.concurrent.CancellationException -> L9b
            int r0 = r7.size()     // Catch: java.util.concurrent.CancellationException -> L9b
            r1 = 0
        L7e:
            if (r1 >= r0) goto L97
            java.lang.Object r2 = r7.get(r1)     // Catch: java.util.concurrent.CancellationException -> L9b
            iku r2 = (defpackage.iku) r2     // Catch: java.util.concurrent.CancellationException -> L9b
            boolean r3 = defpackage.ikj.e(r2)     // Catch: java.util.concurrent.CancellationException -> L9b
            if (r3 == 0) goto L8f
            r2.b()     // Catch: java.util.concurrent.CancellationException -> L9b
        L8f:
            int r1 = r1 + 1
            goto L7e
        L92:
            ffix r7 = r6.d     // Catch: java.util.concurrent.CancellationException -> L9b
            r7.invoke()     // Catch: java.util.concurrent.CancellationException -> L9b
        L97:
            ffcu r7 = defpackage.ffcu.a
            return r7
        L9a:
            return r0
        L9b:
            r7 = move-exception
            ffix r0 = r6.d
            r0.invoke()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.doe.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        doe doeVar = new doe(this.b, this.c, this.d, this.e, ffguVar);
        doeVar.f = obj;
        return doeVar;
    }
}
