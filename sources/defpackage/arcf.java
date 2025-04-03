package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class arcf extends arch {
    private final int a;
    private final int b;

    public arcf(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof arcf)) {
            return false;
        }
        arcf arcfVar = (arcf) obj;
        return this.a == arcfVar.a && this.b == arcfVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "MediaPlayerError(type=" + this.a + ", extra=" + this.b + ")";
    }
}
