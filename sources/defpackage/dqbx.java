package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqbx {
    public final float a;

    public dqbx(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dqbx) && jzq.b(this.a, ((dqbx) obj).a);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "Default(availableHeightForSheetPeek=" + jzq.a(this.a) + ")";
    }
}
