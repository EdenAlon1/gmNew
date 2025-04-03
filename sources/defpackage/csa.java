package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class csa extends ffkk implements ffji {
    final /* synthetic */ csb a;
    final /* synthetic */ iam b;
    final /* synthetic */ iam c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csa(csb csbVar, iam iamVar, iam iamVar2) {
        super(1);
        this.a = csbVar;
        this.b = iamVar;
        this.c = iamVar2;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((Boolean) obj).booleanValue() == ((Boolean) this.a.a.f()).booleanValue() ? this.b : this.c;
    }
}
