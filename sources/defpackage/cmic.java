package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cmic implements ffji {
    final /* synthetic */ djrm a;
    final /* synthetic */ cmis b;

    public cmic(djrm djrmVar, cmis cmisVar) {
        this.a = djrmVar;
        this.b = cmisVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        cmiu cmiuVar = (cmiu) obj;
        cmiuVar.getClass();
        cmin cminVar = (cmin) cmiuVar.toBuilder();
        cminVar.a(djrn.a(this.a).a, this.b);
        eyfy build = cminVar.build();
        build.getClass();
        return (cmiu) build;
    }
}
