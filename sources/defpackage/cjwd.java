package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjwd {
    public static final /* synthetic */ cjwc a(cjwb cjwbVar) {
        eyfy build = cjwbVar.build();
        build.getClass();
        return (cjwc) build;
    }

    public static final void b(boolean z, cjwb cjwbVar) {
        cjwbVar.copyOnWrite();
        cjwc cjwcVar = (cjwc) cjwbVar.instance;
        cjwc cjwcVar2 = cjwc.a;
        cjwcVar.b |= 64;
        cjwcVar.g = z;
    }

    public static final void c(boolean z, cjwb cjwbVar) {
        cjwbVar.copyOnWrite();
        cjwc cjwcVar = (cjwc) cjwbVar.instance;
        cjwc cjwcVar2 = cjwc.a;
        cjwcVar.b |= 512;
        cjwcVar.i = z;
    }

    public static final void d(eyja eyjaVar, cjwb cjwbVar) {
        eyjaVar.getClass();
        cjwbVar.copyOnWrite();
        cjwc cjwcVar = (cjwc) cjwbVar.instance;
        cjwc cjwcVar2 = cjwc.a;
        cjwcVar.j = eyjaVar;
        cjwcVar.b |= 1024;
    }

    public static final void e(cjvw cjvwVar, cjwb cjwbVar) {
        cjwbVar.copyOnWrite();
        cjwc cjwcVar = (cjwc) cjwbVar.instance;
        cjwc cjwcVar2 = cjwc.a;
        cjwcVar.c = cjvwVar;
        cjwcVar.b |= 1;
    }

    public static final void f(cjvz cjvzVar, cjwb cjwbVar) {
        cjwbVar.copyOnWrite();
        cjwc cjwcVar = (cjwc) cjwbVar.instance;
        cjwc cjwcVar2 = cjwc.a;
        cjwcVar.d = cjvzVar;
        cjwcVar.b |= 2;
    }

    public static final void g(cjwb cjwbVar) {
        cjwbVar.copyOnWrite();
        cjwc cjwcVar = (cjwc) cjwbVar.instance;
        cjwc cjwcVar2 = cjwc.a;
        cjwcVar.b |= 128;
        cjwcVar.h = true;
    }
}
