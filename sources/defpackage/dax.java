package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dax extends ffkk implements ffji {
    final /* synthetic */ dbe a;
    final /* synthetic */ float b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dax(dbe dbeVar, float f) {
        super(1);
        this.a = dbeVar;
        this.b = f;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        long longValue = ((Number) obj).longValue();
        if (!this.a.t()) {
            dbe dbeVar = this.a;
            float f = this.b;
            if (dbeVar.c() == Long.MIN_VALUE) {
                dbeVar.j(longValue);
            }
            long c = longValue - dbeVar.c();
            boolean z = f != 0.0f;
            if (f != 0.0f) {
                c = ffln.c(c / f);
            }
            dbeVar.l(c);
            dbeVar.h(c, !z);
        }
        return ffcu.a;
    }
}
