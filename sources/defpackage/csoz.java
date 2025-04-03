package defpackage;

import android.telephony.ServiceState;
import android.telephony.TelephonyCallback;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class csoz extends TelephonyCallback implements TelephonyCallback.ServiceStateListener {
    private final Consumer a;

    public csoz(Consumer consumer) {
        this.a = consumer;
    }

    public final void onServiceStateChanged(ServiceState serviceState) {
        this.a.accept(serviceState);
    }
}
