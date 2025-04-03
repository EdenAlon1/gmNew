package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esuc extends ffhv implements ffji {
    Object a;
    int b;
    final /* synthetic */ esun c;
    final /* synthetic */ String d;
    final /* synthetic */ fcek e;
    final /* synthetic */ ests f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public esuc(esun esunVar, String str, fcek fcekVar, ests estsVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.c = esunVar;
        this.d = str;
        this.e = fcekVar;
        this.f = estsVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0017, code lost:
    
        if (r4 != r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003f, code lost:
    
        if (r4 == r0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x004d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004c, code lost:
    
        return defpackage.ffdx.T(defpackage.esun.r((defpackage.fcaf) r4));
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r4) {
        /*
            r3 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r3.b
            r2 = 1
            defpackage.ffci.b(r4)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L19
            goto L42
        Ld:
            esun r4 = r3.c
            java.lang.String r1 = r3.d
            r3.b = r2
            java.lang.Object r4 = defpackage.esun.l(r4, r1, r3)
            if (r4 == r0) goto L4d
        L19:
            fcek r1 = r3.e
            fcfo r4 = (defpackage.fcfo) r4
            java.util.List r1 = defpackage.ffdx.b(r1)
            fcad r4 = defpackage.esti.a(r4, r1)
            esun r1 = r3.c
            ests r2 = r3.f
            esrg r1 = r1.b
            fatc r2 = r2.b()
            r1.a(r2)
            esun r1 = r3.c
            r3.a = r1
            r2 = 2
            r3.b = r2
            essk r1 = r1.a
            java.lang.Object r4 = r1.h(r4, r3)
            if (r4 != r0) goto L42
            goto L4d
        L42:
            fcaf r4 = (defpackage.fcaf) r4
            java.util.List r4 = defpackage.esun.r(r4)
            java.lang.Object r4 = defpackage.ffdx.T(r4)
            return r4
        L4d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.esuc.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new esuc(this.c, this.d, this.e, this.f, (ffgu) obj).b(ffcu.a);
    }
}
