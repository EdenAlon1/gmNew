package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqnh {
    public static final /* synthetic */ eptp a(epti eptiVar) {
        eyfy build = eptiVar.build();
        build.getClass();
        return (eptp) build;
    }

    public static final void b(int i, epti eptiVar) {
        eptiVar.copyOnWrite();
        eptp eptpVar = (eptp) eptiVar.instance;
        eptp eptpVar2 = eptp.a;
        eptpVar.b |= 4;
        eptpVar.i = i;
    }

    public static final void c(eptv eptvVar, epti eptiVar) {
        eptiVar.copyOnWrite();
        eptp eptpVar = (eptp) eptiVar.instance;
        eptp eptpVar2 = eptp.a;
        eptpVar.g = eptvVar;
        eptpVar.b |= 1;
    }

    public static final void d(int i, epti eptiVar) {
        eptiVar.copyOnWrite();
        eptp eptpVar = (eptp) eptiVar.instance;
        eptp eptpVar2 = eptp.a;
        eptpVar.b |= 2;
        eptpVar.h = i;
    }

    public static final void e(eqaw eqawVar, epti eptiVar) {
        eptiVar.copyOnWrite();
        eptp eptpVar = (eptp) eptiVar.instance;
        eptp eptpVar2 = eptp.a;
        eptpVar.j = eqawVar;
        eptpVar.b |= 8;
    }
}
