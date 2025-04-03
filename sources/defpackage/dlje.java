package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlje extends dliy {
    public final effy a;
    private final dlpw b;

    public dlje(dlpw dlpwVar, effy effyVar) {
        this.b = dlpwVar;
        this.a = effyVar;
    }

    @Override // defpackage.dliy
    protected final long m() {
        return this.b.f().toEpochMilli();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.dliy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final java.lang.Object n(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.dliz
            if (r0 == 0) goto L13
            r0 = r5
            dliz r0 = (defpackage.dliz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dliz r0 = new dliz
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r5)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.ffci.b(r5)
            dlja r5 = new dlja
            r2 = 0
            r5.<init>(r4, r2)
            r0.c = r3
            java.lang.Object r5 = defpackage.ffsl.a(r5, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            r5.getClass()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlje.n(ffgu):java.lang.Object");
    }

    @Override // defpackage.dliy
    protected final Object y(ffji ffjiVar, ffgu ffguVar) {
        Object a = ffsl.a(new dljd(this, ffjiVar, null), ffguVar);
        return a == ffhh.a ? a : ffcu.a;
    }
}
