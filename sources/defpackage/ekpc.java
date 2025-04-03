package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekpc extends ekpf {
    public String a;
    public Integer b;
    private evbl c;

    @Override // defpackage.ekpf
    public final ekpg a() {
        evbl evblVar = this.c;
        if (evblVar != null) {
            return new ekpd(this.a, this.b, evblVar);
        }
        throw new IllegalStateException("Missing required properties: rpcServiceConfig");
    }

    @Override // defpackage.ekpf
    public final void b(evbl evblVar) {
        if (evblVar == null) {
            throw new NullPointerException("Null rpcServiceConfig");
        }
        this.c = evblVar;
    }
}
