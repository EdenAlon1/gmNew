package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class foy extends ffkk implements ffji {
    final /* synthetic */ float a;
    final /* synthetic */ hho b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public foy(float f, hho hhoVar) {
        super(1);
        this.a = f;
        this.b = hhoVar;
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        long j = ((iar) obj).a;
        float c = iar.c(j) * this.a;
        float a = iar.a(j) * this.a;
        if (iar.c(((iar) this.b.a()).a) != c || iar.a(((iar) this.b.a()).a) != a) {
            this.b.b(new iar(ias.a(c, a)));
        }
        return ffcu.a;
    }
}
