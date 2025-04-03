package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lbq extends ffhv implements ffjm {
    Object a;
    int b;
    /* synthetic */ boolean c;
    final /* synthetic */ lcc d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lbq(lcc lccVar, int i, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = lccVar;
        this.e = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((lbq) c(bool, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0022, code lost:
    
        if (r5 != r0) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0049  */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) {
        /*
            r4 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r4.b
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 == r2) goto Lf
            java.lang.Object r0 = r4.a
            defpackage.ffci.b(r5)
            goto L39
        Lf:
            boolean r1 = r4.c
            defpackage.ffci.b(r5)
            goto L24
        L15:
            defpackage.ffci.b(r5)
            boolean r1 = r4.c
            lcc r5 = r4.d
            r4.b = r2
            java.lang.Object r5 = r5.j(r4)
            if (r5 == r0) goto L53
        L24:
            if (r1 == 0) goto L43
            lcc r1 = r4.d
            lcs r1 = r1.c()
            r4.a = r5
            r2 = 2
            r4.b = r2
            java.lang.Object r1 = r1.d()
            if (r1 == r0) goto L53
            r0 = r5
            r5 = r1
        L39:
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r3 = r0
            r0 = r5
            r5 = r3
            goto L45
        L43:
            int r0 = r4.e
        L45:
            lah r1 = new lah
            if (r5 == 0) goto L4e
            int r2 = r5.hashCode()
            goto L4f
        L4e:
            r2 = 0
        L4f:
            r1.<init>(r5, r2, r0)
            return r1
        L53:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lbq.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        lbq lbqVar = new lbq(this.d, this.e, ffguVar);
        lbqVar.c = ((Boolean) obj).booleanValue();
        return lbqVar;
    }
}
