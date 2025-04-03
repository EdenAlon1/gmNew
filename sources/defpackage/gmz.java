package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gmz extends ffkk implements ffji {
    final /* synthetic */ iqk a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ iqk d;
    final /* synthetic */ int e;
    final /* synthetic */ ffkz f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmz(iqk iqkVar, int i, int i2, iqk iqkVar2, int i3, ffkz ffkzVar) {
        super(1);
        this.a = iqkVar;
        this.b = i;
        this.c = i2;
        this.d = iqkVar2;
        this.e = i3;
        this.f = ffkzVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        iqj iqjVar = (iqj) obj;
        iqj.m(iqjVar, this.a, this.b, this.c);
        iqj.m(iqjVar, this.d, this.e, this.f.a);
        return ffcu.a;
    }
}
