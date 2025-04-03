package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dokt extends dokv {
    public final int a;

    public dokt(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dokt) && this.a == ((dokt) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "ResourceId(id=" + this.a + ")";
    }
}
