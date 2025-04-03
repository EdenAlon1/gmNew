package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class phf extends phi {
    private final phe d;
    private final boolean e;

    public phf(int i, int i2, phe pheVar, boolean z) {
        super(i, i2);
        this.d = pheVar;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof phf) {
            phf phfVar = (phf) obj;
            if (this.b == phfVar.b && this.c == phfVar.c && ffkj.e(this.d, phfVar.d) && this.e == phfVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.b * 31) + this.c) * 31) + this.d.hashCode()) * 31) + (true != this.e ? 1237 : 1231);
    }

    @Override // defpackage.phi
    public final String toString() {
        return "phf{width=" + this.b + ", color=" + this.c + ", primaryContainerDragRange=" + this.d + ", isDraggingToFullscreenAllowed=" + this.e + '}';
    }
}
