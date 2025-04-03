package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erac {
    public static final /* synthetic */ epyn a(epym epymVar) {
        eyfy build = epymVar.build();
        build.getClass();
        return (epyn) build;
    }

    public static final void b(String str, epym epymVar) {
        str.getClass();
        epymVar.copyOnWrite();
        epyn epynVar = (epyn) epymVar.instance;
        epyn epynVar2 = epyn.a;
        epynVar.b |= 1;
        epynVar.c = str;
    }

    public static final void c(epym epymVar) {
        epymVar.copyOnWrite();
        epyn epynVar = (epyn) epymVar.instance;
        epyn epynVar2 = epyn.a;
        epynVar.b |= 2;
        epynVar.d = "";
    }
}
