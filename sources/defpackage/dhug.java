package defpackage;

import android.os.SystemClock;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhug implements dhsj {
    private final dhsj a;
    private final dhuq b;

    public dhug(dhsj dhsjVar, dhuq dhuqVar) {
        this.a = dhsjVar;
        this.b = dhuqVar;
    }

    @Override // defpackage.dhsj
    public final Instant a() {
        dhsj dhsjVar = this.a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long currentTimeMillis = System.currentTimeMillis();
        Instant a = dhsjVar.a();
        this.b.a(a != null ? 2 : 1, currentTimeMillis, System.currentTimeMillis(), (int) (SystemClock.elapsedRealtime() - elapsedRealtime));
        return a;
    }

    public final String toString() {
        dhuq dhuqVar = this.b;
        return "TelemetryTrustedTimeClientImpl{delegate=" + this.a.toString() + ", trustedTimeTelemetryLogger=" + dhuqVar.toString() + "}";
    }
}
