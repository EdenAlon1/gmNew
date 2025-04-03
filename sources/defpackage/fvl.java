package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fvl extends ffkk implements ffji {
    final /* synthetic */ gmk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fvl(gmk gmkVar) {
        super(1);
        this.a = gmkVar;
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        idd iddVar = (idd) obj;
        float b = this.a.d.b();
        float a = this.a.d.p().a();
        float f = b < a ? a - b : 0.0f;
        iddVar.y(f > 0.0f ? (iar.a(iddVar.r) + f) / iar.a(iddVar.r) : 1.0f);
        iddVar.C(ids.a(0.5f, 0.0f));
        return ffcu.a;
    }
}
