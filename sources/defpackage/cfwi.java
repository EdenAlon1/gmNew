package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfwi implements cfvx {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/fcm/impl/GaiaDittoPingRefreshHandler");
    public final fazb b;
    public final ffbr c;
    public final ffbr d;
    private final ffbr e;
    private final ffhd f;
    private final ffsk g;

    /* compiled from: PG */
    public interface a {
        ffbr gZ();
    }

    public cfwi(ffbr ffbrVar, fazb fazbVar, ffbr ffbrVar2, ffbr ffbrVar3, ffhd ffhdVar, ffsk ffskVar) {
        ffbrVar.getClass();
        fazbVar.getClass();
        ffbrVar2.getClass();
        ffhdVar.getClass();
        ffskVar.getClass();
        this.e = ffbrVar;
        this.b = fazbVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.f = ffhdVar;
        this.g = ffskVar;
    }

    @Override // defpackage.cfvx
    public final elfl a() {
        elfl c;
        c = axol.c(this.g, ffhe.a, ffsm.a, new cfwl(this, null));
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ffgu r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.cfwk
            if (r0 == 0) goto L13
            r0 = r6
            cfwk r0 = (defpackage.cfwk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cfwk r0 = new cfwk
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
            ffhd r6 = r5.f
            ffhd r6 = defpackage.ekxi.a(r6)
            cfwj r2 = new cfwj
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfwi.b(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.eisx r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cfwm
            if (r0 == 0) goto L13
            r0 = r6
            cfwm r0 = (defpackage.cfwm) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cfwm r0 = new cfwm
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r6)
            goto L5b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.ffci.b(r6)
            ffbr r6 = r4.e
            java.lang.Object r6 = r6.b()
            android.content.Context r6 = (android.content.Context) r6
            java.lang.Class<cfwi$a> r2 = cfwi.a.class
            java.lang.Object r5 = defpackage.ekhv.a(r6, r2, r5)
            cfwi$a r5 = (cfwi.a) r5
            ffbr r5 = r5.gZ()
            java.lang.Object r5 = r5.b()
            cgxw r5 = (defpackage.cgxw) r5
            cgwm r6 = defpackage.cgwm.FORCE_REFRESH
            elfl r5 = r5.l(r6)
            r0.c = r3
            java.lang.Object r6 = defpackage.fgfz.c(r5, r0)
            if (r6 != r1) goto L5b
            return r1
        L5b:
            r6.getClass()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfwi.c(eisx, ffgu):java.lang.Object");
    }
}
