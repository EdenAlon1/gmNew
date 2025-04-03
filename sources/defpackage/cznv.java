package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cznv extends ffhv implements ffjm {
    final /* synthetic */ czns a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cznv(czns cznsVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = cznsVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cznv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0063, code lost:
    
        if (defpackage.aoqw.h(r1) == false) goto L15;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) {
        /*
            r8 = this;
            defpackage.ffci.b(r9)
            czns r9 = r8.a
            android.app.Activity r0 = r9.b
            android.content.Intent r0 = r0.getIntent()
            r0.getClass()
            java.lang.String r1 = r9.c(r0)
            ffbr r2 = r9.m
            java.lang.Object r2 = r2.b()
            czoi r2 = (defpackage.czoi) r2
            j$.util.Optional r2 = r2.b(r0)
            java.lang.Object r2 = defpackage.fflm.b(r2)
            java.lang.String r2 = (java.lang.String) r2
            android.net.Uri r3 = r0.getData()
            r4 = 0
            if (r3 == 0) goto L30
            java.lang.String r3 = r3.toString()
            goto L31
        L30:
            r3 = r4
        L31:
            java.lang.String r3 = defpackage.cskt.b(r3)
            entd r5 = defpackage.czns.a
            ensk r5 = r5.h()
            ensz r5 = (defpackage.ensz) r5
            java.lang.String r6 = defpackage.cskt.b(r2)
            java.lang.String r7 = "Deep Link '%s', bot: %s, shortCode: %s..."
            r5.J(r7, r3, r1, r6)
            if (r1 == 0) goto L65
            int r5 = r1.length()
            if (r5 != 0) goto L4f
            goto L65
        L4f:
            ffbr r5 = r9.n
            java.lang.Object r5 = r5.b()
            askf r5 = (defpackage.askf) r5
            boolean r5 = r5.a()
            if (r5 == 0) goto L6e
            cskc r5 = defpackage.cpdg.a
            boolean r5 = defpackage.aoqw.h(r1)
            if (r5 != 0) goto L6e
        L65:
            if (r2 == 0) goto Laa
            int r5 = r2.length()
            if (r5 != 0) goto L6e
            goto Laa
        L6e:
            if (r2 == 0) goto L78
            int r0 = r2.length()
            if (r0 != 0) goto L77
            goto L78
        L77:
            r1 = r2
        L78:
            r1.getClass()
            entd r0 = defpackage.czns.a
            ensk r0 = r0.h()
            ensz r0 = (defpackage.ensz) r0
            java.lang.String r2 = "Fetching Rbm Deep Link for: %s..."
            java.lang.String r3 = defpackage.cskt.b(r1)
            r0.t(r2, r3)
            ffbr r0 = r9.j
            java.lang.Object r0 = r0.b()
            ejwl r0 = (defpackage.ejwl) r0
            ffbr r2 = r9.k
            java.lang.Object r2 = r2.b()
            avhw r2 = (defpackage.avhw) r2
            avht r3 = new avht
            r3.<init>(r2, r1)
            czns$a r1 = new czns$a
            r1.<init>()
            r0.b(r3, r1)
            goto Ld6
        Laa:
            entd r2 = defpackage.czns.a
            ensk r2 = r2.j()
            ensz r2 = (defpackage.ensz) r2
            java.lang.String r5 = "Bot id or short code is not enabled/valid: %s"
            r2.t(r5, r3)
            ffbr r2 = r9.i
            java.lang.Object r2 = r2.b()
            avjf r2 = (defpackage.avjf) r2
            android.net.Uri r3 = r0.getData()
            if (r3 == 0) goto Lc9
            java.lang.String r4 = r3.getScheme()
        Lc9:
            java.lang.String r3 = "android.intent.extra.REFERRER"
            java.lang.String r0 = r0.getStringExtra(r3)
            r3 = 2
            r2.m(r3, r1, r4, r0)
            r9.g()
        Ld6:
            ffcu r9 = defpackage.ffcu.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cznv.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cznv(this.a, ffguVar);
    }
}
