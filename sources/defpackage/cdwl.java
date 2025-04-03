package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cdwl extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cdwo b;
    final /* synthetic */ eyhs c;
    final /* synthetic */ ceuw d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdwl(cdwo cdwoVar, eyhs eyhsVar, ceuw ceuwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cdwoVar;
        this.c = eyhsVar;
        this.d = ceuwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cdwl) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r6 != r0) goto L8;
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
            defpackage.ffci.b(r6)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L25
            return r6
        Ld:
            cdwo r6 = r5.b
            eyhs r1 = r5.c
            cdws r3 = r6.d
            babm r6 = r6.c
            int r1 = r3.a(r1)
            elfl r6 = r6.b(r1)
            r5.a = r2
            java.lang.Object r6 = defpackage.fgfz.c(r6, r5)
            if (r6 == r0) goto L3b
        L25:
            cdwo r1 = r5.b
            eisx r6 = (defpackage.eisx) r6
            r6.getClass()
            ceuw r2 = r5.d
            eyhs r3 = r5.c
            r4 = 2
            r5.a = r4
            java.lang.Object r6 = r1.m(r6, r2, r3, r5)
            if (r6 != r0) goto L3a
            goto L3b
        L3a:
            return r6
        L3b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdwl.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cdwl(this.b, this.c, this.d, ffguVar);
    }
}
