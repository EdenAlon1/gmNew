package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acr extends ffkk implements ffji {
    final /* synthetic */ aca a;
    final /* synthetic */ lkr b;
    final /* synthetic */ act c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acr(aca acaVar, lkr lkrVar, act actVar) {
        super(1);
        this.a = acaVar;
        this.b = lkrVar;
        this.c = actVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.a.b(this.b, this.c);
        return new acq(this.c);
    }
}
