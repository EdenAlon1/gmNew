package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajvf extends ajvg {
    public final int a;

    public ajvf(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ajvf) && this.a == ((ajvf) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "ResourceId(resourceId=" + this.a + ")";
    }
}
