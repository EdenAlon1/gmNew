package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnss {
    public static final /* synthetic */ cnsr a(cnsq cnsqVar) {
        eyfy build = cnsqVar.build();
        build.getClass();
        return (cnsr) build;
    }

    public static final void b(cnue cnueVar, cnsq cnsqVar) {
        cnsqVar.copyOnWrite();
        cnsr cnsrVar = (cnsr) cnsqVar.instance;
        cnsr cnsrVar2 = cnsr.a;
        cnsrVar.e = cnueVar;
        cnsrVar.b |= 4;
    }

    public static final void c(String str, cnsq cnsqVar) {
        str.getClass();
        cnsqVar.copyOnWrite();
        cnsr cnsrVar = (cnsr) cnsqVar.instance;
        cnsr cnsrVar2 = cnsr.a;
        cnsrVar.b |= 1;
        cnsrVar.c = str;
    }
}
