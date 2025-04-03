package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azai {
    public final String a;
    public final String b;

    public azai(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof azai)) {
            return false;
        }
        azai azaiVar = (azai) obj;
        return ffkj.e(this.a, azaiVar.a) && ffkj.e(this.b, azaiVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "AppCapability(key=" + this.a + ", value=" + this.b + ")";
    }
}
