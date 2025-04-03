package defpackage;

import android.telephony.SignalStrength;
import android.telephony.TelephonyCallback;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cspe extends TelephonyCallback implements TelephonyCallback.SignalStrengthsListener {
    private final Consumer a;

    public cspe(Consumer consumer) {
        this.a = consumer;
    }

    public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
        this.a.accept(signalStrength);
    }
}
