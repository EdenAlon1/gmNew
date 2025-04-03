package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jiu {
    public final int a;
    public float b;
    private final ffjm c;

    public jiu(int i, ffjm ffjmVar) {
        this.a = i;
        this.c = ffjmVar;
    }

    public final int a(int i) {
        return ffmk.i(i - ffln.b(this.b), 0, this.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(float r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.jit
            if (r0 == 0) goto L13
            r0 = r6
            jit r0 = (defpackage.jit) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            jit r0 = new jit
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            jiu r5 = r0.d
            defpackage.ffci.b(r6)
            goto L47
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ffci.b(r6)
            ffjm r6 = r4.c
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r5)
            r0.d = r4
            r0.c = r3
            java.lang.Object r6 = r6.a(r2, r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            r5 = r4
        L47:
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            float r0 = r5.b
            float r0 = r0 + r6
            r5.b = r0
            ffcu r5 = defpackage.ffcu.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jiu.b(float, ffgu):java.lang.Object");
    }

    public final Object c(float f, ffgu ffguVar) {
        Object b = b(f - this.b, ffguVar);
        return b == ffhh.a ? b : ffcu.a;
    }
}
