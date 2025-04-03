package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfmj extends cfmk {
    public final fayi a;

    public cfmj(fayi fayiVar) {
        fayiVar.getClass();
        this.a = fayiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cfmj) && ffkj.e(this.a, ((cfmj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Scytale(fileEncryptionMetadata=" + this.a + ")";
    }
}
