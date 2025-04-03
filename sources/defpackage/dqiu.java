package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqiu extends ffhv implements ffjm {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ fgcl c;
    final /* synthetic */ dqiy d;
    final /* synthetic */ dqgm e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqiu(fgcl fgclVar, dqiy dqiyVar, dqgm dqgmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = fgclVar;
        this.d = dqiyVar;
        this.e = dqgmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqiu) c((dqij) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        if (r1.fQ(r6, r5) == r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        if (r6 != r0) goto L9;
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
            if (r1 == 0) goto L15
            if (r1 == r2) goto Ld
            defpackage.ffci.b(r6)
            goto L3b
        Ld:
            java.lang.Object r1 = r5.b
            fgcl r1 = (defpackage.fgcl) r1
            defpackage.ffci.b(r6)
            goto L2e
        L15:
            defpackage.ffci.b(r6)
            java.lang.Object r6 = r5.b
            dqij r6 = (defpackage.dqij) r6
            fgcl r1 = r5.c
            dqiy r3 = r5.d
            dqgm r4 = r5.e
            r5.b = r1
            r5.a = r2
            dqji r2 = r3.f
            java.lang.Object r6 = defpackage.dqji.g(r2, r6, r4, r5)
            if (r6 == r0) goto L3e
        L2e:
            r2 = 0
            r5.b = r2
            r2 = 2
            r5.a = r2
            java.lang.Object r6 = r1.fQ(r6, r5)
            if (r6 != r0) goto L3b
            goto L3e
        L3b:
            ffcu r6 = defpackage.ffcu.a
            return r6
        L3e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqiu.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dqiu dqiuVar = new dqiu(this.c, this.d, this.e, ffguVar);
        dqiuVar.b = obj;
        return dqiuVar;
    }
}
