package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kba extends ffkk implements ffji {
    final /* synthetic */ iui a;
    final /* synthetic */ hvi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kba(iui iuiVar, hvi hviVar) {
        super(1);
        this.a = iuiVar;
        this.b = hviVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.a.k(((hvi) obj).a(this.b));
        return ffcu.a;
    }
}
