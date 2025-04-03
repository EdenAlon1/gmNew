package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvum implements cvup {
    public final String a;

    public cvum(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cvum) && ffkj.e(this.a, ((cvum) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Header(value=" + this.a + ")";
    }
}
