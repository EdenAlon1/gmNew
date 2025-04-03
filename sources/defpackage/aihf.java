package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aihf implements aiha {
    public static final enru a = enru.c("com/google/android/apps/messaging/navigation/NavigationRouterControllerImpl");
    public final aigx b;
    public final lkk c;
    private final ffsk d;
    private final Map e;
    private final Map f;
    private boolean g;

    public aihf(aigx aigxVar, ffsk ffskVar, lkk lkkVar, Map map, Map map2) {
        aigxVar.getClass();
        ffskVar.getClass();
        lkkVar.getClass();
        this.b = aigxVar;
        this.d = ffskVar;
        this.c = lkkVar;
        this.e = map;
        this.f = map2;
    }

    @Override // defpackage.aiha
    public final void a() {
        ((enrr) a.e().h("com/google/android/apps/messaging/navigation/NavigationRouterControllerImpl", "initialize", 32, "NavigationRouterControllerImpl.kt")).q("Initializing navigation controller.");
        if (this.g) {
            return;
        }
        axol.k(this.d, null, new aihe(this, null), 3);
        this.g = true;
    }

    @Override // defpackage.aiha
    public final void b(aihv aihvVar, boolean z) {
        ((enrr) a.e().h("com/google/android/apps/messaging/navigation/NavigationRouterControllerImpl", "setCanNavigateToTarget", 55, "NavigationRouterControllerImpl.kt")).D("%s navigation to target: %s.", true != z ? "Disabling" : "Enabling", aihvVar);
        this.b.e(aihvVar, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.aihr r9, defpackage.ffgu r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.aihb
            if (r0 == 0) goto L13
            r0 = r10
            aihb r0 = (defpackage.aihb) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            aihb r0 = new aihb
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.c
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.e
            r3 = 1
            java.lang.String r4 = "handleUpdatedState"
            java.lang.String r5 = "com/google/android/apps/messaging/navigation/NavigationRouterControllerImpl"
            java.lang.String r6 = "NavigationRouterControllerImpl.kt"
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r9 = r0.b
            java.lang.Object r0 = r0.a
            defpackage.ffci.b(r10)
            goto L9f
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            defpackage.ffci.b(r10)
            java.util.Map r10 = r8.f
            java.lang.Class r2 = r9.getClass()
            java.lang.Object r10 = r10.get(r2)
            aiih r10 = (defpackage.aiih) r10
            if (r10 != 0) goto L5e
            enru r10 = defpackage.aihf.a
            ensk r10 = r10.f()
            r0 = 62
            ensk r10 = r10.h(r5, r4, r0, r6)
            enrr r10 = (defpackage.enrr) r10
            java.lang.String r0 = "No navigation operation for state %s"
            r10.t(r0, r9)
            goto Lb2
        L5e:
            enru r2 = defpackage.aihf.a
            ensk r2 = r2.h()
            r7 = 64
            ensk r2 = r2.h(r5, r4, r7, r6)
            enrr r2 = (defpackage.enrr) r2
            java.lang.String r7 = "Invoking operation %s for state %s"
            r2.D(r7, r10, r9)
            r0.a = r9
            r0.b = r10
            r0.e = r3
            aihv r2 = r9.b()
            java.util.Map r3 = r8.e
            java.lang.Class r7 = r2.getClass()
            java.lang.Object r3 = r3.get(r7)
            aigw r3 = (defpackage.aigw) r3
            if (r3 == 0) goto Lb6
            int r2 = r9.a()
            aihv r7 = r9.b()
            java.lang.Object r0 = r10.a(r2, r7, r3, r0)
            ffhh r2 = defpackage.ffhh.a
            if (r0 == r2) goto L9b
            ffcu r0 = defpackage.ffcu.a
        L9b:
            if (r0 == r1) goto Lb5
            r0 = r9
            r9 = r10
        L9f:
            enru r10 = defpackage.aihf.a
            ensk r10 = r10.f()
            r1 = 66
            ensk r10 = r10.h(r5, r4, r1, r6)
            enrr r10 = (defpackage.enrr) r10
            java.lang.String r1 = "Finished invoking operation %s for state %s"
            r10.D(r1, r9, r0)
        Lb2:
            ffcu r9 = defpackage.ffcu.a
            return r9
        Lb5:
            return r1
        Lb6:
            java.lang.Class r9 = r2.getClass()
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            int r0 = defpackage.fflc.a
            ffkb r0 = new ffkb
            r0.<init>(r9)
            java.lang.String r9 = r0.c()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r0 = "A navigation handler has not been provided for "
            java.lang.String r9 = r0.concat(r9)
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aihf.c(aihr, ffgu):java.lang.Object");
    }
}
