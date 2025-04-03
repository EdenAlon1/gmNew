package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drey extends drfa {
    public static final drex a = new drex();
    public final String b;
    public final drek c;

    public drey(String str, drek drekVar) {
        str.getClass();
        this.b = str;
        this.c = drekVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drey)) {
            return false;
        }
        drey dreyVar = (drey) obj;
        return ffkj.e(this.b, dreyVar.b) && ffkj.e(this.c, dreyVar.c);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    public final String toString() {
        return this.c.a() + "|" + this.b;
    }
}
