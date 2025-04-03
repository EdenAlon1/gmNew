package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ayk extends bak {
    private final int a;
    private final avl b;

    public ayk(int i, avl avlVar) {
        this.a = i;
        this.b = avlVar;
    }

    @Override // defpackage.bak
    public final int a() {
        return this.a;
    }

    @Override // defpackage.bak
    public final avl b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bak) {
            bak bakVar = (bak) obj;
            if (this.a == bakVar.a() && this.b.equals(bakVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "CaptureError{requestId=" + this.a + ", imageCaptureException=" + this.b + "}";
    }
}
