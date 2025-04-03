package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fpm extends ffkk implements ffji {
    final /* synthetic */ float a;
    final /* synthetic */ der b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fpm(float f, der derVar) {
        super(1);
        this.a = f;
        this.b = derVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ifo ifoVar = (ifo) obj;
        ifoVar.p();
        if (!jzq.b(this.a, 0.0f)) {
            float ec = this.a * ifoVar.ec();
            float a = iar.a(ifoVar.b()) - (ec / 2.0f);
            der derVar = this.b;
            ifq.g(ifoVar, derVar.b, ial.a(0.0f, a), ial.a(iar.c(ifoVar.b()), a), ec, 0.0f, 496);
        }
        return ffcu.a;
    }
}
