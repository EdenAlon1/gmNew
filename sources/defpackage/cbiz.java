package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbiz {
    public static final /* synthetic */ cbiy a(cbix cbixVar) {
        eyfy build = cbixVar.build();
        build.getClass();
        return (cbiy) build;
    }

    public static final void b(String str, cbix cbixVar) {
        str.getClass();
        cbixVar.copyOnWrite();
        cbiy cbiyVar = (cbiy) cbixVar.instance;
        cbiy cbiyVar2 = cbiy.a;
        cbiyVar.b |= 1;
        cbiyVar.c = str;
    }

    public static final void c(long j, cbix cbixVar) {
        cbixVar.copyOnWrite();
        cbiy cbiyVar = (cbiy) cbixVar.instance;
        cbiy cbiyVar2 = cbiy.a;
        cbiyVar.b |= 2;
        cbiyVar.d = j;
    }
}
