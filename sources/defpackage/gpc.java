package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gpc extends ffkk implements ffji {
    final /* synthetic */ boolean a;
    final /* synthetic */ boolean b;
    final /* synthetic */ float c;
    final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gpc(boolean z, boolean z2, float f, boolean z3) {
        super(1);
        this.a = z;
        this.b = z2;
        this.c = f;
        this.d = z3;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        hay hayVar = (hay) obj;
        hayVar.a(gpj.c, 0.0f);
        if (this.a) {
            hayVar.a(gpj.a, this.b ? -this.c : this.c);
        }
        if (this.d) {
            hayVar.a(gpj.b, this.b ? this.c : -this.c);
        }
        return ffcu.a;
    }
}
