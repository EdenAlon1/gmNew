package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class chqa extends chrq {
    private final Optional a;
    private final elfl b;

    public chqa(Optional optional, elfl elflVar) {
        if (optional == null) {
            throw new NullPointerException("Null getSelf");
        }
        this.a = optional;
        if (elflVar == null) {
            throw new NullPointerException("Null isSelfE2eeProvisioned");
        }
        this.b = elflVar;
    }

    @Override // defpackage.chrq
    public final elfl a() {
        return this.b;
    }

    @Override // defpackage.chrq
    public final Optional b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof chrq) {
            chrq chrqVar = (chrq) obj;
            if (this.a.equals(chrqVar.b()) && this.b.equals(chrqVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        elfl elflVar = this.b;
        return "ConversationSelfResult{getSelf=" + this.a.toString() + ", isSelfE2eeProvisioned=" + elflVar.toString() + "}";
    }
}
