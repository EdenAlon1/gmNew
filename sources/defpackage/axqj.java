package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axqj extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ ffxx c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axqj(ffxx ffxxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = ffxxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axqj) c((ffxy) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004d, code lost:
    
        if (r2.fQ(r6, r5) == r0) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) {
        /*
            r5 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r5.b
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 == r2) goto Ld
            defpackage.ffci.b(r6)
            goto L50
        Ld:
            java.lang.Object r1 = r5.a
            java.lang.Object r2 = r5.d
            ffxy r2 = (defpackage.ffxy) r2
            defpackage.ffci.b(r6)
            goto L37
        L17:
            defpackage.ffci.b(r6)
            java.lang.Object r6 = r5.d
            ffxy r6 = (defpackage.ffxy) r6
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            ffxx r3 = r5.c
            axqi r4 = new axqi
            r4.<init>(r1, r6)
            r5.d = r6
            r5.a = r1
            r5.b = r2
            java.lang.Object r2 = r3.a(r4, r5)
            if (r2 == r0) goto L53
            r2 = r6
        L37:
            boolean r6 = r1.isEmpty()
            if (r6 != 0) goto L50
            java.util.List r6 = defpackage.ffdx.ak(r1)
            r1 = 0
            r5.d = r1
            r5.a = r1
            r1 = 2
            r5.b = r1
            java.lang.Object r6 = r2.fQ(r6, r5)
            if (r6 != r0) goto L50
            goto L53
        L50:
            ffcu r6 = defpackage.ffcu.a
            return r6
        L53:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axqj.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        axqj axqjVar = new axqj(this.c, ffguVar);
        axqjVar.d = obj;
        return axqjVar;
    }
}
