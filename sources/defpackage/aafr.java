package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aafr {
    public final alxr a;

    public aafr(alxr alxrVar) {
        alxrVar.getClass();
        this.a = alxrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aafr) && ffkj.e(this.a, ((aafr) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ProgressBarOverlayArgs(message=" + this.a + ")";
    }
}
