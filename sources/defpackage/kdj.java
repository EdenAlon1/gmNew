package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kdj extends ffkk implements ffji {
    final /* synthetic */ kes a;
    final /* synthetic */ kev b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kdj(kes kesVar, kev kevVar) {
        super(1);
        this.a = kesVar;
        this.b = kevVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        kes kesVar = this.a;
        kesVar.d = this.b;
        kesVar.m();
        return new kdi();
    }
}
