package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gzi extends ffkk implements ffix {
    final /* synthetic */ gzl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gzi(gzl gzlVar) {
        super(0);
        this.a = gzlVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        gzl gzlVar = this.a;
        float b = gzlVar.p().b(gzlVar.h());
        gzl gzlVar2 = this.a;
        float b2 = gzlVar2.p().b(gzlVar2.e.a()) - b;
        float abs = Math.abs(b2);
        float f = 1.0f;
        if (!Float.isNaN(abs) && abs > 1.0E-6f) {
            float d = (this.a.d() - b) / b2;
            if (d < 1.0E-6f) {
                f = 0.0f;
            } else if (d <= 0.999999f) {
                f = d;
            }
        }
        return Float.valueOf(f);
    }
}
