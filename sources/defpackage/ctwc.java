package defpackage;

import android.telephony.SubscriptionManager;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ctwc implements emyl {
    @Override // defpackage.emyl
    public final Object get() {
        int defaultSmsSubscriptionId;
        defaultSmsSubscriptionId = SubscriptionManager.getDefaultSmsSubscriptionId();
        return Integer.valueOf(defaultSmsSubscriptionId);
    }
}
