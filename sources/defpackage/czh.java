package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class czh extends ffkk implements ffix {
    final /* synthetic */ Object a;
    final /* synthetic */ cza b;
    final /* synthetic */ Object c;
    final /* synthetic */ cyz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czh(Object obj, cza czaVar, Object obj2, cyz cyzVar) {
        super(0);
        this.a = obj;
        this.b = czaVar;
        this.c = obj2;
        this.d = cyzVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        if (!ffkj.e(this.a, this.b.a) || !ffkj.e(this.c, this.b.b)) {
            cza czaVar = this.b;
            Object obj = this.a;
            Object obj2 = this.c;
            cyz cyzVar = this.d;
            czaVar.a = obj;
            czaVar.b = obj2;
            czaVar.d = cyzVar;
            czaVar.e = new daq(cyzVar, czaVar.c, obj, obj2);
            czaVar.i.b(true);
            czaVar.f = false;
            czaVar.g = true;
        }
        return ffcu.a;
    }
}
