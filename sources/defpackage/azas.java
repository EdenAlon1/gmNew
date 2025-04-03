package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class azas extends azau {
    private final enhk a;

    public azas(enhk enhkVar) {
        this.a = enhkVar;
    }

    @Override // defpackage.azau
    public final enhk b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof azau) {
            return ennc.m(this.a, ((azau) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RcsCapabilities{capabilities=" + ennc.g(this.a) + "}";
    }
}
