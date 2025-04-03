package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etil extends etgr {
    public final etik a;

    public etil(etik etikVar) {
        this.a = etikVar;
    }

    @Override // defpackage.etgf
    public final boolean a() {
        return this.a != etik.c;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof etil) && ((etil) obj).a == this.a;
    }

    public final int hashCode() {
        return Objects.hash(etil.class, this.a);
    }

    public final String toString() {
        return "ChaCha20Poly1305 Parameters (variant: " + this.a.d + ")";
    }
}
