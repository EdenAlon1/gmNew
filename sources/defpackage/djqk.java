package defpackage;

import android.telephony.SubscriptionManager;
import j$.util.Objects;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djqk extends SubscriptionManager.OnSubscriptionsChangedListener {
    public final SubscriptionManager a;
    public final ExecutorService b;
    private final int c;
    private int d = 1;
    private final djnp e;

    public djqk(SubscriptionManager subscriptionManager, int i, djnp djnpVar, ExecutorService executorService) {
        emxf.b(i >= 0, "Invalid SubscriptionId");
        this.c = i;
        this.e = djnpVar;
        this.a = subscriptionManager;
        this.b = executorService;
    }

    @Override // android.telephony.SubscriptionManager.OnSubscriptionsChangedListener
    public final void onSubscriptionsChanged() {
        try {
            if (this.a.getActiveSubscriptionInfo(this.c) == null) {
                if (this.d == 2) {
                    djnp djnpVar = this.e;
                    dkty.d(djnpVar.b.a, "SIM(subId=%d) is removed.", Integer.valueOf(djnpVar.a));
                    djqf djqfVar = djnpVar.b.c;
                    if (!Objects.isNull(djqfVar)) {
                        djqfVar.G(false);
                    }
                }
                this.d = 3;
                return;
            }
            if (this.d == 3) {
                djnp djnpVar2 = this.e;
                dkty.d(djnpVar2.b.a, "SIM(subId=%d) is detected.", Integer.valueOf(djnpVar2.a));
                djqf djqfVar2 = djnpVar2.b.c;
                if (!Objects.isNull(djqfVar2)) {
                    djqfVar2.G(true);
                }
            }
            this.d = 2;
        } catch (SecurityException unused) {
        }
    }
}
