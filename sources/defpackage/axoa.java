package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class axoa extends ffhv implements ffjm {
    int a;
    final /* synthetic */ elfl b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axoa(elfl elflVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = elflVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axoa) c((ffxy) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if (r1.fQ(r4, r3) == r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        if (r4 != r0) goto L9;
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
            if (r1 == 0) goto L15
            if (r1 == r2) goto Ld
            defpackage.ffci.b(r4)
            goto L36
        Ld:
            java.lang.Object r1 = r3.c
            ffxy r1 = (defpackage.ffxy) r1
            defpackage.ffci.b(r4)
            goto L29
        L15:
            defpackage.ffci.b(r4)
            java.lang.Object r4 = r3.c
            r1 = r4
            ffxy r1 = (defpackage.ffxy) r1
            elfl r4 = r3.b
            r3.c = r1
            r3.a = r2
            java.lang.Object r4 = defpackage.fgfz.c(r4, r3)
            if (r4 == r0) goto L39
        L29:
            r2 = 0
            r3.c = r2
            r2 = 2
            r3.a = r2
            java.lang.Object r4 = r1.fQ(r4, r3)
            if (r4 != r0) goto L36
            goto L39
        L36:
            ffcu r4 = defpackage.ffcu.a
            return r4
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axoa.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        axoa axoaVar = new axoa(this.b, ffguVar);
        axoaVar.c = obj;
        return axoaVar;
    }
}
