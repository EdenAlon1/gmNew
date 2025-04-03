package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aeqy extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aerc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeqy(aerc aercVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aercVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aeqy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        r3.b.f(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0017, code lost:
    
        if (r4 != r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002c, code lost:
    
        if (r4.b.b(r3) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0038, code lost:
    
        return r0;
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
            defpackage.ffci.b(r4)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L19
            goto L2f
        Ld:
            aerc r4 = r3.b
            r3.a = r2
            aerd r4 = r4.b
            java.lang.Object r4 = r4.c(r3)
            if (r4 == r0) goto L38
        L19:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L35
            aerc r4 = r3.b
            r1 = 2
            r3.a = r1
            aerd r4 = r4.b
            java.lang.Object r4 = r4.b(r3)
            if (r4 != r0) goto L2f
            goto L38
        L2f:
            aerc r4 = r3.b
            r0 = 0
            r4.f(r0)
        L35:
            ffcu r4 = defpackage.ffcu.a
            return r4
        L38:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeqy.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aeqy(this.b, ffguVar);
    }
}
