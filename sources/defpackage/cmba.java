package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmba {
    private final cmel a;
    private final cqoh b;
    private final cguo c;

    public cmba(cmel cmelVar, cqoh cqohVar, cguo cguoVar) {
        this.a = cmelVar;
        this.b = cqohVar;
        this.c = cguoVar;
    }

    public final cmay a(String str, boolean z, String str2) {
        cmap createBuilder = cmay.a.createBuilder();
        createBuilder.copyOnWrite();
        cmay cmayVar = (cmay) createBuilder.instance;
        cmayVar.b |= 1;
        cmayVar.c = str;
        if (z) {
            cmar cmarVar = (cmar) cmas.a.createBuilder();
            eyja d = eykm.d(this.b.f().toEpochMilli());
            cmarVar.copyOnWrite();
            cmas cmasVar = (cmas) cmarVar.instance;
            d.getClass();
            cmasVar.c = d;
            cmasVar.b |= 1;
            cmas cmasVar2 = (cmas) cmarVar.build();
            cmaq cmaqVar = (cmaq) cmax.a.createBuilder();
            cmaqVar.copyOnWrite();
            cmax cmaxVar = (cmax) cmaqVar.instance;
            cmasVar2.getClass();
            cmaxVar.c = cmasVar2;
            cmaxVar.b |= 1;
            if (!djai.z() || !djai.ac() ? dizg.z() : this.c.c(str2).y) {
                cmaqVar.copyOnWrite();
                cmax cmaxVar2 = (cmax) cmaqVar.instance;
                cmaxVar2.e = cmaw.a(4);
                cmaxVar2.b = 4 | cmaxVar2.b;
            }
            createBuilder.b((cmax) cmaqVar.build());
        }
        return createBuilder.build();
    }

    public final elfl b(String str, cmay cmayVar) {
        return this.a.g(str, cmayVar);
    }
}
