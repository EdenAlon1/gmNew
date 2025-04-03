package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fezo {
    public static final fhmx a;
    public static final fhmx b;
    public static final fhmx c;
    public static final fhmx d;
    public static final fhmx e;
    public final fhmx f;
    public final fhmx g;
    final int h;

    static {
        fhmx fhmxVar = fhmx.a;
        a = fhmw.b(":status");
        b = fhmw.b(":method");
        c = fhmw.b(":path");
        d = fhmw.b(":scheme");
        e = fhmw.b(":authority");
        fhmw.b(":host");
        fhmw.b(":version");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public fezo(String str, String str2) {
        this(fhmw.b(str), fhmw.b(str2));
        fhmx fhmxVar = fhmx.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fezo) {
            fezo fezoVar = (fezo) obj;
            if (this.f.equals(fezoVar.f) && this.g.equals(fezoVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f.hashCode() + 527) * 31) + this.g.hashCode();
    }

    public final String toString() {
        return String.format("%s: %s", this.f.e(), this.g.e());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public fezo(fhmx fhmxVar, String str) {
        this(fhmxVar, fhmw.b(str));
        fhmx fhmxVar2 = fhmx.a;
    }

    public fezo(fhmx fhmxVar, fhmx fhmxVar2) {
        this.f = fhmxVar;
        this.g = fhmxVar2;
        this.h = fhmxVar.b() + 32 + fhmxVar2.b();
    }
}
