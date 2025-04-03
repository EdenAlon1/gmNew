package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gnf extends ffkk implements ffji {
    final /* synthetic */ boolean a;
    final /* synthetic */ gnn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gnf(boolean z, gnn gnnVar) {
        super(1);
        this.a = z;
        this.b = gnnVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        jkv jkvVar = (jkv) obj;
        if (!this.a) {
            jkr.c(jkvVar);
        }
        gne gneVar = new gne(this.b);
        ffmx[] ffmxVarArr = jkr.a;
        jku jkuVar = jjl.a;
        jkvVar.e(jjl.h, new jjb(null, gneVar));
        return ffcu.a;
    }
}
