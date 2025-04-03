package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clzh {
    public final cmel a;
    public final errl b;
    public final dkpp c;
    private final cqoh d;

    public clzh(cmel cmelVar, errl errlVar, dkpp dkppVar, cqoh cqohVar) {
        this.a = cmelVar;
        this.b = errlVar;
        this.c = dkppVar;
        this.d = cqohVar;
    }

    public final elfl a(String str, clzf clzfVar) {
        return this.a.c(str, clzfVar);
    }

    public final clza b(int i, int i2) {
        clza createBuilder = clzf.a.createBuilder();
        eyja d = eykm.d(this.d.f().toEpochMilli());
        createBuilder.copyOnWrite();
        clzf clzfVar = (clzf) createBuilder.instance;
        d.getClass();
        clzfVar.e = d;
        clzfVar.b |= 4;
        createBuilder.copyOnWrite();
        clzf clzfVar2 = (clzf) createBuilder.instance;
        clzfVar2.c = clzd.a(i);
        clzfVar2.b |= 1;
        createBuilder.copyOnWrite();
        clzf clzfVar3 = (clzf) createBuilder.instance;
        clzfVar3.d = clzb.a(i2);
        clzfVar3.b |= 2;
        return createBuilder;
    }

    public final void c(String str, clze clzeVar, int i) {
        clza b = b(i, 4);
        b.copyOnWrite();
        clzf clzfVar = (clzf) b.instance;
        clzf clzfVar2 = clzf.a;
        clzfVar.h = clzeVar.a();
        clzfVar.b |= 64;
        a(str, b.build()).k(axnw.b(), this.b);
    }
}
