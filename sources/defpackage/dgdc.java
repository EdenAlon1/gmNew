package defpackage;

import android.content.Context;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import j$.time.Duration;
import j$.time.Instant;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dgdc {
    private static final Duration b = Duration.ofMinutes(30);
    public final AtomicReference a;
    private final dfxf c;

    public dgdc(Context context) {
        dfxo dfxoVar = new dfxo(context, new dfxg("droidguard"));
        this.a = new AtomicReference(Instant.MIN);
        this.c = dfxoVar;
    }

    final synchronized void a(int i, dhre dhreVar, long j, long j2) {
        int i2;
        int i3;
        int i4;
        final Instant ofEpochMilli = Instant.ofEpochMilli(System.currentTimeMillis());
        if (((Instant) this.a.get()).plus(b).isAfter(ofEpochMilli)) {
            return;
        }
        if (dhreVar.m()) {
            i4 = 0;
            i3 = 0;
        } else {
            if (((dhrm) dhreVar).d) {
                i2 = 100;
            } else {
                Exception h = dhreVar.h();
                if (h instanceof dfqu) {
                    Status status = ((dfqu) h).a;
                    int i5 = status.f;
                    ConnectionResult connectionResult = status.i;
                    i3 = connectionResult != null ? connectionResult.c : -1;
                    i4 = i5;
                } else {
                    i2 = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
                }
            }
            i4 = i2;
            i3 = -1;
        }
        this.c.a(new TelemetryData(0, engw.r(new MethodInvocation(i, i4, i3, j, j2, null, null, 0, -1)))).t(new dhqv() { // from class: dgdb
            @Override // defpackage.dhqv
            public final void d(Exception exc) {
                ConnectionResult connectionResult2;
                if ((exc instanceof dfqu) && (connectionResult2 = ((dfqu) exc).a.i) != null && connectionResult2.c == 24) {
                    dgdc.this.a.set(ofEpochMilli);
                }
            }
        });
    }
}
