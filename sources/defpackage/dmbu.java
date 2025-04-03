package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmbu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ qfn b;
    final /* synthetic */ boolean c;
    final /* synthetic */ qgp d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmbu(qfn qfnVar, boolean z, qgp qgpVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = qfnVar;
        this.c = z;
        this.d = qgpVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmbu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0015, code lost:
    
        if (defpackage.qfx.b(r11, r10) != r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0035, code lost:
    
        if (defpackage.qfm.a(r1, r2, 1, 0.0f, null, r6, null, r10, 1850) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003b, code lost:
    
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
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L17
            goto L38
        Ld:
            qfn r11 = r10.b
            r10.a = r2
            java.lang.Object r11 = defpackage.qfx.b(r11, r10)
            if (r11 == r0) goto L3b
        L17:
            boolean r11 = r10.c
            if (r11 != 0) goto L38
            qfn r1 = r10.b
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
            if (r11 != r0) goto L38
            goto L3b
        L38:
            ffcu r11 = defpackage.ffcu.a
            return r11
        L3b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmbu.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dmbu(this.b, this.c, this.d, ffguVar);
    }
}
