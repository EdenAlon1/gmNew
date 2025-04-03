package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xlu {
    public final int a;
    public final int b;
    public final boolean c;

    public xlu(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xlu)) {
            return false;
        }
        xlu xluVar = (xlu) obj;
        return this.a == xluVar.a && this.b == xluVar.b && this.c == xluVar.c;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        return "TextCounterData(codePointsRemaining=" + this.a + ", currentMessageCount=" + this.b + ", isMessageTooLong=" + this.c + ")";
    }

    public /* synthetic */ xlu(int i, int i2) {
        this(i, i2, false);
    }
}
