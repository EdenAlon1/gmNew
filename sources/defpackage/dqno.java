package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqno {
    public final int a;
    public final int b;

    public dqno(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqno)) {
            return false;
        }
        dqno dqnoVar = (dqno) obj;
        return this.a == dqnoVar.a && this.b == dqnoVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "TextSelection(anchor=" + this.a + ", edge=" + this.b + ")";
    }
}
