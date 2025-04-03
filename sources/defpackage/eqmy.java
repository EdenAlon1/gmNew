package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqmy {
    public static final /* synthetic */ epsw a(epso epsoVar) {
        eyfy build = epsoVar.build();
        build.getClass();
        return (epsw) build;
    }

    public static final void b(int i, epso epsoVar) {
        epsoVar.copyOnWrite();
        epsw epswVar = (epsw) epsoVar.instance;
        epsw epswVar2 = epsw.a;
        epswVar.i = i - 1;
        epswVar.b |= 64;
    }

    public static final void c(int i, epso epsoVar) {
        epsoVar.copyOnWrite();
        epsw epswVar = (epsw) epsoVar.instance;
        epsw epswVar2 = epsw.a;
        epswVar.c = i - 1;
        epswVar.b |= 1;
    }
}
