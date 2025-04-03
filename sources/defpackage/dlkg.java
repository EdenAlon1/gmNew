package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlkg implements dlkb {
    private final dlkj a;

    public dlkg(ffbr ffbrVar) {
        ffbrVar.getClass();
        Object b = ffbrVar.b();
        b.getClass();
        this.a = (dlkj) b;
    }

    private static final Object c(dhre dhreVar, ffgu ffguVar) {
        ffrh ffrhVar = new ffrh(ffhi.c(ffguVar), 1);
        ffrhVar.B();
        dhreVar.s(new dlkf(ffrhVar));
        return ffrhVar.m();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.dlkb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r5, android.os.ParcelFileDescriptor r6, defpackage.ffgu r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.dlke
            if (r0 == 0) goto L13
            r0 = r7
            dlke r0 = (defpackage.dlke) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dlke r0 = new dlke
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r7)
            goto L40
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.ffci.b(r7)
            dlkj r7 = r4.a
            dhre r5 = r7.a(r5, r6)
            r0.c = r3
            java.lang.Object r7 = c(r5, r0)
            if (r7 == r1) goto L5e
        L40:
            dlkh r7 = (defpackage.dlkh) r7
            java.lang.Integer r5 = r7.a
            if (r5 == 0) goto L53
            int r5 = r5.intValue()
            r6 = 2
            if (r5 == r3) goto L52
            if (r5 == r6) goto L50
            goto L53
        L50:
            r3 = 3
            goto L53
        L52:
            r3 = r6
        L53:
            dlka r5 = new dlka
            dlkc r6 = new dlkc
            r6.<init>(r3)
            r5.<init>(r6)
            return r5
        L5e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlkg.a(int, android.os.ParcelFileDescriptor, ffgu):java.lang.Object");
    }

    @Override // defpackage.dlkb
    public final Object b(int[] iArr, ffgu ffguVar) {
        Object c = c(this.a.b(iArr), ffguVar);
        return c == ffhh.a ? c : ffcu.a;
    }
}
