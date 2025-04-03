package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class phh extends phi {
    public phh(int i, int i2) {
        super(i, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof phh) {
            phh phhVar = (phh) obj;
            if (this.b == phhVar.b && this.c == phhVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b * 31) + this.c;
    }
}
