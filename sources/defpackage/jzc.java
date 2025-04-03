package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jzc extends ffkk implements ffjm {
    final /* synthetic */ Object[] a;
    final /* synthetic */ hjz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jzc(Object[] objArr, hjz hjzVar) {
        super(2);
        this.a = objArr;
        this.b = hjzVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        int intValue = ((Number) obj2).intValue();
        int i = intValue & 3;
        if (hfdVar.J(i != 2, intValue & 1)) {
            Object[] objArr = this.a;
            ffjm ffjmVar = jyz.a;
            boolean F = hfdVar.F(objArr);
            hjz hjzVar = this.b;
            Object[] objArr2 = this.a;
            Object f = hfdVar.f();
            if (F || f == hfc.a) {
                f = new jzb(hjzVar, objArr2);
                hfdVar.y(f);
            }
            fks.a(ffjmVar, (ffix) f, null, null, 0L, 0L, null, hfdVar, 6);
        } else {
            hfdVar.s();
        }
        return ffcu.a;
    }
}
