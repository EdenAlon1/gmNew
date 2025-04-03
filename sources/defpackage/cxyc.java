package defpackage;

import defpackage.cxze;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxyc extends cxze.b {
    private final int a;
    private final int b;

    public cxyc(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // cxze.b
    public final int a() {
        return this.b;
    }

    @Override // cxze.b
    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cxze.b) {
            cxze.b bVar = (cxze.b) obj;
            if (this.a == bVar.b() && this.b == bVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "BannerLayoutChangedEvent{width=" + this.a + ", height=" + this.b + "}";
    }
}
