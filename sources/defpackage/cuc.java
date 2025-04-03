package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cuc extends ffkk implements ffji {
    final /* synthetic */ cud a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cuc(cud cudVar) {
        super(1);
        this.a = cudVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        dau dauVar = (dau) obj;
        if (dauVar.d(cst.a, cst.b)) {
            cxa cxaVar = this.a.e.b().b;
            return cxaVar != null ? cxaVar.b : ctt.b;
        }
        if (!dauVar.d(cst.b, cst.c)) {
            return ctt.b;
        }
        cxa cxaVar2 = this.a.f.b().b;
        return cxaVar2 != null ? cxaVar2.b : ctt.b;
    }
}
