package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfvk {
    public final ecwh a;
    public final String b;

    public cfvk(ecwh ecwhVar, String str) {
        emxf.b(str.endsWith("__"), "Phenotype builder prefix should end with __ characters");
        this.a = ecwhVar;
        this.b = str;
    }

    public final cfup a(String str, int i) {
        return cfvl.e(this.a, this.b.concat(str), i);
    }

    public final cfup b(String str, long j) {
        return cfvl.f(this.a, this.b.concat(str), j);
    }

    public final cfup c(String str, String str2) {
        return cfvl.h(this.a, this.b.concat(str), str2);
    }

    public final cfup d(String str, boolean z) {
        return cfvl.i(this.a, this.b.concat(str), z);
    }
}
