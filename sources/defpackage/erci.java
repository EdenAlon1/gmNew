package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erci {
    public static final /* synthetic */ erch a(ercg ercgVar) {
        eyfy build = ercgVar.build();
        build.getClass();
        return (erch) build;
    }

    public static final void b(int i, ercg ercgVar) {
        ercgVar.copyOnWrite();
        erch erchVar = (erch) ercgVar.instance;
        erch erchVar2 = erch.a;
        erchVar.b |= 4;
        erchVar.g = i;
    }

    public static final void c(erce erceVar, ercg ercgVar) {
        ercgVar.copyOnWrite();
        erch erchVar = (erch) ercgVar.instance;
        erch erchVar2 = erch.a;
        erchVar.e = erceVar;
        erchVar.b |= 1;
    }

    public static final void d(int i, ercg ercgVar) {
        ercgVar.copyOnWrite();
        erch erchVar = (erch) ercgVar.instance;
        erch erchVar2 = erch.a;
        erchVar.f = i - 1;
        erchVar.b |= 2;
    }
}
