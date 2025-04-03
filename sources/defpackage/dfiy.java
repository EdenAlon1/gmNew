package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfiy {
    public static final /* synthetic */ dfix a(dfiw dfiwVar) {
        eyfy build = dfiwVar.build();
        build.getClass();
        return (dfix) build;
    }

    public static final void b(String str, dfiw dfiwVar) {
        str.getClass();
        dfiwVar.copyOnWrite();
        dfix dfixVar = (dfix) dfiwVar.instance;
        dfix dfixVar2 = dfix.a;
        dfixVar.b |= 1;
        dfixVar.e = str;
    }

    public static final void c(dfjy dfjyVar, dfiw dfiwVar) {
        dfiwVar.copyOnWrite();
        dfix dfixVar = (dfix) dfiwVar.instance;
        dfix dfixVar2 = dfix.a;
        dfixVar.d = dfjyVar;
        dfixVar.c = 3;
    }

    public static final void d(int i, dfiw dfiwVar) {
        dfiwVar.copyOnWrite();
        dfix dfixVar = (dfix) dfiwVar.instance;
        dfix dfixVar2 = dfix.a;
        dfixVar.b |= 2;
        dfixVar.f = i;
    }
}
