package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuun implements cuui {
    private static final enru b = enru.c("com/google/android/apps/messaging/shared/util/spam/spatula/datastore/SpatulaAccountDataServiceImpl");
    public final lap a;
    private final ffsk c;
    private final ffbr d;

    public cuun(ffsk ffskVar, lap lapVar, ffbr ffbrVar) {
        ffskVar.getClass();
        lapVar.getClass();
        ffbrVar.getClass();
        this.c = ffskVar;
        this.a = lapVar;
        this.d = ffbrVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.cuui
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ffgu r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.cuuk
            if (r0 == 0) goto L13
            r0 = r8
            cuuk r0 = (defpackage.cuuk) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cuuk r0 = new cuuk
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r0 = r0.a
            java.lang.Integer r0 = (java.lang.Integer) r0
            defpackage.ffci.b(r8)
            goto L77
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L37:
            java.lang.Object r2 = r0.a
            cuun r2 = (defpackage.cuun) r2
            defpackage.ffci.b(r8)
            goto L5c
        L3f:
            defpackage.ffci.b(r8)
            ffsk r8 = r7.c
            ffhd r8 = r8.hT()
            ffhd r8 = defpackage.ekxi.a(r8)
            cuuj r2 = new cuuj
            r2.<init>(r3, r7)
            r0.a = r7
            r0.d = r5
            java.lang.Object r8 = defpackage.ffra.a(r8, r2, r0)
            if (r8 == r1) goto L9b
            r2 = r7
        L5c:
            java.lang.Integer r8 = (java.lang.Integer) r8
            ffbr r2 = r2.d
            java.lang.Object r2 = r2.b()
            eixo r2 = (defpackage.eixo) r2
            com.google.common.util.concurrent.ListenableFuture r2 = r2.e()
            r0.a = r8
            r0.d = r4
            java.lang.Object r0 = defpackage.fgfz.c(r2, r0)
            if (r0 == r1) goto L9b
            r6 = r0
            r0 = r8
            r8 = r6
        L77:
            r8.getClass()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L80:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L9a
            java.lang.Object r1 = r8.next()
            r2 = r1
            eisx r2 = (defpackage.eisx) r2
            int r2 = r2.a()
            if (r0 == 0) goto L80
            int r4 = r0.intValue()
            if (r2 != r4) goto L80
            return r1
        L9a:
            return r3
        L9b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cuun.a(ffgu):java.lang.Object");
    }

    @Override // defpackage.cuui
    public final void b(eisx eisxVar) {
        axol.k(this.c, null, new cuum(this, eisxVar, null), 3);
        ensk h = b.h();
        h.Y(ente.a, "BugleSpam");
        ((enrr) h.h("com/google/android/apps/messaging/shared/util/spam/spatula/datastore/SpatulaAccountDataServiceImpl", "setActiveUser", 56, "SpatulaAccountDataServiceImpl.kt")).r("Setting active user to AccountId=%s", eisxVar.a());
    }
}
