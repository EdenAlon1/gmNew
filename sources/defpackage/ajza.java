package defpackage;

import androidx.car.app.model.Alert;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajza {
    public static final enru a = enru.c("com/google/android/apps/messaging/restore/analytics/RestoreEventLogger");
    public final ffsk b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;

    public ajza(ffbr ffbrVar, ffbr ffbrVar2, ffsk ffskVar, ffbr ffbrVar3) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffskVar.getClass();
        ffbrVar3.getClass();
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.b = ffskVar;
        this.e = ffbrVar3;
    }

    public static final int b(int i, Duration duration) {
        if (duration.toMillis() == 0) {
            return 0;
        }
        double millis = (i / duration.toMillis()) * 1000.0d;
        return millis < eobe.a ? Alert.DURATION_SHOW_INDEFINITELY : (int) millis;
    }

    public final ffbr a(boolean z) {
        return (z || !((aucj) this.e.b()).a()) ? this.c : this.d;
    }
}
