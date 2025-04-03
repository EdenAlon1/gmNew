package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlgp {
    public static final dlgg a(dlgn dlgnVar) {
        dlgg dlggVar = ((dlgo) dlgnVar.instance).c;
        if (dlggVar == null) {
            dlggVar = dlgg.a;
        }
        dlggVar.getClass();
        return dlggVar;
    }

    public static final /* synthetic */ dlgo b(dlgn dlgnVar) {
        eyfy build = dlgnVar.build();
        build.getClass();
        return (dlgo) build;
    }

    public static final void c(dlgg dlggVar, dlgn dlgnVar) {
        dlgnVar.copyOnWrite();
        dlgo dlgoVar = (dlgo) dlgnVar.instance;
        dlgo dlgoVar2 = dlgo.a;
        dlgoVar.c = dlggVar;
        dlgoVar.b |= 1;
    }

    public static final /* synthetic */ void d(dlgs dlgsVar, dlgn dlgnVar) {
        dlgnVar.copyOnWrite();
        dlgo dlgoVar = (dlgo) dlgnVar.instance;
        dlgo dlgoVar2 = dlgo.a;
        eygr eygrVar = dlgoVar.d;
        if (!eygrVar.c()) {
            dlgoVar.d = eyfy.mutableCopy(eygrVar);
        }
        dlgoVar.d.add(dlgsVar);
    }
}
