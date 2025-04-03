package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyxa {
    public final boolean a;
    public final boolean b;

    public cyxa(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cyxa)) {
            return false;
        }
        cyxa cyxaVar = (cyxa) obj;
        return this.a == cyxaVar.a && this.b == cyxaVar.b;
    }

    public final int hashCode() {
        return (cywz.a(this.a) * 31) + cywz.a(this.b);
    }

    public final String toString() {
        return "Flags(enablePopupTransitionAnimationFix=" + this.a + ", enableLargeDisplayAvatarFix=" + this.b + ")";
    }

    public cyxa() {
        this(false, false);
    }
}
