package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtay implements dtbf {
    public final dtbu a;
    private final dtbd b;
    private final int c;
    private final dsos d;

    public dtay(dtbd dtbdVar, int i, dtbu dtbuVar, dsos dsosVar) {
        dtbdVar.getClass();
        this.b = dtbdVar;
        this.c = i;
        this.a = dtbuVar;
        this.d = dsosVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dtay)) {
            return false;
        }
        dtay dtayVar = (dtay) obj;
        return ffkj.e(this.b, dtayVar.b) && this.c == dtayVar.c && ffkj.e(this.a, dtayVar.a) && ffkj.e(this.d, dtayVar.d);
    }

    public final int hashCode() {
        return (((((this.b.hashCode() * 31) + this.c) * 31) + this.a.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "InputOverKeyboard(inputState=" + this.b + ", inputHeight=" + this.c + ", displayed=" + this.a + ", keyboard=" + this.d + ")";
    }
}
