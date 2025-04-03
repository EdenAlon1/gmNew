package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejft extends ejfs {
    private final eixz c;

    public ejft(eixz eixzVar) {
        this.c = eixzVar;
    }

    @Override // defpackage.ejfs
    public final eixz b() {
        return this.c;
    }

    @Override // defpackage.qtp
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ejfs) {
            return this.c.equals(((ejfs) obj).b());
        }
        return false;
    }

    @Override // defpackage.qtp
    public final int hashCode() {
        return this.c.hashCode() ^ 1000003;
    }
}
