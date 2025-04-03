package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqne extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ dqnf c;
    final /* synthetic */ String d;
    final /* synthetic */ ffjm e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqne(dqnf dqnfVar, String str, ffjm ffjmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = dqnfVar;
        this.d = str;
        this.e = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqne) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x005a  */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r12) {
        /*
            r11 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r11.b
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 == r2) goto L13
            java.lang.Object r0 = r11.a
            java.lang.Object r1 = r11.f
            ffsk r1 = (defpackage.ffsk) r1
            defpackage.ffci.b(r12)
            goto L56
        L13:
            java.lang.Object r1 = r11.f
            ffsk r1 = (defpackage.ffsk) r1
            defpackage.ffci.b(r12)
            goto L35
        L1b:
            defpackage.ffci.b(r12)
            java.lang.Object r12 = r11.f
            ffsk r12 = (defpackage.ffsk) r12
            dqnf r1 = r11.c
            java.lang.String r3 = r11.d
            r11.f = r12
            r11.b = r2
            dqok r1 = r1.a
            java.lang.Object r1 = r1.d(r3, r11)
            if (r1 == r0) goto L87
            r10 = r1
            r1 = r12
            r12 = r10
        L35:
            dqof r12 = (defpackage.dqof) r12
            if (r12 != 0) goto L41
            java.lang.String r12 = r11.d
            dqnr r2 = new dqnr
            r2.<init>(r12)
            r12 = r2
        L41:
            dqnf r2 = r11.c
            java.lang.String r3 = r11.d
            r11.f = r1
            r11.a = r12
            r4 = 2
            r11.b = r4
            dqok r2 = r2.a
            java.lang.Object r2 = r2.e(r3, r11)
            if (r2 == r0) goto L87
            r0 = r12
            r12 = r2
        L56:
            dqqj r12 = (defpackage.dqqj) r12
            if (r12 != 0) goto L66
            dqqh r12 = new dqqh
            r2 = r0
            dqof r2 = (defpackage.dqof) r2
            dqns r2 = r2.b()
            r12.<init>(r2)
        L66:
            r4 = r12
            dqrp r3 = new dqrp
            dqrl r7 = defpackage.dqrl.a
            r5 = r0
            dqof r5 = (defpackage.dqof) r5
            r8 = 0
            r9 = 20
            r6 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            boolean r12 = defpackage.ffsl.g(r1)
            if (r12 == 0) goto L84
            ffjm r12 = r11.e
            dqnf r0 = r11.c
            java.util.List r0 = r0.b
            r12.a(r0, r3)
        L84:
            ffcu r12 = defpackage.ffcu.a
            return r12
        L87:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqne.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dqne dqneVar = new dqne(this.c, this.d, this.e, ffguVar);
        dqneVar.f = obj;
        return dqneVar;
    }
}
