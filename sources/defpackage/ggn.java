package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ggn extends ffkk implements ffji {
    final /* synthetic */ int a;
    final /* synthetic */ iqk b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ggn(int i, iqk iqkVar, int i2) {
        super(1);
        this.a = i;
        this.b = iqkVar;
        this.c = i2;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        float f = this.a - this.b.a;
        int i = this.c;
        ((iqj) obj).e(this.b, ffln.b(f / 2.0f), ffln.b((i - r1.b) / 2.0f), 0.0f);
        return ffcu.a;
    }
}
