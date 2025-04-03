package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xsy implements xta {
    public final String a;

    public xsy(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xsy) && ffkj.e(this.a, ((xsy) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "Discard(textCaption=" + this.a + ")";
    }
}
