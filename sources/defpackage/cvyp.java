package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvyp {
    public final String a;
    public final boolean b;

    public cvyp() {
        this("");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cvyp) && ffkj.e(this.a, ((cvyp) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "GroupNameConfig(name=" + this.a + ")";
    }

    public cvyp(String str) {
        this.a = str;
        this.b = str.length() > 0;
    }
}
