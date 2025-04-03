package defpackage;

import com.google.android.apps.messaging.R;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dekb implements dejr {
    public static final ejui a = new ejtz("WELCOME_FLOW_V1_DATA");
    public static final enru b = enru.c("com/google/android/apps/messaging/welcome/v1/WelcomeFlowV1EntryPointImpl");
    public static final emyl c = cfvl.y("disable_welcome_flow_for_hawkeye");
    public final ffsk d;
    public final eisx e;
    public final ea f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    public final ffbr j;
    public final ffbr k;
    public final ffbr l;
    private final ffbr m;
    private final ffbr n;
    private final ffbr o;

    public dekb(ffsk ffskVar, eisx eisxVar, ea eaVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9) {
        ffskVar.getClass();
        eisxVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar6.getClass();
        this.d = ffskVar;
        this.e = eisxVar;
        this.f = eaVar;
        this.g = ffbrVar;
        this.m = ffbrVar2;
        this.n = ffbrVar3;
        this.h = ffbrVar4;
        this.i = ffbrVar5;
        this.o = ffbrVar6;
        this.j = ffbrVar7;
        this.k = ffbrVar8;
        this.l = ffbrVar9;
    }

    @Override // defpackage.dejr
    public final void a(Callable callable) {
        ((ejxn) this.m.b()).g(R.id.welcome_flow_v1_launch_local_subscription, new dejx(this), new deka(callable, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ffgu r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.dejy
            if (r0 == 0) goto L13
            r0 = r6
            dejy r0 = (defpackage.dejy) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dejy r0 = new dejy
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r6)
            goto L57
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.ffci.b(r6)
            ffbr r6 = r5.o
            java.lang.Object r6 = r6.b()
            ejvb r6 = (defpackage.ejvb) r6
            ffbr r2 = r5.n
            java.lang.Object r2 = r2.b()
            eixo r2 = (defpackage.eixo) r2
            ejuh r2 = r2.b()
            ejwa r4 = defpackage.ejwa.FEW_SECONDS
            com.google.common.util.concurrent.ListenableFuture r6 = r6.b(r2, r4)
            r6.getClass()
            r0.c = r3
            java.lang.Object r6 = defpackage.fgfz.c(r6, r0)
            if (r6 == r1) goto L8f
        L57:
            r6.getClass()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            boolean r0 = r6 instanceof java.util.Collection
            r1 = 0
            if (r0 == 0) goto L6c
            r0 = r6
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L6c
        L6a:
            r3 = r1
            goto L8a
        L6c:
            java.util.Iterator r6 = r6.iterator()
        L70:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L6a
            java.lang.Object r0 = r6.next()
            eixn r0 = (defpackage.eixn) r0
            eixz r0 = r0.b()
            java.lang.String r0 = r0.k
            java.lang.String r2 = "google"
            boolean r0 = defpackage.ffkj.e(r0, r2)
            if (r0 == 0) goto L70
        L8a:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        L8f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dekb.b(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.dejz
            if (r0 == 0) goto L13
            r0 = r5
            dejz r0 = (defpackage.dejz) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dejz r0 = new dejz
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r5)
            goto L49
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.ffci.b(r5)
            ffbr r5 = r4.n
            java.lang.Object r5 = r5.b()
            eixo r5 = (defpackage.eixo) r5
            eisx r2 = r4.e
            com.google.common.util.concurrent.ListenableFuture r5 = r5.c(r2)
            r0.c = r3
            java.lang.Object r5 = defpackage.fgfz.c(r5, r0)
            if (r5 != r1) goto L49
            return r1
        L49:
            eixn r5 = (defpackage.eixn) r5
            eixz r5 = r5.b()
            java.lang.String r5 = r5.k
            java.lang.String r0 = "pseudonymous"
            boolean r5 = defpackage.ffkj.e(r5, r0)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dekb.c(ffgu):java.lang.Object");
    }
}
