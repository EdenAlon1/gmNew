package defpackage;

import android.net.ConnectivityManager;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceyo {
    public static final cfva a = cfvl.l(cfvl.b, "network_callback_no_network_timeout_millis", 400);
    public final avdw b;
    public final fgcm c;
    public final fgcl d;
    private final ceyn e;

    public ceyo(ConnectivityManager connectivityManager, avdw avdwVar, ffsk ffskVar) {
        connectivityManager.getClass();
        ffskVar.getClass();
        this.b = avdwVar;
        this.c = fgdm.a(ffem.a);
        this.d = fgcu.e(1, 0, 0, 6);
        ceyn ceynVar = new ceyn(this, connectivityManager);
        this.e = ceynVar;
        connectivityManager.registerDefaultNetworkCallback(ceynVar);
        axol.k(ffskVar, null, new ceyj(this, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        if (r6 != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ffgu r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.ceyk
            if (r0 == 0) goto L13
            r0 = r6
            ceyk r0 = (defpackage.ceyk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ceyk r0 = new ceyk
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
            goto L56
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            ceyo r2 = r0.d
            defpackage.ffci.b(r6)
            goto L48
        L38:
            defpackage.ffci.b(r6)
            fgcl r6 = r5.d
            r0.d = r5
            r0.c = r4
            java.lang.Object r6 = defpackage.fgbj.a(r6, r0)
            if (r6 == r1) goto L62
            r2 = r5
        L48:
            fgcm r6 = r2.c
            r2 = 0
            r0.d = r2
            r0.c = r3
            java.lang.Object r6 = defpackage.fgbj.a(r6, r0)
            if (r6 != r1) goto L56
            goto L62
        L56:
            java.util.Map r6 = (java.util.Map) r6
            boolean r6 = r6.isEmpty()
            r6 = r6 ^ r4
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        L62:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ceyo.a(ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0053, code lost:
    
        if (r6 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ffgu r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.ceyl
            if (r0 == 0) goto L13
            r0 = r6
            ceyl r0 = (defpackage.ceyl) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ceyl r0 = new ceyl
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
            goto L55
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            ceyo r2 = r0.d
            defpackage.ffci.b(r6)
            goto L48
        L38:
            defpackage.ffci.b(r6)
            fgcl r6 = r5.d
            r0.d = r5
            r0.c = r4
            java.lang.Object r6 = defpackage.fgbj.a(r6, r0)
            if (r6 == r1) goto L87
            r2 = r5
        L48:
            fgcm r6 = r2.c
            r2 = 0
            r0.d = r2
            r0.c = r3
            java.lang.Object r6 = defpackage.fgbj.a(r6, r0)
            if (r6 == r1) goto L87
        L55:
            java.util.Map r6 = (java.util.Map) r6
            boolean r0 = r6.isEmpty()
            r1 = 0
            if (r0 == 0) goto L60
        L5e:
            r4 = r1
            goto L82
        L60:
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L68:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L5e
            java.lang.Object r0 = r6.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            android.net.NetworkCapabilities r0 = (android.net.NetworkCapabilities) r0
            r2 = 18
            boolean r0 = r0.hasCapability(r2)
            if (r0 == 0) goto L68
        L82:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            return r6
        L87:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ceyo.b(ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0053, code lost:
    
        if (r6 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ffgu r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.ceym
            if (r0 == 0) goto L13
            r0 = r6
            ceym r0 = (defpackage.ceym) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ceym r0 = new ceym
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
            goto L55
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            ceyo r2 = r0.d
            defpackage.ffci.b(r6)
            goto L48
        L38:
            defpackage.ffci.b(r6)
            fgcl r6 = r5.d
            r0.d = r5
            r0.c = r4
            java.lang.Object r6 = defpackage.fgbj.a(r6, r0)
            if (r6 == r1) goto L87
            r2 = r5
        L48:
            fgcm r6 = r2.c
            r2 = 0
            r0.d = r2
            r0.c = r3
            java.lang.Object r6 = defpackage.fgbj.a(r6, r0)
            if (r6 == r1) goto L87
        L55:
            java.util.Map r6 = (java.util.Map) r6
            boolean r0 = r6.isEmpty()
            r1 = 0
            if (r0 == 0) goto L60
        L5e:
            r4 = r1
            goto L82
        L60:
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L68:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L5e
            java.lang.Object r0 = r6.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            android.net.NetworkCapabilities r0 = (android.net.NetworkCapabilities) r0
            r2 = 11
            boolean r0 = r0.hasCapability(r2)
            if (r0 == 0) goto L68
        L82:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            return r6
        L87:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ceyo.c(ffgu):java.lang.Object");
    }
}
