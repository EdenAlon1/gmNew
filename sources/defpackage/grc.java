package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class grc extends ffkk implements ffji {
    final /* synthetic */ fflb a;
    final /* synthetic */ grf b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ ipq e;
    final /* synthetic */ int f;
    final /* synthetic */ int g;
    final /* synthetic */ iqk h;
    final /* synthetic */ iqk i;
    final /* synthetic */ iqk j;
    final /* synthetic */ iqk k;
    final /* synthetic */ iqk l;
    final /* synthetic */ iqk m;
    final /* synthetic */ iqk n;
    final /* synthetic */ iqk o;
    final /* synthetic */ float p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public grc(fflb fflbVar, grf grfVar, int i, int i2, ipq ipqVar, int i3, int i4, iqk iqkVar, iqk iqkVar2, iqk iqkVar3, iqk iqkVar4, iqk iqkVar5, iqk iqkVar6, iqk iqkVar7, iqk iqkVar8, float f) {
        super(1);
        this.a = fflbVar;
        this.b = grfVar;
        this.c = i;
        this.d = i2;
        this.e = ipqVar;
        this.f = i3;
        this.g = i4;
        this.h = iqkVar;
        this.i = iqkVar2;
        this.j = iqkVar3;
        this.k = iqkVar4;
        this.l = iqkVar5;
        this.m = iqkVar6;
        this.n = iqkVar7;
        this.o = iqkVar8;
        this.p = f;
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        int eo;
        iqk iqkVar;
        iqj iqjVar = (iqj) obj;
        if (this.a.a != null) {
            grf grfVar = this.b;
            if (grfVar.a) {
                int i = huo.a;
                eo = hum.n.a(((iqk) this.a.a).b, this.c);
            } else {
                eo = this.e.eo(grfVar.d) + this.d;
            }
            int i2 = this.d;
            grf grfVar2 = this.b;
            int i3 = this.f;
            int i4 = this.g;
            iqk iqkVar2 = this.h;
            iqk iqkVar3 = (iqk) this.a.a;
            iqk iqkVar4 = this.i;
            iqk iqkVar5 = this.j;
            iqk iqkVar6 = this.k;
            iqk iqkVar7 = this.l;
            iqk iqkVar8 = this.m;
            iqk iqkVar9 = this.n;
            iqk iqkVar10 = this.o;
            float f = this.p;
            int i5 = iqkVar3.b + i2;
            kah q = this.e.q();
            iqjVar.e(iqkVar9, 0, 0, 0.0f);
            int a = i4 - hbm.a(iqkVar10);
            if (iqkVar5 != null) {
                int i6 = huo.a;
                iqkVar = iqkVar6;
                iqj.m(iqjVar, iqkVar5, 0, hum.n.a(iqkVar5.b, a));
            } else {
                iqkVar = iqkVar6;
            }
            int c = kav.c(eo, i2, f);
            int b = q == kah.a ? hbm.b(iqkVar5) : hbm.b(iqkVar);
            int i7 = b;
            iqjVar.e(iqkVar3, kav.c(((gqy) grfVar2.b).b.a(iqkVar3.a, (i3 - hbm.b(iqkVar5)) - hbm.b(iqkVar), q) + i7, ((gqy) grfVar2.b).a.a(iqkVar3.a, (i3 - hbm.b(iqkVar5)) - hbm.b(iqkVar), q) + i7, f), c, 0.0f);
            if (iqkVar7 != null) {
                iqj.m(iqjVar, iqkVar7, hbm.b(iqkVar5), i5);
            }
            int b2 = hbm.b(iqkVar5) + hbm.b(iqkVar7);
            iqj.m(iqjVar, iqkVar2, b2, i5);
            if (iqkVar4 != null) {
                iqj.m(iqjVar, iqkVar4, b2, i5);
            }
            if (iqkVar8 != null) {
                iqj.m(iqjVar, iqkVar8, (i3 - hbm.b(iqkVar)) - iqkVar8.a, i5);
            }
            if (iqkVar != null) {
                iqk iqkVar11 = iqkVar;
                int i8 = i3 - iqkVar11.a;
                int i9 = huo.a;
                iqj.m(iqjVar, iqkVar11, i8, hum.n.a(iqkVar11.b, a));
            }
            if (iqkVar10 != null) {
                iqj.m(iqjVar, iqkVar10, 0, a);
            }
        } else {
            grf grfVar3 = this.b;
            int i10 = this.f;
            int i11 = this.g;
            iqk iqkVar12 = this.h;
            iqk iqkVar13 = this.i;
            iqk iqkVar14 = this.j;
            iqk iqkVar15 = this.k;
            iqk iqkVar16 = this.l;
            iqk iqkVar17 = this.m;
            iqk iqkVar18 = this.n;
            iqk iqkVar19 = this.o;
            float ec = this.e.ec();
            iqjVar.f(iqkVar18, 0L, 0.0f);
            int a2 = i11 - hbm.a(iqkVar19);
            int b3 = ffln.b(((ebf) grfVar3.c).a * ec);
            if (iqkVar14 != null) {
                int i12 = huo.a;
                iqj.m(iqjVar, iqkVar14, 0, hum.n.a(iqkVar14.b, a2));
            }
            if (iqkVar16 != null) {
                iqj.m(iqjVar, iqkVar16, hbm.b(iqkVar14), grf.f(grfVar3, a2, b3, iqkVar16));
            }
            int b4 = hbm.b(iqkVar14) + hbm.b(iqkVar16);
            iqj.m(iqjVar, iqkVar12, b4, grf.f(grfVar3, a2, b3, iqkVar12));
            if (iqkVar13 != null) {
                iqj.m(iqjVar, iqkVar13, b4, grf.f(grfVar3, a2, b3, iqkVar13));
            }
            if (iqkVar17 != null) {
                iqj.m(iqjVar, iqkVar17, (i10 - hbm.b(iqkVar15)) - iqkVar17.a, grf.f(grfVar3, a2, b3, iqkVar17));
            }
            if (iqkVar15 != null) {
                int i13 = i10 - iqkVar15.a;
                int i14 = huo.a;
                iqj.m(iqjVar, iqkVar15, i13, hum.n.a(iqkVar15.b, a2));
            }
            if (iqkVar19 != null) {
                iqj.m(iqjVar, iqkVar19, 0, a2);
            }
        }
        return ffcu.a;
    }
}
