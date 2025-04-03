package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import com.google.android.gms.time.trustedtime.dto.GlobalState;
import com.google.android.gms.time.trustedtime.dto.TimeSignalResult;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dhsv implements dhtt {
    public final dhuj a;
    private final dhtp b;
    private final dhuh c;
    private final Object d;
    private final dhtq e;
    private boolean f;

    public dhsv(Context context, dhtp dhtpVar, GlobalState globalState, Executor executor) {
        dhul dhulVar = new dhul(context, globalState);
        dhuh dhuhVar = new dhuh(globalState);
        dhtq dhtqVar = new dhtq(executor, new ecda("BasicInternalTimeSignalSupplier"));
        this.d = new Object();
        this.a = dhulVar;
        this.b = dhtpVar;
        this.c = dhuhVar;
        this.e = dhtqVar;
    }

    @Override // defpackage.dhtt
    public final dhre a() {
        synchronized (this.d) {
            if (this.f) {
                return dhrt.c(null);
            }
            b();
            return this.b.a();
        }
    }

    final void b() {
        synchronized (this.d) {
            this.e.e();
            dhuj dhujVar = this.a;
            synchronized (((dhul) dhujVar).d) {
                BroadcastReceiver broadcastReceiver = ((dhul) dhujVar).e;
                if (broadcastReceiver != null) {
                    ((dhul) dhujVar).e = null;
                    ((dhul) dhujVar).b.unregisterReceiver(broadcastReceiver);
                    dhul.a.decrementAndGet();
                }
            }
            this.f = true;
        }
    }

    final void c(TimeSignalResult timeSignalResult) {
        synchronized (this.d) {
            if (this.f) {
                return;
            }
            dhts dhtsVar = new dhts(timeSignalResult.a, timeSignalResult.b, new dhsh(this.c.a, timeSignalResult.c.b), timeSignalResult.d, timeSignalResult.e);
            dhts dhtsVar2 = (dhts) this.e.c();
            if (dhtsVar2 != null) {
                dhsh dhshVar = dhtsVar2.c;
                dhsh dhshVar2 = dhtsVar.c;
                if (dhshVar.a != dhshVar2.a) {
                    throw new IllegalArgumentException("Ticks must be from the same origin");
                }
                if (dhshVar.b > dhshVar2.b) {
                    return;
                }
            }
            this.e.f(dhtsVar);
        }
    }

    @Override // defpackage.dhtt
    public final void d(dhtx dhtxVar) {
        synchronized (this.d) {
            if (this.f) {
                throw new IllegalStateException("dispose() has been called");
            }
            if (this.e.b() != 0) {
                throw new IllegalStateException("Listener already set");
            }
            dhtq dhtqVar = this.e;
            dhtxVar.getClass();
            dhtqVar.d(dhtxVar);
        }
    }

    public final String toString() {
        String str;
        synchronized (this.d) {
            str = "BasicInternalTimeSignalSupplier{parentInitializer=" + this.b.toString() + ", tickerFactory=TickerFactory, internalListenersManager=" + this.e.toString() + ", timeSignalResultReceiver=" + this.a.toString() + ", disposed=" + this.f + "}";
        }
        return str;
    }
}
