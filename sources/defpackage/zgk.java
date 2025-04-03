package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zgk implements ffjp {
    final /* synthetic */ zgm a;

    public zgk(zgm zgmVar) {
        this.a = zgmVar;
    }

    @Override // defpackage.ffjp
    public final /* bridge */ /* synthetic */ Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        dspe dspeVar = (dspe) obj;
        hvi hviVar = (hvi) obj2;
        zgv zgvVar = (zgv) obj3;
        int intValue = ((Number) obj5).intValue();
        dspeVar.getClass();
        hviVar.getClass();
        zgvVar.getClass();
        zgm zgmVar = this.a;
        zgmVar.c(dspeVar, hviVar, zgvVar, (hfd) obj4, (intValue & 126) | 512 | (intValue & 896));
        return ffcu.a;
    }
}
