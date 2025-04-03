package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alxe extends Exception {
    public final int a;

    public alxe() {
        super("Compose constraint violated because: SELFIDENTITY_UNAVAILABLE.");
        this.a = 2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof alxe) && ((alxe) obj).a == this.a;
    }

    public final int hashCode() {
        int i = this.a;
        if (i != 0) {
            return i;
        }
        throw null;
    }

    public alxe(int i, String str) {
        super(str);
        this.a = i;
    }
}
