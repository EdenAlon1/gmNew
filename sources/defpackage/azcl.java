package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azcl {
    private final azch a;
    private final ffbr b;

    public azcl(azch azchVar, ffbr ffbrVar, ffsk ffskVar) {
        azchVar.getClass();
        ffbrVar.getClass();
        ffskVar.getClass();
        this.a = azchVar;
        this.b = ffbrVar;
    }

    @ffbs
    public final Object a(ffgu ffguVar) {
        int ordinal = this.a.b.ordinal();
        if (ordinal == 0) {
            awuf awufVar = (awuf) awui.a.createBuilder();
            awufVar.getClass();
            awuj.b(this.a.c, awufVar);
            awuj.c(awuh.PHONE, awufVar);
            return awuj.a(awufVar);
        }
        if (ordinal == 1) {
            awuf awufVar2 = (awuf) awui.a.createBuilder();
            awufVar2.getClass();
            awuj.b(this.a.c, awufVar2);
            awuj.c(awuh.BOT, awufVar2);
            return awuj.a(awufVar2);
        }
        if (ordinal == 2) {
            return b(ffguVar);
        }
        if (ordinal != 3) {
            throw new ffcd();
        }
        awuf awufVar3 = (awuf) awui.a.createBuilder();
        awufVar3.getClass();
        awuj.b(this.a.c, awufVar3);
        awuj.c(awuh.EMERGENCY, awufVar3);
        return awuj.a(awufVar3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
    
        if (r6 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ffgu r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.azck
            if (r0 == 0) goto L13
            r0 = r6
            azck r0 = (defpackage.azck) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            azck r0 = new azck
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r6)
            goto L67
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            azcl r2 = r0.d
            defpackage.ffci.b(r6)
            goto L52
        L38:
            defpackage.ffci.b(r6)
            ffbr r6 = r5.b
            java.lang.Object r6 = r6.b()
            azfv r6 = (defpackage.azfv) r6
            azch r2 = r5.a
            r0.d = r5
            r0.c = r4
            azcr r2 = r2.a
            java.lang.Object r6 = r6.i(r2, r0)
            if (r6 == r1) goto L77
            r2 = r5
        L52:
            azhq r6 = (defpackage.azhq) r6
            ffbr r2 = r2.b
            java.lang.Object r2 = r2.b()
            azfv r2 = (defpackage.azfv) r2
            r4 = 0
            r0.d = r4
            r0.c = r3
            java.lang.Object r6 = r2.f(r6, r0)
            if (r6 == r1) goto L77
        L67:
            azfh r6 = (defpackage.azfh) r6
            awwf r6 = r6.a()
            awui r6 = r6.d
            if (r6 != 0) goto L73
            awui r6 = defpackage.awui.a
        L73:
            r6.getClass()
            return r6
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azcl.b(ffgu):java.lang.Object");
    }
}
