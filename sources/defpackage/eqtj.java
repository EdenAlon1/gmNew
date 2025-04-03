package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqtj {
    public final eqsv a;

    public eqtj(eqsv eqsvVar) {
        this.a = eqsvVar;
    }

    public final /* synthetic */ eqsw a() {
        eyfy build = this.a.build();
        build.getClass();
        return (eqsw) build;
    }

    public final void b(boolean z) {
        eqsv eqsvVar = this.a;
        eqsvVar.copyOnWrite();
        eqsw eqswVar = (eqsw) eqsvVar.instance;
        eqsw eqswVar2 = eqsw.a;
        eqswVar.b |= 16;
        eqswVar.g = z;
    }

    public final void c(boolean z) {
        eqsv eqsvVar = this.a;
        eqsvVar.copyOnWrite();
        eqsw eqswVar = (eqsw) eqsvVar.instance;
        eqsw eqswVar2 = eqsw.a;
        eqswVar.b |= 8;
        eqswVar.f = z;
    }
}
