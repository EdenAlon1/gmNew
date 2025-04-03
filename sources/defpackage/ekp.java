package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ekp extends ffkk implements ffji {
    final /* synthetic */ ekn a;
    final /* synthetic */ int b;
    final /* synthetic */ float c;
    final /* synthetic */ ffky d;
    final /* synthetic */ ffkx e;
    final /* synthetic */ boolean f;
    final /* synthetic */ float g;
    final /* synthetic */ ffkz h;
    final /* synthetic */ int i;
    final /* synthetic */ int j;
    final /* synthetic */ fflb k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ekp(ekn eknVar, int i, float f, ffky ffkyVar, ffkx ffkxVar, boolean z, float f2, ffkz ffkzVar, int i2, int i3, fflb fflbVar) {
        super(1);
        this.a = eknVar;
        this.b = i;
        this.c = f;
        this.d = ffkyVar;
        this.e = ffkxVar;
        this.f = z;
        this.g = f2;
        this.h = ffkzVar;
        this.i = i2;
        this.j = i3;
        this.k = fflbVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int f;
        cxs cxsVar = (cxs) obj;
        if (!ekr.c(this.a, this.b)) {
            float d = (this.c > 0.0f ? ffmk.d(((Number) cxsVar.a()).floatValue(), this.c) : ffmk.c(((Number) cxsVar.a()).floatValue(), this.c)) - this.d.a;
            ekn eknVar = this.a;
            int i = this.b;
            float a = eknVar.a(d);
            if (!ekr.c(eknVar, i) && !ekr.b(this.f, this.a, this.b, this.j)) {
                if (d != a) {
                    cxsVar.c();
                    this.e.a = false;
                    return ffcu.a;
                }
                this.d.a += d;
                if (this.f) {
                    if (((Number) cxsVar.a()).floatValue() > this.g) {
                        cxsVar.c();
                    }
                } else if (((Number) cxsVar.a()).floatValue() < (-this.g)) {
                    cxsVar.c();
                }
                if (this.f) {
                    if (this.h.a >= 2) {
                        int d2 = this.b - this.a.d();
                        int i2 = this.i;
                        if (d2 > i2) {
                            this.a.e(this.b - i2, 0);
                        }
                    }
                } else if (this.h.a >= 2) {
                    ekn eknVar2 = this.a;
                    int i3 = this.b;
                    int b = eknVar2.b() - i3;
                    int i4 = this.i;
                    if (b > i4) {
                        this.a.e(i3 + i4, 0);
                    }
                }
            }
        }
        if (ekr.b(this.f, this.a, this.b, this.j)) {
            this.a.e(this.b, this.j);
            this.e.a = false;
            cxsVar.c();
        } else if (ekr.c(this.a, this.b)) {
            ekn eknVar3 = this.a;
            int i5 = this.b;
            fflb fflbVar = this.k;
            f = eknVar3.f(i5);
            throw new ehx(f, (cxv) fflbVar.a);
        }
        return ffcu.a;
    }
}
