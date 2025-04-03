package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class arcg extends arch {
    private final Throwable a;

    public arcg(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof arcg) && ffkj.e(this.a, ((arcg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PlayerNotPrepared(throwable=" + this.a + ")";
    }
}
