package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gke extends ffkk implements ffji {
    final /* synthetic */ ffix a;
    final /* synthetic */ int b;
    final /* synthetic */ float c;
    final /* synthetic */ float d;
    final /* synthetic */ long e;
    final /* synthetic */ ifv f;
    final /* synthetic */ long g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gke(ffix ffixVar, int i, float f, float f2, long j, ifv ifvVar, long j2) {
        super(1);
        this.a = ffixVar;
        this.b = i;
        this.c = f;
        this.d = f2;
        this.e = j;
        this.f = ifvVar;
        this.g = j2;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ifr ifrVar = (ifr) obj;
        float floatValue = ((Number) this.a.invoke()).floatValue() * 360.0f;
        float eg = (((idm.a(this.b, 0) || iar.a(ifrVar.b()) > iar.c(ifrVar.b())) ? this.c : this.c + this.d) / ((float) (ifrVar.eg(iar.c(ifrVar.b())) * 3.141592653589793d))) * 360.0f;
        float min = 270.0f + floatValue + Math.min(floatValue, eg);
        float min2 = Math.min(floatValue, eg);
        gkn.c(ifrVar, min, (360.0f - floatValue) - (min2 + min2), this.e, this.f);
        gkn.c(ifrVar, 270.0f, floatValue, this.g, this.f);
        return ffcu.a;
    }
}
