package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alpt extends ffhv implements ffjm {
    int a;
    final /* synthetic */ alqf b;
    final /* synthetic */ int c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alpt(ffgu ffguVar, alqf alqfVar, int i) {
        super(2, ffguVar);
        this.b = alqfVar;
        this.c = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((alpt) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        if (defpackage.ctzl.b(r1.a, r3, r4) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
    
        if (r5 != r0) goto L9;
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
            goto L3f
        Ld:
            defpackage.ffci.b(r5)
            goto L22
        L11:
            defpackage.ffci.b(r5)
            java.lang.Object r5 = r4.d
            ffsk r5 = (defpackage.ffsk) r5
            alqf r5 = r4.b
            r4.a = r2
            java.lang.Object r5 = r5.a(r4)
            if (r5 == r0) goto L42
        L22:
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L3f
            alqf r1 = r4.b
            int r2 = r4.c
            int r5 = r5.intValue()
            alpu r3 = new alpu
            r3.<init>(r5, r2)
            r5 = 2
            r4.a = r5
            effy r5 = r1.a
            java.lang.Object r5 = defpackage.ctzl.b(r5, r3, r4)
            if (r5 != r0) goto L3f
            goto L42
        L3f:
            ffcu r5 = defpackage.ffcu.a
            return r5
        L42:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alpt.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        alpt alptVar = new alpt(ffguVar, this.b, this.c);
        alptVar.d = obj;
        return alptVar;
    }
}
