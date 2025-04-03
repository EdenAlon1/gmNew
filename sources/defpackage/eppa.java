package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eppa {
    public final epox a;

    public eppa(epox epoxVar) {
        this.a = epoxVar;
    }

    public final /* synthetic */ epoy a() {
        eyfy build = this.a.build();
        build.getClass();
        return (epoy) build;
    }

    public final void b(int i) {
        epox epoxVar = this.a;
        epoxVar.copyOnWrite();
        epoy epoyVar = (epoy) epoxVar.instance;
        epoy epoyVar2 = epoy.a;
        epoyVar.c = Integer.valueOf(i - 1);
        epoyVar.b = 2;
    }
}
