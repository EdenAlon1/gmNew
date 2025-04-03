package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.time.trustedtime.dto.TimeSignalResult;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dhuk extends BroadcastReceiver {
    final /* synthetic */ ksp a;

    public dhuk(ksp kspVar) {
        this.a = kspVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        AtomicInteger atomicInteger = dhul.a;
        TimeSignalResult timeSignalResult = (TimeSignalResult) dfxl.a(intent, "om.google.android.gms.time.TIME_SIGNAL_RESULT", TimeSignalResult.CREATOR);
        if (timeSignalResult == null) {
            ((ensz) dhtk.a.j()).t("Intent received=%s contains unexpectedly null time signal", intent);
            return;
        }
        ksp kspVar = this.a;
        dhtk.a.n().D("Intent received=%s containing time signal=%s", intent, timeSignalResult);
        kspVar.accept(timeSignalResult);
    }
}
