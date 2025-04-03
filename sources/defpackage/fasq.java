package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fasq {
    public static final /* synthetic */ fatc a(fatb fatbVar) {
        eyfy build = fatbVar.build();
        build.getClass();
        return (fatc) build;
    }

    public static final void b(fasu fasuVar, fatb fatbVar) {
        fatbVar.copyOnWrite();
        fatc fatcVar = (fatc) fatbVar.instance;
        fatc fatcVar2 = fatc.a;
        fatcVar.d = fasuVar;
        fatcVar.c = 2;
    }

    public static final void c(String str, fatb fatbVar) {
        fatbVar.copyOnWrite();
        fatc fatcVar = (fatc) fatbVar.instance;
        fatc fatcVar2 = fatc.a;
        fatcVar.e = str;
    }

    public static final void d(fatf fatfVar, fatb fatbVar) {
        fatbVar.copyOnWrite();
        fatc fatcVar = (fatc) fatbVar.instance;
        fatc fatcVar2 = fatc.a;
        fatcVar.d = fatfVar;
        fatcVar.c = 1;
    }

    public static final void e(String str, fatb fatbVar) {
        fatbVar.copyOnWrite();
        fatc fatcVar = (fatc) fatbVar.instance;
        fatc fatcVar2 = fatc.a;
        fatcVar.b |= 1;
        fatcVar.f = str;
    }
}
