package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jzd extends ffkk implements ffjn {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ Object[] c;
    final /* synthetic */ hjz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jzd(String str, String str2, Object[] objArr, hjz hjzVar) {
        super(3);
        this.a = str;
        this.b = str2;
        this.c = objArr;
        this.d = hjzVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ebe ebeVar = (ebe) obj;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= true != hfdVar.D(ebeVar) ? 2 : 4;
        }
        if (hfdVar.J((intValue & 19) != 18, intValue & 1)) {
            hvi c = eba.c(hvi.e, ebeVar);
            String str = this.a;
            String str2 = this.b;
            Object[] objArr = this.c;
            hjz hjzVar = this.d;
            int i = huo.a;
            ipn a = dyc.a(hum.a, false);
            int a2 = hey.a(hfdVar);
            hgb c2 = hfdVar.c();
            hvi b = huz.b(hfdVar, c);
            int i2 = ist.a;
            ffix ffixVar = iss.a;
            hfdVar.M();
            hfdVar.x();
            if (hfdVar.H()) {
                hfdVar.j(ffixVar);
            } else {
                hfdVar.z();
            }
            hlc.b(hfdVar, a, iss.e);
            hlc.b(hfdVar, c2, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfdVar.y(valueOf);
                hfdVar.h(valueOf, ffjmVar);
            }
            hlc.b(hfdVar, b, iss.c);
            jyx.a(str, str2, hfdVar, objArr[hjzVar.c()]);
            hfdVar.n();
        } else {
            hfdVar.s();
        }
        return ffcu.a;
    }
}
