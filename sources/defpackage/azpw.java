package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azpw implements bdil {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/core/myidentity/MyIdentityForeignKeyUpgrader");
    private final bdii b;
    private final ffsk c;
    private final ffsk d;
    private final byys e;

    public azpw(bdii bdiiVar, ffsk ffskVar, ffsk ffskVar2) {
        bdiiVar.getClass();
        ffskVar.getClass();
        ffskVar2.getClass();
        this.b = bdiiVar;
        this.c = ffskVar;
        this.d = ffskVar2;
        this.e = byys.MY_IDENTITY_FOREIGN_KEY;
    }

    @Override // defpackage.bdil
    public final byys a() {
        return this.e;
    }

    @Override // defpackage.bdil
    public final elfl b() {
        elfl c;
        c = axol.c(this.c, ffhe.a, ffsm.a, new azpt(this, null));
        return c;
    }

    @Override // defpackage.bdil
    public final elfl c(long j) {
        elfl c;
        c = axol.c(this.d, ffhe.a, ffsm.a, new azpu(this, j, null));
        return c;
    }

    @Override // defpackage.bdil
    public final elfl d(Optional optional) {
        elfl c;
        optional.getClass();
        c = axol.c(this.d, ffhe.a, ffsm.a, new azpv(this, optional, null));
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.ffgu r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.azps
            if (r0 == 0) goto L13
            r0 = r6
            azps r0 = (defpackage.azps) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            azps r0 = new azps
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r6)
            goto L4c
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.ffci.b(r6)
            bdii r6 = r5.b
            byys r2 = defpackage.byys.PARTICIPANTS_TABLE_MY_IDENTITY
            bdif r4 = new bdif
            r4.<init>()
            errl r6 = r6.c
            elfl r6 = defpackage.elfo.g(r4, r6)
            r6.getClass()
            r0.c = r3
            java.lang.Object r6 = defpackage.fgfz.c(r6, r0)
            if (r6 == r1) goto L5a
        L4c:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L57
            bdhm r6 = defpackage.bdhm.EXECUTE_UPGRADE
            return r6
        L57:
            bdhm r6 = defpackage.bdhm.DISABLED
            return r6
        L5a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azpw.e(ffgu):java.lang.Object");
    }

    @Override // defpackage.bdil
    public final void f() {
    }
}
