package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cqt extends ffkk implements ffji {
    final /* synthetic */ cqv a;
    final /* synthetic */ long b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqt(cqv cqvVar, long j) {
        super(1);
        this.a = cqvVar;
        this.b = j;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        long j;
        dau dauVar = (dau) obj;
        if (ffkj.e(dauVar.a(), this.a.c.a())) {
            j = this.a.a(this.b);
        } else {
            hkx hkxVar = (hkx) this.a.c.d.f(dauVar.a());
            j = hkxVar != null ? ((kaf) hkxVar.a()).a : 0L;
        }
        hkx hkxVar2 = (hkx) this.a.c.d.f(dauVar.b());
        long j2 = hkxVar2 != null ? ((kaf) hkxVar2.a()).a : 0L;
        cwt cwtVar = (cwt) this.a.b.a();
        if (cwtVar != null) {
            cyq cyqVar = (cyq) cwtVar.b.a(new kaf(j), new kaf(j2));
            if (cyqVar != null) {
                return cyqVar;
            }
        }
        return cxu.b(0.0f, 400.0f, null, 5);
    }
}
