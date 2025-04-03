package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ldb extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ ldc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ldb(ldc ldcVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = ldcVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ldb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        if (r5 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        if (r1.a(r5, r4) != r0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0041 -> B:5:0x0043). Please report as a decompilation issue!!! */
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
            if (r1 == 0) goto L13
            if (r1 == r2) goto Ld
            defpackage.ffci.b(r5)
            goto L43
        Ld:
            java.lang.Object r1 = r4.a
            defpackage.ffci.b(r5)
            goto L37
        L13:
            defpackage.ffci.b(r5)
            ldc r5 = r4.c
            lad r5 = r5.d
            int r5 = r5.a()
            if (r5 <= 0) goto L54
        L20:
            ldc r5 = r4.c
            ffsk r5 = r5.a
            defpackage.ffsl.f(r5)
            ldc r5 = r4.c
            ffjm r1 = r5.b
            r4.a = r1
            r4.b = r2
            ffwm r5 = r5.c
            java.lang.Object r5 = r5.i(r4)
            if (r5 == r0) goto L53
        L37:
            r3 = 0
            r4.a = r3
            r3 = 2
            r4.b = r3
            java.lang.Object r5 = r1.a(r5, r4)
            if (r5 == r0) goto L53
        L43:
            ldc r5 = r4.c
            lad r5 = r5.d
            java.util.concurrent.atomic.AtomicInteger r5 = r5.a
            int r5 = r5.decrementAndGet()
            if (r5 == 0) goto L50
            goto L20
        L50:
            ffcu r5 = defpackage.ffcu.a
            return r5
        L53:
            return r0
        L54:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ldb.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ldb(this.c, ffguVar);
    }
}
