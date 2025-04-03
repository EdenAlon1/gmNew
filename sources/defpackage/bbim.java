package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bbim {
    public final boolean a;

    public bbim(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bbim) && this.a == ((bbim) obj).a;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    public final String toString() {
        return "BackupParameters(includeC2pData=" + this.a + ")";
    }
}
