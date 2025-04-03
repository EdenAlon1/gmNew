package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ucw extends udy {
    private final Optional a;
    private final int b;

    public ucw(Optional optional, int i) {
        this.a = optional;
        this.b = i;
    }

    @Override // defpackage.udy
    public final Optional a() {
        return this.a;
    }

    @Override // defpackage.udy
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof udy) {
            udy udyVar = (udy) obj;
            if (this.a.equals(udyVar.a()) && this.b == udyVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "CombinedDraft{draft=" + this.a.toString() + ", source=" + ucy.a(this.b) + "}";
    }
}
