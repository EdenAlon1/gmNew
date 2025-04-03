package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ekw extends ffkk implements ffji {
    final /* synthetic */ elb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ekw(elb elbVar) {
        super(1);
        this.a = elbVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ejg ejgVar = (ejg) this.a.a.invoke();
        int b = ejgVar.b();
        int i = 0;
        while (true) {
            if (i >= b) {
                i = -1;
                break;
            }
            if (ffkj.e(ejgVar.d(i), obj)) {
                break;
            }
            i++;
        }
        return Integer.valueOf(i);
    }
}
