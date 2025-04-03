package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oek extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ ffxx c;
    final /* synthetic */ ffjn d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oek(ffxx ffxxVar, ffjn ffjnVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = ffxxVar;
        this.d = ffjnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((oek) c((ffxy) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004b, code lost:
    
        if (r7.a(r5, r6) == r0) goto L15;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) {
        /*
            r6 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r6.b
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L18
            if (r1 == r2) goto Le
            defpackage.ffci.b(r7)
            goto L4e
        Le:
            java.lang.Object r1 = r6.a
            java.lang.Object r2 = r6.e
            ffxy r2 = (defpackage.ffxy) r2
            defpackage.ffci.b(r7)
            goto L35
        L18:
            defpackage.ffci.b(r7)
            java.lang.Object r7 = r6.e
            ffxy r7 = (defpackage.ffxy) r7
            fflb r1 = new fflb
            r1.<init>()
            r1.a = r3
            java.lang.Object r4 = r1.a
            r6.e = r7
            r6.a = r1
            r6.b = r2
            java.lang.Object r2 = r7.fQ(r4, r6)
            if (r2 == r0) goto L51
            r2 = r7
        L35:
            ffxx r7 = r6.c
            ffjn r4 = r6.d
            oej r5 = new oej
            fflb r1 = (defpackage.fflb) r1
            r5.<init>(r1, r4, r2)
            r6.e = r3
            r6.a = r3
            r1 = 2
            r6.b = r1
            java.lang.Object r7 = r7.a(r5, r6)
            if (r7 != r0) goto L4e
            goto L51
        L4e:
            ffcu r7 = defpackage.ffcu.a
            return r7
        L51:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oek.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        oek oekVar = new oek(this.c, this.d, ffguVar);
        oekVar.e = obj;
        return oekVar;
    }
}
