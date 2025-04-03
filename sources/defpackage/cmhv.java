package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cmhv extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cmii b;
    final /* synthetic */ djrm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmhv(cmii cmiiVar, djrm djrmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cmiiVar;
        this.c = djrmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmhv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0080, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x007a, code lost:
    
        r6.b.k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x007f, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        if (r7 != r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x001e, code lost:
    
        if (r7 != r0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
    
        if (r1 != 2) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0044, code lost:
    
        r7 = r6.b;
        r1 = r6.c;
        r2 = defpackage.eykm.d(((defpackage.cqoh) r7.l.b()).f().toEpochMilli());
        r2.getClass();
        r6.a = 3;
        r7 = defpackage.ffra.a(defpackage.ekxi.a(r7.f), new defpackage.cmhz(null, r7, r1, r2), r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0073, code lost:
    
        if (r7 == defpackage.ffhh.a) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0075, code lost:
    
        r7 = defpackage.ffcu.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0077, code lost:
    
        if (r7 != r0) goto L19;
     */
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
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L11
            defpackage.ffci.b(r7)
            if (r1 == r4) goto L20
            if (r1 == r2) goto L44
            goto L7a
        L11:
            defpackage.ffci.b(r7)
            cmii r7 = r6.b
            djrm r1 = r6.c
            r6.a = r4
            java.lang.Object r7 = r7.r(r1, r6)
            if (r7 == r0) goto L80
        L20:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            cmii r1 = r6.b
            djrm r5 = r6.c
            int r7 = r7 + r4
            r6.a = r2
            ffhd r2 = r1.f
            ffhd r2 = defpackage.ekxi.a(r2)
            cmhx r4 = new cmhx
            r4.<init>(r3, r1, r5, r7)
            java.lang.Object r7 = defpackage.ffra.a(r2, r4, r6)
            ffhh r1 = defpackage.ffhh.a
            if (r7 == r1) goto L42
            ffcu r7 = defpackage.ffcu.a
        L42:
            if (r7 == r0) goto L80
        L44:
            cmii r7 = r6.b
            djrm r1 = r6.c
            ffbr r2 = r7.l
            java.lang.Object r2 = r2.b()
            cqoh r2 = (defpackage.cqoh) r2
            j$.time.Instant r2 = r2.f()
            long r4 = r2.toEpochMilli()
            eyja r2 = defpackage.eykm.d(r4)
            r2.getClass()
            r4 = 3
            r6.a = r4
            ffhd r4 = r7.f
            ffhd r4 = defpackage.ekxi.a(r4)
            cmhz r5 = new cmhz
            r5.<init>(r3, r7, r1, r2)
            java.lang.Object r7 = defpackage.ffra.a(r4, r5, r6)
            ffhh r1 = defpackage.ffhh.a
            if (r7 == r1) goto L77
            ffcu r7 = defpackage.ffcu.a
        L77:
            if (r7 != r0) goto L7a
            goto L80
        L7a:
            cmii r7 = r6.b
            r7.k()
            return r3
        L80:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmhv.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cmhv(this.b, this.c, ffguVar);
    }
}
