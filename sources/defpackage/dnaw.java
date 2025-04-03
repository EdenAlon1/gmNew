package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnaw {
    public final String a;
    public final String b;

    public dnaw(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnaw)) {
            return false;
        }
        dnaw dnawVar = (dnaw) obj;
        return ffkj.e(this.a, dnawVar.a) && ffkj.e(this.b, dnawVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "MddFile(fileId=" + this.a + ", fileGroup=" + this.b + ")";
    }
}
