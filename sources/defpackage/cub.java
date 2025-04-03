package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cub extends ffkk implements ffji {
    final /* synthetic */ cud a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cub(cud cudVar) {
        super(1);
        this.a = cudVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        dau dauVar = (dau) obj;
        Object obj2 = null;
        if (dauVar.d(cst.a, cst.b)) {
            csd csdVar = this.a.e.b().c;
            if (csdVar != null) {
                obj2 = csdVar.c;
            }
        } else if (dauVar.d(cst.b, cst.c)) {
            csd csdVar2 = this.a.f.b().c;
            if (csdVar2 != null) {
                obj2 = csdVar2.c;
            }
        } else {
            obj2 = ctt.c;
        }
        return obj2 == null ? ctt.c : obj2;
    }
}
