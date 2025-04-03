package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fmb extends ffkk implements ffji {
    final /* synthetic */ long a;
    final /* synthetic */ long b;
    final /* synthetic */ hkx c;
    final /* synthetic */ hkx d;
    final /* synthetic */ hkx e;
    final /* synthetic */ hkx f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fmb(long j, long j2, hkx hkxVar, hkx hkxVar2, hkx hkxVar3, hkx hkxVar4) {
        super(1);
        this.a = j;
        this.b = j2;
        this.c = hkxVar;
        this.d = hkxVar2;
        this.e = hkxVar3;
        this.f = hkxVar4;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ifr ifrVar = (ifr) obj;
        float a = iar.a(ifrVar.b());
        fmk.f(ifrVar, 0.0f, 1.0f, this.a, a);
        if (fmk.a(this.c) - fmk.b(this.d) > 0.0f) {
            hkx hkxVar = this.c;
            hkx hkxVar2 = this.d;
            fmk.f(ifrVar, fmk.a(hkxVar), fmk.b(hkxVar2), this.b, a);
        }
        if (fmk.c(this.e) - fmk.d(this.f) > 0.0f) {
            hkx hkxVar3 = this.e;
            hkx hkxVar4 = this.f;
            fmk.f(ifrVar, fmk.c(hkxVar3), fmk.d(hkxVar4), this.b, a);
        }
        return ffcu.a;
    }
}
