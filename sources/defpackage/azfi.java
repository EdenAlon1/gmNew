package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azfi {
    public final azfh a;

    public azfi(azfh azfhVar) {
        azfhVar.getClass();
        this.a = azfhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof azfi) && ffkj.e(this.a, ((azfi) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "GroupCacheEntry(group=" + this.a + ")";
    }
}
