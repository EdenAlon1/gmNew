package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmbv extends ffhv implements ffjm {
    int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ qfn c;
    final /* synthetic */ qgp d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmbv(boolean z, qfn qfnVar, qgp qgpVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = z;
        this.c = qfnVar;
        this.d = qgpVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmbv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
    
        if (defpackage.qfm.a(r1, r2, 1, 0.0f, null, r6, null, r10, 1850) == r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        if (defpackage.qfm.b(r1, r11, r3, r10, 8) == r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0042, code lost:
    
        return r0;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r11) {
        /*
            r10 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r10.a
            r2 = 1
            defpackage.ffci.b(r11)
            if (r1 == 0) goto Lb
            goto L43
        Lb:
            boolean r11 = r10.b
            if (r11 == 0) goto L26
            qgp r11 = r10.d
            qfn r1 = r10.c
            qci r11 = r11.a()
            float r3 = r1.e()
            r10.a = r2
            r2 = 8
            java.lang.Object r11 = defpackage.qfm.b(r1, r11, r3, r10, r2)
            if (r11 != r0) goto L43
            goto L42
        L26:
            qfn r1 = r10.c
            qgp r11 = r10.d
            qci r2 = r11.a()
            float r6 = r1.e()
            r11 = 2
            r10.a = r11
            r7 = 0
            r9 = 1850(0x73a, float:2.592E-42)
            r3 = 1
            r4 = 0
            r5 = 0
            r8 = r10
            java.lang.Object r11 = defpackage.qfm.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r11 != r0) goto L43
        L42:
            return r0
        L43:
            ffcu r11 = defpackage.ffcu.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmbv.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dmbv(this.b, this.c, this.d, ffguVar);
    }
}
