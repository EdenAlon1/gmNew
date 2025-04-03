package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jze extends ffkk implements ffjm {
    final /* synthetic */ Object[] a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jze(Object[] objArr, String str, String str2) {
        super(2);
        this.a = objArr;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        int intValue = ((Number) obj2).intValue();
        int i = intValue & 3;
        if (hfdVar.J(i != 2, intValue & 1)) {
            Object f = hfdVar.f();
            if (f == hfc.a) {
                f = new hhy(0);
                hfdVar.y(f);
            }
            hjz hjzVar = (hjz) f;
            fnd.a(null, null, null, null, null, hpx.d(958604965, new jzc(this.a, hjzVar), hfdVar), 0, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, hpx.d(57310875, new jzd(this.b, this.c, this.a, hjzVar), hfdVar), hfdVar, 196608, 12582912, 131039);
        } else {
            hfdVar.s();
        }
        return ffcu.a;
    }
}
