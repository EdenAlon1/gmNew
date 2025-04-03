package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fqx implements ijf {
    private final ffji a;
    private final ffjm b;

    public fqx(ffji ffjiVar, ffjm ffjmVar) {
        this.a = ffjiVar;
        this.b = ffjmVar;
    }

    @Override // defpackage.ijf
    public final long a(long j, long j2, int i) {
        if (!ijq.a(i, 1) || iak.c(j2) <= 0.0f) {
            return 0L;
        }
        return ial.a(0.0f, ((Number) this.a.invoke(Float.valueOf(iak.c(j2)))).floatValue());
    }

    @Override // defpackage.ijf
    public final long b(long j, int i) {
        if (!ijq.a(i, 1) || iak.c(j) >= 0.0f) {
            return 0L;
        }
        return ial.a(0.0f, ((Number) this.a.invoke(Float.valueOf(iak.c(j)))).floatValue());
    }

    @Override // defpackage.ijf
    public final /* synthetic */ Object c(long j, long j2, ffgu ffguVar) {
        return new kan(0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.ijf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(long r5, defpackage.ffgu r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.fqw
            if (r0 == 0) goto L13
            r0 = r7
            fqw r0 = (defpackage.fqw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fqw r0 = new fqw
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r7)
            goto L46
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.ffci.b(r7)
            ffjm r7 = r4.b
            float r5 = defpackage.kan.b(r5)
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r5)
            r0.c = r3
            java.lang.Object r7 = r7.a(r6, r0)
            if (r7 != r1) goto L46
            return r1
        L46:
            java.lang.Number r7 = (java.lang.Number) r7
            float r5 = r7.floatValue()
            r6 = 0
            long r5 = defpackage.kao.a(r6, r5)
            kan r7 = new kan
            r7.<init>(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fqx.d(long, ffgu):java.lang.Object");
    }
}
