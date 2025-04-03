package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahny implements ahns {
    public final cqoh a;
    private final ffbr b;
    private final ffbr c;
    private final ffsk d;

    public ahny(ffbr ffbrVar, ffbr ffbrVar2, ffsk ffskVar, cqoh cqohVar) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffskVar.getClass();
        cqohVar.getClass();
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffskVar;
        this.a = cqohVar;
    }

    @Override // defpackage.ahns
    public final ejuh a(eisx eisxVar) {
        AtomicReference atomicReference = new AtomicReference(ejug.a);
        ahnt ahntVar = new ahnt(atomicReference, this, eisxVar, null);
        return new ejxd(this.d, new ahnu(atomicReference, null), ahntVar);
    }

    @Override // defpackage.ahns
    public final elfl b(eisx eisxVar) {
        elfl c;
        c = axol.c(this.d, ffhe.a, ffsm.a, new ahnw(this, eisxVar, null));
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.eisx r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ahnv
            if (r0 == 0) goto L13
            r0 = r6
            ahnv r0 = (defpackage.ahnv) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ahnv r0 = new ahnv
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ahny r5 = r0.d
            defpackage.ffci.b(r6)
            goto L42
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ffci.b(r6)
            if (r5 == 0) goto L49
            r0.d = r4
            r0.c = r3
            java.lang.Object r6 = r4.d(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            r5 = r4
        L42:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            goto L4b
        L49:
            r5 = r4
            r6 = r3
        L4b:
            r0 = 0
            if (r6 == 0) goto L5d
            ffbr r6 = r5.c
            java.lang.Object r6 = r6.b()
            ctyz r6 = (defpackage.ctyz) r6
            boolean r6 = r6.f()
            if (r6 == 0) goto L5d
            goto L5e
        L5d:
            r3 = r0
        L5e:
            ffbr r5 = r5.c
            java.lang.Object r5 = r5.b()
            ctyz r5 = (defpackage.ctyz) r5
            boolean r5 = r5.j(r3)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahny.c(eisx, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.eisx r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ahnx
            if (r0 == 0) goto L13
            r0 = r6
            ahnx r0 = (defpackage.ahnx) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ahnx r0 = new ahnx
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r6)
            goto L4a
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.ffci.b(r6)
            ffbr r6 = r4.b
            java.lang.Object r6 = r6.b()
            adkp r6 = (defpackage.adkp) r6
            evsb r2 = defpackage.evsh.a
            java.lang.String r2 = r2.a
            elfl r5 = r6.a(r5, r2)
            r0.c = r3
            java.lang.Object r6 = defpackage.fgfz.c(r5, r0)
            if (r6 == r1) goto L5b
        L4a:
            adko r6 = (defpackage.adko) r6
            adko r5 = defpackage.adko.YES
            if (r6 == r5) goto L56
            adko r5 = defpackage.adko.SKIPPED_PSEUDONYMOUS_ACCOUNT
            if (r6 != r5) goto L55
            goto L56
        L55:
            r3 = 0
        L56:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L5b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahny.d(eisx, ffgu):java.lang.Object");
    }
}
