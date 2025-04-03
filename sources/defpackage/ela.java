package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ela extends ffkk implements ffji {
    final /* synthetic */ elb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ela(elb elbVar) {
        super(1);
        this.a = elbVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        ejg ejgVar = (ejg) this.a.a.invoke();
        if (intValue < 0 || intValue >= ejgVar.b()) {
            dwv.c("Can't scroll to index " + intValue + ", it is out of bounds [0, " + ejgVar.b() + ')');
        }
        elb elbVar = this.a;
        ffqy.d(elbVar.D(), null, null, new ekz(elbVar, intValue, null), 3);
        return true;
    }
}
