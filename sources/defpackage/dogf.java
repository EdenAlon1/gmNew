package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dogf {
    public final String a;
    public final ffix b;

    public dogf(String str, ffix ffixVar) {
        this.a = str;
        this.b = ffixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dogf)) {
            return false;
        }
        dogf dogfVar = (dogf) obj;
        return ffkj.e(this.a, dogfVar.a) && ffkj.e(this.b, dogfVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "AlertCardButton(text=" + this.a + ", onClick=" + this.b + ")";
    }
}
