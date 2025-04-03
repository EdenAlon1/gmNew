package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ghf extends ffkk implements ffjm {
    final /* synthetic */ long a;
    final /* synthetic */ ffix b;
    final /* synthetic */ gmk c;
    final /* synthetic */ cxj d;
    final /* synthetic */ ffsk e;
    final /* synthetic */ ffji f;
    final /* synthetic */ hvi g;
    final /* synthetic */ float h;
    final /* synthetic */ boolean i;
    final /* synthetic */ idh j;
    final /* synthetic */ long k;
    final /* synthetic */ long l;
    final /* synthetic */ float m;
    final /* synthetic */ ffjm n;
    final /* synthetic */ ffjm o;
    final /* synthetic */ ffjn p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ghf(long j, ffix ffixVar, gmk gmkVar, cxj cxjVar, ffsk ffskVar, ffji ffjiVar, hvi hviVar, float f, boolean z, idh idhVar, long j2, long j3, float f2, ffjm ffjmVar, ffjm ffjmVar2, ffjn ffjnVar) {
        super(2);
        this.a = j;
        this.b = ffixVar;
        this.c = gmkVar;
        this.d = cxjVar;
        this.e = ffskVar;
        this.f = ffjiVar;
        this.g = hviVar;
        this.h = f;
        this.i = z;
        this.j = idhVar;
        this.k = j2;
        this.l = j3;
        this.m = f2;
        this.n = ffjmVar;
        this.o = ffjmVar2;
        this.p = ffjnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hvi c;
        hvi c2;
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            c = ebs.c(hvi.e, 1.0f);
            c2 = jjs.c(ecs.a(c), false, ghe.a);
            long j = this.a;
            ffix ffixVar = this.b;
            gmk gmkVar = this.c;
            cxj cxjVar = this.d;
            ffsk ffskVar = this.e;
            ffji ffjiVar = this.f;
            hvi hviVar = this.g;
            float f = this.h;
            boolean z = this.i;
            idh idhVar = this.j;
            long j2 = this.k;
            long j3 = this.l;
            float f2 = this.m;
            ffjm ffjmVar = this.n;
            ffjm ffjmVar2 = this.o;
            ffjn ffjnVar = this.p;
            int i = huo.a;
            ipn a = dyc.a(hum.a, false);
            int a2 = hey.a(hfdVar);
            hgb c3 = hfdVar.c();
            hvi b = huz.b(hfdVar, c2);
            int i2 = ist.a;
            ffix ffixVar2 = iss.a;
            hfdVar.M();
            hfdVar.x();
            if (hfdVar.H()) {
                hfdVar.j(ffixVar2);
            } else {
                hfdVar.z();
            }
            hlc.b(hfdVar, a, iss.e);
            hlc.b(hfdVar, c3, iss.d);
            ffjm ffjmVar3 = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfdVar.y(valueOf);
                hfdVar.h(valueOf, ffjmVar3);
            }
            hlc.b(hfdVar, b, iss.c);
            dyi dyiVar = dyi.a;
            gim.a(j, ffixVar, gmkVar.d() != gml.a, hfdVar, 0);
            gim.e(dyiVar, cxjVar, ffskVar, ffixVar, ffjiVar, hviVar, gmkVar, f, z, idhVar, j2, j3, f2, ffjmVar, ffjmVar2, ffjnVar, hfdVar, 70, 0);
            hfdVar.n();
        }
        return ffcu.a;
    }
}
