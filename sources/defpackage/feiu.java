package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feiu {
    public final feai a;
    public feaq b;
    public fear c;
    final /* synthetic */ feiz d;

    public feiu(feiz feizVar, feai feaiVar) {
        this.d = feizVar;
        this.a = feaiVar;
        fear a = feizVar.a.a(feizVar.b);
        this.c = a;
        if (a != null) {
            this.b = a.a(feaiVar);
            return;
        }
        throw new IllegalStateException("Could not find policy '" + feizVar.b + "'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files.");
    }
}
