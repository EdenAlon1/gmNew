package defpackage;

import io.grpc.Status;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fety extends feby {
    final /* synthetic */ fetz a;
    private final feby b;

    public fety(fetz fetzVar, feby febyVar) {
        this.a = fetzVar;
        this.b = febyVar;
    }

    @Override // defpackage.feby
    public final Status a(feca fecaVar) {
        Status a = this.b.a(fecaVar);
        if (a.f()) {
            this.a.b.a();
            return a;
        }
        fetz fetzVar = this.a;
        fetx fetxVar = new fetx(fetzVar);
        fejb fejbVar = (fejb) fetzVar.b;
        fejbVar.c.d();
        if (fejbVar.e == null) {
            fejbVar.e = new feml();
        }
        fedr fedrVar = fejbVar.d;
        if (fedrVar != null && fedrVar.b()) {
            return a;
        }
        long a2 = fejbVar.e.a();
        fejbVar.d = fejbVar.c.a(fetxVar, a2, TimeUnit.NANOSECONDS, fejbVar.b);
        fejb.a.logp(Level.FINE, "io.grpc.internal.BackoffPolicyRetryScheduler", "schedule", "Scheduling DNS resolution backoff for {0}ns", Long.valueOf(a2));
        return a;
    }
}
