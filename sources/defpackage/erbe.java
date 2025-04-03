package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erbe {
    private final eqkm a;

    public erbe(eqkm eqkmVar) {
        this.a = eqkmVar;
    }

    public final /* synthetic */ eqkn a() {
        eyfy build = this.a.build();
        build.getClass();
        return (eqkn) build;
    }

    public final void b(eqwo eqwoVar) {
        eqkm eqkmVar = this.a;
        eqkmVar.copyOnWrite();
        eqkn eqknVar = (eqkn) eqkmVar.instance;
        eqkn eqknVar2 = eqkn.a;
        eqknVar.d = eqwoVar;
        eqknVar.b |= 2;
    }

    public final void c(int i) {
        eqkm eqkmVar = this.a;
        eqkmVar.copyOnWrite();
        eqkn eqknVar = (eqkn) eqkmVar.instance;
        eqkn eqknVar2 = eqkn.a;
        eqknVar.c = i - 1;
        eqknVar.b |= 1;
    }
}
