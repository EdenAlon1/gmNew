package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceyb extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ceyc b;
    final /* synthetic */ String c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ceyb(ffgu ffguVar, ceyc ceycVar, String str) {
        super(2, ffguVar);
        this.b = ceycVar;
        this.c = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ceyb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0088, code lost:
    
        if (r4.g(r1, r3) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0061, code lost:
    
        if (r4 != r0) goto L20;
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
            if (r1 == 0) goto L12
            if (r1 == r2) goto Le
            defpackage.ffci.b(r4)
            goto L8b
        Le:
            defpackage.ffci.b(r4)
            goto L63
        L12:
            defpackage.ffci.b(r4)
            java.lang.Object r4 = r3.d
            ffsk r4 = (defpackage.ffsk) r4
            cfup r4 = defpackage.ceyc.a
            java.lang.Object r4 = r4.e()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L2a
            cexh r4 = defpackage.cexh.b
            return r4
        L2a:
            ceyc r4 = r3.b
            ffbr r4 = r4.b
            java.lang.Object r4 = r4.b()
            java.util.Map r4 = (java.util.Map) r4
            java.lang.String r1 = r3.c
            java.lang.Object r4 = r4.get(r1)
            ffbr r4 = (defpackage.ffbr) r4
            if (r4 != 0) goto L46
            ceyc r4 = r3.b
            java.lang.String r1 = r3.c
            ffbr r4 = r4.h(r1)
        L46:
            java.lang.Object r4 = r4.b()
            ceve r4 = (defpackage.ceve) r4
            cety r4 = r4.a()
            cetj r4 = (defpackage.cetj) r4
            boolean r4 = r4.j
            if (r4 != 0) goto L59
            cexh r4 = defpackage.cexh.a
            return r4
        L59:
            ceyc r4 = r3.b
            r3.a = r2
            java.lang.Object r4 = r4.f(r3)
            if (r4 == r0) goto L8e
        L63:
            java.lang.String r1 = r3.c
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r4 = r4.get(r1)
            cexh r1 = defpackage.cexh.b
            if (r4 != r1) goto L70
            return r1
        L70:
            cfup r4 = defpackage.ceyc.a
            java.lang.String r4 = r3.c
            boolean r4 = defpackage.cexo.a(r4)
            if (r4 == 0) goto L7d
            cexh r4 = defpackage.cexh.a
            return r4
        L7d:
            ceyc r4 = r3.b
            java.lang.String r1 = r3.c
            r2 = 2
            r3.a = r2
            java.lang.Object r4 = r4.g(r1, r3)
            if (r4 != r0) goto L8b
            goto L8e
        L8b:
            cexh r4 = defpackage.cexh.b
            return r4
        L8e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ceyb.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ceyb ceybVar = new ceyb(ffguVar, this.b, this.c);
        ceybVar.d = obj;
        return ceybVar;
    }
}
