package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xsb {
    public final dlut a;

    public xsb(dlut dlutVar) {
        this.a = dlutVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xsb) && ffkj.e(this.a, ((xsb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DisabledComposeRowUiData(annotationUiData=" + this.a + ")";
    }
}
