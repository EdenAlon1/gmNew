package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjho implements cjhi {
    public final drtt a;
    public final cfyt b;
    private final ejar c;
    private final ffsk d;

    public cjho(ejar ejarVar, drtt drttVar, ffsk ffskVar, cfyt cfytVar) {
        ejarVar.getClass();
        ffskVar.getClass();
        cfytVar.getClass();
        this.c = ejarVar;
        this.a = drttVar;
        this.d = ffskVar;
        this.b = cfytVar;
    }

    @Override // defpackage.cjhi
    public final elfl a(eisx eisxVar, List list) {
        elfl c;
        eisxVar.getClass();
        list.getClass();
        c = axol.c(this.d, ffhe.a, ffsm.a, new cjhm(this, eisxVar, list, null));
        return c;
    }

    @Override // defpackage.cjhi
    public final Object b(drud drudVar, ffgu ffguVar) {
        return this.a.a(drudVar, ffguVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.cjhi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.eisx r7, java.util.List r8, defpackage.ffgu r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.cjhn
            if (r0 == 0) goto L13
            r0 = r9
            cjhn r0 = (defpackage.cjhn) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cjhn r0 = new cjhn
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r9)
            return r9
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            drtt r7 = r0.e
            java.lang.Object r8 = r0.a
            defpackage.ffci.b(r9)
            goto L4e
        L3a:
            defpackage.ffci.b(r9)
            drtt r9 = r6.a
            r0.a = r8
            r0.e = r9
            r0.d = r4
            java.lang.Object r7 = r6.e(r7, r0)
            if (r7 == r1) goto L5f
            r5 = r9
            r9 = r7
            r7 = r5
        L4e:
            doxj r9 = (defpackage.doxj) r9
            r2 = 0
            r0.a = r2
            r0.e = r2
            r0.d = r3
            java.lang.Object r7 = r7.c(r9, r8, r0)
            if (r7 != r1) goto L5e
            goto L5f
        L5e:
            return r7
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjho.c(eisx, java.util.List, ffgu):java.lang.Object");
    }

    @Override // defpackage.cjhi
    public final void d(String str) {
        axol.k(this.d, null, new cjhk(this, str, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.eisx r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cjhj
            if (r0 == 0) goto L13
            r0 = r6
            cjhj r0 = (defpackage.cjhj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cjhj r0 = new cjhj
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r6)
            goto L48
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.ffci.b(r6)
            ejar r6 = r4.c
            com.google.common.util.concurrent.ListenableFuture r5 = r6.b(r5)
            elfl r5 = defpackage.elfl.g(r5)
            r5.getClass()
            r0.c = r3
            java.lang.Object r6 = defpackage.fgfz.c(r5, r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            java.lang.String r6 = (java.lang.String) r6
            doxj r5 = new doxj
            r5.<init>(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjho.e(eisx, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.eisx r7, java.util.List r8, defpackage.ffgu r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.cjhl
            if (r0 == 0) goto L13
            r0 = r9
            cjhl r0 = (defpackage.cjhl) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cjhl r0 = new cjhl
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r9)
            return r9
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            drtt r7 = r0.e
            java.lang.Object r8 = r0.a
            defpackage.ffci.b(r9)
            goto L4e
        L3a:
            defpackage.ffci.b(r9)
            drtt r9 = r6.a
            r0.a = r8
            r0.e = r9
            r0.d = r4
            java.lang.Object r7 = r6.e(r7, r0)
            if (r7 == r1) goto L5f
            r5 = r9
            r9 = r7
            r7 = r5
        L4e:
            doxj r9 = (defpackage.doxj) r9
            r2 = 0
            r0.a = r2
            r0.e = r2
            r0.d = r3
            java.lang.Object r7 = r7.d(r9, r8, r0)
            if (r7 != r1) goto L5e
            goto L5f
        L5e:
            return r7
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjho.f(eisx, java.util.List, ffgu):java.lang.Object");
    }
}
