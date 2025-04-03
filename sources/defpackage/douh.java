package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class douh implements doui {
    private final dotn a;

    public douh() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof douh) && ffkj.e(this.a, ((douh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ManualTrigger(flags=" + this.a + ")";
    }

    public /* synthetic */ douh(byte[] bArr) {
        this.a = new dotn(null);
    }
}
