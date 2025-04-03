package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gmo extends ffkk implements ffji {
    final /* synthetic */ gnn a;
    final /* synthetic */ long b;
    final /* synthetic */ long c;
    final /* synthetic */ long d;
    final /* synthetic */ long e;
    final /* synthetic */ float f;
    final /* synthetic */ float g;
    final /* synthetic */ float h = 8.0f;
    final /* synthetic */ ffjm i;
    final /* synthetic */ ffjn j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmo(gnn gnnVar, long j, long j2, long j3, long j4, float f, float f2, float f3, ffjm ffjmVar, ffjn ffjnVar) {
        super(1);
        this.a = gnnVar;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = f;
        this.g = f2;
        this.i = ffjmVar;
        this.j = ffjnVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        float f;
        dqs dqsVar;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float em;
        float em2;
        ifr ifrVar = (ifr) obj;
        gmv gmvVar = gmv.a;
        gnn gnnVar = this.a;
        float b = gnnVar.b();
        float ek = ifrVar.ek(gnnVar.n.c());
        float ek2 = ifrVar.ek(this.a.o.c());
        float ek3 = ifrVar.ek(0);
        float ek4 = ifrVar.ek(0);
        float ek5 = ifrVar.ek(this.a.f());
        float ek6 = ifrVar.ek(this.a.e());
        dqs dqsVar2 = this.a.e;
        boolean z = dqsVar2 == dqs.a;
        float a = z ? iar.a(ifrVar.b()) : iar.c(ifrVar.b());
        float f7 = this.g;
        float f8 = this.f;
        float f9 = (a + 0.0f) * b;
        float em3 = ifrVar.em(8.0f);
        float f10 = a - em3;
        float em4 = ifrVar.em(f7);
        if (Float.compare(f8, 0.0f) > 0) {
            if (z) {
                ifrVar.em(ek4);
                ifrVar.em(f8);
                em = ifrVar.em(ek6) / 2.0f;
                em2 = ifrVar.em(f8);
            } else {
                ifrVar.em(ek3);
                ifrVar.em(f8);
                em = ifrVar.em(ek5) / 2.0f;
                em2 = ifrVar.em(f8);
            }
            f = em + em2;
        } else {
            f = 0.0f;
        }
        float f11 = f9 + 0.0f;
        ffjm ffjmVar = this.i;
        float f12 = f11 + f;
        if (f11 < (a - f) - em3) {
            float f13 = a - f12;
            long a2 = z ? ial.a(0.0f, f12) : ial.a(f12, 0.0f);
            long a3 = z ? ias.a(ifrVar.em(ek), f13) : ias.a(f13, ifrVar.em(ek2));
            dqsVar = dqsVar2;
            f3 = 0.0f;
            long j = a2;
            f4 = f11;
            f6 = f12;
            gmv.b(ifrVar, dqsVar, j, a3, this.b, em4, em3);
            f2 = em4;
            f5 = em3;
            long a4 = z ? ial.a(iak.b(ifrVar.a()), f10) : ial.a(f10, iak.c(ifrVar.a()));
            if (ffjmVar != null) {
                ffjmVar.a(ifrVar, new iak(a4));
            }
        } else {
            dqsVar = dqsVar2;
            f2 = em4;
            f3 = 0.0f;
            f4 = f11;
            f5 = em3;
            f6 = f12;
        }
        float f14 = f4 - f;
        float f15 = f14 + f3;
        if (f15 > f5) {
            float f16 = f3;
            gmv.b(ifrVar, dqsVar, ial.a(f16, f16), z ? ias.a(ifrVar.em(ek), f15) : ias.a(f15, ifrVar.em(ek2)), this.c, f5, f2);
        }
        new ffmf(f14, f6);
        return ffcu.a;
    }
}
