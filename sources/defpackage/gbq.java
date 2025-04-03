package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gbq extends ffkk implements ffjm {
    final /* synthetic */ eey a;
    final /* synthetic */ ffmj b;
    final /* synthetic */ ham c;
    final /* synthetic */ haq d;
    final /* synthetic */ ffji e;
    final /* synthetic */ hal f;
    final /* synthetic */ Long g;
    final /* synthetic */ fzr h;
    final /* synthetic */ gae i;
    final /* synthetic */ dmug j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbq(eey eeyVar, ffmj ffmjVar, ham hamVar, haq haqVar, ffji ffjiVar, hal halVar, Long l, gae gaeVar, dmug dmugVar, fzr fzrVar) {
        super(2);
        this.a = eeyVar;
        this.b = ffmjVar;
        this.c = hamVar;
        this.d = haqVar;
        this.e = ffjiVar;
        this.f = halVar;
        this.g = l;
        this.i = gaeVar;
        this.j = dmugVar;
        this.h = fzrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hvi c;
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            c = jjs.c(hvi.e, false, gbn.a);
            eey eeyVar = this.a;
            fzw fzwVar = fzw.a;
            eey eeyVar2 = this.a;
            cyj a = cyk.a();
            cyq a2 = gjb.a(4, hfdVar);
            boolean D = hfdVar.D(a) | hfdVar.D(eeyVar2);
            Object f = hfdVar.f();
            if (D || f == hfc.a) {
                f = new dvq(new fzv(new dvg(eeyVar2, dvx.a)), a, a2);
                hfdVar.y(f);
            }
            dtt dttVar = (dtt) f;
            boolean F = hfdVar.F(this.b) | hfdVar.F(this.c) | hfdVar.D(this.d) | hfdVar.D(this.e) | hfdVar.D(this.f) | hfdVar.D(this.g) | hfdVar.F(this.i) | hfdVar.D(this.j) | hfdVar.D(this.h);
            ffmj ffmjVar = this.b;
            ham hamVar = this.c;
            haq haqVar = this.d;
            ffji ffjiVar = this.e;
            hal halVar = this.f;
            Long l = this.g;
            gae gaeVar = this.i;
            dmug dmugVar = this.j;
            fzr fzrVar = this.h;
            Object f2 = hfdVar.f();
            if (F || f2 == hfc.a) {
                f2 = new gbp(ffmjVar, hamVar, haqVar, ffjiVar, halVar, l, gaeVar, dmugVar, fzrVar);
                hfdVar.y(f2);
            }
            edh.c(c, eeyVar, null, null, null, dttVar, false, (ffji) f2, hfdVar, 0);
        }
        return ffcu.a;
    }
}
