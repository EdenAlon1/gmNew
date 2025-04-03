package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jhj extends ffkk implements ffji {
    final /* synthetic */ jhk a;
    final /* synthetic */ ffjm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jhj(jhk jhkVar, ffjm ffjmVar) {
        super(1);
        this.a = jhkVar;
        this.b = ffjmVar;
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        iyq iyqVar = (iyq) obj;
        if (!this.a.c) {
            lkk P = iyqVar.a.P();
            jhk jhkVar = this.a;
            jhkVar.e = this.b;
            if (jhkVar.d == null) {
                jhkVar.d = P;
                P.c(jhkVar);
            } else if (P.a().a(lkj.CREATED)) {
                jhk jhkVar2 = this.a;
                ((hfu) jhkVar2.b).l(new hpw(-2000640158, true, new jhi(jhkVar2, this.b)));
            }
        }
        return ffcu.a;
    }
}
