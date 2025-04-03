package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ghs extends ffkk implements ffji {
    final /* synthetic */ gmk a;
    final /* synthetic */ cxj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ghs(gmk gmkVar, cxj cxjVar) {
        super(1);
        this.a = gmkVar;
        this.b = cxjVar;
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        idd iddVar = (idd) obj;
        float b = this.a.d.b();
        float a = iar.a(iddVar.r);
        if (!Float.isNaN(b) && !Float.isNaN(a) && a != 0.0f) {
            float floatValue = ((Number) this.b.d()).floatValue();
            iddVar.x(gim.b(iddVar, floatValue));
            iddVar.y(gim.c(iddVar, floatValue));
            iddVar.C(ids.a(0.5f, (b + a) / a));
        }
        return ffcu.a;
    }
}
