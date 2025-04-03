package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fxj extends ffkk implements ffji {
    final /* synthetic */ iqk a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ iqk d;
    final /* synthetic */ int e;
    final /* synthetic */ iqk f;
    final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxj(iqk iqkVar, int i, int i2, iqk iqkVar2, int i3, iqk iqkVar3, int i4) {
        super(1);
        this.a = iqkVar;
        this.b = i;
        this.c = i2;
        this.d = iqkVar2;
        this.e = i3;
        this.f = iqkVar3;
        this.g = i4;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        iqj iqjVar = (iqj) obj;
        iqk iqkVar = this.a;
        if (iqkVar != null) {
            int i = huo.a;
            iqj.m(iqjVar, iqkVar, 0, hum.n.a(this.b, this.c));
        }
        iqj.m(iqjVar, this.d, this.e, 0);
        iqk iqkVar2 = this.f;
        if (iqkVar2 != null) {
            int i2 = this.e + this.d.a;
            int i3 = huo.a;
            iqj.m(iqjVar, iqkVar2, i2, hum.n.a(this.g, this.c));
        }
        return ffcu.a;
    }
}
