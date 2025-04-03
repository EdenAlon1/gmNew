package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euby extends euea {
    public final eubx a;

    public euby(eubx eubxVar) {
        this.a = eubxVar;
    }

    @Override // defpackage.etgf
    public final boolean a() {
        return this.a != eubx.d;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof euby) && ((euby) obj).a == this.a;
    }

    public final int hashCode() {
        return Objects.hash(euby.class, this.a);
    }

    public final String toString() {
        return "Ed25519 Parameters (variant: " + this.a.e + ")";
    }
}
