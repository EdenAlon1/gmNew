package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ercf {
    public static final /* synthetic */ erce a(ercd ercdVar) {
        eyfy build = ercdVar.build();
        build.getClass();
        return (erce) build;
    }

    public static final void b(int i, ercd ercdVar) {
        ercdVar.copyOnWrite();
        erce erceVar = (erce) ercdVar.instance;
        erce erceVar2 = erce.a;
        erceVar.b |= 1;
        erceVar.c = i;
    }

    public static final void c(String str, ercd ercdVar) {
        ercdVar.copyOnWrite();
        erce erceVar = (erce) ercdVar.instance;
        erce erceVar2 = erce.a;
        erceVar.b |= 8;
        erceVar.f = str;
    }

    public static final void d(int i, ercd ercdVar) {
        ercdVar.copyOnWrite();
        erce erceVar = (erce) ercdVar.instance;
        erce erceVar2 = erce.a;
        erceVar.b |= 2;
        erceVar.d = i;
    }

    public static final void e(int i, ercd ercdVar) {
        ercdVar.copyOnWrite();
        erce erceVar = (erce) ercdVar.instance;
        erce erceVar2 = erce.a;
        erceVar.e = i - 1;
        erceVar.b |= 4;
    }
}
