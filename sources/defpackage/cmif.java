package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cmif implements ffji {
    final /* synthetic */ cmip a;

    public cmif(cmip cmipVar) {
        this.a = cmipVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        cmiu cmiuVar = (cmiu) obj;
        cmiuVar.getClass();
        cmin cminVar = (cmin) cmiuVar.toBuilder();
        cminVar.copyOnWrite();
        cmiu cmiuVar2 = (cmiu) cminVar.instance;
        cmiuVar2.e = this.a.e;
        cmiuVar2.b |= 2;
        eyfy build = cminVar.build();
        build.getClass();
        return (cmiu) build;
    }
}
