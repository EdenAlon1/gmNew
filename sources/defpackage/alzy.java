package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class alzy extends ambl {
    private final int a;

    public alzy(int i) {
        this.a = i;
    }

    @Override // defpackage.ambl
    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ambl) && this.a == ((ambl) obj).a();
    }

    public final int hashCode() {
        return this.a ^ 1000003;
    }

    public final String toString() {
        return "OffsetPagingKey{offset=" + this.a + "}";
    }
}
