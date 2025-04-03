package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpfl extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dpfm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpfl(dpfm dpfmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dpfmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpfl) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0015, code lost:
    
        if (r4.a(r3) != r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0024, code lost:
    
        if (r4.invoke(r3) == r0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        return defpackage.ffcu.a;
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
            if (r1 == r2) goto L17
            goto L27
        Ld:
            dpfm r4 = r3.b
            r3.a = r2
            java.lang.Object r4 = r4.a(r3)
            if (r4 == r0) goto L2a
        L17:
            dpfm r4 = r3.b
            dpfo r4 = r4.c
            ffji r4 = r4.e
            r1 = 2
            r3.a = r1
            java.lang.Object r4 = r4.invoke(r3)
            if (r4 != r0) goto L27
            goto L2a
        L27:
            ffcu r4 = defpackage.ffcu.a
            return r4
        L2a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpfl.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dpfl(this.b, ffguVar);
    }
}
