package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cmhy implements ffji {
    final /* synthetic */ cmii a;
    final /* synthetic */ djrm b;
    final /* synthetic */ int c;

    public cmhy(cmii cmiiVar, djrm djrmVar, int i) {
        this.a = cmiiVar;
        this.b = djrmVar;
        this.c = i;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        cmiu cmiuVar = (cmiu) obj;
        cmiuVar.getClass();
        cmin cminVar = (cmin) cmiuVar.toBuilder();
        cmim cmimVar = cmiuVar.d;
        if (cmimVar == null) {
            cmimVar = cmim.a;
        }
        cmij cmijVar = (cmij) cmimVar.toBuilder();
        cmii cmiiVar = this.a;
        djrm djrmVar = this.b;
        int i = this.c;
        String z = cmiiVar.z(djrmVar);
        cmijVar.copyOnWrite();
        cmim cmimVar2 = (cmim) cmijVar.instance;
        eyhm eyhmVar = cmimVar2.c;
        if (!eyhmVar.b) {
            cmimVar2.c = eyhmVar.a();
        }
        cmimVar2.c.put(z, Integer.valueOf(i));
        cminVar.copyOnWrite();
        cmiu cmiuVar2 = (cmiu) cminVar.instance;
        cmim cmimVar3 = (cmim) cmijVar.build();
        cmimVar3.getClass();
        cmiuVar2.d = cmimVar3;
        cmiuVar2.b |= 1;
        eyfy build = cminVar.build();
        build.getClass();
        return (cmiu) build;
    }
}
