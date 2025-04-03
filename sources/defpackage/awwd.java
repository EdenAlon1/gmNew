package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awwd {
    public static final /* synthetic */ awwc a(awwb awwbVar) {
        eyfy build = awwbVar.build();
        build.getClass();
        return (awwc) build;
    }

    public static final void b(awxf awxfVar, awwb awwbVar) {
        awxfVar.getClass();
        awwbVar.copyOnWrite();
        awwc awwcVar = (awwc) awwbVar.instance;
        awwc awwcVar2 = awwc.a;
        awwcVar.e = awxfVar;
        awwcVar.b |= 4;
    }

    public static final void c(String str, awwb awwbVar) {
        str.getClass();
        awwbVar.copyOnWrite();
        awwc awwcVar = (awwc) awwbVar.instance;
        awwc awwcVar2 = awwc.a;
        awwcVar.b |= 1;
        awwcVar.c = str;
    }

    public static final void d(boolean z, awwb awwbVar) {
        awwbVar.copyOnWrite();
        awwc awwcVar = (awwc) awwbVar.instance;
        awwc awwcVar2 = awwc.a;
        awwcVar.b |= 2;
        awwcVar.d = z;
    }
}
