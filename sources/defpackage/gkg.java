package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gkg extends ffkk implements ffji {
    final /* synthetic */ hkx a;
    final /* synthetic */ int b;
    final /* synthetic */ float c;
    final /* synthetic */ float d;
    final /* synthetic */ hkx e;
    final /* synthetic */ hkx f;
    final /* synthetic */ long g;
    final /* synthetic */ ifv h;
    final /* synthetic */ long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gkg(hkx hkxVar, int i, float f, float f2, hkx hkxVar2, hkx hkxVar3, long j, ifv ifvVar, long j2) {
        super(1);
        this.a = hkxVar;
        this.b = i;
        this.c = f;
        this.d = f2;
        this.e = hkxVar2;
        this.f = hkxVar3;
        this.g = j;
        this.h = ifvVar;
        this.i = j2;
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        ifr ifrVar = (ifr) obj;
        float floatValue = ((Number) this.a.a()).floatValue() * 360.0f;
        float eg = (((idm.a(this.b, 0) || iar.a(ifrVar.b()) > iar.c(ifrVar.b())) ? this.c : this.c + this.d) / ((float) (ifrVar.eg(iar.c(ifrVar.b())) * 3.141592653589793d))) * 360.0f;
        float floatValue2 = ((Number) this.e.a()).floatValue() + ((Number) this.f.a()).floatValue();
        long j = this.g;
        ifv ifvVar = this.h;
        long j2 = this.i;
        long a = ifrVar.a();
        ifl t = ifrVar.t();
        long a2 = t.a();
        t.b().l();
        try {
            t.c.c(floatValue2, a);
            float min = Math.min(floatValue, eg) + floatValue;
            float min2 = Math.min(floatValue, eg);
            gkn.c(ifrVar, min, (360.0f - floatValue) - (min2 + min2), j, ifvVar);
            gkn.c(ifrVar, 0.0f, floatValue, j2, ifvVar);
            t.b().j();
            t.h(a2);
            return ffcu.a;
        } catch (Throwable th) {
            t.b().j();
            t.h(a2);
            throw th;
        }
    }
}
