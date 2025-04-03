package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjwh {
    public static final /* synthetic */ cjwg a(cjwf cjwfVar) {
        eyfy build = cjwfVar.build();
        build.getClass();
        return (cjwg) build;
    }

    public static final void b(long j, cjwf cjwfVar) {
        cjwfVar.copyOnWrite();
        cjwg cjwgVar = (cjwg) cjwfVar.instance;
        cjwg cjwgVar2 = cjwg.a;
        cjwgVar.b |= 1;
        cjwgVar.d = j;
    }

    public static final void c(String str, cjwf cjwfVar) {
        str.getClass();
        cjwfVar.copyOnWrite();
        cjwg cjwgVar = (cjwg) cjwfVar.instance;
        cjwg cjwgVar2 = cjwg.a;
        cjwgVar.c = str;
    }
}
