package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeiv extends eeji {
    public final int a;
    private final int b;
    private final int c;

    public eeiv(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // defpackage.eeji
    public final int a() {
        return this.a;
    }

    @Override // defpackage.eeji
    public final int b() {
        return this.b;
    }

    @Override // defpackage.eeji
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eeji) {
            eeji eejiVar = (eeji) obj;
            if (this.a == eejiVar.a() && this.b == eejiVar.b() && this.c == eejiVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        return "TimerConfiguration{t1=" + this.a + ", t2=" + this.b + ", t4=" + this.c + "}";
    }
}
