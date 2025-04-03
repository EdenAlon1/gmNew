package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ehz {
    public final int a;
    public final int b;

    public ehz(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i < 0) {
            dwv.c("negative start index");
        }
        if (i2 >= i) {
            return;
        }
        dwv.c("end index greater than start");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ehz)) {
            return false;
        }
        ehz ehzVar = (ehz) obj;
        return this.a == ehzVar.a && this.b == ehzVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "Interval(start=" + this.a + ", end=" + this.b + ')';
    }
}
