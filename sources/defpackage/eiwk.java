package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eiwk {
    public final int a;
    public int b;

    public eiwk(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eiwk)) {
            return false;
        }
        eiwk eiwkVar = (eiwk) obj;
        return this.a == eiwkVar.a && this.b == eiwkVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "ActiveCallbacks(callbacksId=" + this.a + ", callbacksState=" + this.b + ")";
    }
}
