package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hqx implements hgo {
    final /* synthetic */ hra a;
    final /* synthetic */ Object b;
    final /* synthetic */ hrc c;

    public hqx(hra hraVar, Object obj, hrc hrcVar) {
        this.a = hraVar;
        this.b = obj;
        this.c = hrcVar;
    }

    @Override // defpackage.hgo
    public final void a() {
        Object b = this.a.c.b(this.b);
        hrc hrcVar = this.c;
        if (b == hrcVar) {
            hra hraVar = this.a;
            hraVar.a(hrcVar, hraVar.b, this.b);
        }
    }
}
