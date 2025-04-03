package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class orh {
    public final int a;
    private final int b;

    public orh(int i) {
        this.a = i;
        this.b = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof orh)) {
            return false;
        }
        orh orhVar = (orh) obj;
        return this.a == orhVar.a && this.b == orhVar.b;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b));
    }

    public final String toString() {
        return String.valueOf(this.a) + "," + String.valueOf(this.b);
    }

    public orh(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
