package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejst extends ejsy {
    private final ffcu a = ffcu.a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ejst) && ffkj.e(this.a, ((ejst) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Idle(unit=" + this.a + ")";
    }
}
