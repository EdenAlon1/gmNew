package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hqy extends ffkk implements ffji {
    final /* synthetic */ hra a;
    final /* synthetic */ Object b;
    final /* synthetic */ hrc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hqy(hra hraVar, Object obj, hrc hrcVar) {
        super(1);
        this.a = hraVar;
        this.b = obj;
        this.c = hrcVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean g = this.a.c.g(this.b);
        Object obj2 = this.b;
        if (g) {
            throw new IllegalArgumentException(a.i(obj2, "Key ", " was used multiple times "));
        }
        this.a.b.remove(obj2);
        hra hraVar = this.a;
        hraVar.c.e(this.b, this.c);
        return new hqx(this.a, this.b, this.c);
    }
}
