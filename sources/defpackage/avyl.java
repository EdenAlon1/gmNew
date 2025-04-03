package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avyl extends ffhv implements ffjm {
    int a;
    final /* synthetic */ awan b;
    final /* synthetic */ avzh c;
    final /* synthetic */ awap d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avyl(ffgu ffguVar, awan awanVar, avzh avzhVar, awap awapVar) {
        super(2, ffguVar);
        this.b = awanVar;
        this.c = avzhVar;
        this.d = awapVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avyl) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0044, code lost:
    
        if (r5.c.g(r1, r4) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
    
        if (r5.c.c(r4) != r0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0029, code lost:
    
        if (r5.a.b(r4) != r0) goto L11;
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
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L18
            if (r1 == r3) goto L14
            if (r1 == r2) goto L10
            defpackage.ffci.b(r5)
            goto L47
        L10:
            defpackage.ffci.b(r5)
            goto L37
        L14:
            defpackage.ffci.b(r5)
            goto L2b
        L18:
            defpackage.ffci.b(r5)
            java.lang.Object r5 = r4.e
            ffsk r5 = (defpackage.ffsk) r5
            awan r5 = r4.b
            r4.a = r3
            awat r5 = r5.a
            java.lang.Object r5 = r5.b(r4)
            if (r5 == r0) goto L4a
        L2b:
            awan r5 = r4.b
            r4.a = r2
            ffss r5 = r5.c
            java.lang.Object r5 = r5.c(r4)
            if (r5 == r0) goto L4a
        L37:
            avzh r5 = r4.c
            awap r1 = r4.d
            r2 = 3
            r4.a = r2
            awcz r5 = r5.c
            java.lang.Object r5 = r5.g(r1, r4)
            if (r5 != r0) goto L47
            goto L4a
        L47:
            ffcu r5 = defpackage.ffcu.a
            return r5
        L4a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avyl.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        avyl avylVar = new avyl(ffguVar, this.b, this.c, this.d);
        avylVar.e = obj;
        return avylVar;
    }
}
