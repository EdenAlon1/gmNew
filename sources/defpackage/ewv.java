package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ewv extends ffkk implements ffji {
    final /* synthetic */ hho a;
    final /* synthetic */ dwn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ewv(hho hhoVar, dwn dwnVar) {
        super(1);
        this.a = hhoVar;
        this.b = dwnVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new ewu(this.a, this.b);
    }
}
