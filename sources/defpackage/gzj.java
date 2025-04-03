package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gzj extends ffkk implements ffix {
    final /* synthetic */ gzl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gzj(gzl gzlVar) {
        super(0);
        this.a = gzlVar;
    }

    @Override // defpackage.ffix
    public final Object invoke() {
        Object i = this.a.i();
        if (i != null) {
            return i;
        }
        gzl gzlVar = this.a;
        float b = gzlVar.b();
        return !Float.isNaN(b) ? gzlVar.g(b, gzlVar.h(), 0.0f) : gzlVar.h();
    }
}
