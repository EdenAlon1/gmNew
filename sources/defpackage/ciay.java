package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ciay extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ciax b;
    final /* synthetic */ fcek c;
    final /* synthetic */ Object d;
    final /* synthetic */ ffji e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ciay(ffgu ffguVar, ciax ciaxVar, fcek fcekVar, Object obj, ffji ffjiVar) {
        super(2, ffguVar);
        this.b = ciaxVar;
        this.c = fcekVar;
        this.d = obj;
        this.e = ffjiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ciay) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        if (r10 != r0) goto L10;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) {
        /*
            r9 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r9.a
            r2 = 1
            if (r1 == 0) goto L11
            if (r1 == r2) goto Ld
            defpackage.ffci.b(r10)
            return r10
        Ld:
            defpackage.ffci.b(r10)
            goto L34
        L11:
            defpackage.ffci.b(r10)
            java.lang.Object r10 = r9.f
            ffsk r10 = (defpackage.ffsk) r10
            ciax r5 = r9.b
            fcek r7 = r9.c
            java.lang.Object r6 = r9.d
            ffji r8 = r9.e
            r9.a = r2
            ffhd r10 = r5.b
            ffhd r10 = defpackage.ekxi.a(r10)
            ciaz r3 = new ciaz
            r4 = 0
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.Object r10 = defpackage.ffra.a(r10, r3, r9)
            if (r10 == r0) goto L41
        L34:
            com.google.common.util.concurrent.ListenableFuture r10 = (com.google.common.util.concurrent.ListenableFuture) r10
            r1 = 2
            r9.a = r1
            java.lang.Object r10 = defpackage.fgfz.c(r10, r9)
            if (r10 != r0) goto L40
            goto L41
        L40:
            return r10
        L41:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ciay.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ciay ciayVar = new ciay(ffguVar, this.b, this.c, this.d, this.e);
        ciayVar.f = obj;
        return ciayVar;
    }
}
