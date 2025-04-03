package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dsz extends ffhu implements ffjm {
    Object a;
    int b;
    final /* synthetic */ ffsk c;
    final /* synthetic */ ffjn d;
    final /* synthetic */ ffji e;
    final /* synthetic */ dqx f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsz(ffsk ffskVar, ffjn ffjnVar, ffji ffjiVar, dqx dqxVar, ffgu ffguVar) {
        super(ffguVar);
        this.c = ffskVar;
        this.d = ffjnVar;
        this.e = ffjiVar;
        this.f = dqxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dsz) c((iju) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x006f  */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) {
        /*
            r9 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r9.b
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1c
            if (r1 == r2) goto L12
            java.lang.Object r0 = r9.g
            ffud r0 = (defpackage.ffud) r0
            defpackage.ffci.b(r10)
            goto L6b
        L12:
            java.lang.Object r1 = r9.a
            java.lang.Object r2 = r9.g
            iju r2 = (defpackage.iju) r2
            defpackage.ffci.b(r10)
            goto L44
        L1c:
            defpackage.ffci.b(r10)
            java.lang.Object r10 = r9.g
            iju r10 = (defpackage.iju) r10
            ffsk r1 = r9.c
            ffjn r4 = defpackage.dtr.a
            dqx r4 = r9.f
            ffsm r5 = defpackage.ffsm.d
            dsy r6 = new dsy
            r6.<init>(r4, r3)
            ffud r1 = defpackage.ffqy.d(r1, r3, r5, r6, r2)
            r9.g = r10
            r9.a = r1
            r9.b = r2
            r2 = 3
            java.lang.Object r2 = defpackage.dtr.g(r10, r3, r9, r2)
            if (r2 == r0) goto L9a
            r8 = r2
            r2 = r10
            r10 = r8
        L44:
            iku r10 = (defpackage.iku) r10
            r10.b()
            ffjn r4 = r9.d
            ffjn r5 = defpackage.dtr.a
            if (r4 == r5) goto L5d
            ffsk r4 = r9.c
            ffjn r5 = r9.d
            dqx r6 = r9.f
            dsv r7 = new dsv
            r7.<init>(r5, r6, r10, r3)
            defpackage.dtr.j(r4, r1, r7)
        L5d:
            r9.g = r1
            r9.a = r3
            r10 = 2
            r9.b = r10
            java.lang.Object r10 = defpackage.dtr.l(r2, r9)
            if (r10 == r0) goto L9a
            r0 = r1
        L6b:
            iku r10 = (defpackage.iku) r10
            if (r10 != 0) goto L7c
            ffsk r10 = r9.c
            dqx r1 = r9.f
            dsw r2 = new dsw
            r2.<init>(r1, r3)
            defpackage.dtr.j(r10, r0, r2)
            goto L97
        L7c:
            r10.b()
            ffsk r1 = r9.c
            dqx r2 = r9.f
            dsx r4 = new dsx
            r4.<init>(r2, r3)
            defpackage.dtr.j(r1, r0, r4)
            ffji r0 = r9.e
            iak r1 = new iak
            long r2 = r10.c
            r1.<init>(r2)
            r0.invoke(r1)
        L97:
            ffcu r10 = defpackage.ffcu.a
            return r10
        L9a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsz.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dsz dszVar = new dsz(this.c, this.d, this.e, this.f, ffguVar);
        dszVar.g = obj;
        return dszVar;
    }
}
