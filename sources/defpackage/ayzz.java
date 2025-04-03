package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayzz {
    public final int a;
    private final int b = 40;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ayzz)) {
            return false;
        }
        ayzz ayzzVar = (ayzz) obj;
        if (this.a != ayzzVar.a) {
            return false;
        }
        int i = ayzzVar.b;
        return true;
    }

    public final int hashCode() {
        return (this.a * 31) + 40;
    }

    public final String toString() {
        return "InMemoryCacheConfig(sizeLimit=" + this.a + ", evictLevel=40)";
    }
}
