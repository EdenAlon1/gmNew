package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class iej {
    private final idy a;
    private final idy b;
    private final idy c;

    public iej(idy idyVar, idy idyVar2, idy idyVar3) {
        this.a = idyVar;
        this.b = idyVar2;
        this.c = idyVar3;
    }

    public long a(long j) {
        idy idyVar = this.b;
        float d = ibw.d(j);
        float c = ibw.c(j);
        float b = ibw.b(j);
        long d2 = idyVar.d(d, c, b);
        idy idyVar2 = this.b;
        return this.c.e(Float.intBitsToFloat((int) (d2 >> 32)), Float.intBitsToFloat((int) (d2 & 4294967295L)), idyVar2.c(d, c, b), ibw.a(j), this.a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public iej(defpackage.idy r5, defpackage.idy r6) {
        /*
            r4 = this;
            long r0 = r5.b
            r2 = 12884901888(0x300000000, double:6.365987373E-314)
            boolean r0 = defpackage.idx.b(r0, r2)
            if (r0 == 0) goto L15
            ifi r0 = defpackage.iem.a
            ifi r0 = defpackage.iem.b
            idy r5 = defpackage.idz.g(r5, r0)
        L15:
            long r0 = r6.b
            boolean r0 = defpackage.idx.b(r0, r2)
            if (r0 == 0) goto L26
            ifi r0 = defpackage.iem.a
            ifi r0 = defpackage.iem.b
            idy r0 = defpackage.idz.g(r6, r0)
            goto L27
        L26:
            r0 = r6
        L27:
            r4.<init>(r6, r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iej.<init>(idy, idy):void");
    }
}
