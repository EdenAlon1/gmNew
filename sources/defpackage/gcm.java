package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gcm extends ffkk implements ffjm {
    final /* synthetic */ String a;
    final /* synthetic */ fzr b;
    final /* synthetic */ boolean c;
    final /* synthetic */ boolean d;
    final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gcm(String str, fzr fzrVar, boolean z, boolean z2, boolean z3) {
        super(2);
        this.a = str;
        this.b = fzrVar;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hvi d;
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            d = ebs.d(hvi.e, 1.0f);
            int i = huo.a;
            String str = this.a;
            fzr fzrVar = this.b;
            boolean z = this.c;
            boolean z2 = this.d;
            boolean z3 = this.e;
            ipn a = dyc.a(hum.e, false);
            int a2 = hey.a(hfdVar);
            hgb c = hfdVar.c();
            hvi b = huz.b(hfdVar, d);
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
            hlc.b(hfdVar, c, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfdVar.y(valueOf);
                hfdVar.h(valueOf, ffjmVar);
            }
            hlc.b(hfdVar, b, iss.c);
            grl.b(str, jjs.b(hvi.e, gcl.a), ((ibw) cwo.b((z2 && z3) ? fzrVar.j : z2 ? fzrVar.k : (z && z3) ? fzrVar.i : z3 ? fzrVar.g : fzrVar.h, gjb.a(4, hfdVar), hfdVar, 0, 12).a()).i, 0L, null, null, null, 0L, new jyj(3), 0L, 0, false, 0, 0, null, null, hfdVar, 0, 0, 130552);
            hfdVar.n();
        }
        return ffcu.a;
    }
}
