package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jyn {
    static final /* synthetic */ jyn a = new jyn();

    private jyn() {
    }

    public static final jyr a(long j) {
        return j != 16 ? new jxx(j) : jyo.a;
    }

    public static final jyr b(ibq ibqVar, float f) {
        if (ibqVar == null) {
            return jyo.a;
        }
        if (!(ibqVar instanceof idl)) {
            if (ibqVar instanceof ide) {
                return new jxw((ide) ibqVar, f);
            }
            throw new ffcd();
        }
        long j = ((idl) ibqVar).a;
        if (!Float.isNaN(f) && f < 1.0f) {
            j = iby.f(ibw.d(j), ibw.c(j), ibw.b(j), ibw.a(j) * f, ibw.f(j));
        }
        return a(j);
    }
}
