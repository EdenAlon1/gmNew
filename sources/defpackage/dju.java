package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dju extends ffkk implements ffji {
    final /* synthetic */ ffix a;
    final /* synthetic */ dkl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dju(ffix ffixVar, dkl dklVar) {
        super(1);
        this.a = ffixVar;
        this.b = dklVar;
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        long j = ((iak) obj).a;
        this.a.invoke();
        this.b.b(new dkj(j));
        return ffcu.a;
    }
}
