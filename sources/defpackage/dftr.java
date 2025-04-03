package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ConnectionInfo;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dftr implements dhqs {
    private final dftd a;
    private final int b;
    private final dfrz c;
    private final long d;
    private final long e;

    public dftr(dftd dftdVar, int i, dfrz dfrzVar, long j, long j2) {
        this.a = dftdVar;
        this.b = i;
        this.c = dfrzVar;
        this.d = j;
        this.e = j2;
    }

    public static ConnectionTelemetryConfiguration b(dfsz dfszVar, BaseGmsClient baseGmsClient, int i) {
        int[] iArr;
        int[] iArr2;
        ConnectionInfo connectionInfo = baseGmsClient.q;
        ConnectionTelemetryConfiguration connectionTelemetryConfiguration = connectionInfo == null ? null : connectionInfo.d;
        if (connectionTelemetryConfiguration == null || !connectionTelemetryConfiguration.b || ((iArr = connectionTelemetryConfiguration.d) != null ? !dfyj.b(iArr, i) : !((iArr2 = connectionTelemetryConfiguration.f) == null || !dfyj.b(iArr2, i))) || dfszVar.h >= connectionTelemetryConfiguration.e) {
            return null;
        }
        return connectionTelemetryConfiguration;
    }

    @Override // defpackage.dhqs
    public final void a(dhre dhreVar) {
        dfsz b;
        int i;
        int i2;
        int i3;
        int i4;
        long j;
        long j2;
        if (this.a.h()) {
            RootTelemetryConfiguration rootTelemetryConfiguration = dfwz.a().a;
            if ((rootTelemetryConfiguration == null || rootTelemetryConfiguration.b) && (b = this.a.b(this.c)) != null) {
                Object obj = b.b;
                if (obj instanceof BaseGmsClient) {
                    BaseGmsClient baseGmsClient = (BaseGmsClient) obj;
                    int i5 = 0;
                    boolean z = this.d > 0;
                    int i6 = baseGmsClient.l;
                    int i7 = 100;
                    if (rootTelemetryConfiguration != null) {
                        z &= rootTelemetryConfiguration.c;
                        boolean G = baseGmsClient.G();
                        int i8 = rootTelemetryConfiguration.d;
                        int i9 = rootTelemetryConfiguration.e;
                        i = rootTelemetryConfiguration.a;
                        if (G && !baseGmsClient.q()) {
                            ConnectionTelemetryConfiguration b2 = b(b, baseGmsClient, this.b);
                            if (b2 == null) {
                                return;
                            }
                            boolean z2 = b2.c && this.d > 0;
                            i9 = b2.e;
                            z = z2;
                        }
                        i3 = i8;
                        i2 = i9;
                    } else {
                        i = 0;
                        i2 = 100;
                        i3 = 5000;
                    }
                    dftd dftdVar = this.a;
                    int i10 = -1;
                    if (dhreVar.m()) {
                        i4 = 0;
                    } else {
                        if (!((dhrm) dhreVar).d) {
                            Exception h = dhreVar.h();
                            if (h instanceof dfqu) {
                                Status status = ((dfqu) h).a;
                                i7 = status.f;
                                ConnectionResult connectionResult = status.i;
                                if (connectionResult != null) {
                                    i5 = connectionResult.c;
                                    i4 = i7;
                                }
                            } else {
                                i4 = 101;
                                i5 = -1;
                            }
                        }
                        i4 = i7;
                        i5 = -1;
                    }
                    if (z) {
                        long j3 = this.d;
                        long j4 = this.e;
                        long currentTimeMillis = System.currentTimeMillis();
                        i10 = (int) (SystemClock.elapsedRealtime() - j4);
                        j2 = currentTimeMillis;
                        j = j3;
                    } else {
                        j = 0;
                        j2 = 0;
                    }
                    MethodInvocation methodInvocation = new MethodInvocation(this.b, i4, i5, j, j2, null, null, i6, i10);
                    long j5 = i3;
                    Handler handler = dftdVar.o;
                    handler.sendMessage(handler.obtainMessage(18, new dfts(methodInvocation, i, j5, i2)));
                }
            }
        }
    }
}
