package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqwd {
    private final eqwn a;

    public eqwd(eqwn eqwnVar) {
        this.a = eqwnVar;
    }

    public final /* synthetic */ eqwo a() {
        eyfy build = this.a.build();
        build.getClass();
        return (eqwo) build;
    }

    public final void b(eqpc eqpcVar) {
        eqpcVar.getClass();
        eqwn eqwnVar = this.a;
        eqwnVar.copyOnWrite();
        eqwo eqwoVar = (eqwo) eqwnVar.instance;
        eqwo eqwoVar2 = eqwo.a;
        eqwoVar.d = eqpcVar;
        eqwoVar.b |= 2;
    }

    public final void c(eqwf eqwfVar) {
        eqwfVar.getClass();
        eqwn eqwnVar = this.a;
        eqwnVar.copyOnWrite();
        eqwo eqwoVar = (eqwo) eqwnVar.instance;
        eqwo eqwoVar2 = eqwo.a;
        eqwoVar.c = eqwfVar.N;
        eqwoVar.b |= 1;
    }
}
