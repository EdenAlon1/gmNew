package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyqe {
    public final engw a;

    public cyqe(engw engwVar) {
        this.a = engwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cyqe) && ffkj.e(this.a, ((cyqe) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "EncryptionUiData(actions=" + this.a + ")";
    }
}
