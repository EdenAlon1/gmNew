package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feri implements feap {
    public ferp a;
    final /* synthetic */ ferq b;

    public feri(ferq ferqVar) {
        this.b = ferqVar;
    }

    @Override // defpackage.feap
    public final void a(fdyd fdydVar) {
        if (this.b.o) {
            ferq.f.logp(Level.WARNING, "io.grpc.internal.PickFirstLeafLoadBalancer$HealthListener", "onSubchannelState", "Ignoring health status {0} for subchannel {1} as this is not under a petiole policy", new Object[]{fdydVar, this.a.a});
            return;
        }
        ferq.f.logp(Level.FINE, "io.grpc.internal.PickFirstLeafLoadBalancer$HealthListener", "onSubchannelState", "Received health status {0} for subchannel {1}", new Object[]{fdydVar, this.a.a});
        this.a.d = fdydVar;
        if (this.b.i.f()) {
            ferp ferpVar = this.a;
            ferq ferqVar = this.b;
            if (ferpVar == ferqVar.h.get(ferqVar.i.b())) {
                this.b.i(this.a);
            }
        }
    }
}
