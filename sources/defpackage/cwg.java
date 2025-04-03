package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cwg extends ffkk implements ffji {
    final /* synthetic */ ipq a;
    final /* synthetic */ cwb b;
    final /* synthetic */ iqk c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwg(ipq ipqVar, cwb cwbVar, iqk iqkVar) {
        super(1);
        this.a = ipqVar;
        this.b = cwbVar;
        this.c = iqkVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        iqj iqjVar = (iqj) obj;
        ioc b = iqjVar.b();
        if (b != null) {
            if (this.a.eu()) {
                this.b.g = b;
            } else {
                this.b.f = b;
            }
        }
        iqjVar.e(this.c, 0, 0, 0.0f);
        return ffcu.a;
    }
}
