package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hck extends ffkk implements ffjm {
    final /* synthetic */ jpo a;
    final /* synthetic */ jpo b;
    final /* synthetic */ hkx c;
    final /* synthetic */ hkx d;
    final /* synthetic */ boolean e;
    final /* synthetic */ hkx f;
    final /* synthetic */ ffjn g;
    final /* synthetic */ hcp h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hck(jpo jpoVar, jpo jpoVar2, hkx hkxVar, hkx hkxVar2, boolean z, hkx hkxVar3, ffjn ffjnVar, hcp hcpVar) {
        super(2);
        this.a = jpoVar;
        this.b = jpoVar2;
        this.c = hkxVar;
        this.d = hkxVar2;
        this.e = z;
        this.f = hkxVar3;
        this.g = ffjnVar;
        this.h = hcpVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            jpo a = jpp.a(this.a, this.b, ((Number) this.c.a()).floatValue());
            boolean z = this.e;
            hkx hkxVar = this.f;
            if (z) {
                a = jpo.y(a, ((ibw) hkxVar.a()).i, 0L, null, null, null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777214);
            }
            hdh.c(((ibw) this.d.a()).i, a, hpx.d(-1245867650, new hcj(this.g, this.h), hfdVar), hfdVar, 384);
        }
        return ffcu.a;
    }
}
