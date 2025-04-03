package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dql extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dqq b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dql(dqq dqqVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dqqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dql) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0062, code lost:
    
        if (r3.a(r4, r5, r6, r7, r8) != r0) goto L36;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0062 -> B:4:0x0025). Please report as a decompilation issue!!! */
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
            r2 = 1
            if (r1 == 0) goto L1d
            if (r1 == r2) goto L11
            java.lang.Object r1 = r9.c
            ffsk r1 = (defpackage.ffsk) r1
            defpackage.ffci.b(r10)     // Catch: java.lang.Throwable -> L19
            goto L25
        L11:
            java.lang.Object r1 = r9.c
            ffsk r1 = (defpackage.ffsk) r1
            defpackage.ffci.b(r10)     // Catch: java.lang.Throwable -> L19
            goto L3d
        L19:
            r0 = move-exception
            r10 = r0
            r8 = r9
            goto L76
        L1d:
            defpackage.ffci.b(r10)
            java.lang.Object r10 = r9.c
            r1 = r10
            ffsk r1 = (defpackage.ffsk) r1
        L25:
            ffhd r10 = r1.hT()     // Catch: java.lang.Throwable -> L67
            boolean r10 = defpackage.ffui.h(r10)     // Catch: java.lang.Throwable -> L67
            if (r10 == 0) goto L6d
            dqq r10 = r9.b     // Catch: java.lang.Throwable -> L67
            ffwm r10 = r10.c     // Catch: java.lang.Throwable -> L67
            r9.c = r1     // Catch: java.lang.Throwable -> L67
            r9.a = r2     // Catch: java.lang.Throwable -> L67
            java.lang.Object r10 = r10.i(r9)     // Catch: java.lang.Throwable -> L67
            if (r10 == r0) goto L6b
        L3d:
            r5 = r10
            dqb r5 = (defpackage.dqb) r5     // Catch: java.lang.Throwable -> L67
            dqq r10 = r9.b     // Catch: java.lang.Throwable -> L67
            jzn r10 = r10.b     // Catch: java.lang.Throwable -> L67
            r3 = 1086324736(0x40c00000, float:6.0)
            float r6 = r10.em(r3)     // Catch: java.lang.Throwable -> L67
            dqq r10 = r9.b     // Catch: java.lang.Throwable -> L67
            jzn r10 = r10.b     // Catch: java.lang.Throwable -> L67
            r3 = 1065353216(0x3f800000, float:1.0)
            float r7 = r10.em(r3)     // Catch: java.lang.Throwable -> L67
            dqq r3 = r9.b     // Catch: java.lang.Throwable -> L67
            dsp r4 = r3.a     // Catch: java.lang.Throwable -> L67
            r9.c = r1     // Catch: java.lang.Throwable -> L67
            r10 = 2
            r9.a = r10     // Catch: java.lang.Throwable -> L67
            r8 = r9
            java.lang.Object r10 = r3.a(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L65
            if (r10 != r0) goto L25
            goto L6c
        L65:
            r0 = move-exception
            goto L69
        L67:
            r0 = move-exception
            r8 = r9
        L69:
            r10 = r0
            goto L76
        L6b:
            r8 = r9
        L6c:
            return r0
        L6d:
            r8 = r9
            dqq r10 = r8.b
            defpackage.dqq.f(r10)
            ffcu r10 = defpackage.ffcu.a
            return r10
        L76:
            dqq r0 = r8.b
            defpackage.dqq.f(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dql.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dql dqlVar = new dql(this.b, ffguVar);
        dqlVar.c = obj;
        return dqlVar;
    }
}
