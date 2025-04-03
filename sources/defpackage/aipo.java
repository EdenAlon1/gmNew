package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aipo {
    public final String a;
    public final String b;

    public aipo(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aipo)) {
            return false;
        }
        aipo aipoVar = (aipo) obj;
        return ffkj.e(this.a, aipoVar.a) && ffkj.e(this.b, aipoVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Header(key=" + this.a + ", value=" + this.b + ")";
    }
}
