package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jno extends ffkk implements ffjm {
    public static final jno a = new jno();

    public jno() {
        super(2);
    }

    @Override // defpackage.ffjm
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        long j = ((iak) obj2).a;
        if (iak.i(j, 9205357640488583168L)) {
            return false;
        }
        return ffdx.f(Float.valueOf(Float.intBitsToFloat((int) (j >> 32))), Float.valueOf(Float.intBitsToFloat((int) (j & 4294967295L))));
    }
}
