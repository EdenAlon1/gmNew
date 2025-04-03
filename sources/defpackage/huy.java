package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class huy extends ffkk implements ffjm {
    final /* synthetic */ hfd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public huy(hfd hfdVar) {
        super(2);
        this.a = hfdVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hvi hviVar = (hvi) obj;
        hvi hviVar2 = (hvg) obj2;
        if (hviVar2 instanceof huw) {
            ffjn ffjnVar = ((huw) hviVar2).a;
            fflf.e(ffjnVar, 3);
            hviVar2 = huz.a(this.a, (hvi) ffjnVar.a(hvi.e, this.a, 0));
        }
        return hviVar.a(hviVar2);
    }
}
