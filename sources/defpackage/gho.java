package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gho extends ffkk implements ffji {
    final /* synthetic */ float a;
    final /* synthetic */ long b;
    final /* synthetic */ gmk c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gho(float f, long j, gmk gmkVar) {
        super(1);
        this.a = f;
        this.b = j;
        this.c = gmkVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        hay hayVar = (hay) obj;
        hayVar.a(gml.a, this.a);
        float f = this.a / 2.0f;
        if (kaf.a(this.b) > f && !this.c.a) {
            hayVar.a(gml.c, f);
        }
        if (kaf.a(this.b) != 0) {
            hayVar.a(gml.b, Math.max(0.0f, this.a - kaf.a(r0)));
        }
        return ffcu.a;
    }
}
