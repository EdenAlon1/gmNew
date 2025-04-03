package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kbl extends ffhv implements ffjm {
    int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ kbs c;
    final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kbl(boolean z, kbs kbsVar, long j, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = z;
        this.c = kbsVar;
        this.d = j;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((kbl) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        if (r10.b.d(r2, 0, r9) == r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        if (r10.b.d(0, r6, r9) == r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0034, code lost:
    
        return r0;
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
            defpackage.ffci.b(r10)
            if (r1 == 0) goto Lb
            goto L35
        Lb:
            boolean r10 = r9.b
            if (r10 != 0) goto L22
            kbs r10 = r9.c
            long r6 = r9.d
            r9.a = r2
            ijj r3 = r10.b
            r4 = 0
            r8 = r9
            java.lang.Object r10 = r3.d(r4, r6, r8)
            r6 = r8
            if (r10 != r0) goto L35
            goto L34
        L22:
            r6 = r9
            kbs r10 = r6.c
            long r2 = r6.d
            r1 = 2
            r6.a = r1
            ijj r1 = r10.b
            r4 = 0
            java.lang.Object r10 = r1.d(r2, r4, r6)
            if (r10 != r0) goto L35
        L34:
            return r0
        L35:
            ffcu r10 = defpackage.ffcu.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kbl.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new kbl(this.b, this.c, this.d, ffguVar);
    }
}
