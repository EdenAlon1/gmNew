package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmrt {
    public static final /* synthetic */ cmrs a(cmrr cmrrVar) {
        eyfy build = cmrrVar.build();
        build.getClass();
        return (cmrs) build;
    }

    public static final void b(cmri cmriVar, cmrr cmrrVar) {
        cmrrVar.copyOnWrite();
        cmrs cmrsVar = (cmrs) cmrrVar.instance;
        cmrs cmrsVar2 = cmrs.a;
        cmrsVar.c = cmriVar;
        cmrsVar.b |= 1;
    }

    public static final void c(String str, cmrr cmrrVar) {
        cmrrVar.copyOnWrite();
        cmrs cmrsVar = (cmrs) cmrrVar.instance;
        cmrs cmrsVar2 = cmrs.a;
        cmrsVar.b |= 8;
        cmrsVar.f = str;
    }

    public static final void d(fjay fjayVar, cmrr cmrrVar) {
        cmrrVar.copyOnWrite();
        cmrs cmrsVar = (cmrs) cmrrVar.instance;
        cmrs cmrsVar2 = cmrs.a;
        cmrsVar.e = fjayVar;
        cmrsVar.b |= 4;
    }
}
