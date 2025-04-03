package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class szk extends ffhv implements ffjm {
    Object a;
    int b;
    int c;
    final /* synthetic */ szm d;
    final /* synthetic */ tad e;
    final /* synthetic */ ajiy f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public szk(szm szmVar, tad tadVar, ajiy ajiyVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = szmVar;
        this.e = tadVar;
        this.f = ajiyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((szk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00e0, code lost:
    
        if (r0.a(r2, r7, r3, r4, r18) == r6) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.szk.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new szk(this.d, this.e, this.f, ffguVar);
    }
}
