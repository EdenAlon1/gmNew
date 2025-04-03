package defpackage;

import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes.dex */
final class asy extends axq {
    private final int a;
    private final Surface b;

    public asy(int i, Surface surface) {
        this.a = i;
        if (surface == null) {
            throw new NullPointerException("Null surface");
        }
        this.b = surface;
    }

    @Override // defpackage.axq
    public final int a() {
        return this.a;
    }

    @Override // defpackage.axq
    public final Surface b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof axq) {
            axq axqVar = (axq) obj;
            if (this.a == axqVar.a() && this.b.equals(axqVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "Result{resultCode=" + this.a + ", surface=" + this.b + "}";
    }
}
