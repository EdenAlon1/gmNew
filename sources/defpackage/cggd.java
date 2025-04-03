package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cggd {
    public final ffhd a;
    public final effy b;

    public cggd(ffhd ffhdVar, ffsk ffskVar, effy effyVar) {
        ffhdVar.getClass();
        ffskVar.getClass();
        effyVar.getClass();
        this.a = ffhdVar;
        this.b = effyVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ffgu r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.cgfw
            if (r0 == 0) goto L13
            r0 = r6
            cgfw r0 = (defpackage.cgfw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cgfw r0 = new cgfw
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r6)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.ffci.b(r6)
            ffhd r6 = r5.a
            ffhd r6 = defpackage.ekxi.a(r6)
            cgfv r2 = new cgfv
            r4 = 0
            r2.<init>(r4, r5)
            r0.c = r3
            java.lang.Object r6 = defpackage.ffra.a(r6, r2, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            r6.getClass()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cggd.a(ffgu):java.lang.Object");
    }

    public final Object b(Instant instant, ffgu ffguVar) {
        return ffra.a(ekxi.a(this.a), new cgfz(null, this, instant), ffguVar);
    }

    public final Object c(int i, Instant instant, int i2, ffgu ffguVar) {
        return ffra.a(ekxi.a(this.a), new cgfx(null, this, i, instant, i2), ffguVar);
    }
}
