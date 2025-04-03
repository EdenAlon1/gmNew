package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jji {
    public static final jji a = new jji(0.0f, new ffmf(0.0f, 0.0f));
    public final float b;
    public final ffmf c;
    private final int d = 0;

    public jji(float f, ffmf ffmfVar) {
        this.b = f;
        this.c = ffmfVar;
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jji)) {
            return false;
        }
        jji jjiVar = (jji) obj;
        if (this.b != jjiVar.b || !ffkj.e(this.c, jjiVar.c)) {
            return false;
        }
        int i = jjiVar.d;
        return true;
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.b) * 31) + this.c.hashCode()) * 31;
    }

    public final String toString() {
        return "ProgressBarRangeInfo(current=" + this.b + ", range=" + this.c + ", steps=0)";
    }
}
