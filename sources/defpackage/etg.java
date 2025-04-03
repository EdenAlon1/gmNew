package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class etg extends ffkk implements ffji {
    final /* synthetic */ eva a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public etg(eva evaVar) {
        super(1);
        this.a = evaVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ioc iocVar = (ioc) obj;
        exq d = this.a.d();
        if (d != null) {
            d.c = iocVar;
        }
        return ffcu.a;
    }
}
