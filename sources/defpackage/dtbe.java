package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtbe implements dtbf {
    public final dsos a;

    public dtbe(dsos dsosVar) {
        this.a = dsosVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dtbe) && ffkj.e(this.a, ((dtbe) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Keyboard(keyboard=" + this.a + ")";
    }
}
