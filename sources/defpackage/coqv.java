package defpackage;

import android.telephony.SubscriptionManager;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coqv extends SubscriptionManager.OnSubscriptionsChangedListener {
    final /* synthetic */ coqx a;

    public coqv(coqx coqxVar) {
        this.a = coqxVar;
    }

    @Override // android.telephony.SubscriptionManager.OnSubscriptionsChangedListener
    public final void onSubscriptionsChanged() {
        ekzm b = ((elbx) this.a.e.b()).b("SimStateMonitor#onSubscriptionsChanged");
        coqx coqxVar = this.a;
        try {
            axol.k(coqxVar.d, null, new coqu(coqxVar, null), 3);
            ffig.a(b, null);
        } finally {
        }
    }
}
