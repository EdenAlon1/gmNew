package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class igu extends ffkk implements ffji {
    final /* synthetic */ igv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public igu(igv igvVar) {
        super(1);
        this.a = igvVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        iib iibVar = (iib) obj;
        this.a.d(iibVar);
        ffji ffjiVar = this.a.e;
        if (ffjiVar != null) {
            ffjiVar.invoke(iibVar);
        }
        return ffcu.a;
    }
}
