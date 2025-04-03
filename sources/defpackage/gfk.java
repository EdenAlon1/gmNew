package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gfk extends ffkk implements ffji {
    final /* synthetic */ iqk a;
    final /* synthetic */ int b;
    final /* synthetic */ boolean c;
    final /* synthetic */ int d;
    final /* synthetic */ iqk e;
    final /* synthetic */ iqk f;
    final /* synthetic */ iqk g;
    final /* synthetic */ int h;
    final /* synthetic */ iqk i;
    final /* synthetic */ int j;
    final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gfk(iqk iqkVar, int i, boolean z, int i2, iqk iqkVar2, iqk iqkVar3, iqk iqkVar4, int i3, iqk iqkVar5, int i4, int i5) {
        super(1);
        this.a = iqkVar;
        this.b = i;
        this.c = z;
        this.d = i2;
        this.e = iqkVar2;
        this.f = iqkVar3;
        this.g = iqkVar4;
        this.h = i3;
        this.i = iqkVar5;
        this.j = i4;
        this.k = i5;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int a;
        iqj iqjVar = (iqj) obj;
        iqk iqkVar = this.a;
        if (iqkVar != null) {
            int i = this.b;
            boolean z = this.c;
            int i2 = this.d;
            int i3 = this.h;
            if (!z) {
                int i4 = huo.a;
                i2 = hum.n.a(iqkVar.b, i3);
            }
            iqj.m(iqjVar, iqkVar, i, i2);
        }
        int b = this.b + hbm.b(this.a);
        if (this.c) {
            a = this.d;
        } else {
            int a2 = hbm.a(this.e) + hbm.a(this.f) + hbm.a(this.g);
            int i5 = huo.a;
            a = hum.n.a(a2, this.h);
        }
        iqk iqkVar2 = this.f;
        if (iqkVar2 != null) {
            iqj.m(iqjVar, iqkVar2, b, a);
        }
        int a3 = a + hbm.a(this.f);
        iqk iqkVar3 = this.e;
        if (iqkVar3 != null) {
            iqj.m(iqjVar, iqkVar3, b, a3);
        }
        int a4 = a3 + hbm.a(this.e);
        iqk iqkVar4 = this.g;
        if (iqkVar4 != null) {
            iqj.m(iqjVar, iqkVar4, b, a4);
        }
        iqk iqkVar5 = this.i;
        if (iqkVar5 != null) {
            int i6 = this.j;
            int i7 = this.k;
            boolean z2 = this.c;
            int i8 = this.d;
            int i9 = this.h;
            int i10 = (i6 - i7) - iqkVar5.a;
            if (!z2) {
                int i11 = huo.a;
                i8 = hum.n.a(iqkVar5.b, i9);
            }
            iqj.m(iqjVar, iqkVar5, i10, i8);
        }
        return ffcu.a;
    }
}
