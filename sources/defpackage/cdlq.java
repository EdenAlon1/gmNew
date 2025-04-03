package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdlq implements cdlo {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/CmsMediaConstraintTrackerImpl");
    private final ceyo b;
    private final Context c;

    public cdlq(ceyo ceyoVar, Context context) {
        ceyoVar.getClass();
        context.getClass();
        this.b = ceyoVar;
        this.c = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    @Override // defpackage.cdlo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ffgu r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.cdlp
            if (r0 == 0) goto L13
            r0 = r12
            cdlp r0 = (defpackage.cdlp) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cdlp r0 = new cdlp
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            java.lang.String r3 = "getMediaConstraintsInfo"
            java.lang.String r4 = "com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/media/CmsMediaConstraintTrackerImpl"
            java.lang.String r5 = "CmsMediaConstraintTrackerImpl.kt"
            java.lang.String r6 = "BugleCms"
            r7 = 0
            r8 = 1
            if (r2 == 0) goto L3a
            if (r2 != r8) goto L32
            java.lang.Object r0 = r0.a
            defpackage.ffci.b(r12)     // Catch: java.lang.Exception -> L8d
            goto L74
        L32:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L3a:
            defpackage.ffci.b(r12)
            android.content.Context r12 = r11.c
            android.content.IntentFilter r2 = new android.content.IntentFilter
            java.lang.String r9 = "android.intent.action.BATTERY_CHANGED"
            r2.<init>(r9)
            android.content.Intent r12 = defpackage.koa.g(r12, r7, r2)
            if (r12 != 0) goto L65
            enru r12 = defpackage.cdlq.a
            ensk r12 = r12.j()
            ensn r0 = defpackage.ente.a
            r12.Y(r0, r6)
            r0 = 43
            ensk r12 = r12.h(r4, r3, r0, r5)
            enrr r12 = (defpackage.enrr) r12
            java.lang.String r0 = "Android returned null for ACTION_BATTERY_CHANGED sticky intent"
            r12.q(r0)
            return r7
        L65:
            ceyo r2 = r11.b     // Catch: java.lang.Exception -> L8d
            r0.a = r12     // Catch: java.lang.Exception -> L8d
            r0.d = r8     // Catch: java.lang.Exception -> L8d
            java.lang.Object r0 = r2.c(r0)     // Catch: java.lang.Exception -> L8d
            if (r0 == r1) goto L8c
            r10 = r0
            r0 = r12
            r12 = r10
        L74:
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.lang.Exception -> L8d
            boolean r12 = r12.booleanValue()     // Catch: java.lang.Exception -> L8d
            java.lang.String r1 = "plugged"
            android.content.Intent r0 = (android.content.Intent) r0     // Catch: java.lang.Exception -> L8d
            r2 = 0
            int r0 = r0.getIntExtra(r1, r2)     // Catch: java.lang.Exception -> L8d
            cdpw r1 = new cdpw     // Catch: java.lang.Exception -> L8d
            if (r0 <= 0) goto L88
            goto L89
        L88:
            r8 = r2
        L89:
            r1.<init>(r12, r8)     // Catch: java.lang.Exception -> L8d
        L8c:
            return r1
        L8d:
            r12 = move-exception
            enru r0 = defpackage.cdlq.a
            ensk r0 = r0.j()
            ensn r1 = defpackage.ente.a
            r0.Y(r1, r6)
            enrr r0 = (defpackage.enrr) r0
            ensk r12 = r0.g(r12)
            r0 = 59
            ensk r12 = r12.h(r4, r3, r0, r5)
            enrr r12 = (defpackage.enrr) r12
            java.lang.String r0 = "Failed to get media constraints info."
            r12.q(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdlq.a(ffgu):java.lang.Object");
    }
}
