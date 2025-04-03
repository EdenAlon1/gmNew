package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqyi {
    public static final /* synthetic */ eqyh a(eqxx eqxxVar) {
        eyfy build = eqxxVar.build();
        build.getClass();
        return (eqyh) build;
    }

    public static final void b(eqyb eqybVar, eqxx eqxxVar) {
        eqxxVar.copyOnWrite();
        eqyh eqyhVar = (eqyh) eqxxVar.instance;
        eqyh eqyhVar2 = eqyh.a;
        eqyhVar.e = eqybVar;
        eqyhVar.b |= 256;
    }

    public static final void c(int i, eqxx eqxxVar) {
        eqxxVar.copyOnWrite();
        eqyh eqyhVar = (eqyh) eqxxVar.instance;
        eqyh eqyhVar2 = eqyh.a;
        eqyhVar.c = i - 1;
        eqyhVar.b |= 1;
    }
}
