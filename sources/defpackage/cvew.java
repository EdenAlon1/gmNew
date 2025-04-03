package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvew {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/video/SafeDuoKitClientKt");

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
    
        r5 = defpackage.cvew.a.j();
        r5.Y(defpackage.ente.a, "Bugle");
        ((defpackage.enrr) r5.h("com/google/android/apps/messaging/shared/video/SafeDuoKitClientKt", "safeApiProviderAvailability", 16, "SafeDuoKitClient.kt")).t("Error calling getApiAvailabilityAsync. API availability unknown", r4);
        r4 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.dgea r4, defpackage.ffgu r5) {
        /*
            boolean r0 = r5 instanceof defpackage.cvev
            if (r0 == 0) goto L13
            r0 = r5
            cvev r0 = (defpackage.cvev) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            cvev r0 = new cvev
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r5)     // Catch: java.lang.Exception -> L48
            goto L43
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.ffci.b(r5)
            dhre r4 = r4.f()     // Catch: java.lang.Exception -> L48
            com.google.common.util.concurrent.ListenableFuture r4 = defpackage.duin.a(r4)     // Catch: java.lang.Exception -> L48
            r0.b = r3     // Catch: java.lang.Exception -> L48
            java.lang.Object r5 = defpackage.fgfz.c(r4, r0)     // Catch: java.lang.Exception -> L48
            if (r5 != r1) goto L43
            return r1
        L43:
            com.google.android.gms.duokit.GetApiAvailabilityResponse r5 = (com.google.android.gms.duokit.GetApiAvailabilityResponse) r5     // Catch: java.lang.Exception -> L48
            int r4 = r5.a     // Catch: java.lang.Exception -> L48
            goto L6a
        L48:
            r4 = move-exception
            enru r5 = defpackage.cvew.a
            ensk r5 = r5.j()
            ensn r0 = defpackage.ente.a
            java.lang.String r1 = "Bugle"
            r5.Y(r0, r1)
            java.lang.String r0 = "safeApiProviderAvailability"
            r1 = 16
            java.lang.String r2 = "com/google/android/apps/messaging/shared/video/SafeDuoKitClientKt"
            java.lang.String r3 = "SafeDuoKitClient.kt"
            ensk r5 = r5.h(r2, r0, r1, r3)
            enrr r5 = (defpackage.enrr) r5
            java.lang.String r0 = "Error calling getApiAvailabilityAsync. API availability unknown"
            r5.t(r0, r4)
            r4 = 0
        L6a:
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvew.a(dgea, ffgu):java.lang.Object");
    }
}
