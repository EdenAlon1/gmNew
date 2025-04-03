package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtgs extends ffhv implements ffjm {
    int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ dteh c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtgs(boolean z, dteh dtehVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = z;
        this.c = dtehVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dtgs) c((dtgp) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if (r4.d(r3) == r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if (r4.c(r1, r3) == r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0027, code lost:
    
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
            if (r1 == 0) goto Lb
            goto L28
        Lb:
            java.lang.Object r4 = r3.d
            dtgp r4 = (defpackage.dtgp) r4
            boolean r1 = r3.b
            if (r1 == 0) goto L1e
            dteh r1 = r3.c
            r3.a = r2
            java.lang.Object r4 = r4.c(r1, r3)
            if (r4 != r0) goto L28
            goto L27
        L1e:
            r1 = 2
            r3.a = r1
            java.lang.Object r4 = r4.d(r3)
            if (r4 != r0) goto L28
        L27:
            return r0
        L28:
            ffcu r4 = defpackage.ffcu.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtgs.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dtgs dtgsVar = new dtgs(this.b, this.c, ffguVar);
        dtgsVar.d = obj;
        return dtgsVar;
    }
}
