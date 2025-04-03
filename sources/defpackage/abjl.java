package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abjl implements abjo {
    public final float a;

    public abjl(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof abjl) && Float.compare(this.a, ((abjl) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "Changed(value=" + this.a + ")";
    }
}
