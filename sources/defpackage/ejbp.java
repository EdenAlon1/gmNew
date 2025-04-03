package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejbp {
    public static final /* synthetic */ ejbo a(ejbl ejblVar) {
        eyfy build = ejblVar.build();
        build.getClass();
        return (ejbo) build;
    }

    public static final void b(boolean z, ejbl ejblVar) {
        ejblVar.copyOnWrite();
        ejbo ejboVar = (ejbo) ejblVar.instance;
        ejbo ejboVar2 = ejbo.a;
        ejboVar.b |= 1;
        ejboVar.c = z;
    }

    public static final void c(int i, ejbl ejblVar) {
        ejblVar.copyOnWrite();
        ejbo ejboVar = (ejbo) ejblVar.instance;
        ejbo ejboVar2 = ejbo.a;
        ejboVar.e = i - 1;
        ejboVar.b |= 2;
    }
}
