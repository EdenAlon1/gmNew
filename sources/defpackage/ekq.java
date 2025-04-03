package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ekq extends ffkk implements ffji {
    final /* synthetic */ float a;
    final /* synthetic */ ffky b;
    final /* synthetic */ ekn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ekq(float f, ffky ffkyVar, ekn eknVar) {
        super(1);
        this.a = f;
        this.b = ffkyVar;
        this.c = eknVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        float f = this.a;
        float f2 = 0.0f;
        cxs cxsVar = (cxs) obj;
        if (f > 0.0f) {
            f2 = ffmk.d(((Number) cxsVar.a()).floatValue(), this.a);
        } else if (f < 0.0f) {
            f2 = ffmk.c(((Number) cxsVar.a()).floatValue(), this.a);
        }
        float f3 = f2 - this.b.a;
        if (f3 != this.c.a(f3) || f2 != ((Number) cxsVar.a()).floatValue()) {
            cxsVar.c();
        }
        this.b.a += f3;
        return ffcu.a;
    }
}
