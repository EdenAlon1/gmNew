package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class deo extends ffkk implements ffji {
    final /* synthetic */ icv a;
    final /* synthetic */ ibq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public deo(icv icvVar, ibq ibqVar) {
        super(1);
        this.a = icvVar;
        this.b = ibqVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ifo ifoVar = (ifo) obj;
        ifoVar.p();
        ifq.n(ifoVar, this.a, this.b, 0.0f, null, 60);
        return ffcu.a;
    }
}
