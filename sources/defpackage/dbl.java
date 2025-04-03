package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dbl extends ffkk implements ffji {
    final /* synthetic */ dbe a;
    final /* synthetic */ das b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbl(dbe dbeVar, das dasVar) {
        super(1);
        this.a = dbeVar;
        this.b = dasVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dbk(this.a, this.b);
    }
}
