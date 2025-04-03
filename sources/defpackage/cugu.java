package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cugu {
    public final String a;
    public final String b;

    public cugu(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cugu)) {
            return false;
        }
        cugu cuguVar = (cugu) obj;
        return ffkj.e(this.a, cuguVar.a) && ffkj.e(this.b, cuguVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "UserIds(userId=" + this.a + ", urlUserId=" + this.b + ")";
    }
}
