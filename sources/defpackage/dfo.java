package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dfo extends ffhv implements ffjm {
    long a;
    long b;
    int c;
    final /* synthetic */ dfp d;
    final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dfo(dfp dfpVar, long j, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = dfpVar;
        this.e = j;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dfo) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
    
        if (defpackage.ffsw.c(r3 - r5, r9) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        if (defpackage.ffsw.c(40, r9) != r0) goto L9;
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
            int r1 = r9.c
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 == r2) goto Ld
            defpackage.ffci.b(r10)
            goto L52
        Ld:
            long r3 = r9.b
            long r5 = r9.a
            defpackage.ffci.b(r10)
            goto L37
        L15:
            defpackage.ffci.b(r10)
            dfp r10 = r9.d
            hik r1 = defpackage.jdr.n
            java.lang.Object r10 = defpackage.isv.a(r10, r1)
            jgi r10 = (defpackage.jgi) r10
            r10.h()
            long r3 = r10.e()
            r5 = 40
            r9.a = r5
            r9.b = r3
            r9.c = r2
            java.lang.Object r10 = defpackage.ffsw.c(r5, r9)
            if (r10 == r0) goto L5c
        L37:
            dfp r10 = r9.d
            long r7 = r9.e
            coc r10 = r10.l
            java.lang.Object r10 = r10.a(r7)
            dfh r10 = (defpackage.dfh) r10
            if (r10 == 0) goto L47
            r10.b = r2
        L47:
            long r3 = r3 - r5
            r10 = 2
            r9.c = r10
            java.lang.Object r10 = defpackage.ffsw.c(r3, r9)
            if (r10 != r0) goto L52
            goto L5c
        L52:
            dfp r10 = r9.d
            ffix r10 = r10.c
            r10.invoke()
            ffcu r10 = defpackage.ffcu.a
            return r10
        L5c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dfo.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dfo(this.d, this.e, ffguVar);
    }
}
