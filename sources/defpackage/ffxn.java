package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffxn extends ffxs {
    private final ffjm d;

    public ffxn(ffjm ffjmVar, ffhd ffhdVar, int i, int i2) {
        super(ffjmVar, ffhdVar, i, i2);
        this.d = ffjmVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.ffxs, defpackage.fgea
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final java.lang.Object b(defpackage.ffxe r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ffxm
            if (r0 == 0) goto L13
            r0 = r6
            ffxm r0 = (defpackage.ffxm) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ffxm r0 = new ffxm
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ffxe r5 = r0.d
            defpackage.ffci.b(r6)
            goto L3e
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ffci.b(r6)
            r0.d = r5
            r0.c = r3
            java.lang.Object r6 = defpackage.ffxs.g(r4, r5, r0)
            if (r6 == r1) goto L51
        L3e:
            ffwm r5 = r5.b
            boolean r5 = r5.f()
            if (r5 == 0) goto L49
            ffcu r5 = defpackage.ffcu.a
            return r5
        L49:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        L51:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffxn.b(ffxe, ffgu):java.lang.Object");
    }

    @Override // defpackage.ffxs, defpackage.fgea
    protected final fgea c(ffhd ffhdVar, int i, int i2) {
        return new ffxn(this.d, ffhdVar, i, i2);
    }

    public /* synthetic */ ffxn(ffjm ffjmVar) {
        this(ffjmVar, ffhe.a, -2, 1);
    }
}
