package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gls extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cxj b;
    final /* synthetic */ float c;
    final /* synthetic */ boolean d;
    final /* synthetic */ dwm e;
    final /* synthetic */ hho f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gls(cxj cxjVar, float f, boolean z, dwm dwmVar, hho hhoVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cxjVar;
        this.c = f;
        this.d = z;
        this.e = dwmVar;
        this.f = hhoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gls) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        if (defpackage.hbd.a(r1, r2, r6, r3, r5) == r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0030, code lost:
    
        if (r6.e(r3, r5) == r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004a, code lost:
    
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
            if (r1 == 0) goto Lb
            goto L4b
        Lb:
            cxj r6 = r5.b
            java.lang.Object r6 = r6.c()
            jzq r6 = (defpackage.jzq) r6
            float r6 = r6.a
            float r1 = r5.c
            boolean r6 = defpackage.jzq.b(r6, r1)
            if (r6 != 0) goto L52
            boolean r6 = r5.d
            if (r6 != 0) goto L33
            cxj r6 = r5.b
            float r1 = r5.c
            jzq r3 = new jzq
            r3.<init>(r1)
            r5.a = r2
            java.lang.Object r6 = r6.e(r3, r5)
            if (r6 != r0) goto L4b
            goto L4a
        L33:
            hho r6 = r5.f
            java.lang.Object r6 = r6.a()
            dwm r6 = (defpackage.dwm) r6
            cxj r1 = r5.b
            float r2 = r5.c
            dwm r3 = r5.e
            r4 = 2
            r5.a = r4
            java.lang.Object r6 = defpackage.hbd.a(r1, r2, r6, r3, r5)
            if (r6 != r0) goto L4b
        L4a:
            return r0
        L4b:
            hho r6 = r5.f
            dwm r0 = r5.e
            r6.b(r0)
        L52:
            ffcu r6 = defpackage.ffcu.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gls.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new gls(this.b, this.c, this.d, this.e, this.f, ffguVar);
    }
}
