package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fwt extends ffkk implements ffji {
    final /* synthetic */ hkx a;
    final /* synthetic */ hkx b;
    final /* synthetic */ ifv c;
    final /* synthetic */ hkx d;
    final /* synthetic */ hkx e;
    final /* synthetic */ hkx f;
    final /* synthetic */ ifv g;
    final /* synthetic */ fwp h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fwt(hkx hkxVar, hkx hkxVar2, ifv ifvVar, hkx hkxVar3, hkx hkxVar4, hkx hkxVar5, ifv ifvVar2, fwp fwpVar) {
        super(1);
        this.a = hkxVar;
        this.b = hkxVar2;
        this.c = ifvVar;
        this.d = hkxVar3;
        this.e = hkxVar4;
        this.f = hkxVar5;
        this.g = ifvVar2;
        this.h = fwpVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        float f;
        ifr ifrVar = (ifr) obj;
        long j = ((ibw) this.a.a()).i;
        long j2 = ((ibw) this.b.a()).i;
        float em = ifrVar.em(2.0f);
        float c = iar.c(ifrVar.b());
        if (ffcp.a(j, j2)) {
            ifq.k(ifrVar, j, 0L, ias.a(c, c), iaf.b(em), ifu.a, 0.0f, 226);
            f = 0.0f;
        } else {
            ifv ifvVar = this.c;
            float f2 = ifvVar.a;
            float f3 = f2 / 2.0f;
            float f4 = c - (f2 + f2);
            float f5 = em - f2;
            f = 0.0f;
            ifq.k(ifrVar, j, ial.a(f2, f2), ias.a(f4, f4), iaf.b(Math.max(0.0f, f5)), ifu.a, 0.0f, 224);
            float f6 = c - ifvVar.a;
            ifq.k(ifrVar, j2, ial.a(f3, f3), ias.a(f6, f6), iaf.b(em - f3), ifvVar, 0.0f, 224);
        }
        long j3 = ((ibw) this.d.a()).i;
        float floatValue = ((Number) this.e.a()).floatValue();
        float floatValue2 = ((Number) this.f.a()).floatValue();
        ifv ifvVar2 = this.g;
        fwp fwpVar = this.h;
        float c2 = iar.c(ifrVar.b());
        float b = kav.b(0.4f, 0.5f, floatValue2);
        float b2 = kav.b(0.7f, 0.5f, floatValue2);
        float b3 = kav.b(0.5f, 0.5f, floatValue2);
        float b4 = kav.b(0.3f, 0.5f, floatValue2);
        fwpVar.a.l();
        fwpVar.a.f(0.2f * c2, b3 * c2);
        fwpVar.a.e(b * c2, b2 * c2);
        fwpVar.a.e(0.8f * c2, c2 * b4);
        fwpVar.c.c(fwpVar.a);
        fwpVar.b.l();
        ibe ibeVar = fwpVar.c;
        ibeVar.b(f, ibeVar.a() * floatValue, fwpVar.b);
        ifq.h(ifrVar, fwpVar.b, j3, ifvVar2, 52);
        return ffcu.a;
    }
}
