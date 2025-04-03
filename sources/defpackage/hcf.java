package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hcf extends ffkk implements ffji {
    final /* synthetic */ hkx a;
    final /* synthetic */ hho b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hcf(hkx hkxVar, hho hhoVar) {
        super(1);
        this.a = hkxVar;
        this.b = hhoVar;
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        long j = ((iar) obj).a;
        float floatValue = ((Number) this.a.a()).floatValue();
        float c = iar.c(j) * floatValue;
        float a = iar.a(j) * floatValue;
        if (iar.c(((iar) this.b.a()).a) != c || iar.a(((iar) this.b.a()).a) != a) {
            this.b.b(new iar(ias.a(c, a)));
        }
        return ffcu.a;
    }
}
