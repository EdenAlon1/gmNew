package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyzc extends ffhv implements ffjm {
    int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ eot c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyzc(boolean z, eot eotVar, int i, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = z;
        this.c = eotVar;
        this.d = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cyzc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        if (defpackage.eot.A(r9, r2, r8) == r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        if (defpackage.eot.z(r9, r3, r4, r8, 2) == r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0032, code lost:
    
        return r0;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) {
        /*
            r8 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r8.a
            r2 = 1
            defpackage.ffci.b(r9)
            if (r1 == 0) goto Lb
            goto L33
        Lb:
            boolean r9 = r8.b
            r1 = 2
            if (r9 == 0) goto L26
            eot r9 = r8.c
            int r3 = r8.d
            r4 = 0
            r5 = 6
            r6 = 350(0x15e, float:4.9E-43)
            r7 = 0
            dbu r4 = defpackage.cxu.c(r6, r7, r4, r5)
            r8.a = r2
            java.lang.Object r9 = defpackage.eot.z(r9, r3, r4, r8, r1)
            if (r9 != r0) goto L33
            goto L32
        L26:
            eot r9 = r8.c
            int r2 = r8.d
            r8.a = r1
            java.lang.Object r9 = defpackage.eot.A(r9, r2, r8)
            if (r9 != r0) goto L33
        L32:
            return r0
        L33:
            ffcu r9 = defpackage.ffcu.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cyzc.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cyzc(this.b, this.c, this.d, ffguVar);
    }
}
