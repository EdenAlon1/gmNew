package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ffbf {
    public final Object a;
    public final feaq b;
    final /* synthetic */ ffbh e;
    public feao d = new feah(feak.a);
    public fdyc c = fdyc.CONNECTING;

    public ffbf(ffbh ffbhVar, Object obj, feag feagVar) {
        this.e = ffbhVar;
        this.a = obj;
        this.b = feagVar.a(a());
    }

    protected ffbe a() {
        return new ffbe(this);
    }

    protected final void b() {
        this.b.e();
        this.c = fdyc.SHUTDOWN;
        ffbh.f.logp(Level.FINE, "io.grpc.util.MultiChildLoadBalancer$ChildLbState", "shutdown", "Child balancer {0} deleted", this.a);
    }

    public final String toString() {
        return "Address = " + String.valueOf(this.a) + ", state = " + String.valueOf(this.c) + ", picker type: " + String.valueOf(this.d.getClass()) + ", lb: " + String.valueOf(this.b);
    }
}
