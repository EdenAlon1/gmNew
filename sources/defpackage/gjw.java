package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gjw extends ffkk implements ffji {
    final /* synthetic */ gjz a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ iqk d;
    final /* synthetic */ iqk e;
    final /* synthetic */ iqk f;
    final /* synthetic */ iqk g;
    final /* synthetic */ iqk h;
    final /* synthetic */ fflb i;
    final /* synthetic */ iqk j;
    final /* synthetic */ iqk k;
    final /* synthetic */ iqk l;
    final /* synthetic */ ipq m;
    final /* synthetic */ float n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gjw(gjz gjzVar, int i, int i2, iqk iqkVar, iqk iqkVar2, iqk iqkVar3, iqk iqkVar4, iqk iqkVar5, fflb fflbVar, iqk iqkVar6, iqk iqkVar7, iqk iqkVar8, ipq ipqVar, float f) {
        super(1);
        this.a = gjzVar;
        this.b = i;
        this.c = i2;
        this.d = iqkVar;
        this.e = iqkVar2;
        this.f = iqkVar3;
        this.g = iqkVar4;
        this.h = iqkVar5;
        this.i = fflbVar;
        this.j = iqkVar6;
        this.k = iqkVar7;
        this.l = iqkVar8;
        this.m = ipqVar;
        this.n = f;
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        int i;
        int i2;
        int i3;
        int i4;
        float f;
        float f2;
        float c;
        float f3;
        float f4;
        iqj iqjVar = (iqj) obj;
        iqk iqkVar = (iqk) this.i.a;
        iqk iqkVar2 = this.k;
        gjz gjzVar = this.a;
        ipq ipqVar = this.m;
        float f5 = gjzVar.d;
        float ec = ipqVar.ec();
        kah q = ipqVar.q();
        float em = ipqVar.em(f5);
        iqjVar.e(iqkVar2, 0, 0, 0.0f);
        iqk iqkVar3 = this.l;
        int a = this.b - hbm.a(iqkVar3);
        gjz gjzVar2 = this.a;
        int b = ffln.b(((ebf) gjzVar2.c).a * ec);
        iqk iqkVar4 = this.d;
        if (iqkVar4 != null) {
            int i5 = huo.a;
            iqj.m(iqjVar, iqkVar4, 0, hum.n.a(iqkVar4.b, a));
        }
        iqk iqkVar5 = this.e;
        int i6 = this.c;
        if (iqkVar != null) {
            if (gjzVar2.a) {
                int i7 = huo.a;
                i4 = hum.n.a(iqkVar.b, a);
            } else {
                i4 = b;
            }
            float f6 = this.n;
            int i8 = iqkVar.b / 2;
            ebe ebeVar = gjzVar2.c;
            int c2 = kav.c(i4, -i8, f6);
            float b2 = eba.b(ebeVar, q) * ec;
            float a2 = eba.a(gjzVar2.c, q) * ec;
            if (iqkVar4 == null) {
                c = b2;
                f = c;
                i = a;
                f2 = 0.0f;
            } else {
                f = b2;
                i = a;
                f2 = 0.0f;
                c = iqkVar4.a + ffmk.c(f - em, 0.0f);
            }
            float c3 = iqkVar5 == null ? a2 : iqkVar5.a + ffmk.c(a2 - em, f2);
            kah kahVar = kah.a;
            float f7 = q == kahVar ? f : a2;
            if (q == kahVar) {
                f4 = c3;
                f3 = c;
            } else {
                f3 = c3;
                f4 = f3;
            }
            gqz gqzVar = gjzVar2.b;
            iqjVar.e(iqkVar, ffln.b(kav.b(((gqy) gqzVar).b.a(iqkVar.a, i6 - ffln.b(c + f4), q) + f3, ((gqy) gjzVar2.b).a.a(iqkVar.a, i6 - ffln.b(f + a2), q) + f7, f6)), c2, 0.0f);
        } else {
            i = a;
        }
        iqk iqkVar6 = this.f;
        if (iqkVar6 != null) {
            i2 = b;
            i3 = i;
            iqj.m(iqjVar, iqkVar6, hbm.b(iqkVar4), gjz.f(0, gjzVar2, i3, i2, iqkVar, iqkVar6));
        } else {
            i2 = b;
            i3 = i;
        }
        iqk iqkVar7 = this.j;
        iqk iqkVar8 = this.h;
        int b3 = hbm.b(iqkVar4) + hbm.b(iqkVar6);
        iqj.m(iqjVar, iqkVar8, b3, gjz.f(0, gjzVar2, i3, i2, iqkVar, iqkVar8));
        if (iqkVar7 != null) {
            iqj.m(iqjVar, iqkVar7, b3, gjz.f(0, gjzVar2, i3, i2, iqkVar, iqkVar7));
        }
        iqk iqkVar9 = this.g;
        if (iqkVar9 != null) {
            iqj.m(iqjVar, iqkVar9, (i6 - hbm.b(iqkVar5)) - iqkVar9.a, gjz.f(0, gjzVar2, i3, i2, iqkVar, iqkVar9));
        }
        if (iqkVar5 != null) {
            int i9 = i6 - iqkVar5.a;
            int i10 = huo.a;
            iqj.m(iqjVar, iqkVar5, i9, hum.n.a(iqkVar5.b, i3));
        }
        if (iqkVar3 != null) {
            iqj.m(iqjVar, iqkVar3, 0, i3);
        }
        return ffcu.a;
    }
}
