package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gsj extends ffkk implements ffji {
    final /* synthetic */ ffsk a;
    final /* synthetic */ ftb b;
    final /* synthetic */ float c;
    final /* synthetic */ boolean d;
    final /* synthetic */ hho e;
    final /* synthetic */ hho f;
    final /* synthetic */ hkx g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gsj(ffsk ffskVar, ftb ftbVar, float f, boolean z, hho hhoVar, hho hhoVar2, hkx hkxVar) {
        super(1);
        this.a = ffskVar;
        this.b = ftbVar;
        this.c = f;
        this.d = z;
        this.e = hhoVar;
        this.f = hhoVar2;
        this.g = hkxVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        jkv jkvVar = (jkv) obj;
        jkr.h(jkvVar, null, new gsi(this.a, this.b, this.c, this.d, this.e, this.f));
        float f = guj.a;
        jkr.r(jkvVar, ((Boolean) this.g.a()).booleanValue());
        return ffcu.a;
    }
}
