package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cusv extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cutc b;
    final /* synthetic */ cujo c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cusv(ffgu ffguVar, cutc cutcVar, cujo cujoVar) {
        super(2, ffguVar);
        this.b = cutcVar;
        this.c = cujoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cusv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        if (r9 == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0022, code lost:
    
        if (r9 != r0) goto L9;
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
            if (r1 == 0) goto L11
            if (r1 == r2) goto Ld
            defpackage.ffci.b(r9)
            goto L3b
        Ld:
            defpackage.ffci.b(r9)
            goto L24
        L11:
            defpackage.ffci.b(r9)
            java.lang.Object r9 = r8.d
            ffsk r9 = (defpackage.ffsk) r9
            cutc r9 = r8.b
            cujo r1 = r8.c
            r8.a = r2
            java.lang.Object r9 = r9.l(r1)
            if (r9 == r0) goto L5e
        L24:
            java.util.List r9 = (java.util.List) r9
            if (r9 != 0) goto L2d
            cukp r9 = defpackage.cuko.a()
            return r9
        L2d:
            cutc r1 = r8.b
            cujo r2 = r8.c
            r3 = 2
            r8.a = r3
            java.lang.Object r9 = r1.i(r2, r9, r8)
            if (r9 != r0) goto L3b
            goto L5e
        L3b:
            cusu r9 = (defpackage.cusu) r9
            r0 = 0
            if (r9 != 0) goto L57
            cukp r1 = new cukp
            erer r2 = defpackage.erer.NO_VERDICT
            cula r3 = defpackage.cula.a
            cfva r9 = defpackage.cutc.a
            erer r9 = defpackage.erer.NO_VERDICT
            r4 = 6
            java.lang.Integer r5 = defpackage.cust.c(r9, r0, r4)
            r6 = 0
            r7 = 20
            r4 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
        L57:
            r1 = 0
            r2 = 3
            cukp r9 = defpackage.cusu.a(r9, r0, r1, r2)
            return r9
        L5e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cusv.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cusv cusvVar = new cusv(ffguVar, this.b, this.c);
        cusvVar.d = obj;
        return cusvVar;
    }
}
