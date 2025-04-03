package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dbj extends ffkk implements ffji {
    final /* synthetic */ dbe a;
    final /* synthetic */ dbe b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbj(dbe dbeVar, dbe dbeVar2) {
        super(1);
        this.a = dbeVar;
        this.b = dbeVar2;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.a.e.add(this.b);
        return new dbi(this.a, this.b);
    }
}
