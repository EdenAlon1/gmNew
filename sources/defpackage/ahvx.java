package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahvx {
    public final fgdj a;

    public ahvx(fgdj fgdjVar) {
        fgdjVar.getClass();
        this.a = fgdjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ahvx) && ffkj.e(this.a, ((ahvx) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BottomContentUiData(composeRow=" + this.a + ")";
    }
}
