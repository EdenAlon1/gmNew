package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eja extends ffkk implements ffjm {
    final /* synthetic */ ejc a;
    final /* synthetic */ ejb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eja(ejc ejcVar, ejb ejbVar) {
        super(2);
        this.a = ejcVar;
        this.b = ejbVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [ejg, java.lang.Object] */
    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        int intValue = ((Number) obj2).intValue();
        int i = intValue & 3;
        if (hfdVar.J(i != 2, intValue & 1)) {
            ejc ejcVar = this.a;
            ejb ejbVar = this.b;
            ?? invoke = ejcVar.b.invoke();
            int i2 = ejbVar.c;
            if ((i2 >= invoke.b() || !ffkj.e(invoke.d(i2), this.b.a)) && (i2 = invoke.a(this.b.a)) != -1) {
                this.b.c = i2;
            }
            int i3 = i2;
            if (i3 != -1) {
                hfdVar.v(-660404355);
                ejf.a(invoke, this.a.a, i3, this.b.a, hfdVar, 0);
                hfdVar.o();
            } else {
                hfdVar.v(-660169871);
                hfdVar.o();
            }
            ejb ejbVar2 = this.b;
            boolean F = hfdVar.F(ejbVar2);
            ejb ejbVar3 = this.b;
            Object f = hfdVar.f();
            if (F || f == hfc.a) {
                f = new eiz(ejbVar3);
                hfdVar.y(f);
            }
            hgs.c(ejbVar2.a, (ffji) f, hfdVar);
        } else {
            hfdVar.s();
        }
        return ffcu.a;
    }
}
