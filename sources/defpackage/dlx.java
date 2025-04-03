package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dlx extends ffkk implements ffix {
    final /* synthetic */ dly a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlx(dly dlyVar) {
        super(0);
        this.a = dlyVar;
    }

    @Override // defpackage.ffix
    public final Object invoke() {
        Object e = this.a.e();
        if (e != null) {
            return e;
        }
        dly dlyVar = this.a;
        if (Float.isNaN(dlyVar.a())) {
            return dlyVar.d();
        }
        Object b = dlyVar.k().b(dlyVar.a());
        return b == null ? dlyVar.d() : b;
    }
}
