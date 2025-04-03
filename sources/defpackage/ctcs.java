package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctcs extends ctck {
    private final Optional a;
    private final int b;

    public ctcs(int i, Optional optional) {
        this.b = i;
        this.a = optional;
    }

    @Override // defpackage.ctck
    public final Optional a() {
        return this.a;
    }

    @Override // defpackage.ctck
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ctck) {
            ctck ctckVar = (ctck) obj;
            if (this.b == ctckVar.b() && this.a.equals(ctckVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        int i = this.b;
        return "AudioPlaybackResult{status=" + (i != 1 ? i != 2 ? "INTERRUPTED" : "FAILED" : "SUCCEEDED") + ", error=" + this.a.toString() + "}";
    }
}
