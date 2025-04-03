package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgof implements dqza {
    public final ffbr a;
    public final enru b;
    private final ffsk c;
    private final cftn d;
    private final dqze e;
    private final ffss f;

    public cgof(ffbr ffbrVar, ffsk ffskVar, cftn cftnVar, dqze dqzeVar) {
        ffbrVar.getClass();
        ffskVar.getClass();
        dqzeVar.getClass();
        this.a = ffbrVar;
        this.c = ffskVar;
        this.d = cftnVar;
        this.e = dqzeVar;
        this.b = enru.c("com/google/android/apps/messaging/shared/mdd/geller/EmotifyControllerImpl");
        this.f = ffra.b(ffskVar, ekxi.a(ffhe.a), ffsm.b, new cgoe(null, this));
    }

    @Override // defpackage.dqza
    public final Object a(ffgu ffguVar) {
        return this.f.c(ffguVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        if (r6 != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.dqza
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ffgu r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.cgod
            if (r0 == 0) goto L13
            r0 = r6
            cgod r0 = (defpackage.cgod) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cgod r0 = new cgod
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
            goto L5d
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            cgof r2 = r0.d
            defpackage.ffci.b(r6)
            goto L48
        L38:
            defpackage.ffci.b(r6)
            cftn r6 = r5.d
            r0.d = r5
            r0.c = r4
            java.lang.Object r6 = r6.a(r0)
            if (r6 == r1) goto L6c
            r2 = r5
        L48:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L67
            dqze r6 = r2.e
            r2 = 0
            r0.d = r2
            r0.c = r3
            java.lang.Object r6 = r6.a(r0)
            if (r6 == r1) goto L6c
        L5d:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            if (r6 != 0) goto L66
            goto L67
        L66:
            r4 = 0
        L67:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            return r6
        L6c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgof.b(ffgu):java.lang.Object");
    }

    @Override // defpackage.dqza
    public final void c() {
        cftn cftnVar = this.d;
        if (cftnVar.d.a()) {
            return;
        }
        axol.k(cftnVar.b, null, new cftm(cftnVar, null), 3);
    }
}
