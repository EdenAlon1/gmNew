package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dobj implements dobm {
    public final int a;
    private final boolean b = true;

    public dobj(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dobj)) {
            return false;
        }
        dobj dobjVar = (dobj) obj;
        if (this.a != dobjVar.a) {
            return false;
        }
        boolean z = dobjVar.b;
        return true;
    }

    public final int hashCode() {
        return (this.a * 31) + 1231;
    }

    public final String toString() {
        return "RichCardActionIconResource(iconResource=" + this.a + ", tint=true)";
    }
}
