package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hjg extends ffkk implements ffji {
    final /* synthetic */ hgh a;
    final /* synthetic */ coq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hjg(hgh hghVar, coq coqVar) {
        super(1);
        this.a = hghVar;
        this.b = coqVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.a.r(obj);
        coq coqVar = this.b;
        if (coqVar != null) {
            coqVar.g(obj);
        }
        return ffcu.a;
    }
}
