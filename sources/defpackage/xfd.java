package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xfd extends ffhv implements ffjm {
    int a;
    final /* synthetic */ xfm b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xfd(xfm xfmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = xfmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xfd) c((ffxy) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        if (r1.fQ(r4, r3) == r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
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
            goto L38
        Ld:
            java.lang.Object r1 = r3.c
            ffxy r1 = (defpackage.ffxy) r1
            defpackage.ffci.b(r4)
            goto L2b
        L15:
            defpackage.ffci.b(r4)
            java.lang.Object r4 = r3.c
            r1 = r4
            ffxy r1 = (defpackage.ffxy) r1
            xfm r4 = r3.b
            r3.c = r1
            r3.a = r2
            dqza r4 = r4.g
            java.lang.Object r4 = r4.a(r3)
            if (r4 == r0) goto L3b
        L2b:
            r2 = 0
            r3.c = r2
            r2 = 2
            r3.a = r2
            java.lang.Object r4 = r1.fQ(r4, r3)
            if (r4 != r0) goto L38
            goto L3b
        L38:
            ffcu r4 = defpackage.ffcu.a
            return r4
        L3b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xfd.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        xfd xfdVar = new xfd(this.b, ffguVar);
        xfdVar.c = obj;
        return xfdVar;
    }
}
