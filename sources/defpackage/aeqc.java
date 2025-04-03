package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeqc extends aeqe {
    public final boolean a;

    public aeqc(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aeqc) && this.a == ((aeqc) obj).a;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    public final String toString() {
        return "UserSignedIn(useAnimation=" + this.a + ")";
    }
}
