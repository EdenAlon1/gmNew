package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtei {
    public static final /* synthetic */ dteh a(dteg dtegVar) {
        eyfy build = dtegVar.build();
        build.getClass();
        return (dteh) build;
    }

    public static final void b(dteq dteqVar, dteg dtegVar) {
        dtegVar.copyOnWrite();
        dteh dtehVar = (dteh) dtegVar.instance;
        dteh dtehVar2 = dteh.a;
        dtehVar.d = dteqVar;
        dtehVar.b |= 2;
    }

    public static final void c(dtfd dtfdVar, dteg dtegVar) {
        dtfdVar.getClass();
        dtegVar.copyOnWrite();
        dteh dtehVar = (dteh) dtegVar.instance;
        dteh dtehVar2 = dteh.a;
        dtehVar.c = dtfdVar;
        dtehVar.b |= 1;
    }
}
