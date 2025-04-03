package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fus extends ffkk implements ffji {
    final /* synthetic */ gmk a;
    final /* synthetic */ float b;
    final /* synthetic */ float c;
    final /* synthetic */ float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fus(gmk gmkVar, float f, float f2, float f3) {
        super(1);
        this.a = gmkVar;
        this.b = f;
        this.c = f2;
        this.d = f3;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        hay hayVar = (hay) obj;
        if (!this.a.a) {
            hayVar.a(gml.c, this.b - this.c);
        }
        float f = this.d;
        if (f != this.c) {
            hayVar.a(gml.b, Math.max(this.b - f, 0.0f));
        }
        if (!this.a.b) {
            hayVar.a(gml.a, this.b);
        }
        return ffcu.a;
    }
}
