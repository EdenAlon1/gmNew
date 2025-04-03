package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class douv extends ffhu implements ffjm {
    int a;
    final /* synthetic */ ffsk b;
    final /* synthetic */ boolean c;
    final /* synthetic */ ffji d;
    final /* synthetic */ dovc e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public douv(ffsk ffskVar, boolean z, ffji ffjiVar, dovc dovcVar, ffgu ffguVar) {
        super(ffguVar);
        this.b = ffskVar;
        this.c = z;
        this.d = ffjiVar;
        this.e = dovcVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((douv) c((iju) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x003a, code lost:
    
        if (defpackage.dtr.g(r1, null, r8, 2) != r0) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0077 A[Catch: ikl -> 0x009b, TryCatch #0 {ikl -> 0x009b, blocks: (B:6:0x000e, B:7:0x0066, B:9:0x006a, B:13:0x0077, B:15:0x0098, B:16:0x0012, B:17:0x0058, B:19:0x003c, B:21:0x0040, B:25:0x005b), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006a A[Catch: ikl -> 0x009b, TryCatch #0 {ikl -> 0x009b, blocks: (B:6:0x000e, B:7:0x0066, B:9:0x006a, B:13:0x0077, B:15:0x0098, B:16:0x0012, B:17:0x0058, B:19:0x003c, B:21:0x0040, B:25:0x005b), top: B:2:0x0008 }] */
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
            r3 = 2
            r4 = 3
            r5 = 0
            if (r1 == 0) goto L1e
            if (r1 == r2) goto L16
            if (r1 == r3) goto L12
            defpackage.ffci.b(r9)     // Catch: defpackage.ikl -> L9b
            goto L66
        L12:
            defpackage.ffci.b(r9)     // Catch: defpackage.ikl -> L9b
            goto L58
        L16:
            java.lang.Object r1 = r8.f
            iju r1 = (defpackage.iju) r1
            defpackage.ffci.b(r9)
            goto L3c
        L1e:
            defpackage.ffci.b(r9)
            java.lang.Object r9 = r8.f
            r1 = r9
            iju r1 = (defpackage.iju) r1
            ffsk r9 = r8.b
            dovc r6 = r8.e
            dour r7 = new dour
            r7.<init>(r6, r5)
            defpackage.ffqy.d(r9, r5, r5, r7, r4)
            r8.f = r1
            r8.a = r2
            java.lang.Object r9 = defpackage.dtr.g(r1, r5, r8, r3)
            if (r9 == r0) goto L9e
        L3c:
            boolean r9 = r8.c     // Catch: defpackage.ikl -> L9b
            if (r9 == 0) goto L5b
            jgi r9 = r1.q()     // Catch: defpackage.ikl -> L9b
            long r6 = r9.f()     // Catch: defpackage.ikl -> L9b
            douu r9 = new douu     // Catch: defpackage.ikl -> L9b
            r9.<init>(r5)     // Catch: defpackage.ikl -> L9b
            r8.f = r5     // Catch: defpackage.ikl -> L9b
            r8.a = r3     // Catch: defpackage.ikl -> L9b
            java.lang.Object r9 = r1.s(r6, r9, r8)     // Catch: defpackage.ikl -> L9b
            if (r9 != r0) goto L58
            goto L9e
        L58:
            iku r9 = (defpackage.iku) r9     // Catch: defpackage.ikl -> L9b
            goto L68
        L5b:
            r8.f = r5     // Catch: defpackage.ikl -> L9b
            r8.a = r4     // Catch: defpackage.ikl -> L9b
            java.lang.Object r9 = defpackage.douy.b(r1, r8)     // Catch: defpackage.ikl -> L9b
            if (r9 != r0) goto L66
            goto L9e
        L66:
            iku r9 = (defpackage.iku) r9     // Catch: defpackage.ikl -> L9b
        L68:
            if (r9 != 0) goto L77
            ffsk r9 = r8.b     // Catch: defpackage.ikl -> L9b
            dous r0 = new dous     // Catch: defpackage.ikl -> L9b
            dovc r1 = r8.e     // Catch: defpackage.ikl -> L9b
            r0.<init>(r1, r5)     // Catch: defpackage.ikl -> L9b
            defpackage.ffqy.d(r9, r5, r5, r0, r4)     // Catch: defpackage.ikl -> L9b
            goto L9b
        L77:
            ffsk r0 = r8.b     // Catch: defpackage.ikl -> L9b
            dout r1 = new dout     // Catch: defpackage.ikl -> L9b
            dovc r2 = r8.e     // Catch: defpackage.ikl -> L9b
            r1.<init>(r2, r5)     // Catch: defpackage.ikl -> L9b
            defpackage.ffqy.d(r0, r5, r5, r1, r4)     // Catch: defpackage.ikl -> L9b
            ffji r0 = r8.d     // Catch: defpackage.ikl -> L9b
            long r1 = r9.c     // Catch: defpackage.ikl -> L9b
            iak r3 = new iak     // Catch: defpackage.ikl -> L9b
            r3.<init>(r1)     // Catch: defpackage.ikl -> L9b
            java.lang.Object r0 = r0.invoke(r3)     // Catch: defpackage.ikl -> L9b
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: defpackage.ikl -> L9b
            boolean r0 = r0.booleanValue()     // Catch: defpackage.ikl -> L9b
            if (r0 == 0) goto L9b
            r9.b()     // Catch: defpackage.ikl -> L9b
        L9b:
            ffcu r9 = defpackage.ffcu.a
            return r9
        L9e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.douv.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        douv douvVar = new douv(this.b, this.c, this.d, this.e, ffguVar);
        douvVar.f = obj;
        return douvVar;
    }
}
