package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class epi extends ffhv implements ffjm {
    int a;
    final /* synthetic */ epm b;
    final /* synthetic */ ioc c;
    final /* synthetic */ ffix d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public epi(epm epmVar, ioc iocVar, ffix ffixVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = epmVar;
        this.c = iocVar;
        this.d = ffixVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((epi) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00ce, code lost:
    
        if (r13 != defpackage.ffhh.a) goto L35;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r13) {
        /*
            r12 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r12.a
            defpackage.ffci.b(r13)
            if (r1 == 0) goto Lb
            goto Ld5
        Lb:
            epm r13 = r12.b
            ioc r1 = r12.c
            ffix r2 = r12.d
            eph r3 = new eph
            r3.<init>(r13, r1, r2)
            r1 = 1
            r12.a = r1
            java.lang.Object r2 = r3.invoke()
            if (r2 == 0) goto Ld0
            epg r13 = r13.a
            dmt r13 = (defpackage.dmt) r13
            iam r2 = (defpackage.iam) r2
            boolean r2 = defpackage.dmt.l(r13, r2)
            if (r2 != 0) goto Ld0
            ffrh r2 = new ffrh
            ffgu r4 = defpackage.ffhi.c(r12)
            r2.<init>(r4, r1)
            r2.B()
            dmo r4 = new dmo
            r4.<init>(r3, r2)
            dmg r3 = r13.e
            ffix r5 = r4.a
            java.lang.Object r5 = r5.invoke()
            if (r5 != 0) goto L4f
            ffrf r13 = r4.b
            ffcu r1 = defpackage.ffcu.a
            r13.w(r1)
            goto Lc8
        L4f:
            ffrf r6 = r4.b
            dmf r7 = new dmf
            r7.<init>(r3, r4)
            r6.d(r7)
            hne r6 = r3.a
            int r6 = r6.b
            r7 = 0
            ffmj r6 = defpackage.ffmk.q(r7, r6)
            int r8 = r6.a
            int r6 = r6.b
            if (r8 > r6) goto Lbc
        L68:
            hne r9 = r3.a
            java.lang.Object[] r9 = r9.a
            r9 = r9[r6]
            dmo r9 = (defpackage.dmo) r9
            ffix r9 = r9.a
            java.lang.Object r9 = r9.invoke()
            if (r9 != 0) goto L79
            goto Lb7
        L79:
            r10 = r9
            iam r10 = (defpackage.iam) r10
            r11 = r5
            iam r11 = (defpackage.iam) r11
            iam r10 = r11.d(r10)
            boolean r11 = defpackage.ffkj.e(r10, r5)
            if (r11 == 0) goto L90
            hne r3 = r3.a
            int r6 = r6 + r1
            r3.f(r6, r4)
            goto Lc1
        L90:
            boolean r9 = defpackage.ffkj.e(r10, r9)
            if (r9 != 0) goto Lb7
            java.util.concurrent.CancellationException r9 = new java.util.concurrent.CancellationException
            java.lang.String r10 = "bringIntoView call interrupted by a newer, non-overlapping call"
            r9.<init>(r10)
            hne r10 = r3.a
            int r10 = r10.b
            int r10 = r10 + (-1)
            if (r10 > r6) goto Lb7
        La5:
            hne r11 = r3.a
            java.lang.Object[] r11 = r11.a
            r11 = r11[r6]
            dmo r11 = (defpackage.dmo) r11
            ffrf r11 = r11.b
            r11.h(r9)
            if (r10 == r6) goto Lb7
            int r10 = r10 + 1
            goto La5
        Lb7:
            if (r6 == r8) goto Lbc
            int r6 = r6 + (-1)
            goto L68
        Lbc:
            hne r1 = r3.a
            r1.f(r7, r4)
        Lc1:
            boolean r1 = r13.j
            if (r1 != 0) goto Lc8
            r13.g()
        Lc8:
            java.lang.Object r13 = r2.m()
            ffhh r1 = defpackage.ffhh.a
            if (r13 == r1) goto Ld2
        Ld0:
            ffcu r13 = defpackage.ffcu.a
        Ld2:
            if (r13 != r0) goto Ld5
            return r0
        Ld5:
            ffcu r13 = defpackage.ffcu.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.epi.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new epi(this.b, this.c, this.d, ffguVar);
    }
}
