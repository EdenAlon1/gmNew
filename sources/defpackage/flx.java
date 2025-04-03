package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class flx extends ffkk implements ffji {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ iqk c;
    final /* synthetic */ iqk d;
    final /* synthetic */ iqk e;
    final /* synthetic */ iqk f;
    final /* synthetic */ iqk g;
    final /* synthetic */ iqk h;
    final /* synthetic */ fma i;
    final /* synthetic */ ipq j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public flx(int i, int i2, iqk iqkVar, iqk iqkVar2, iqk iqkVar3, iqk iqkVar4, iqk iqkVar5, iqk iqkVar6, fma fmaVar, ipq ipqVar) {
        super(1);
        this.a = i;
        this.b = i2;
        this.c = iqkVar;
        this.d = iqkVar2;
        this.e = iqkVar3;
        this.f = iqkVar4;
        this.g = iqkVar5;
        this.h = iqkVar6;
        this.i = fmaVar;
        this.j = ipqVar;
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        float b;
        ebe ebeVar = this.i.b;
        iqj iqjVar = (iqj) obj;
        float ec = this.j.ec();
        float f = ((ebf) ebeVar).a * ec;
        kah q = this.j.q();
        int i = flu.a;
        int b2 = ffln.b(f);
        float b3 = eba.b(ebeVar, q) * ec;
        float f2 = ec * 12.0f;
        int b4 = ffln.b(b3);
        iqk iqkVar = this.c;
        int i2 = this.a;
        if (iqkVar != null) {
            int i3 = huo.a;
            iqj.m(iqjVar, iqkVar, 0, hum.n.a(iqkVar.b, i2));
        }
        iqk iqkVar2 = this.d;
        if (iqkVar2 != null) {
            int i4 = this.b - iqkVar2.a;
            int i5 = huo.a;
            iqj.m(iqjVar, iqkVar2, i4, hum.n.a(iqkVar2.b, i2));
        }
        iqk iqkVar3 = this.f;
        if (iqkVar3 != null) {
            fma fmaVar = this.i;
            int i6 = -(iqkVar3.b / 2);
            float f3 = fmaVar.a;
            int c = kav.c(b2, i6, f3);
            if (iqkVar == null) {
                b = 0.0f;
            } else {
                b = (1.0f - f3) * (fpi.b(iqkVar) - f2);
            }
            iqj.m(iqjVar, iqkVar3, ffln.b(b) + b4, c);
        }
        iqk iqkVar4 = this.g;
        iqj.m(iqjVar, this.e, fpi.b(iqkVar), Math.max(b2, fpi.a(iqkVar3) / 2));
        if (iqkVar4 != null) {
            iqj.m(iqjVar, iqkVar4, fpi.b(iqkVar), Math.max(b2, fpi.a(iqkVar3) / 2));
        }
        iqjVar.f(this.h, 0L, 0.0f);
        return ffcu.a;
    }
}
