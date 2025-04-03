package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fgh extends ffkk implements ffjm {
    final /* synthetic */ ioc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fgh(ioc iocVar) {
        super(2);
        this.a = iocVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ioc k = ((fcv) obj).k();
        ioc k2 = ((fcv) obj2).k();
        long h = k != null ? this.a.h(k, 0L) : 0L;
        long h2 = k2 != null ? this.a.h(k2, 0L) : 0L;
        int i = (int) (4294967295L & h2);
        int i2 = (int) (h & 4294967295L);
        return Integer.valueOf(Float.intBitsToFloat(i2) == Float.intBitsToFloat(i) ? ffgh.a(Float.valueOf(Float.intBitsToFloat((int) (h >> 32))), Float.valueOf(Float.intBitsToFloat((int) (h2 >> 32)))) : ffgh.a(Float.valueOf(Float.intBitsToFloat(i2)), Float.valueOf(Float.intBitsToFloat(i))));
    }
}
