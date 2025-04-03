package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class azmj extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ azml c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azmj(azml azmlVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = azmlVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((azmj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0026, code lost:
    
        if (r8 != r0) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0090 A[LOOP:1: B:11:0x008a->B:13:0x0090, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c2 A[LOOP:2: B:16:0x00bc->B:18:0x00c2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0073 A[LOOP:0: B:6:0x006d->B:8:0x0073, LOOP_END] */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) {
        /*
            r7 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r7.b
            r2 = 1
            if (r1 == 0) goto L13
            if (r1 == r2) goto Lf
            java.lang.Object r0 = r7.a
            defpackage.ffci.b(r8)
            goto L41
        Lf:
            defpackage.ffci.b(r8)
            goto L28
        L13:
            defpackage.ffci.b(r8)
            azml r8 = r7.c
            ffbr r8 = r8.c
            java.lang.Object r8 = r8.b()
            azpx r8 = (defpackage.azpx) r8
            r7.b = r2
            java.lang.Object r8 = r8.d(r7)
            if (r8 == r0) goto Lde
        L28:
            azml r1 = r7.c
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            ffbr r1 = r1.c
            java.lang.Object r1 = r1.b()
            azpx r1 = (defpackage.azpx) r1
            r7.a = r8
            r2 = 2
            r7.b = r2
            java.lang.Object r1 = r1.e(r7)
            if (r1 == r0) goto Lde
            r0 = r8
            r8 = r1
        L41:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            enru r1 = defpackage.azml.a
            ensk r1 = r1.e()
            ensn r2 = defpackage.ente.a
            java.lang.String r3 = "BugleCME"
            r1.Y(r2, r3)
            java.lang.String r2 = "invokeSuspend"
            r3 = 86
            java.lang.String r4 = "com/google/android/apps/messaging/shared/core/myidentity/CachedMyIdentityManager$refreshAllCacheFromDelegate$2"
            java.lang.String r5 = "CachedMyIdentityManager.kt"
            ensk r1 = r1.h(r4, r2, r3, r5)
            enrr r1 = (defpackage.enrr) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r4 = defpackage.ffdx.n(r0, r3)
            r2.<init>(r4)
            java.util.Iterator r4 = r0.iterator()
        L6d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L81
            java.lang.Object r5 = r4.next()
            azop r5 = (defpackage.azop) r5
            azsu r5 = r5.b()
            r2.add(r5)
            goto L6d
        L81:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r5 = r0.iterator()
        L8a:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto La1
            java.lang.Object r6 = r5.next()
            azop r6 = (defpackage.azop) r6
            enip r6 = r6.j()
            r6.getClass()
            defpackage.ffdx.w(r4, r6)
            goto L8a
        La1:
            java.lang.String r5 = "Active MyIdentities %s have subIds: %s"
            r1.D(r5, r2, r4)
            azml r1 = r7.c
            azoz r1 = r1.b
            r1.d(r8)
            azml r8 = r7.c
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = defpackage.ffdx.n(r0, r3)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        Lbc:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Ld0
            java.lang.Object r2 = r0.next()
            azop r2 = (defpackage.azop) r2
            azsu r2 = r2.b()
            r1.add(r2)
            goto Lbc
        Ld0:
            azoz r8 = r8.b
            r8.c(r1)
            azml r8 = r7.c
            azoz r8 = r8.b
            java.util.List r8 = defpackage.azlx.a(r8)
            return r8
        Lde:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azmj.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new azmj(this.c, ffguVar);
    }
}
