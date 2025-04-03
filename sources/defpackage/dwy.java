package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dwy extends ffkk implements ffji {
    final /* synthetic */ imq a;
    final /* synthetic */ float b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;
    final /* synthetic */ iqk f;
    final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dwy(imq imqVar, float f, int i, int i2, int i3, iqk iqkVar, int i4) {
        super(1);
        this.a = imqVar;
        this.b = f;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = iqkVar;
        this.g = i4;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        iqj iqjVar = (iqj) obj;
        int i2 = 0;
        if (this.a instanceof inv) {
            i = 0;
        } else if (jzq.b(this.b, Float.NaN)) {
            i = (this.d - this.e) - this.f.a;
        } else {
            i = this.c;
        }
        if (this.a instanceof inv) {
            if (jzq.b(this.b, Float.NaN)) {
                i2 = (this.g - this.e) - this.f.b;
            } else {
                i2 = this.c;
            }
        }
        iqj.m(iqjVar, this.f, i, i2);
        return ffcu.a;
    }
}
