package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhjl {
    public static final fhmx a;
    public static final fhmx b;
    public static final fhmx c;
    public static final fhmx d;
    public static final fhmx e;
    public static final fhmx f;
    public final fhmx g;
    public final fhmx h;
    public final int i;

    static {
        fhmx fhmxVar = fhmx.a;
        a = fhmw.b(":");
        b = fhmw.b(":status");
        c = fhmw.b(":method");
        d = fhmw.b(":path");
        e = fhmw.b(":scheme");
        f = fhmw.b(":authority");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public fhjl(String str, String str2) {
        this(fhmw.b(str), fhmw.b(str2));
        str2.getClass();
        fhmx fhmxVar = fhmx.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fhjl)) {
            return false;
        }
        fhjl fhjlVar = (fhjl) obj;
        return ffkj.e(this.g, fhjlVar.g) && ffkj.e(this.h, fhjlVar.h);
    }

    public final int hashCode() {
        return (this.g.hashCode() * 31) + this.h.hashCode();
    }

    public final String toString() {
        fhmx fhmxVar = this.h;
        return this.g.e() + ": " + fhmxVar.e();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public fhjl(fhmx fhmxVar, String str) {
        this(fhmxVar, fhmw.b(str));
        fhmxVar.getClass();
    }

    public fhjl(fhmx fhmxVar, fhmx fhmxVar2) {
        this.g = fhmxVar;
        this.h = fhmxVar2;
        this.i = fhmxVar.b() + 32 + fhmxVar2.b();
    }
}
