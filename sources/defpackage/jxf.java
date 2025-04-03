package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jxf implements jxi {
    public hkx a;

    public jxf() {
        this.a = lgl.h() ? a() : null;
    }

    public final hkx a() {
        lgl c = lgl.c();
        if (c.b() == 1) {
            return new jxk(true);
        }
        hic hicVar = new hic(false, hla.a);
        c.f(new jxe(hicVar, this));
        return hicVar;
    }
}
