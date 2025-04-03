package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqgr {
    public static final /* synthetic */ cqgd a(cqgc cqgcVar) {
        eyfy build = cqgcVar.build();
        build.getClass();
        return (cqgd) build;
    }

    public static final eyja b(cqgc cqgcVar) {
        eyja eyjaVar = ((cqgd) cqgcVar.instance).d;
        if (eyjaVar == null) {
            eyjaVar = eyja.a;
        }
        eyjaVar.getClass();
        return eyjaVar;
    }

    public static final void c(eyja eyjaVar, cqgc cqgcVar) {
        eyjaVar.getClass();
        cqgcVar.copyOnWrite();
        cqgd cqgdVar = (cqgd) cqgcVar.instance;
        cqgd cqgdVar2 = cqgd.a;
        cqgdVar.e = eyjaVar;
        cqgdVar.b |= 2;
    }

    public static final void d(eyja eyjaVar, cqgc cqgcVar) {
        cqgcVar.copyOnWrite();
        cqgd cqgdVar = (cqgd) cqgcVar.instance;
        cqgd cqgdVar2 = cqgd.a;
        cqgdVar.f = eyjaVar;
        cqgdVar.b |= 4;
    }
}
