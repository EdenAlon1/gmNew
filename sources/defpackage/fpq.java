package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fpq extends ffkk implements ffji {
    final /* synthetic */ iqk a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;
    final /* synthetic */ iqk f;
    final /* synthetic */ iqk g;
    final /* synthetic */ iqk h;
    final /* synthetic */ iqk i;
    final /* synthetic */ fpt j;
    final /* synthetic */ int k;
    final /* synthetic */ int l;
    final /* synthetic */ ipq m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fpq(iqk iqkVar, int i, int i2, int i3, int i4, iqk iqkVar2, iqk iqkVar3, iqk iqkVar4, iqk iqkVar5, fpt fptVar, int i5, int i6, ipq ipqVar) {
        super(1);
        this.a = iqkVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = iqkVar2;
        this.g = iqkVar3;
        this.h = iqkVar4;
        this.i = iqkVar5;
        this.j = fptVar;
        this.k = i5;
        this.l = i6;
        this.m = ipqVar;
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        int i;
        iqj iqjVar = (iqj) obj;
        iqk iqkVar = this.a;
        if (iqkVar != null) {
            int f = ffmk.f(this.b - this.c, 0);
            int i2 = this.d;
            int i3 = this.e;
            iqk iqkVar2 = this.f;
            iqk iqkVar3 = this.g;
            iqk iqkVar4 = this.h;
            iqk iqkVar5 = this.i;
            int i4 = this.k;
            int i5 = this.l;
            fpt fptVar = this.j;
            float ec = this.m.ec();
            if (iqkVar4 != null) {
                int i6 = huo.a;
                i = f;
                iqj.m(iqjVar, iqkVar4, 0, hum.n.a(iqkVar4.b, i3));
            } else {
                i = f;
            }
            if (iqkVar5 != null) {
                int i7 = i2 - iqkVar5.a;
                int i8 = huo.a;
                iqj.m(iqjVar, iqkVar5, i7, hum.n.a(iqkVar5.b, i3));
            }
            float f2 = fptVar.a;
            int i9 = i4 + i5;
            iqj.m(iqjVar, iqkVar, fpi.b(iqkVar4), ffln.b(ec * 16.0f) - ffln.b((r4 - i) * f2));
            iqj.m(iqjVar, iqkVar2, fpi.b(iqkVar4), i9);
            if (iqkVar3 != null) {
                iqj.m(iqjVar, iqkVar3, fpi.b(iqkVar4), i9);
            }
        } else {
            int i10 = this.d;
            int i11 = this.e;
            iqk iqkVar6 = this.f;
            iqk iqkVar7 = this.g;
            iqk iqkVar8 = this.h;
            iqk iqkVar9 = this.i;
            ipq ipqVar = this.m;
            int b = ffln.b(((ebf) this.j.b).a * ipqVar.ec());
            if (iqkVar8 != null) {
                int i12 = huo.a;
                iqj.m(iqjVar, iqkVar8, 0, hum.n.a(iqkVar8.b, i11));
            }
            if (iqkVar9 != null) {
                int i13 = i10 - iqkVar9.a;
                int i14 = huo.a;
                iqj.m(iqjVar, iqkVar9, i13, hum.n.a(iqkVar9.b, i11));
            }
            iqj.m(iqjVar, iqkVar6, fpi.b(iqkVar8), b);
            if (iqkVar7 != null) {
                iqj.m(iqjVar, iqkVar7, fpi.b(iqkVar8), b);
            }
        }
        return ffcu.a;
    }
}
