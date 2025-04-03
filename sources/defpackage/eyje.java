package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eyje extends eyjc {
    static final eyjd k(Object obj) {
        return ((eyfy) obj).unknownFields;
    }

    static final void l(Object obj, eyjd eyjdVar) {
        ((eyfy) obj).unknownFields = eyjdVar;
    }

    @Override // defpackage.eyjc
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        eyjd k = k(obj);
        if (k != eyjd.a) {
            return k;
        }
        eyjd eyjdVar = new eyjd();
        l(obj, eyjdVar);
        return eyjdVar;
    }

    @Override // defpackage.eyjc
    public final /* synthetic */ Object b() {
        return new eyjd();
    }

    @Override // defpackage.eyjc
    public final /* bridge */ /* synthetic */ void c(Object obj, int i, int i2) {
        ((eyjd) obj).f(eyjt.c(i, 5), Integer.valueOf(i2));
    }

    @Override // defpackage.eyjc
    public final /* bridge */ /* synthetic */ void d(Object obj, int i, long j) {
        ((eyjd) obj).f(eyjt.c(i, 1), Long.valueOf(j));
    }

    @Override // defpackage.eyjc
    public final /* bridge */ /* synthetic */ void e(Object obj, int i, Object obj2) {
        ((eyjd) obj).f(eyjt.c(i, 3), obj2);
    }

    @Override // defpackage.eyjc
    public final /* bridge */ /* synthetic */ void f(Object obj, int i, eyee eyeeVar) {
        ((eyjd) obj).f(eyjt.c(i, 2), eyeeVar);
    }

    @Override // defpackage.eyjc
    public final /* bridge */ /* synthetic */ void g(Object obj, int i, long j) {
        ((eyjd) obj).f(eyjt.c(i, 0), Long.valueOf(j));
    }

    @Override // defpackage.eyjc
    public final void h(Object obj) {
        k(obj).e();
    }

    @Override // defpackage.eyjc
    public final /* synthetic */ void j(Object obj) {
        ((eyjd) obj).e();
    }
}
