package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnfc extends BroadcastReceiver {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/receiver/CarrierConfigChangeReceiver");
    private final ffbr b;
    private final ffbr c;

    public cnfc(ffbr ffbrVar, ffbr ffbrVar2) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        this.b = ffbrVar;
        this.c = ffbrVar2;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ensk h = a.h();
        h.Y(ente.a, "Bugle");
        ((enrr) h.h("com/google/android/apps/messaging/shared/receiver/CarrierConfigChangeReceiver", "onReceive", 21, "CarrierConfigChangeReceiver.kt")).q("Carrier config changed. Reloading MMS config.");
        final cpbs cpbsVar = (cpbs) this.b.b();
        final cpbv cpbvVar = (cpbv) this.c.b();
        axos.a(new Runnable() { // from class: cpbr
            @Override // java.lang.Runnable
            public final void run() {
                cpbs.this.c(cpbvVar);
            }
        }, cpbsVar.c);
    }
}
