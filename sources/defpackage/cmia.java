package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cmia implements ffji {
    final /* synthetic */ djrm a;
    final /* synthetic */ eyja b;

    public cmia(djrm djrmVar, eyja eyjaVar) {
        this.a = djrmVar;
        this.b = eyjaVar;
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
        String str = djrn.a(this.a).a;
        eyja eyjaVar = this.b;
        cmijVar.copyOnWrite();
        cmim cmimVar2 = (cmim) cmijVar.instance;
        eyhm eyhmVar = cmimVar2.b;
        if (!eyhmVar.b) {
            cmimVar2.b = eyhmVar.a();
        }
        cmimVar2.b.put(str, eyjaVar);
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
