package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.telephony.SubscriptionManager;
import com.google.android.apps.messaging.shared.simstatetracker.AsyncTelephonySimStateReceiver;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coqx implements coqq {
    public static final entd a = entd.c("BugleSimStateTracker");
    public final Context b;
    public final Executor c;
    public final ffsk d;
    public final ffbr e;
    public final axph f;
    public final AtomicBoolean g;
    public SubscriptionManager.OnSubscriptionsChangedListener h;
    private final errl i;
    private final ffbr j;
    private final ejlk k;
    private final ffbr l;
    private final ffbr m;
    private final ffbr n;
    private final ffbr o;
    private final ffbr p;
    private boolean q;
    private final AtomicBoolean r;

    public coqx(Context context, Executor executor, errl errlVar, ffsk ffskVar, ffsk ffskVar2, ffbr ffbrVar, ejlk ejlkVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7) {
        context.getClass();
        executor.getClass();
        errlVar.getClass();
        ffskVar.getClass();
        ffskVar2.getClass();
        ffbrVar.getClass();
        ejlkVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        this.b = context;
        this.c = executor;
        this.i = errlVar;
        this.d = ffskVar2;
        this.j = ffbrVar;
        this.k = ejlkVar;
        this.e = ffbrVar2;
        this.l = ffbrVar3;
        this.m = ffbrVar4;
        this.n = ffbrVar5;
        this.o = ffbrVar6;
        this.p = ffbrVar7;
        this.f = new axph(new erog() { // from class: coqs
            @Override // defpackage.erog
            public final ListenableFuture a() {
                coqx coqxVar = coqx.this;
                return axol.b(new coqw(coqxVar), coqxVar.d);
            }
        }, errlVar);
        this.q = true;
        this.g = new AtomicBoolean(false);
        this.r = new AtomicBoolean(false);
    }

    @Override // defpackage.coqq
    public final void a() {
        a.n().q("Starting SimStateMonitor.");
        this.k.post(new Runnable() { // from class: coqr
            @Override // java.lang.Runnable
            public final void run() {
                coqx coqxVar = coqx.this;
                if (coqxVar.g.getAndSet(true)) {
                    return;
                }
                coqxVar.h = new coqv(coqxVar);
                if (Build.VERSION.SDK_INT >= 30) {
                    dkvq b = dkvq.b(coqxVar.b);
                    SubscriptionManager.OnSubscriptionsChangedListener onSubscriptionsChangedListener = coqxVar.h;
                    try {
                        b.a.addOnSubscriptionsChangedListener(coqxVar.c, onSubscriptionsChangedListener);
                    } catch (SecurityException e) {
                        throw new dkvd("READ_PHONE_STATE permission is missing.", e);
                    }
                } else {
                    dkvq.b(coqxVar.b).e(coqxVar.h);
                }
                coqx.a.n().q("Registered onSubscriptionsChangedListener.");
            }
        });
        if (!((atrp) this.o.b()).a()) {
            if (((atrr) this.p.b()).a()) {
                ((cosg) this.n.b()).a(1);
            }
        } else {
            if (this.r.getAndSet(true)) {
                return;
            }
            ((cosg) this.n.b()).a(2);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SIM_STATE_CHANGED");
            intentFilter.addAction("android.telephony.action.CARRIER_CONFIG_CHANGED");
            intentFilter.addAction("android.telephony.action.DEFAULT_SUBSCRIPTION_CHANGED");
            intentFilter.addAction("android.telephony.action.DEFAULT_SMS_SUBSCRIPTION_CHANGED");
            Context context = this.b;
            koa.g(context, new AsyncTelephonySimStateReceiver(), intentFilter);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.coqt
            if (r0 == 0) goto L13
            r0 = r5
            coqt r0 = (defpackage.coqt) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            coqt r0 = new coqt
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r5)
            goto L57
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.ffci.b(r5)
            boolean r5 = r4.q
            if (r5 == 0) goto L5c
            r5 = 0
            r4.q = r5
            entd r5 = defpackage.coqx.a
            ensk r5 = r5.n()
            java.lang.String r2 = "Update PhoneSimsState on first SIM event."
            r5.q(r2)
            ffbr r5 = r4.j
            java.lang.Object r5 = r5.b()
            coqc r5 = (defpackage.coqc) r5
            eraj r2 = defpackage.eraj.UPDATE_TRIGGER_APP_START
            r0.c = r3
            java.lang.Object r5 = r5.a(r2, r0)
            if (r5 != r1) goto L57
            return r1
        L57:
            cosw r5 = (defpackage.cosw) r5
            ffcu r5 = defpackage.ffcu.a
            return r5
        L5c:
            entd r5 = defpackage.coqx.a
            ensk r5 = r5.n()
            java.lang.String r0 = "Subscriptions changed. Scheduling PhoneSimsStateUpdate."
            r5.q(r0)
            ffbr r5 = r4.m
            java.lang.Object r5 = r5.b()
            coqy r5 = (defpackage.coqy) r5
            eraj r0 = defpackage.eraj.UPDATE_TRIGGER_SUBSCRIPTIONS_CHANGED
            r5.b(r0)
            ffcu r5 = defpackage.ffcu.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.coqx.b(ffgu):java.lang.Object");
    }
}
