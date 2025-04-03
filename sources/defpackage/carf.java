package defpackage;

import android.telephony.SubscriptionManager;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class carf extends SubscriptionManager.OnSubscriptionsChangedListener {
    final /* synthetic */ carh a;

    public carf(carh carhVar) {
        this.a = carhVar;
    }

    @Override // android.telephony.SubscriptionManager.OnSubscriptionsChangedListener
    public final void onSubscriptionsChanged() {
        ekzm b = this.a.e.b("DataModelImpl#OnSubscriptionsChangedListener");
        try {
            axnw.h(((axph) this.a.f.get()).a());
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
