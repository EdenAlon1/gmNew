package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alhc implements algz {
    private final ffsk a;
    private final Context b;
    private final cins c;
    private final enru d;
    private final ConcurrentHashMap e;
    private final ConcurrentHashMap f;
    private final AtomicInteger g;

    public alhc(ffsk ffskVar, Context context, cins cinsVar) {
        ffskVar.getClass();
        context.getClass();
        cinsVar.getClass();
        this.a = ffskVar;
        this.b = context;
        this.c = cinsVar;
        this.d = enru.c("com/google/android/apps/messaging/shared/analytics/latencydetection/LatencyDetectionAgentImpl");
        this.e = new ConcurrentHashMap();
        this.f = new ConcurrentHashMap();
        this.g = new AtomicInteger(1);
    }

    @Override // defpackage.algz
    public final alha a(long j) {
        int andIncrement = this.g.getAndIncrement();
        alha alhaVar = new alha(this, andIncrement);
        this.e.put(Integer.valueOf(andIncrement), alhaVar);
        this.f.put(Integer.valueOf(alhaVar.a), axol.k(this.a, null, new alhb(j, this, alhaVar, null), 3));
        return alhaVar;
    }

    public final void b(alha alhaVar, int i) {
        ffud ffudVar = (ffud) this.f.remove(Integer.valueOf(alhaVar.a));
        if (ffudVar != null) {
            ffudVar.t(null);
        }
        if (this.e.remove(Integer.valueOf(alhaVar.a)) == null) {
            return;
        }
        if (i != 2) {
            ensk h = this.d.h();
            h.Y(ente.a, "Bugle");
            ((enrr) h.h("com/google/android/apps/messaging/shared/analytics/latencydetection/LatencyDetectionAgentImpl", "stopDetector", 86, "LatencyDetectionAgentImpl.kt")).q("LatencyDetectionAgent has not detected a slowness latency or got cancelled.");
            return;
        }
        ensk h2 = this.d.h();
        h2.Y(ente.a, "Bugle");
        ((enrr) h2.h("com/google/android/apps/messaging/shared/analytics/latencydetection/LatencyDetectionAgentImpl", "stopDetector", 75, "LatencyDetectionAgentImpl.kt")).q("LatencyDetectionAgent has detected a slowness latency, push notification.");
        cins cinsVar = this.c;
        Context context = this.b;
        ephv ephvVar = ephv.SLOW_PERFORMANCE;
        String string = context.getString(R.string.report_issue_slow_performance);
        string.getClass();
        cinsVar.R(ephvVar, 0L, string);
    }
}
