package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class goe extends ffkk implements ffji {
    final /* synthetic */ iqk a;
    final /* synthetic */ int b;
    final /* synthetic */ iqk c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;
    final /* synthetic */ iqk f;
    final /* synthetic */ int g;
    final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public goe(iqk iqkVar, int i, iqk iqkVar2, int i2, int i3, iqk iqkVar3, int i4, int i5) {
        super(1);
        this.a = iqkVar;
        this.b = i;
        this.c = iqkVar2;
        this.d = i2;
        this.e = i3;
        this.f = iqkVar3;
        this.g = i4;
        this.h = i5;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        iqj iqjVar = (iqj) obj;
        iqj.m(iqjVar, this.a, 0, this.b);
        iqk iqkVar = this.c;
        if (iqkVar != null) {
            iqj.m(iqjVar, iqkVar, this.d, this.e);
        }
        iqk iqkVar2 = this.f;
        if (iqkVar2 != null) {
            iqj.m(iqjVar, iqkVar2, this.g, this.h);
        }
        return ffcu.a;
    }
}
