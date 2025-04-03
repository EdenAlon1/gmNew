package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cqu extends ffkk implements ffji {
    final /* synthetic */ cqv a;
    final /* synthetic */ long b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqu(cqv cqvVar, long j) {
        super(1);
        this.a = cqvVar;
        this.b = j;
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        long j;
        if (ffkj.e(obj, this.a.c.a())) {
            j = this.a.a(this.b);
        } else {
            hkx hkxVar = (hkx) this.a.c.d.f(obj);
            j = hkxVar != null ? ((kaf) hkxVar.a()).a : 0L;
        }
        return new kaf(j);
    }
}
