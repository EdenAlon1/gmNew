package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtax implements dtbf {
    public final dtbu a;
    private final dtbd b;
    private final int c;

    public dtax(dtbd dtbdVar, int i, dtbu dtbuVar) {
        dtbdVar.getClass();
        this.b = dtbdVar;
        this.c = i;
        this.a = dtbuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dtax)) {
            return false;
        }
        dtax dtaxVar = (dtax) obj;
        return ffkj.e(this.b, dtaxVar.b) && this.c == dtaxVar.c && ffkj.e(this.a, dtaxVar.a);
    }

    public final int hashCode() {
        return (((this.b.hashCode() * 31) + this.c) * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "Input(inputState=" + this.b + ", inputHeight=" + this.c + ", displayed=" + this.a + ")";
    }
}
