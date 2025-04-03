package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.rcs.availability.metrics.RcsAvailabilityLogWorker;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckhf {
    public final Context a;

    public ckhf(Context context) {
        this.a = context;
    }

    public final void a() {
        pqs a = pqr.a(this.a);
        poz pozVar = poz.KEEP;
        pqh pqhVar = new pqh(RcsAvailabilityLogWorker.class, 6L, TimeUnit.HOURS, 3L, TimeUnit.HOURS);
        poh pohVar = new poh();
        pohVar.c(2);
        pohVar.c = true;
        pqhVar.g(pohVar.a());
        pqhVar.f(poa.LINEAR, 60L, TimeUnit.MINUTES);
        a.f("com.google.android.apps.messaging.shared.rcs.availability.metrics.RcsAvailabilityLogWorker", pozVar, (pqi) pqhVar.b());
    }
}
