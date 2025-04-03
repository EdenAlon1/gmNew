package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akce {
    public static final /* synthetic */ akcd a(akcc akccVar) {
        eyfy build = akccVar.build();
        build.getClass();
        return (akcd) build;
    }

    public static final void b(String str, akcc akccVar) {
        akccVar.copyOnWrite();
        akcd akcdVar = (akcd) akccVar.instance;
        akcd akcdVar2 = akcd.a;
        akcdVar.b |= 2;
        akcdVar.d = str;
    }

    public static final void c(eyja eyjaVar, akcc akccVar) {
        akccVar.copyOnWrite();
        akcd akcdVar = (akcd) akccVar.instance;
        akcd akcdVar2 = akcd.a;
        akcdVar.e = eyjaVar;
        akcdVar.b |= 4;
    }

    public static final void d(long j, akcc akccVar) {
        akccVar.copyOnWrite();
        akcd akcdVar = (akcd) akccVar.instance;
        akcd akcdVar2 = akcd.a;
        akcdVar.b |= 8;
        akcdVar.f = j;
    }

    public static final void e(long j, akcc akccVar) {
        akccVar.copyOnWrite();
        akcd akcdVar = (akcd) akccVar.instance;
        akcd akcdVar2 = akcd.a;
        akcdVar.b |= 16;
        akcdVar.g = j;
    }

    public static final void f(long j, akcc akccVar) {
        akccVar.copyOnWrite();
        akcd akcdVar = (akcd) akccVar.instance;
        akcd akcdVar2 = akcd.a;
        akcdVar.b |= 1;
        akcdVar.c = j;
    }
}
