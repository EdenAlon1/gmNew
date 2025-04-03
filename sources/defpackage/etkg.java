package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etkg extends etgr {
    public final etkf a;

    public etkg(etkf etkfVar) {
        this.a = etkfVar;
    }

    @Override // defpackage.etgf
    public final boolean a() {
        return this.a != etkf.c;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof etkg) && ((etkg) obj).a == this.a;
    }

    public final int hashCode() {
        return Objects.hash(etkg.class, this.a);
    }

    public final String toString() {
        return "XChaCha20Poly1305 Parameters (variant: " + this.a.d + ")";
    }
}
