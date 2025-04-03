package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gbf extends ffkk implements ffjm {
    final /* synthetic */ String a;
    final /* synthetic */ fzr b;
    final /* synthetic */ boolean c;
    final /* synthetic */ boolean d;
    final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbf(String str, fzr fzrVar, boolean z, boolean z2, boolean z3) {
        super(2);
        this.a = str;
        this.b = fzrVar;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hvi i = ebs.i(hvi.e, 40.0f, 40.0f);
            int i2 = huo.a;
            String str = this.a;
            fzr fzrVar = this.b;
            boolean z = this.c;
            boolean z2 = this.d;
            boolean z3 = this.e;
            ipn a = dyc.a(hum.e, false);
            int a2 = hey.a(hfdVar);
            hgb c = hfdVar.c();
            hvi b = huz.b(hfdVar, i);
            int i3 = ist.a;
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
            hvi b2 = jjs.b(hvi.e, gbe.a);
            long j = (z2 && z3) ? fzrVar.p : z2 ? fzrVar.q : (z && z3) ? fzrVar.t : z3 ? fzrVar.n : fzrVar.o;
            hfdVar.v(-822134102);
            hkx b3 = cwo.b(j, gjb.a(4, hfdVar), hfdVar, 0, 12);
            hfdVar.o();
            grl.b(str, b2, ((ibw) b3.a()).i, 0L, null, null, null, 0L, new jyj(3), 0L, 0, false, 0, 0, null, null, hfdVar, 0, 0, 130552);
            hfdVar.n();
        }
        return ffcu.a;
    }
}
