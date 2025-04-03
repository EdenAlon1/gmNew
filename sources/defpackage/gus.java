package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gus extends ffkk implements ffjm {
    final /* synthetic */ jzn a;
    final /* synthetic */ int b;
    final /* synthetic */ long c;
    final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gus(jzn jznVar, int i, long j, long j2) {
        super(2);
        this.a = jznVar;
        this.b = i;
        this.c = j;
        this.d = j2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        long a;
        hxn hxnVar = (hxn) obj;
        ioc iocVar = (ioc) obj2;
        float f = gvc.a;
        ibc ibcVar = new ibc((byte[]) null);
        if (iocVar != null) {
            long j = this.d;
            int i = this.b;
            jzn jznVar = this.a;
            float eo = jznVar.eo(jzv.a(j));
            int eo2 = jznVar.eo(jzv.b(j));
            int eo3 = jznVar.eo(4.0f);
            iam e = iod.e(iocVar);
            float f2 = e.b;
            float f3 = e.d;
            float f4 = e.c;
            float c = iar.c(hxnVar.a());
            float a2 = iar.a(hxnVar.a());
            float f5 = (f4 - a2) - eo3;
            if (f5 < 0.0f) {
                a2 = 0.0f;
            }
            float f6 = (f3 + f2) / 2.0f;
            float f7 = c / 2.0f;
            float f8 = (f3 - f2) / 2.0f;
            if ((f2 - f7) + f8 <= 0.0f) {
                a = ial.a(f6, a2);
            } else {
                float f9 = i;
                a = (f3 + f7) - f8 >= f9 ? ial.a(c - (f9 - f6), a2) : ial.a(f7, a2);
            }
            if (f6 - f7 < 0.0f) {
                a = ial.a(f6 - f2, a2);
            } else if (f7 + f6 > i) {
                a = ial.a(f6 - (f3 - c), a2);
            }
            if (f5 < 0.0f) {
                ibcVar.f(iak.b(a), iak.c(a));
                float f10 = eo2 / 2;
                ibcVar.e(iak.b(a) + f10, iak.c(a));
                ibcVar.e(iak.b(a), iak.c(a) - eo);
                ibcVar.e(iak.b(a) - f10, iak.c(a));
                ibcVar.c();
            } else {
                ibcVar.f(iak.b(a), iak.c(a));
                float f11 = eo2 / 2;
                ibcVar.e(iak.b(a) + f11, iak.c(a));
                ibcVar.e(iak.b(a), iak.c(a) + eo);
                ibcVar.e(iak.b(a) - f11, iak.c(a));
                ibcVar.c();
            }
        }
        return hxnVar.p(new gvb(iocVar, ibcVar, this.c));
    }
}
