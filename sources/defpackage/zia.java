package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zia implements zib {
    public final String a;

    public zia(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zia) && ffkj.e(this.a, ((zia) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Text(reply=" + this.a + ")";
    }
}
