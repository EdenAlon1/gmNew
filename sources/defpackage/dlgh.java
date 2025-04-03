package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlgh {
    public static final /* synthetic */ dlgg a(dlgf dlgfVar) {
        eyfy build = dlgfVar.build();
        build.getClass();
        return (dlgg) build;
    }

    public static final void b(boolean z, dlgf dlgfVar) {
        dlgfVar.copyOnWrite();
        dlgg dlggVar = (dlgg) dlgfVar.instance;
        dlgg dlggVar2 = dlgg.a;
        dlggVar.b |= 2;
        dlggVar.d = z;
    }

    public static final void c(dlgf dlgfVar) {
        dlgfVar.copyOnWrite();
        dlgg dlggVar = (dlgg) dlgfVar.instance;
        dlgg dlggVar2 = dlgg.a;
        dlggVar.b |= 4;
        dlggVar.e = false;
    }

    public static final void d(int i, dlgf dlgfVar) {
        dlgfVar.copyOnWrite();
        dlgg dlggVar = (dlgg) dlgfVar.instance;
        dlgg dlggVar2 = dlgg.a;
        dlggVar.c = i - 1;
        dlggVar.b |= 1;
    }
}
