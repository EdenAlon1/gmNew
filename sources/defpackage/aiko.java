package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aiko implements aigv, aigu {
    private static final enru a = enru.c("com/google/android/apps/messaging/navigation/targets/DirectSendViewerNavigationHandler");
    private final Context b;
    private final dctc c;
    private final aiiu d;

    public aiko(Context context, dctc dctcVar, aiiu aiiuVar) {
        this.b = context;
        this.c = dctcVar;
        this.d = aiiuVar;
    }

    @Override // defpackage.aigu
    public final /* bridge */ /* synthetic */ Object a(aihu aihuVar, ffgu ffguVar) {
        return d(ffguVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.aigv
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.aikl r9, defpackage.ffgu r10) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiko.b(aikl, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.ffgu r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.aikn
            if (r0 == 0) goto L13
            r0 = r8
            aikn r0 = (defpackage.aikn) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aikn r0 = new aikn
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r8)
            goto L43
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L2f:
            defpackage.ffci.b(r8)
            aiiu r8 = r7.d
            ael r2 = new ael
            r2.<init>()
            r0.c = r3
            java.lang.String r3 = "com.google.android.apps.messaging.navigation.targets.DirectSendViewer"
            java.lang.Object r8 = r8.b(r3, r2, r0)
            if (r8 == r1) goto L82
        L43:
            ade r8 = (defpackage.ade) r8
            enru r0 = defpackage.aiko.a
            ensk r1 = r0.f()
            r2 = 155(0x9b, float:2.17E-43)
            java.lang.String r3 = "com/google/android/apps/messaging/navigation/targets/DirectSendViewerNavigationHandler"
            java.lang.String r4 = "resumeNavigation"
            java.lang.String r5 = "DirectSendViewer.kt"
            ensk r1 = r1.h(r3, r4, r2, r5)
            enrr r1 = (defpackage.enrr) r1
            java.lang.String r2 = "MediaViewer activity result: %s"
            r1.t(r2, r8)
            int r1 = r8.a
            r2 = -1
            r6 = 0
            if (r1 != r2) goto L6e
            android.content.Intent r8 = r8.b
            if (r8 == 0) goto L6d
            com.google.android.apps.messaging.navigation.targets.DirectSendResult r8 = defpackage.aikk.a(r8)
            return r8
        L6d:
            return r6
        L6e:
            ensk r0 = r0.j()
            r1 = 160(0xa0, float:2.24E-43)
            ensk r0 = r0.h(r3, r4, r1, r5)
            enrr r0 = (defpackage.enrr) r0
            int r8 = r8.a
            java.lang.String r1 = "Skipping MediaViewer activity result because of resultCode %s"
            r0.r(r1, r8)
            return r6
        L82:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiko.d(ffgu):java.lang.Object");
    }
}
