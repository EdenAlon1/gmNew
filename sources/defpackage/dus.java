package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dus extends ffkk implements ffji {
    final /* synthetic */ fflb a;
    final /* synthetic */ dnh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dus(fflb fflbVar, dnh dnhVar) {
        super(1);
        this.a = fflbVar;
        this.b = dnhVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        cxs cxsVar = (cxs) obj;
        float f = ((dmb) this.a.a).a == 0.0f ? 1.0f : ((dmb) cxsVar.a()).a / ((dmb) this.a.a).a;
        this.b.a(f, iak.e(((dmb) cxsVar.a()).b, ((dmb) this.a.a).b), ((dmb) cxsVar.a()).c - ((dmb) this.a.a).c);
        this.a.a = cxsVar.a();
        return ffcu.a;
    }
}
