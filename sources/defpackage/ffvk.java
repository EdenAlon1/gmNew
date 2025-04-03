package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffvk extends fghk implements Runnable {
    public final long b;

    public ffvk(long j, ffgu ffguVar) {
        super(ffguVar.u(), ffguVar);
        this.b = j;
    }

    @Override // defpackage.ffqq, defpackage.ffuq
    public final String h() {
        return super.h() + "(timeMillis=" + this.b + ")";
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
    
        if (r0 == null) goto L10;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r5 = this;
            ffhd r0 = r5.a
            ffsu r0 = defpackage.ffsw.e(r0)
            boolean r1 = r0 instanceof defpackage.ffsx
            if (r1 == 0) goto Ld
            ffsx r0 = (defpackage.ffsx) r0
            goto Le
        Ld:
            r0 = 0
        Le:
            long r1 = r5.b
            if (r0 == 0) goto L1f
            long r3 = defpackage.ffpw.a
            ffpz r3 = defpackage.ffpz.c
            defpackage.ffpy.e(r1, r3)
            java.lang.String r0 = r0.a()
            if (r0 != 0) goto L27
        L1f:
            java.lang.String r0 = "Timed out waiting for "
            java.lang.String r3 = " ms"
            java.lang.String r0 = defpackage.a.y(r1, r0, r3)
        L27:
            ffvj r1 = new ffvj
            r1.<init>(r0, r5)
            r5.P(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffvk.run():void");
    }
}
