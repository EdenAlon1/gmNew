package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rqm {
    private final rqj a;

    public rqm(rqj rqjVar) {
        this.a = rqjVar;
    }

    public final /* synthetic */ rqk a() {
        eyfy build = this.a.build();
        build.getClass();
        return (rqk) build;
    }

    public final void b(rsc rscVar) {
        rqj rqjVar = this.a;
        rqjVar.copyOnWrite();
        rqk rqkVar = (rqk) rqjVar.instance;
        rqk rqkVar2 = rqk.a;
        rqkVar.f = rscVar;
        rqkVar.b |= 8;
    }

    public final void c(rsf rsfVar) {
        rqj rqjVar = this.a;
        rqjVar.copyOnWrite();
        rqk rqkVar = (rqk) rqjVar.instance;
        rqk rqkVar2 = rqk.a;
        rqkVar.c = rsfVar;
        rqkVar.b |= 1;
    }

    public final void d(rsi rsiVar) {
        rqj rqjVar = this.a;
        rqjVar.copyOnWrite();
        rqk rqkVar = (rqk) rqjVar.instance;
        rqk rqkVar2 = rqk.a;
        rqkVar.d = rsiVar;
        rqkVar.b |= 2;
    }

    public final void e(rsl rslVar) {
        rqj rqjVar = this.a;
        rqjVar.copyOnWrite();
        rqk rqkVar = (rqk) rqjVar.instance;
        rqk rqkVar2 = rqk.a;
        rqkVar.e = rslVar;
        rqkVar.b |= 4;
    }
}
