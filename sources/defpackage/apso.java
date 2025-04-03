package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class apso extends apus {
    private final int a;

    public apso(int i) {
        this.a = i;
    }

    @Override // defpackage.apus
    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof apus) && this.a == ((apus) obj).a();
    }

    public final int hashCode() {
        return this.a ^ 1000003;
    }

    public final String toString() {
        return "OffsetPagingKey{offset=" + this.a + "}";
    }
}
