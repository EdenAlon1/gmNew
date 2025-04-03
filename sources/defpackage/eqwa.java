package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqwa {
    private final eqky a;

    public eqwa(eqky eqkyVar) {
        this.a = eqkyVar;
    }

    public final /* synthetic */ eqkz a() {
        eyfy build = this.a.build();
        build.getClass();
        return (eqkz) build;
    }

    public final void b(long j) {
        eqky eqkyVar = this.a;
        eqkyVar.copyOnWrite();
        eqkz eqkzVar = (eqkz) eqkyVar.instance;
        eqkz eqkzVar2 = eqkz.a;
        eqkzVar.b |= 1;
        eqkzVar.c = j;
    }

    public final void c(boolean z) {
        eqky eqkyVar = this.a;
        eqkyVar.copyOnWrite();
        eqkz eqkzVar = (eqkz) eqkyVar.instance;
        eqkz eqkzVar2 = eqkz.a;
        eqkzVar.b |= 2;
        eqkzVar.d = z;
    }

    public final void d(boolean z) {
        eqky eqkyVar = this.a;
        eqkyVar.copyOnWrite();
        eqkz eqkzVar = (eqkz) eqkyVar.instance;
        eqkz eqkzVar2 = eqkz.a;
        eqkzVar.b |= 4;
        eqkzVar.e = z;
    }
}
