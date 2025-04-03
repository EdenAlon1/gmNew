package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exni extends exnn {
    private final int a;
    private final boolean b;

    public exni(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.exnn
    public final int a() {
        return this.a;
    }

    @Override // defpackage.exnn
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof exnn) {
            exnn exnnVar = (exnn) obj;
            if (this.a == exnnVar.a() && this.b == exnnVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.b ? 1237 : 1231) ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "CpuOptions{numThreads=" + this.a + ", useXnnpack=" + this.b + "}";
    }
}
