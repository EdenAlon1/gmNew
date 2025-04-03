package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cusf {
    public final int a;
    public final String b;

    public cusf(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cusf)) {
            return false;
        }
        cusf cusfVar = (cusf) obj;
        return this.a == cusfVar.a && ffkj.e(this.b, cusfVar.b);
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "RcsNetworkSpamIndicator(spamVerdict=" + this.a + ", source=" + this.b + ")";
    }
}
