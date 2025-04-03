package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class muo {
    public final int a;
    public final boolean b;

    public muo(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            muo muoVar = (muo) obj;
            if (this.a == muoVar.a && this.b == muoVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + (this.b ? 1 : 0);
    }
}
