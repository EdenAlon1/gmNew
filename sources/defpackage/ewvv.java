package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewvv extends ewzy {
    private final int a;

    public ewvv(int i) {
        this.a = i;
    }

    @Override // defpackage.ewzy
    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ewzy) && this.a == ((ewzy) obj).a();
    }

    public final int hashCode() {
        return this.a ^ 1000003;
    }

    public final String toString() {
        return "Permissions{readContacts=" + this.a + "}";
    }
}
