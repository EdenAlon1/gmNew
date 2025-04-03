package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eved implements evew {
    private final evbl a;

    public eved(evbl evblVar) {
        this.a = evblVar;
    }

    @Override // defpackage.evew
    public final /* synthetic */ evgb a(eves evesVar) {
        return evgb.a;
    }

    @Override // defpackage.evew
    public final evgb b(eves evesVar) {
        emxf.m(true, "Cronet does not support CallOptions.withAuthority(). See https://github.com/grpc/grpc-java/issues/1767");
        fdxj fdxjVar = evesVar.b;
        evbk evbkVar = (evbk) fdxjVar.h(evbk.a);
        if (evbkVar == null) {
            evbkVar = this.a.b(evesVar.c.b);
            evbkVar.getClass();
            fdxjVar = fdxjVar.f(evbk.a, evbkVar);
        }
        return new evgb(1, null, null, fdxjVar.f(duio.a, evbkVar.a()));
    }

    @Override // defpackage.evew
    public final /* synthetic */ evgb c() {
        return evgb.a;
    }

    @Override // defpackage.evew
    public final /* synthetic */ evgb e() {
        return evgb.a;
    }

    @Override // defpackage.evew
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.evew
    public final /* synthetic */ void g() {
    }

    @Override // defpackage.evew
    public final /* synthetic */ void d(ever everVar) {
    }
}
