package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuwp implements cuwg {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/util/spam/tachyon/TachyonSpamGrpcProxyImpl");
    public final Context b;
    private final ffhd c;

    public cuwp(Context context, ffhd ffhdVar) {
        context.getClass();
        ffhdVar.getClass();
        this.b = context;
        this.c = ffhdVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.cuwg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.fbct r8, defpackage.fcim r9, defpackage.ffgu r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.cuwh
            if (r0 == 0) goto L13
            r0 = r10
            cuwh r0 = (defpackage.cuwh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cuwh r0 = new cuwh
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r10)
            goto L86
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            defpackage.ffci.b(r10)
            fdxk r10 = r8.a
            febs r2 = defpackage.fbcu.a
            if (r2 != 0) goto L73
            java.lang.Class<fbcu> r4 = defpackage.fbcu.class
            monitor-enter(r4)
            febs r2 = defpackage.fbcu.a     // Catch: java.lang.Throwable -> L70
            if (r2 != 0) goto L6e
            febp r2 = defpackage.febs.a()     // Catch: java.lang.Throwable -> L70
            febr r5 = defpackage.febr.UNARY     // Catch: java.lang.Throwable -> L70
            r2.c = r5     // Catch: java.lang.Throwable -> L70
            java.lang.String r5 = "google.internal.communications.instantmessaging.v1.Abuse"
            java.lang.String r6 = "AddSpamSignalV2"
            java.lang.String r5 = defpackage.febs.c(r5, r6)     // Catch: java.lang.Throwable -> L70
            r2.d = r5     // Catch: java.lang.Throwable -> L70
            r2.b()     // Catch: java.lang.Throwable -> L70
            fcim r5 = defpackage.fcim.a     // Catch: java.lang.Throwable -> L70
            eyfc r6 = defpackage.ffag.a     // Catch: java.lang.Throwable -> L70
            ffae r6 = new ffae     // Catch: java.lang.Throwable -> L70
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L70
            r2.a = r6     // Catch: java.lang.Throwable -> L70
            fcio r5 = defpackage.fcio.a     // Catch: java.lang.Throwable -> L70
            ffae r6 = new ffae     // Catch: java.lang.Throwable -> L70
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L70
            r2.b = r6     // Catch: java.lang.Throwable -> L70
            febs r2 = r2.a()     // Catch: java.lang.Throwable -> L70
            defpackage.fbcu.a = r2     // Catch: java.lang.Throwable -> L70
        L6e:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L70
            goto L73
        L70:
            r8 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L70
            throw r8
        L73:
            fdxj r8 = r8.b
            fdxo r8 = r10.a(r2, r8)
            com.google.common.util.concurrent.ListenableFuture r8 = defpackage.ffat.a(r8, r9)
            r0.c = r3
            java.lang.Object r10 = defpackage.fgfz.c(r8, r0)
            if (r10 != r1) goto L86
            return r1
        L86:
            r10.getClass()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cuwp.a(fbct, fcim, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.cuwg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.Map r5, java.lang.String r6, defpackage.ffgu r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.cuwi
            if (r0 == 0) goto L13
            r0 = r7
            cuwi r0 = (defpackage.cuwi) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cuwi r0 = new cuwi
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r7)
            goto L46
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.ffci.b(r7)
            r0.c = r3
            ffhd r7 = r4.c
            ffhd r7 = defpackage.ekxi.a(r7)
            cuwj r2 = new cuwj
            r3 = 0
            r2.<init>(r3, r4, r6, r5)
            java.lang.Object r7 = defpackage.ffra.a(r7, r2, r0)
            if (r7 == r1) goto L59
        L46:
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L51
            int r5 = r7.length()
            if (r5 == 0) goto L51
            return r7
        L51:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "DroidGuard result is null or empty"
            r5.<init>(r6)
            throw r5
        L59:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cuwp.b(java.util.Map, java.lang.String, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.cuwg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.fbct r8, defpackage.fcja r9, defpackage.ffgu r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.cuwm
            if (r0 == 0) goto L13
            r0 = r10
            cuwm r0 = (defpackage.cuwm) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cuwm r0 = new cuwm
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r10)
            goto L86
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            defpackage.ffci.b(r10)
            fdxk r10 = r8.a
            febs r2 = defpackage.fbcu.d
            if (r2 != 0) goto L73
            java.lang.Class<fbcu> r4 = defpackage.fbcu.class
            monitor-enter(r4)
            febs r2 = defpackage.fbcu.d     // Catch: java.lang.Throwable -> L70
            if (r2 != 0) goto L6e
            febp r2 = defpackage.febs.a()     // Catch: java.lang.Throwable -> L70
            febr r5 = defpackage.febr.UNARY     // Catch: java.lang.Throwable -> L70
            r2.c = r5     // Catch: java.lang.Throwable -> L70
            java.lang.String r5 = "google.internal.communications.instantmessaging.v1.Abuse"
            java.lang.String r6 = "GetFuzzyMatchingTemplates"
            java.lang.String r5 = defpackage.febs.c(r5, r6)     // Catch: java.lang.Throwable -> L70
            r2.d = r5     // Catch: java.lang.Throwable -> L70
            r2.b()     // Catch: java.lang.Throwable -> L70
            fcja r5 = defpackage.fcja.a     // Catch: java.lang.Throwable -> L70
            eyfc r6 = defpackage.ffag.a     // Catch: java.lang.Throwable -> L70
            ffae r6 = new ffae     // Catch: java.lang.Throwable -> L70
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L70
            r2.a = r6     // Catch: java.lang.Throwable -> L70
            fcjc r5 = defpackage.fcjc.a     // Catch: java.lang.Throwable -> L70
            ffae r6 = new ffae     // Catch: java.lang.Throwable -> L70
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L70
            r2.b = r6     // Catch: java.lang.Throwable -> L70
            febs r2 = r2.a()     // Catch: java.lang.Throwable -> L70
            defpackage.fbcu.d = r2     // Catch: java.lang.Throwable -> L70
        L6e:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L70
            goto L73
        L70:
            r8 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L70
            throw r8
        L73:
            fdxj r8 = r8.b
            fdxo r8 = r10.a(r2, r8)
            com.google.common.util.concurrent.ListenableFuture r8 = defpackage.ffat.a(r8, r9)
            r0.c = r3
            java.lang.Object r10 = defpackage.fgfz.c(r8, r0)
            if (r10 != r1) goto L86
            return r1
        L86:
            r10.getClass()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cuwp.c(fbct, fcja, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.cuwg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.fbct r8, defpackage.fcje r9, defpackage.ffgu r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.cuwn
            if (r0 == 0) goto L13
            r0 = r10
            cuwn r0 = (defpackage.cuwn) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cuwn r0 = new cuwn
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r10)
            goto L86
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            defpackage.ffci.b(r10)
            fdxk r10 = r8.a
            febs r2 = defpackage.fbcu.b
            if (r2 != 0) goto L73
            java.lang.Class<fbcu> r4 = defpackage.fbcu.class
            monitor-enter(r4)
            febs r2 = defpackage.fbcu.b     // Catch: java.lang.Throwable -> L70
            if (r2 != 0) goto L6e
            febp r2 = defpackage.febs.a()     // Catch: java.lang.Throwable -> L70
            febr r5 = defpackage.febr.UNARY     // Catch: java.lang.Throwable -> L70
            r2.c = r5     // Catch: java.lang.Throwable -> L70
            java.lang.String r5 = "google.internal.communications.instantmessaging.v1.Abuse"
            java.lang.String r6 = "GetSpamState"
            java.lang.String r5 = defpackage.febs.c(r5, r6)     // Catch: java.lang.Throwable -> L70
            r2.d = r5     // Catch: java.lang.Throwable -> L70
            r2.b()     // Catch: java.lang.Throwable -> L70
            fcje r5 = defpackage.fcje.a     // Catch: java.lang.Throwable -> L70
            eyfc r6 = defpackage.ffag.a     // Catch: java.lang.Throwable -> L70
            ffae r6 = new ffae     // Catch: java.lang.Throwable -> L70
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L70
            r2.a = r6     // Catch: java.lang.Throwable -> L70
            fcjg r5 = defpackage.fcjg.a     // Catch: java.lang.Throwable -> L70
            ffae r6 = new ffae     // Catch: java.lang.Throwable -> L70
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L70
            r2.b = r6     // Catch: java.lang.Throwable -> L70
            febs r2 = r2.a()     // Catch: java.lang.Throwable -> L70
            defpackage.fbcu.b = r2     // Catch: java.lang.Throwable -> L70
        L6e:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L70
            goto L73
        L70:
            r8 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L70
            throw r8
        L73:
            fdxj r8 = r8.b
            fdxo r8 = r10.a(r2, r8)
            com.google.common.util.concurrent.ListenableFuture r8 = defpackage.ffat.a(r8, r9)
            r0.c = r3
            java.lang.Object r10 = defpackage.fgfz.c(r8, r0)
            if (r10 != r1) goto L86
            return r1
        L86:
            r10.getClass()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cuwp.d(fbct, fcje, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.cuwg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.fbct r8, defpackage.fcji r9, defpackage.ffgu r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.cuwo
            if (r0 == 0) goto L13
            r0 = r10
            cuwo r0 = (defpackage.cuwo) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cuwo r0 = new cuwo
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r10)
            goto L86
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            defpackage.ffci.b(r10)
            fdxk r10 = r8.a
            febs r2 = defpackage.fbcu.c
            if (r2 != 0) goto L73
            java.lang.Class<fbcu> r4 = defpackage.fbcu.class
            monitor-enter(r4)
            febs r2 = defpackage.fbcu.c     // Catch: java.lang.Throwable -> L70
            if (r2 != 0) goto L6e
            febp r2 = defpackage.febs.a()     // Catch: java.lang.Throwable -> L70
            febr r5 = defpackage.febr.UNARY     // Catch: java.lang.Throwable -> L70
            r2.c = r5     // Catch: java.lang.Throwable -> L70
            java.lang.String r5 = "google.internal.communications.instantmessaging.v1.Abuse"
            java.lang.String r6 = "GetURLState"
            java.lang.String r5 = defpackage.febs.c(r5, r6)     // Catch: java.lang.Throwable -> L70
            r2.d = r5     // Catch: java.lang.Throwable -> L70
            r2.b()     // Catch: java.lang.Throwable -> L70
            fcji r5 = defpackage.fcji.a     // Catch: java.lang.Throwable -> L70
            eyfc r6 = defpackage.ffag.a     // Catch: java.lang.Throwable -> L70
            ffae r6 = new ffae     // Catch: java.lang.Throwable -> L70
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L70
            r2.a = r6     // Catch: java.lang.Throwable -> L70
            fcjk r5 = defpackage.fcjk.a     // Catch: java.lang.Throwable -> L70
            ffae r6 = new ffae     // Catch: java.lang.Throwable -> L70
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L70
            r2.b = r6     // Catch: java.lang.Throwable -> L70
            febs r2 = r2.a()     // Catch: java.lang.Throwable -> L70
            defpackage.fbcu.c = r2     // Catch: java.lang.Throwable -> L70
        L6e:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L70
            goto L73
        L70:
            r8 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L70
            throw r8
        L73:
            fdxj r8 = r8.b
            fdxo r8 = r10.a(r2, r8)
            com.google.common.util.concurrent.ListenableFuture r8 = defpackage.ffat.a(r8, r9)
            r0.c = r3
            java.lang.Object r10 = defpackage.fgfz.c(r8, r0)
            if (r10 != r1) goto L86
            return r1
        L86:
            r10.getClass()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cuwp.e(fbct, fcji, ffgu):java.lang.Object");
    }
}
