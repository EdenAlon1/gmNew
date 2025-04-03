package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjdf implements ciwq {
    @Override // defpackage.ciwq
    public final /* bridge */ /* synthetic */ ciwl a(Object obj) {
        cjda cjdaVar = (cjda) obj;
        cjdaVar.getClass();
        ciwk ciwkVar = (ciwk) ciwl.a.createBuilder();
        ciwkVar.copyOnWrite();
        ciwl ciwlVar = (ciwl) ciwkVar.instance;
        ciwlVar.d = cjdaVar;
        ciwlVar.c = 5;
        eyfy build = ciwkVar.build();
        build.getClass();
        return (ciwl) build;
    }

    @Override // defpackage.ciwq
    public final /* bridge */ /* synthetic */ Object c(ciwl ciwlVar) {
        ciwlVar.getClass();
        cjda cjdaVar = ciwlVar.c == 5 ? (cjda) ciwlVar.d : cjda.a;
        cjdaVar.getClass();
        return cjdaVar;
    }

    @Override // defpackage.ciwq
    public final /* synthetic */ engw b(engw engwVar) {
        return engwVar;
    }
}
