package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceia {
    public static final /* synthetic */ cejk a(cejj cejjVar) {
        eyfy build = cejjVar.build();
        build.getClass();
        return (cejk) build;
    }

    public static final /* synthetic */ eyjx b(cejj cejjVar) {
        return new eyjx(new eygk(((cejk) cejjVar.instance).k, cejk.a));
    }

    public static final void c(int i, cejj cejjVar) {
        cejjVar.copyOnWrite();
        cejk cejkVar = (cejk) cejjVar.instance;
        eygj eygjVar = cejk.a;
        cejkVar.c |= 1;
        cejkVar.d = i;
    }

    public static final void d(int i, cejj cejjVar) {
        cejjVar.copyOnWrite();
        cejk cejkVar = (cejk) cejjVar.instance;
        eygj eygjVar = cejk.a;
        cejkVar.c |= 16;
        cejkVar.h = i;
    }

    public static final void e(boolean z, cejj cejjVar) {
        cejjVar.copyOnWrite();
        cejk cejkVar = (cejk) cejjVar.instance;
        eygj eygjVar = cejk.a;
        cejkVar.c |= 8;
        cejkVar.g = z;
    }

    public static final void f(String str, cejj cejjVar) {
        cejjVar.copyOnWrite();
        cejk cejkVar = (cejk) cejjVar.instance;
        eygj eygjVar = cejk.a;
        cejkVar.c |= 4;
        cejkVar.f = str;
    }

    public static final void g(eyja eyjaVar, cejj cejjVar) {
        eyjaVar.getClass();
        cejjVar.copyOnWrite();
        cejk cejkVar = (cejk) cejjVar.instance;
        eygj eygjVar = cejk.a;
        cejkVar.j = eyjaVar;
        cejkVar.c |= 64;
    }

    public static final void h(eyja eyjaVar, cejj cejjVar) {
        eyjaVar.getClass();
        cejjVar.copyOnWrite();
        cejk cejkVar = (cejk) cejjVar.instance;
        eygj eygjVar = cejk.a;
        cejkVar.i = eyjaVar;
        cejkVar.c |= 32;
    }

    public static final void i(cejo cejoVar, cejj cejjVar) {
        cejoVar.getClass();
        cejjVar.copyOnWrite();
        cejk cejkVar = (cejk) cejjVar.instance;
        eygj eygjVar = cejk.a;
        cejkVar.e = cejoVar.g;
        cejkVar.c |= 2;
    }

    public static final void j(boolean z, cejj cejjVar) {
        cejjVar.copyOnWrite();
        cejk cejkVar = (cejk) cejjVar.instance;
        eygj eygjVar = cejk.a;
        cejkVar.c |= 128;
        cejkVar.l = z;
    }

    public static final /* synthetic */ void k(cejo cejoVar, cejj cejjVar) {
        cejoVar.getClass();
        cejjVar.a(cejoVar);
    }
}
