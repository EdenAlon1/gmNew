package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fta extends ffhv implements ffji {
    int a;
    final /* synthetic */ ftb b;
    final /* synthetic */ float c;
    final /* synthetic */ boolean d;
    final /* synthetic */ cxt e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fta(ftb ftbVar, float f, boolean z, cxt cxtVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = ftbVar;
        this.c = f;
        this.d = z;
        this.e = cxtVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0071, code lost:
    
        if (r9.e(r3, r8) != r0) goto L18;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) {
        /*
            r8 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r8.a
            r2 = 1
            defpackage.ffci.b(r9)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L73
            return r9
        Ld:
            ftb r9 = r8.b
            int r9 = r9.f()
            r1 = 0
            boolean r9 = defpackage.guk.b(r9, r1)
            if (r9 == 0) goto L40
            ftb r9 = r8.b
            float r3 = r8.c
            int r3 = defpackage.ftb.n(r3)
            r4 = 12
            int r3 = r3 % r4
            float r3 = (float) r3
            r5 = 1057360530(0x3f060a92, float:0.5235988)
            float r3 = r3 * r5
            r9.c = r3
            int r3 = defpackage.ftb.n(r3)
            int r3 = r3 % r4
            boolean r5 = defpackage.guj.w(r9)
            if (r2 == r5) goto L38
            goto L39
        L38:
            r1 = r4
        L39:
            int r3 = r3 + r1
            gul r9 = r9.a
            r9.h(r3)
            goto L58
        L40:
            ftb r9 = r8.b
            float r1 = r8.c
            int r1 = defpackage.ftb.o(r1)
            float r1 = (float) r1
            r3 = 1037465424(0x3dd67750, float:0.10471976)
            float r1 = r1 * r3
            r9.d = r1
            gul r9 = r9.a
            int r1 = defpackage.ftb.o(r1)
            r9.i(r1)
        L58:
            boolean r9 = r8.d
            if (r9 != 0) goto L76
            ftb r9 = r8.b
            float r1 = r8.c
            cxj r9 = r9.e
            java.lang.Float r3 = new java.lang.Float
            float r1 = defpackage.ftb.m(r1)
            r3.<init>(r1)
            r8.a = r2
            java.lang.Object r9 = r9.e(r3, r8)
            if (r9 == r0) goto L98
        L73:
            ffcu r9 = defpackage.ffcu.a
            return r9
        L76:
            ftb r9 = r8.b
            float r1 = r8.c
            float r1 = defpackage.ftb.m(r1)
            float r1 = r9.a(r1)
            cxj r2 = r9.e
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r1)
            cxt r4 = r8.e
            r9 = 2
            r8.a = r9
            r5 = 0
            r7 = 12
            r6 = r8
            java.lang.Object r9 = defpackage.cxj.j(r2, r3, r4, r5, r6, r7)
            if (r9 != r0) goto L99
        L98:
            return r0
        L99:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fta.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new fta(this.b, this.c, this.d, this.e, (ffgu) obj).b(ffcu.a);
    }
}
