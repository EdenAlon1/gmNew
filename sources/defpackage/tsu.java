package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tsu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ tst b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tsu(tst tstVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = tstVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tsu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0062, code lost:
    
        if (r4.a(r3) == r0) goto L15;
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
            int r1 = r3.a
            r2 = 1
            if (r1 == 0) goto L11
            if (r1 == r2) goto Ld
            defpackage.ffci.b(r4)
            goto L65
        Ld:
            defpackage.ffci.b(r4)     // Catch: defpackage.babn -> L68
            goto L3a
        L11:
            defpackage.ffci.b(r4)
            tst r4 = r3.b
            entd r4 = r4.c
            ensk r4 = r4.h()
            ensz r4 = (defpackage.ensz) r4
            java.lang.String r1 = "CmsDailySynclet retrieving linked account."
            r4.q(r1)
            tst r4 = r3.b     // Catch: defpackage.babn -> L68
            ffbr r4 = r4.a     // Catch: defpackage.babn -> L68
            java.lang.Object r4 = r4.b()     // Catch: defpackage.babn -> L68
            babf r4 = (defpackage.babf) r4     // Catch: defpackage.babn -> L68
            elfl r4 = r4.a()     // Catch: defpackage.babn -> L68
            r3.a = r2     // Catch: defpackage.babn -> L68
            java.lang.Object r4 = defpackage.fgfz.c(r4, r3)     // Catch: defpackage.babn -> L68
            if (r4 != r0) goto L3a
            goto L64
        L3a:
            eisx r4 = (defpackage.eisx) r4     // Catch: defpackage.babn -> L68
            tst r1 = r3.b
            entd r1 = r1.c
            ensk r1 = r1.h()
            ensz r1 = (defpackage.ensz) r1
            java.lang.String r2 = "CmsDailySynclet running tasks."
            r1.q(r2)
            tst r1 = r3.b
            android.content.Context r1 = r1.b
            java.lang.Class<tst$a> r2 = tst.a.class
            java.lang.Object r4 = defpackage.ekhv.a(r1, r2, r4)
            tst$a r4 = (tst.a) r4
            tta r4 = r4.d()
            r1 = 2
            r3.a = r1
            java.lang.Object r4 = r4.a(r3)
            if (r4 != r0) goto L65
        L64:
            return r0
        L65:
            ffcu r4 = defpackage.ffcu.a
            return r4
        L68:
            tst r4 = r3.b
            entd r4 = r4.c
            ensk r4 = r4.h()
            ensz r4 = (defpackage.ensz) r4
            java.lang.String r0 = "CmsDailySynclet retrieving linked account failed. Aborting."
            r4.q(r0)
            ffcu r4 = defpackage.ffcu.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tsu.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new tsu(this.b, ffguVar);
    }
}
