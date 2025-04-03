package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fvs extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cxj b;
    final /* synthetic */ float c;
    final /* synthetic */ boolean d;
    final /* synthetic */ fvt e;
    final /* synthetic */ dwm f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fvs(cxj cxjVar, float f, boolean z, fvt fvtVar, dwm dwmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cxjVar;
        this.c = f;
        this.d = z;
        this.e = fvtVar;
        this.f = dwmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fvs) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x007e, code lost:
    
        if (defpackage.hbd.a(r1, r2, r6, r3, r5) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0031, code lost:
    
        if (r6.e(r3, r5) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0080, code lost:
    
        return r0;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) {
        /*
            r5 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r5.a
            r2 = 1
            defpackage.ffci.b(r6)
            if (r1 == 0) goto Lc
            goto L81
        Lc:
            cxj r6 = r5.b
            java.lang.Object r6 = r6.c()
            jzq r6 = (defpackage.jzq) r6
            float r6 = r6.a
            float r1 = r5.c
            boolean r6 = defpackage.jzq.b(r6, r1)
            if (r6 != 0) goto L81
            boolean r6 = r5.d
            if (r6 != 0) goto L34
            cxj r6 = r5.b
            float r1 = r5.c
            jzq r3 = new jzq
            r3.<init>(r1)
            r5.a = r2
            java.lang.Object r6 = r6.e(r3, r5)
            if (r6 != r0) goto L81
            goto L80
        L34:
            cxj r6 = r5.b
            java.lang.Object r6 = r6.c()
            jzq r6 = (defpackage.jzq) r6
            float r6 = r6.a
            fvt r1 = r5.e
            float r1 = r1.b
            boolean r1 = defpackage.jzq.b(r6, r1)
            if (r1 == 0) goto L50
            dwp r6 = new dwp
            r1 = 0
            r6.<init>(r1)
            goto L71
        L50:
            fvt r1 = r5.e
            float r1 = r1.d
            boolean r1 = defpackage.jzq.b(r6, r1)
            if (r1 == 0) goto L60
            dwk r6 = new dwk
            r6.<init>()
            goto L71
        L60:
            fvt r1 = r5.e
            float r1 = r1.c
            boolean r6 = defpackage.jzq.b(r6, r1)
            if (r6 == 0) goto L70
            dwf r6 = new dwf
            r6.<init>()
            goto L71
        L70:
            r6 = 0
        L71:
            cxj r1 = r5.b
            float r2 = r5.c
            dwm r3 = r5.f
            r4 = 2
            r5.a = r4
            java.lang.Object r6 = defpackage.hbd.a(r1, r2, r6, r3, r5)
            if (r6 != r0) goto L81
        L80:
            return r0
        L81:
            ffcu r6 = defpackage.ffcu.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fvs.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new fvs(this.b, this.c, this.d, this.e, this.f, ffguVar);
    }
}
