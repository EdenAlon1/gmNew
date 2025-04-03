package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evhn extends evhs {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public evhn(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    @Override // defpackage.evhs
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.evhs
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.evhs
    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof evhs) {
            evhs evhsVar = (evhs) obj;
            if (this.a == evhsVar.a() && this.b == evhsVar.b() && this.c == evhsVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.a ? 1237 : 1231;
        return ((((i ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true == this.c ? 1231 : 1237);
    }

    public final String toString() {
        return "EncoderOptions{enableCelLogsiteMetadata=" + this.a + ", enableSafeFormatArgs=" + this.b + ", includeSuppressedExceptions=" + this.c + "}";
    }
}
