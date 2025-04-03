package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class emr extends ffkk implements ffix {
    final /* synthetic */ hkx a;
    final /* synthetic */ eot b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emr(hkx hkxVar, eot eotVar) {
        super(0);
        this.a = hkxVar;
        this.b = eotVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        enq enqVar = (enq) this.a.a();
        return new ens(this.b, enqVar, new elp(this.b.e.d.a(), enqVar));
    }
}
