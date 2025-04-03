package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bznb extends ffhv implements ffjm {
    int a;
    final /* synthetic */ bznk b;
    final /* synthetic */ long c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;
    final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bznb(bznk bznkVar, long j, int i, int i2, int i3, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = bznkVar;
        this.c = j;
        this.d = i;
        this.e = i2;
        this.f = i3;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bznb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0019, code lost:
    
        if (r9 != r0) goto L8;
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
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L1b
            return r9
        Ld:
            bznk r9 = r8.b
            comc r9 = r9.n()
            r8.a = r2
            java.lang.Object r9 = r9.c(r8)
            if (r9 == r0) goto L6f
        L1b:
            bzma r9 = (defpackage.bzma) r9
            int r9 = r9.c
            bzlz r9 = defpackage.bzlz.b(r9)
            if (r9 != 0) goto L27
            bzlz r9 = defpackage.bzlz.UNRECOGNIZED
        L27:
            r9.getClass()
            bzlz r1 = defpackage.bzlz.VERIFICATION_CODES_LOADING
            if (r9 == r1) goto L32
            bzlz r1 = defpackage.bzlz.VERIFICATION_CODES_LOADED
            if (r9 != r1) goto L4c
        L32:
            entd r9 = defpackage.bznk.b
            ensk r9 = r9.n()
            java.lang.String r1 = "got new request when existing request waiting for user action"
            r9.q(r1)
            bznk r9 = r8.b
            ffbr r9 = r9.h
            java.lang.Object r9 = r9.b()
            cgvp r9 = (defpackage.cgvp) r9
            cgvo r1 = defpackage.cgvo.i
            r9.b(r1)
        L4c:
            bznk r9 = r8.b
            r9.q()
            bznk r6 = r8.b
            long r2 = r8.c
            int r4 = r8.d
            int r5 = r8.e
            int r7 = r8.f
            comc r9 = r6.n()
            bzna r1 = new bzna
            r1.<init>()
            r2 = 2
            r8.a = r2
            java.lang.Object r9 = r9.d(r1, r8)
            if (r9 != r0) goto L6e
            goto L6f
        L6e:
            return r9
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bznb.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new bznb(this.b, this.c, this.d, this.e, this.f, ffguVar);
    }
}
