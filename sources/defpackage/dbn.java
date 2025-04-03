package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dbn extends ffkk implements ffji {
    final /* synthetic */ dbe a;
    final /* synthetic */ daw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbn(dbe dbeVar, daw dawVar) {
        super(1);
        this.a = dbeVar;
        this.b = dawVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.a.u(this.b);
        return new dbm(this.a, this.b);
    }
}
