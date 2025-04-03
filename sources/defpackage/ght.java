package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ght extends ffkk implements ffji {
    final /* synthetic */ cxj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ght(cxj cxjVar) {
        super(1);
        this.a = cxjVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        idd iddVar = (idd) obj;
        float floatValue = ((Number) this.a.d()).floatValue();
        float b = gim.b(iddVar, floatValue);
        float c = gim.c(iddVar, floatValue);
        iddVar.y(c == 0.0f ? 1.0f : b / c);
        iddVar.C(gim.a);
        return ffcu.a;
    }
}
