package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dbp extends ffkk implements ffji {
    final /* synthetic */ dbe a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbp(dbe dbeVar) {
        super(1);
        this.a = dbeVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dbo(this.a);
    }
}
