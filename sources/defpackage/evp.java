package defpackage;

/* compiled from: PG */
@ffiv
/* loaded from: classes.dex */
public final class evp {
    public final int a;

    public final boolean equals(Object obj) {
        return (obj instanceof evp) && this.a == ((evp) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "MenuItemsAvailability(value=" + this.a + ')';
    }
}
