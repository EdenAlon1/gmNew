package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbcv {
    public static final /* synthetic */ fcim a(fcij fcijVar) {
        eyfy build = fcijVar.build();
        build.getClass();
        return (fcim) build;
    }

    public static final void b(String str, fcij fcijVar) {
        str.getClass();
        fcijVar.copyOnWrite();
        fcim fcimVar = (fcim) fcijVar.instance;
        fcim fcimVar2 = fcim.a;
        fcimVar.e = str;
    }

    public static final void c(fcfo fcfoVar, fcij fcijVar) {
        fcijVar.copyOnWrite();
        fcim fcimVar = (fcim) fcijVar.instance;
        fcim fcimVar2 = fcim.a;
        fcimVar.c = fcfoVar;
        fcimVar.b |= 1;
    }

    public static final void d(fcek fcekVar, fcij fcijVar) {
        fcijVar.copyOnWrite();
        fcim fcimVar = (fcim) fcijVar.instance;
        fcim fcimVar2 = fcim.a;
        fcimVar.d = fcekVar;
        fcimVar.b |= 2;
    }

    public static final void e(fcfw fcfwVar, fcij fcijVar) {
        fcijVar.copyOnWrite();
        fcim fcimVar = (fcim) fcijVar.instance;
        fcim fcimVar2 = fcim.a;
        fcimVar.f = fcfwVar;
        fcimVar.b |= 4;
    }

    public static final /* synthetic */ void f(fcil fcilVar, fcij fcijVar) {
        fcilVar.getClass();
        fcijVar.copyOnWrite();
        fcim fcimVar = (fcim) fcijVar.instance;
        fcim fcimVar2 = fcim.a;
        eygr eygrVar = fcimVar.g;
        if (!eygrVar.c()) {
            fcimVar.g = eyfy.mutableCopy(eygrVar);
        }
        fcimVar.g.add(fcilVar);
    }

    public static final void h(fcij fcijVar) {
        fcijVar.copyOnWrite();
        fcim fcimVar = (fcim) fcijVar.instance;
        fcim fcimVar2 = fcim.a;
        fcimVar.h = 2;
    }
}
