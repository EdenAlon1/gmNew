package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfif extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cfim b;
    final /* synthetic */ String c;
    final /* synthetic */ cfhz d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfif(ffgu ffguVar, cfim cfimVar, String str, cfhz cfhzVar) {
        super(2, ffguVar);
        this.b = cfimVar;
        this.c = str;
        this.d = cfhzVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cfif) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
    
        if (r5.c(r1, r3, r4) != r0) goto L10;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) {
        /*
            r4 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r4.a
            r2 = 1
            if (r1 == 0) goto L11
            if (r1 == r2) goto Ld
            defpackage.ffci.b(r5)
            return r5
        Ld:
            defpackage.ffci.b(r5)
            goto L26
        L11:
            defpackage.ffci.b(r5)
            java.lang.Object r5 = r4.e
            ffsk r5 = (defpackage.ffsk) r5
            cfim r5 = r4.b
            java.lang.String r1 = r4.c
            cfhz r3 = r4.d
            r4.a = r2
            java.lang.Object r5 = r5.c(r1, r3, r4)
            if (r5 == r0) goto L35
        L26:
            cfim r5 = r4.b
            java.lang.String r1 = r4.c
            r2 = 2
            r4.a = r2
            java.lang.Object r5 = r5.a(r1, r4)
            if (r5 != r0) goto L34
            goto L35
        L34:
            return r5
        L35:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfif.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cfif cfifVar = new cfif(ffguVar, this.b, this.c, this.d);
        cfifVar.e = obj;
        return cfifVar;
    }
}
